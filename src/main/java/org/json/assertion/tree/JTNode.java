package org.json.assertion.tree;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

//    @Override
//    public String toString() {
//        return String.format("%s(parent=%s)",
//                this.getClass().getSimpleName(), parent);
//    }

    public List<JTNode> getChildren() {
        return children;
    }
}
