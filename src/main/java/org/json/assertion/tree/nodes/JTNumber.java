package org.json.assertion.tree.nodes;

import org.json.assertion.utils.Location;

public abstract  class JTNumber extends JTLeafNode {

    public JTNumber(JTNode parent, Location location) {
        super(parent, location);
    }

    public abstract int intValue();
    public abstract long longValue();
    public abstract double doubleValue();
}
