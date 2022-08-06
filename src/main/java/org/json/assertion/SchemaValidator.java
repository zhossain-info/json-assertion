package org.json.assertion;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.json.assertion.error.SchemaAssertionError;
import org.json.assertion.error.SchemaValidatorError;
import org.json.assertion.tree.*;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.utils.JsonScope;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class SchemaValidator {

    SchemaContext schemaContext;
    ErrorStack errorStack;
    ImportFunction importFunction;

    public SchemaValidator() {
        this.schemaContext = new SchemaContext(this);
        this.errorStack = schemaContext.getErrorStack();
        this.importFunction = schemaContext.getImportFunction();
    }

    public void assertValidJson(String schema, String json) {
        validate(schema, json);
    }

    public void validate(String schema, String json) {
        try {
            reset();
            JsonInputTree inputTree = new JsonInputTree(errorStack);
            JsonSchemaTree schemaTree = new JsonSchemaTree(schemaContext);
            log.debug("SCHEMA TREE AND INPUT TREE NODE TRAVERSAL:");
            matchCommon(schemaTree.getRoot(schema), inputTree.getRoot(json));
            handleError();
        } catch(Exception e) {
            errorStack.push(new SchemaValidatorError(e.getMessage(), e));
            handleError();
        }
    }

    private void handleError() {
        if (errorStack.size() > 0) log.debug("ALL VALIDATION ERROR MESSAGES:");
        for (Throwable e : errorStack.getStack()) {
            log.debug(String.format("%s:%s", e.getClass().getSimpleName(), e.getMessage()));
        }
        if (errorStack.size() > 0) {
            throw errorStack.get(0);
        }
    }

    public void matchCommon(JTNode schemaNode, JTNode jsonNode) {
        log.debug(String.format("Schema Node: %s, Input Node: %s", schemaNode, jsonNode));
        if(schemaNode instanceof  JTObject) {
            matchObject((JTObject) schemaNode, jsonNode);
        } else if(schemaNode instanceof JTArray) {
            matchArray((JTArray) schemaNode, jsonNode);
        } else if(schemaNode instanceof JTValidator) {
            matchValidator((JTValidator) schemaNode, JsonScope.fromNode(jsonNode));
        } else if(schemaNode instanceof JTLeafNode) {
            matchLeaf((JTLeafNode) schemaNode, (JTLeafNode) jsonNode);
        } else {
            matchInternal(schemaNode, jsonNode);
        }
    }

    private void matchArray(JTArray sArray, JTNode jNode) {
        if(!sArray.getClass().equals(jNode.getClass())) {
            errorStack.push(new SchemaAssertionError(
                    "Data type mismatch in internal node",
                    sArray.getClass().getSimpleName(),
                    jNode.getClass().getSimpleName()));
        }
        List<JTNode> sChildren = sArray.getChildren();
        List<JTNode> jChildren = jNode.getChildren();
        for(int i = 0; i < sChildren.size(); i++) {
            JTNode sChild = sChildren.get(i);
            if(sChild instanceof JTValidator) {
                matchValidator((JTValidator) sChild, JsonScope.from(jNode, i));
            } else {
                matchCommon(sChild, jChildren.get(i));
            }
        }
    }

    private void matchKeyValue(JTKeyValue sKeyValue, JTNode jNode) {
        log.debug(String.format("Schema Node: %s, Input Node: %s", sKeyValue, jNode));
        JTString sKey = (JTString) sKeyValue.getChild(0);
        JTNode sValue = sKeyValue.getChild(1);
        JTKeyValue jKeyValue = ((JTObject) jNode).getKeyValue(sKey);
        if(sValue instanceof JTValidator) {
            if(((JTValidator) sValue).isOptional() && jKeyValue == null) return;
        }
        if(jKeyValue == null) {
            errorStack.push(new SchemaAssertionError(
                    "Mandatory key-value not found",
                    sKey.getText(), null));
            return;
        }
        List<JTNode> children = sKeyValue.getChildren();
        for(int i = 0; i < children.size(); i++) {
            matchCommon(children.get(i), jKeyValue.getChild(i));
        }
    }

    private void matchValidator(JTValidator sValidator, JsonScope jScope) {
        JTDataType dataType = sValidator.getJTDataType();
        if(dataType != null) matchDataType(dataType, jScope);
        JTFunction function = sValidator.getJTFunction();
        if(function != null) matchFunction(function, jScope);
    }

    private void matchLeaf(JTLeafNode sLeaf, JTLeafNode jLeaf) {
        if(!sLeaf.getClass().equals(jLeaf.getClass())) {
            errorStack.push(new SchemaAssertionError(
                    "Data type mismatch in leaf node",
                    sLeaf.getClass().getSimpleName(),
                    jLeaf.getClass().getSimpleName()));
        }
        if(!sLeaf.getText().equals(jLeaf.getText())) {
            errorStack.push(new SchemaAssertionError(
                    "Value mismatch in leaf node",
                    sLeaf.getText(), jLeaf.getText()));
        }
    }

    private void matchObject(JTObject sObject, JTNode jNode) {
        if(!sObject.getClass().equals(jNode.getClass())) {
            errorStack.push(new SchemaAssertionError(
                    "Data type mismatch in internal node",
                    sObject.getClass().getSimpleName(),
                    jNode.getClass().getSimpleName()));
        }
        List<JTNode> sChildren = sObject.getChildren();
        for(int i = 0; i < sChildren.size(); i++) {
            JTNode sChild = sChildren.get(i);
            if(sChild instanceof JTKeyValue) {
                // child on the position could be a different key
                matchKeyValue((JTKeyValue) sChild, jNode);
            } else {
                matchFunction((JTFunction) sChild, JsonScope.fromParent(jNode));
            }

        }
    }
    private void matchInternal(JTNode sNode, JTNode jNode) {
        if(!sNode.getClass().equals(jNode.getClass())) {
            errorStack.push(new SchemaAssertionError(
                    "Data type mismatch in internal node",
                    sNode.getClass().getSimpleName(),
                    jNode.getClass().getSimpleName()));
        }
        List<JTNode> sChildren = sNode.getChildren();
        List<JTNode> jChildren = jNode.getChildren();
        for(int i = 0; i < sChildren.size(); i++) {
            matchCommon(sChildren.get(i), jChildren.get(i));
        }
    }

    private void matchDataType(JTDataType sDataType, JsonScope jScope) {
        log.debug(String.format("Schema Node: %s, Input Node: %s", sDataType, jScope));
        Class<?>[] nodeClasses = sDataType.getDataType().getNodeClasses();
        if(!ArrayUtils.contains(nodeClasses, jScope.getNode().getClass())) {
            errorStack.push(new SchemaAssertionError(
                    "Data type mismatch for type declaration",
                    Arrays.stream(nodeClasses).map(n -> n.getSimpleName())
                            .collect(Collectors.joining(", ")),
                    jScope.getNode().getClass().getSimpleName()));
        }
    }

    private void matchFunction(JTFunction sFunction, JsonScope jScope) {
        log.debug(String.format("Schema Node: %s, Input Node: %s", sFunction, jScope));
        importFunction.invokeFunction(sFunction, jScope);
    }

    public void reset() {
        errorStack.clear();
        importFunction.clear();
    }
}
