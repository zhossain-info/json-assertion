package org.json.assertion.utils;

import org.json.assertion.tree.nodes.JTNode;

public class JsonScope {
    private JTNode parent;
    private JTNode node;

    public static JsonScope fromParent(JTNode parent) {
        JsonScope scope = new JsonScope();
        scope.parent = parent;
        return scope;
    }

    public static JsonScope fromNode(JTNode child) {
        JsonScope scope = new JsonScope();
        scope.node = child;
        return scope;
    }

    public static JsonScope from(JTNode parent, int index) {
        JsonScope scope = new JsonScope();
        int size = parent.getChildren().size();
        if(index < size) scope.node = parent.getChild(index);
        else scope.parent = parent;
        return scope;
    }

    private JsonScope() {
    }

    public JTNode getParent() {
        if(node != null) return node.getParent();
        else return parent;
    }

    public JTNode getNode() {
        return node;
    }

    @Override
    public String toString() {
        if(node != null) return Utilities.toString(node);
        else return Utilities.toString(parent);
    }
}
