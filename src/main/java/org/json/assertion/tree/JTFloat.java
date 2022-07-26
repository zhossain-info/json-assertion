package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;

public class JTFloat extends JTLeafNode {

    private float value;

    public JTFloat(JTNode parent, String text) {
        super(parent);
        this.value = Float.parseFloat(text);
    }
}
