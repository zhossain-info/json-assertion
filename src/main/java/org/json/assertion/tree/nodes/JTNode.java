package org.json.assertion.tree.nodes;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
public abstract class JTNode {

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

    @Override
    public String toString() {
        if(parent != null) {
            return String.format("%s(parent: %s)", getClass().getSimpleName(),
                    parent.getClass().getSimpleName());
        } else {
            return String.format("%s(parent: null)", getClass().getSimpleName());
        }
    }
}
