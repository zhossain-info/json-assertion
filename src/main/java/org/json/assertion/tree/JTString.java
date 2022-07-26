package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.assertion.DataType;

public class JTString extends JTDataNode {

    private String value;
    public JTString(JTNode parent, String text) {
        super(parent, DataType.STRING);
        this.value = text;
    }
}
