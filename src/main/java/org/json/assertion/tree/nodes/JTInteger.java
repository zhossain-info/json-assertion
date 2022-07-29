package org.json.assertion.tree.nodes;

import lombok.Getter;
import org.json.assertion.tree.DataType;
@Getter
public class JTInteger extends JTLeafNode {

    private int value;

    public JTInteger(JTNode parent, String text) {
        super(parent);
        this.value = Integer.parseInt(text);
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }
}
