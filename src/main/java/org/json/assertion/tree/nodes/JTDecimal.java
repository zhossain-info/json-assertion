package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

public class JTDecimal extends JTDataNode {

    private double value;

    public JTDecimal(JTNode parent, String text) {
        super(parent, DataType.DECIMAL);
        this.value = Double.parseDouble(text);
    }
}
