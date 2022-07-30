package org.json.assertion.tree.nodes;

public class JTString extends JTLeafNode {

    private String value;
    public JTString(JTNode parent, String text) {
        super(parent);
        this.value = text;
    }

    @Override
    public String getText() {
        return value;
    }
}
