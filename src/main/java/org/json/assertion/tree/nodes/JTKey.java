package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

public class JTKey extends JTLeafNode {

    private String text;

    public JTKey(JTNode parent, String text) {
        super(parent);
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
