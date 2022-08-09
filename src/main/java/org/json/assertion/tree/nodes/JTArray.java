package org.json.assertion.tree.nodes;

import org.json.assertion.utils.Location;

import java.util.List;

public class JTArray extends JTNode {

    public JTArray(JTNode parent, Location location) {
        super(parent, location);
    }

    @Override
    public String toJson() {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        List<JTNode> children = getChildren();
        for(int i = 0; i < children.size(); i++) {
            if(i > 0) builder.append(',');
            builder.append(children.get(i).toJson());
        }
        builder.append(']');
        return builder.toString();
    }
}
