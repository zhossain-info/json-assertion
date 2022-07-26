package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;

public class JTString extends JTLeafNode {

    private String value;
    public JTString(JTNode parent, String text) {
        super(parent);
        this.value = text;
    }
}
