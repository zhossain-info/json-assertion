package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

public class JTString extends JTDataNode {

    private String value;
    public JTString(JTNode parent, String text) {
        super(parent, DataType.STRING);
        this.value = text;
    }
}
