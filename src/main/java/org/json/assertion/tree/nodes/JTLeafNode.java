package org.json.assertion.tree.nodes;

import lombok.NoArgsConstructor;
import org.json.assertion.utils.Location;

public abstract class JTLeafNode extends JTNode {

    public JTLeafNode(JTNode parent, Location location) {
        super(parent, location);
    }

    @Override
    public void addChild(JTNode child) {
        throw new UnsupportedOperationException("cannot add child to leaf node");
    }

    public abstract String getText();
}
