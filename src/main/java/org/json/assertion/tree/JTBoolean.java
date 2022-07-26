package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;

public class JTBoolean extends JTLeafNode {

    private boolean value;

    public JTBoolean(JTNode parent, String text) {
        super(parent);
        this.value = Boolean.valueOf(text);
    }
}
