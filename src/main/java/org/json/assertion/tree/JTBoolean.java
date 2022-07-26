package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.assertion.DataType;

public class JTBoolean extends JTDataNode {

    private boolean value;

    public JTBoolean(JTNode parent, String text) {
        super(parent, DataType.BOOLEAN);
        this.value = Boolean.valueOf(text);
    }
}
