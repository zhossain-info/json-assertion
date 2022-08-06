package org.json.assertion.tree.nodes;

public class JTRoot extends JTNode {

    public JTRoot() {
    }

    @Override
    public String toJson() {
        return getChild(0).toJson();
    }
}
