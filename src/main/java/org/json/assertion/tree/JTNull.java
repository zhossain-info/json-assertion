package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;

public class JTNull extends JTLeafNode {

    private String value;

    public JTNull(JTNode parent, String text) {
        super(parent);
        this.value = text;
    }
}
