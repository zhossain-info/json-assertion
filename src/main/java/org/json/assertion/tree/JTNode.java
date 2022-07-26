package org.json.assertion.tree;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class JTNode {

    private JTNode parent;
    private List<JTNode> children = new ArrayList<>();

    public JTNode(JTNode parent) {
        this.parent = parent;
        parent.addChild(this);
    }

    public void addChild(JTNode child) {
        children.add(child);
    }

    public JTNode getChild(int index) {
        return children.get(index);
    }

    public List<JTNode> getChildren() {
        return children;
    }
}
