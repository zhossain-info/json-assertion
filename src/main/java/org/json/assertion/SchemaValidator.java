package org.json.assertion;

import org.json.assertion.exception.AssertionFailedError;
import org.json.assertion.tree.ErrorList;
import org.json.assertion.tree.ImportMap;
import org.json.assertion.tree.JsonInputTree;
import org.json.assertion.tree.JsonSchemaTree;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.utils.ArgInput;

import java.util.List;

public class SchemaValidator {

    ErrorList errorList = ErrorList.getInstance();

    public void validate(String schema, String input) {
        errorList.clear();
        JsonInputTree inputTree = new JsonInputTree();
        JsonSchemaTree schemaTree = new JsonSchemaTree();
        matchCommon(schemaTree.getRoot(schema), inputTree.getRoot(input));
        for(Error e : errorList.getList()) {
            System.err.println(e.getMessage());
        }
        throw errorList.get(0);
    }

    public void matchCommon(JTNode schema, JTNode input) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s", schema, input));
        if(schema instanceof  JTObject) {
            matchObject((JTObject) schema, input);
        } else if(schema instanceof JTArray) {
            matchArray((JTArray) schema, input);
        } else if(schema instanceof JTValidator) {
            matchValidator((JTValidator) schema, ArgInput.fromChild(input));
        } else if(schema instanceof JTLeafNode) {
            matchLeaf((JTLeafNode) schema, (JTLeafNode) input);
        } else {
            matchInternal(schema, input);
        }
    }

    private void matchArray(JTArray sArray, JTNode iNode) {
        if(!sArray.getClass().equals(iNode.getClass())) {
            //System.err.println("Mismatch found: Data type mismatch in internal node");
            errorList.add(new AssertionFailedError(
                    "Mismatch found: Data type mismatch in internal node"));
        }
        List<JTNode> sChildren = sArray.getChildren();
        List<JTNode> iChildren = iNode.getChildren();
        for(int i = 0; i < sChildren.size(); i++) {
            JTNode sChild = sChildren.get(i);
            if(sChild instanceof JTValidator) {
                matchValidator((JTValidator) sChild, ArgInput.from(iNode, i));
            } else {
                matchCommon(sChild, iChildren.get(i));
            }
        }
    }

    private void matchKeyValue(JTKeyValue sKeyValue, JTNode input) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s", sKeyValue, input));
        JTString sKey = (JTString) sKeyValue.getChild(0);
        JTNode sValue = sKeyValue.getChild(1);
        JTKeyValue iKeyValue = ((JTObject) input).getKeyValue(sKey);
        if(sValue instanceof JTValidator) {
            if(((JTValidator) sValue).isOptional() && iKeyValue == null) return;
        }
        if(iKeyValue == null) {
            //System.err.println("mandatory key-value not found");
            errorList.add(new AssertionFailedError("mandatory key-value not found"));
            return;
        }
        List<JTNode> children = sKeyValue.getChildren();
        for(int i = 0; i < children.size(); i++) {
            matchCommon(children.get(i), iKeyValue.getChild(i));
        }
    }

    private void matchValidator(JTValidator validator, ArgInput input) {
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
            errorList.add(new AssertionFailedError(
                    "Mismatch found: Data type mismatch in leaf node"));
        }
        if(!schema.getText().equals(input.getText())) {
            //System.err.println("Mismatch found: Value mismatch in leaf node");
            errorList.add(new AssertionFailedError(
                    "Mismatch found: Value mismatch in leaf node"));
        }
    }

    private void matchObject(JTObject sObject, JTNode iNode) {
        if(!sObject.getClass().equals(iNode.getClass())) {
            //System.err.println("Mismatch found: Data type mismatch in internal node");
            errorList.add(new AssertionFailedError(
                    "Mismatch found: Data type mismatch in internal node"));
        }
        List<JTNode> sChildren = sObject.getChildren();
        for(int i = 0; i < sChildren.size(); i++) {
            JTNode sChild = sChildren.get(i);
            if(sChild instanceof JTKeyValue) {
                matchKeyValue((JTKeyValue) sChild, iNode);
            } else {
                matchFunction((JTFunction) sChild, ArgInput.fromParent(iNode));
            }

        }
    }
    private void matchInternal(JTNode schema, JTNode input) {
        if(!schema.getClass().equals(input.getClass())) {
            //System.err.println("Mismatch found: Data type mismatch in internal node");
            errorList.add(new AssertionFailedError(
                    "Mismatch found: Data type mismatch in internal node"));
        }
        List<JTNode> schemaChildren = schema.getChildren();
        List<JTNode> inputChildren = input.getChildren();
        for(int i = 0; i < schemaChildren.size(); i++) {
            matchCommon(schemaChildren.get(i), inputChildren.get(i));
        }
    }

    private void matchDataType(JTDataType dataType, ArgInput input) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s", dataType, input));
        if(!dataType.getDataType().getNodeClass().equals(input.getInputChild().getClass())) {
            //System.err.println("Mismatch found: Data type mismatch in data type declaration");
            errorList.add(new AssertionFailedError(
                    "Mismatch found: Data type mismatch in data type declaration"));
        }
    }

    private void matchFunction(JTFunction function, ArgInput input) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s", function, input));
        ImportMap importMap = ImportMap.getInstance();
        importMap.invokeFunction(function, input);
    }
}
