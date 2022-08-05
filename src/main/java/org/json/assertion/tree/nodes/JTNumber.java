package org.json.assertion.tree.nodes;

public abstract  class JTNumber extends JTLeafNode {

    public JTNumber(JTNode parent) {
        super(parent);
    }

    public abstract int intValue();
    public abstract long longValue();
    public abstract double doubleValue();
}
