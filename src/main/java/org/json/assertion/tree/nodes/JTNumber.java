package org.json.assertion.tree.nodes;

public abstract  class JTNumber extends JTLeafNode {

    public JTNumber(JTNode parent) {
        super(parent);
    }

    public abstract double doubleValue();
}
