package org.json.assertion;

import org.json.assertion.tree.JTNode;
import org.json.assertion.tree.JTRoot;
import org.json.assertion.walker.JsonInputWalker;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws URISyntaxException, IOException {
        JsonInputWalker walker = new JsonInputWalker();
        String json = Files.readString(Paths.get(walker.getClass()
                .getResource("/fileTest.json").toURI()));
        JTRoot root = walker.walk(json);
        System.out.println("Json Tree Objects:");
        printNode(root);
    }

    private static void printNode(JTNode node) {
        System.out.println(node);
        for(JTNode child : node.getChildren()) {
            printNode(child);
        }
    }
}
