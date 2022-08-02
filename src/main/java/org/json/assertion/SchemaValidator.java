package org.json.assertion;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.json.assertion.error.SchemaAssertionError;
import org.json.assertion.error.SchemaValidatorError;
import org.json.assertion.tree.*;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.utils.TreeInput;

import java.util.List;

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

    public void assertSchema(String inputSchema, String inputJson) {
        validate(inputSchema, inputJson);
    }

    public void validate(String schema, String input) {
        try {
            JsonInputTree inputTree = new JsonInputTree(schemaContext.getErrorStack());
            JsonSchemaTree schemaTree = new JsonSchemaTree(schemaContext);
            log.debug("SCHEMA TREE AND INPUT TREE NODE TRAVERSAL:");
            matchCommon(schemaTree.getRoot(schema), inputTree.getRoot(input));
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

    public void matchCommon(JTNode schema, JTNode input) {
        log.debug(String.format("Schema Node: %s, Input Node: %s", schema, input));
        if(schema instanceof  JTObject) {
            matchObject((JTObject) schema, input);
        } else if(schema instanceof JTArray) {
            matchArray((JTArray) schema, input);
        } else if(schema instanceof JTValidator) {
            matchValidator((JTValidator) schema, TreeInput.fromChild(input));
        } else if(schema instanceof JTLeafNode) {
            matchLeaf((JTLeafNode) schema, (JTLeafNode) input);
        } else {
            matchInternal(schema, input);
        }
    }

    private void matchArray(JTArray sArray, JTNode iNode) {
        if(!sArray.getClass().equals(iNode.getClass())) {
            //System.err.println("Mismatch found: Data type mismatch in internal node");
            errorStack.push(new SchemaAssertionError(
                    "Mismatch found: Data type mismatch in internal node"));
        }
        List<JTNode> sChildren = sArray.getChildren();
        List<JTNode> iChildren = iNode.getChildren();
        for(int i = 0; i < sChildren.size(); i++) {
            JTNode sChild = sChildren.get(i);
            if(sChild instanceof JTValidator) {
                matchValidator((JTValidator) sChild, TreeInput.from(iNode, i));
            } else {
                matchCommon(sChild, iChildren.get(i));
            }
        }
    }

    private void matchKeyValue(JTKeyValue sKeyValue, JTNode input) {
        log.debug(String.format("Schema Node: %s, Input Node: %s", sKeyValue, input));
        JTString sKey = (JTString) sKeyValue.getChild(0);
        JTNode sValue = sKeyValue.getChild(1);
        JTKeyValue iKeyValue = ((JTObject) input).getKeyValue(sKey);
        if(sValue instanceof JTValidator) {
            if(((JTValidator) sValue).isOptional() && iKeyValue == null) return;
        }
        if(iKeyValue == null) {
            //System.err.println("mandatory key-value not found");
            errorStack.push(new SchemaAssertionError("mandatory key-value not found"));
            return;
        }
        List<JTNode> children = sKeyValue.getChildren();
        for(int i = 0; i < children.size(); i++) {
            matchCommon(children.get(i), iKeyValue.getChild(i));
        }
    }

    private void matchValidator(JTValidator validator, TreeInput input) {
        //System.out.println(String.format("Schema Node: %s, Input Node: %s", validator, input));
        JTDataType dataType = validator.getJTDataType();
        if(dataType != null) matchDataType(dataType, input);
        JTFunction function = validator.getJTFunction();
        if(function != null) matchFunction(function, input);
    }

    private void matchLeaf(JTLeafNode schema, JTLeafNode input) {
        //System.out.println(String.format("Schema Node: %s, Input Node: %s", schema, input));
        if(!schema.getClass().equals(input.getClass())) {
            //System.err.println("Mismatch found: Data type mismatch in leaf node");
            errorStack.push(new SchemaAssertionError(
                    "Mismatch found: Data type mismatch in leaf node"));
        }
        if(!schema.getText().equals(input.getText())) {
            //System.err.println("Mismatch found: Value mismatch in leaf node");
            errorStack.push(new SchemaAssertionError(
                    "Mismatch found: Value mismatch in leaf node"));
        }
    }

    private void matchObject(JTObject sObject, JTNode iNode) {
        if(!sObject.getClass().equals(iNode.getClass())) {
            //System.err.println("Mismatch found: Data type mismatch in internal node");
            errorStack.push(new SchemaAssertionError(
                    "Mismatch found: Data type mismatch in internal node"));
        }
        List<JTNode> sChildren = sObject.getChildren();
        for(int i = 0; i < sChildren.size(); i++) {
            JTNode sChild = sChildren.get(i);
            if(sChild instanceof JTKeyValue) {
                matchKeyValue((JTKeyValue) sChild, iNode);
            } else {
                matchFunction((JTFunction) sChild, TreeInput.fromParent(iNode));
            }

        }
    }
    private void matchInternal(JTNode schema, JTNode input) {
        if(!schema.getClass().equals(input.getClass())) {
            //System.err.println("Mismatch found: Data type mismatch in internal node");
            errorStack.push(new SchemaAssertionError(
                    "Mismatch found: Data type mismatch in internal node"));
        }
        List<JTNode> schemaChildren = schema.getChildren();
        List<JTNode> inputChildren = input.getChildren();
        for(int i = 0; i < schemaChildren.size(); i++) {
            matchCommon(schemaChildren.get(i), inputChildren.get(i));
        }
    }

    private void matchDataType(JTDataType dataType, TreeInput input) {
        log.debug(String.format("Schema Node: %s, Input Node: %s", dataType, input));
        if(!ArrayUtils.contains(dataType.getDataType().getNodeClasses(), input.getInputChild().getClass())) {
            //System.err.println("Mismatch found: Data type mismatch in data type declaration");
            errorStack.push(new SchemaAssertionError(
                    "Mismatch found: Data type mismatch in data type declaration"));
        }
    }

    private void matchFunction(JTFunction function, TreeInput input) {
        log.debug(String.format("Schema Node: %s, Input Node: %s", function, input));
        importFunction.invokeFunction(function, input);
    }
}
