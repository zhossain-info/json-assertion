package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.assertion.DataType;

public class JTNull extends JTDataNode {

    private String value;

    public JTNull(JTNode parent, String text) {
        super(parent, DataType.NULL);
        this.value = text;
    }
}
