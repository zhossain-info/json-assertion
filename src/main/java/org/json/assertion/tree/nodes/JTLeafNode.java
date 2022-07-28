package org.json.assertion.tree.nodes;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class JTLeafNode extends JTNode {

    public JTLeafNode(JTNode parent) {
        super(parent);
    }

    @Override
    public void addChild(JTNode child) {
        throw new UnsupportedOperationException("cannot add child to leaf node");
    }
}
