package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

public class JTInteger extends JTDataNode {

    private int value;

    public JTInteger(JTNode parent, String text) {
        super(parent, DataType.INTEGER);
        this.value = Integer.parseInt(text);
    }
}
