package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;

public class JTLeafNode extends JTNode {

    public JTLeafNode(JTNode parent) {
        super(parent);
    }

    @Override
    public void addChild(JTNode child) {
        throw new UnsupportedOperationException("cannot add child to leaf node");
    }
}
