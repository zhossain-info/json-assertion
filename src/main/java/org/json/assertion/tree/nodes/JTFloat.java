package org.json.assertion.tree.nodes;

import org.json.assertion.utils.Location;

public class JTFloat extends JTNumber {

    private double value;

    public JTFloat(JTNode parent, Location location, String text) {
        super(parent, location);
        this.value = Double.parseDouble(text);
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
        return (long) value;
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
