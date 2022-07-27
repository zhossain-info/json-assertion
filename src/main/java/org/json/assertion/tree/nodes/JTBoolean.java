package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

public class JTBoolean extends JTDataNode {

    private boolean value;

    public JTBoolean(JTNode parent, String text) {
        super(parent, DataType.BOOLEAN);
        this.value = Boolean.valueOf(text);
    }
}
