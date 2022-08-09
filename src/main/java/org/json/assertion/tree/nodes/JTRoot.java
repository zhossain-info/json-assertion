package org.json.assertion.tree.nodes;

import org.json.assertion.utils.Location;

public class JTRoot extends JTNode {

    public JTRoot(Location location) {
        super(location);
    }

    @Override
    public String toJson() {
        return getChild(0).toJson();
    }
}
