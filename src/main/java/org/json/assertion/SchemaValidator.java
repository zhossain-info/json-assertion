package org.json.assertion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.tuple.Pair;
import org.json.assertion.tree.ImportMap;
import org.json.assertion.tree.JsonInputTree;
import org.json.assertion.tree.JsonSchemaTree;
import org.json.assertion.tree.nodes.*;

import java.awt.image.ImageProducer;
import java.util.List;

public class SchemaValidator {

    @AllArgsConstructor
    @Getter
    private class ChildPointer {
        private JTNode parent;
        private int index;

        public JTNode getChild() {
            return parent.getChildren().get(index);
        }
    }

    public void validate(String schema, String input) {
        JsonInputTree inputTree = new JsonInputTree();
        JsonSchemaTree schemaTree = new JsonSchemaTree();
        traverse(schemaTree.getRoot(schema), inputTree.getRoot(input));
    }

    private void traverse(JTNode schema, JTNode input) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s", schema, input));
        List<JTNode> schemaChildren = schema.getChildren();
        List<JTNode> inputChildren = input.getChildren();
        for(int i = 0; i < schemaChildren.size(); i++) {
            JTNode schemaNode = schemaChildren.get(i);
            if(schemaNode instanceof JTValidator) {
                validate((JTValidator) schemaNode, new ChildPointer(input, i));
            } else if(schemaNode instanceof JTLeafNode) {
                validate((JTLeafNode) schemaNode, (JTLeafNode) input.getChild(i));
            } else {
                JTNode inputNode = inputChildren.get(i);
                if(!schemaNode.getClass().equals(inputNode.getClass())) {
                    System.err.println("Mismatch found: Data type mismatch in internal node");
                }
                traverse(schemaNode, inputNode);
            }
        }
    }

    private void validate(JTValidator validator, ChildPointer pointer) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s", validator, pointer.getChild()));
        JTDataType dataType = validator.getJTDataType();
        if(dataType != null) validate(dataType, pointer.getChild());
        JTFunction function = validator.getJTFunction();
        if(function != null) validate(function, pointer.getChild());
    }

    private void validate(JTDataType dataType, JTNode input) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s", dataType, input));
        if(!dataType.getDataType().getNodeClass().equals(input.getClass())) {
            System.err.println("Mismatch found: Data type mismatch in data type declaration");
        }
    }

    private void validate(JTFunction function, JTNode input) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s", function, input));
        ImportMap importMap = ImportMap.getInstance();
        importMap.invokeFunction(function, input);
    }

    private void validate(JTLeafNode schema, JTLeafNode input) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s", schema, input));
        if(!schema.getClass().equals(input.getClass())) {
            System.out.println("Mismatch found: Data type mismatch in leaf node");
        }
        if(!schema.getText().equals(input.getText())) {
            System.out.println("Mismatch found: Value mismatch in leaf node");
        }
    }
}
