package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;

public class JTInteger extends JTLeafNode {

    private int value;

    public JTInteger(JTNode parent, String text) {
        super(parent);
        this.value = Integer.parseInt(text);
    }
}
