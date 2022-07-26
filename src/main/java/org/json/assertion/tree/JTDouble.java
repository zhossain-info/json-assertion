package org.json.assertion.tree;

import org.antlr.v4.runtime.tree.TerminalNode;

public class JTDouble extends JTLeafNode {

    private double value;

    public JTDouble(JTNode parent, String text) {
        super(parent);
        this.value = Double.parseDouble(text);
    }
}
