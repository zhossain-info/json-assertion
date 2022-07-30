package org.json.assertion.utils;

import lombok.Getter;
import org.json.assertion.tree.nodes.JTNode;

@Getter
public class ArgInput {
    private JTNode parent;
    private JTNode node;

    public ArgInput(JTNode node) {
        this.node = node;
    }

    public ArgInput(JTNode parent, int index) {
        int size = parent.getChildren().size();
        if(index < size) this.node = parent.getChild(index);
        else this.parent = parent;
    }

    public JTNode getInputParent() {
        if(node != null) return node.getParent();
        else return parent;
    }
}
