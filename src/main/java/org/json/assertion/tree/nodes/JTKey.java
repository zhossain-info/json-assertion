package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

public class JTKey extends JTDataNode {

    private String text;

    public JTKey(JTNode parent, String text) {
        super(parent, DataType.STRING);
        this.text = text;
    }
}
