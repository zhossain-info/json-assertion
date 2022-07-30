package org.json.assertion.tree.nodes;

public class JTNull extends JTLeafNode {

    private String value;

    public JTNull(JTNode parent, String text) {
        super(parent);
        this.value = text;
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }
}
