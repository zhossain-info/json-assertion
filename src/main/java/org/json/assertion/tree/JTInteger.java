package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.assertion.DataType;

public class JTInteger extends JTDataNode {

    private int value;

    public JTInteger(JTNode parent, String text) {
        super(parent, DataType.INTEGER);
        this.value = Integer.parseInt(text);
    }
}
