package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.assertion.DataType;

public class JTKey extends JTDataNode {

    private String text;

    public JTKey(JTNode parent, String text) {
        super(parent, DataType.STRING);
        this.text = text;
    }
}
