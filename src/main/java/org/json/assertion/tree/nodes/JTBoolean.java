package org.json.assertion.tree.nodes;

public class JTBoolean extends JTLeafNode {

    private boolean value;

    public JTBoolean(JTNode parent, String text) {
        super(parent);
        this.value = Boolean.valueOf(text);
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }
}
