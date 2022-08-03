package org.json.assertion.utils;

import org.json.assertion.tree.nodes.JTNode;

public class TreeInput {
    private JTNode parent;
    private JTNode child;

    public static TreeInput fromParent(JTNode parent) {
        TreeInput input = new TreeInput();
        input.parent = parent;
        return input;
    }

    public static TreeInput fromChild(JTNode child) {
        TreeInput input = new TreeInput();
        input.child = child;
        return input;
    }

    public static TreeInput from(JTNode parent, int index) {
        TreeInput input = new TreeInput();
        int size = parent.getChildren().size();
        if(index < size) input.child = parent.getChild(index);
        else input.parent = parent;
        return input;
    }

    private TreeInput() {
    }

    public JTNode getInputParent() {
        if(child != null) return child.getParent();
        else return parent;
    }

    public JTNode getInputChild() {
        return child;
    }

    @Override
    public String toString() {
        if(child != null) return Utils.toString(child);
        else return Utils.toString(parent);
    }
}
