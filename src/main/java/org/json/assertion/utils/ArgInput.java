package org.json.assertion.utils;

import org.json.assertion.tree.nodes.JTNode;

public class ArgInput {
    private JTNode parent;
    private JTNode child;

    public static ArgInput fromParent(JTNode parent) {
        ArgInput input = new ArgInput();
        input.parent = parent;
        return input;
    }

    public static ArgInput fromChild(JTNode child) {
        ArgInput input = new ArgInput();
        input.child = child;
        return input;
    }

    public static ArgInput from(JTNode parent, int index) {
        ArgInput input = new ArgInput();
        int size = parent.getChildren().size();
        if(index < size) input.child = parent.getChild(index);
        else input.parent = parent;
        return input;
    }

    private ArgInput() {
    }

    public JTNode getInputParent() {
        if(child != null) return child.getParent();
        else return parent;
    }

    public JTNode getInputChild() {
        return child;
    }
}
