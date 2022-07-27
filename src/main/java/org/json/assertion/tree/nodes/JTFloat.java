package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

public class JTFloat extends JTDataNode {

    private float value;

    public JTFloat(JTNode parent, String text) {
        super(parent, DataType.FLOAT);
        this.value = Float.parseFloat(text);
    }
}
