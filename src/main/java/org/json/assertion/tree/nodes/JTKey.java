package org.json.assertion.tree.nodes;

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

    @Override
    public boolean equals(Object obj) {
        return text.equals(((JTKey)obj).getText());
    }
}
