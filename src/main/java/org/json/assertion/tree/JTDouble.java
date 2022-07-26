package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.assertion.DataType;

public class JTDouble extends JTDataNode {

    private double value;

    public JTDouble(JTNode parent, String text) {
        super(parent, DataType.DOUBLE);
        this.value = Double.parseDouble(text);
    }
}
