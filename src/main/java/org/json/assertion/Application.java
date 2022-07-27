package org.json.assertion;

import org.json.assertion.tree.DataType;
import org.json.assertion.tree.nodes.JTDataNode;
import org.json.assertion.tree.nodes.JTDataType;
import org.json.assertion.tree.nodes.JTNode;
import org.json.assertion.tree.nodes.JTRoot;
import org.json.assertion.tree.JsonInputTree;
import org.json.assertion.tree.JsonSchemaTree;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) throws URISyntaxException, IOException {
        JsonInputTree inputTree = new JsonInputTree();
        JsonSchemaTree schemaTree = new JsonSchemaTree();

        String json = Files.readString(Paths.get(inputTree.getClass()
                .getResource("/input.json").toURI()));
        String schema = Files.readString(Paths.get(inputTree.getClass()
                .getResource("/schema.scm").toURI()));

        JTRoot inputRoot = inputTree.getRoot(json);
        JTRoot schemaRoot = schemaTree.getRoot(schema);
        System.out.println("\nJson Schema and Input Tree:");
        traverseSchema(schemaRoot, inputRoot);
    }

    private static void traverseSchema(JTNode schemaNode, JTNode inputNode) {
        System.out.println(String.format("Schema Node: %s, Input Node: %s",
                schemaNode, inputNode));
        if(schemaNode instanceof JTDataType) {
            if(inputNode instanceof JTDataNode) {
                DataType expected = ((JTDataType) schemaNode).getDataType();
                DataType actual = ((JTDataNode) inputNode).getDataType();
                if(expected == actual) {
                    System.out.println(
                            String.format("\t\tMatched: Expected: %s, Actual: %s", expected, actual));
                } else {
                    System.err.println(
                            String.format("\t\tMismatched: Expected: %s, Actual: %s", expected, actual));
                }
            } else {
                System.out.println("Invalid Schema");
            }
        }
        Iterator<JTNode> schemaIterator = schemaNode.getChildren().iterator();
        Iterator<JTNode> inputIterator = inputNode.getChildren().iterator();

        while(schemaIterator.hasNext()) {
            traverseSchema(schemaIterator.next(), inputIterator.next());
        }
    }
}
