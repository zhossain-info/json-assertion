package org.json.assertion.tree.nodes;

import org.json.assertion.utils.Location;

public class JTNull extends JTLeafNode {

    private String value;

    public JTNull(JTNode parent, Location location, String text) {
        super(parent, location);
        this.value = text;
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }

    @Override
    public String toJson() {
        return "null";
    }
}
