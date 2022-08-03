package org.json.assertion.utils;

import org.json.assertion.tree.nodes.JTNode;

public class Utilities {

    public static String toString(JTNode node) {
        JTNode parent = node.getParent();
        if(parent != null) {
            return String.format("%s@%.4s(parent: %s@%.4s)", node.getClass().getSimpleName(),
                    Integer.toHexString(System.identityHashCode(node)),
                    parent.getClass().getSimpleName(),
                    Integer.toHexString(System.identityHashCode(parent)));
        } else {
            return String.format("%s@%.4s(parent: null)", node.getClass().getSimpleName(),
                    Integer.toHexString(System.identityHashCode(node)));
        }
    }
}
