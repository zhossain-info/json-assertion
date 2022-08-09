package org.json.assertion.tree.nodes;

import org.json.assertion.utils.Location;

import java.util.Objects;

public class JTString extends JTLeafNode {

    private String value;
    public JTString(JTNode parent, Location location, String text) {
        super(parent, location);
        this.value = text;
    }

    @Override
    public String getText() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JTString string = (JTString) o;
        return value.equals(string.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toJson() {
        return value;
    }
}
