package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

public class JTNull extends JTDataNode {

    private String value;

    public JTNull(JTNode parent, String text) {
        super(parent, DataType.NULL);
        this.value = text;
    }
}
