package org.json.assertion.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.json.assertion.tree.nodes.JTNode;

import java.util.List;

@AllArgsConstructor
@Getter
public class ChildLocator {
    private JTNode parent;
    private int index;

    public JTNode getChild() {
        if(parent == null) return null;
        List<JTNode> children = parent.getChildren();
        if(index >= children.size()) return null;
        return children.get(index);
    }
}
