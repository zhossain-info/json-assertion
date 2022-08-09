package org.json.assertion.tree.nodes;

import org.json.assertion.utils.Location;

public class JTBoolean extends JTLeafNode {

    private boolean value;

    public JTBoolean(JTNode parent, Location location, String text) {
        super(parent, location);
        this.value = Boolean.valueOf(text);
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }

    @Override
    public String toJson() {
        return String.valueOf(value);
    }
}
