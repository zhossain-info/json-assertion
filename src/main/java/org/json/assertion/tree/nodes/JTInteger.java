package org.json.assertion.tree.nodes;

import lombok.Getter;
import org.json.assertion.utils.Location;

public class JTInteger extends JTNumber {

    private long value;

    public JTInteger(JTNode parent, Location location, String text) {
        super(parent, location);
        this.value = Long.parseLong(text);
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }

    @Override
    public int intValue() {
        return (int) value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public String toJson() {
        return String.valueOf(value);
    }
}
