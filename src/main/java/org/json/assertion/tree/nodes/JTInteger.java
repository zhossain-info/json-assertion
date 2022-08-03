package org.json.assertion.tree.nodes;

import lombok.Getter;
@Getter
public class JTInteger extends JTNumber {

    private long value;

    public JTInteger(JTNode parent, String text) {
        super(parent);
        this.value = Long.parseLong(text);
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
