package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.assertion.DataType;

public class JTFloat extends JTDataNode {

    private float value;

    public JTFloat(JTNode parent, String text) {
        super(parent, DataType.FLOAT);
        this.value = Float.parseFloat(text);
    }
}
