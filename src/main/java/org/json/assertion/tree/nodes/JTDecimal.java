package org.json.assertion.tree.nodes;

public class JTDecimal extends JTLeafNode {

    private double value;

    public JTDecimal(JTNode parent, String text) {
        super(parent);
        this.value = Double.parseDouble(text);
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }
}
