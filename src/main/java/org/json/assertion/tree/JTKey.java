package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;

public class JTKey extends JTLeafNode {

    private String text;

    public JTKey(JTNode parent, String text) {
        super(parent);
        this.text = text;
    }
}
