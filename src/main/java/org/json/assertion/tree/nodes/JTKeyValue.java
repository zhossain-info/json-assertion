package org.json.assertion.tree.nodes;

import org.json.assertion.utils.Location;

import java.util.List;

public class JTKeyValue extends JTNode {

    public JTKeyValue(JTNode parent, Location location) {
        super(parent, location);
    }

    @Override
    public String toJson() {
        StringBuilder builder = new StringBuilder();
        List<JTNode> keyValue = getChildren();
        builder.append(keyValue.get(0).toJson())
                .append(':')
                .append(keyValue.get(1).toJson());
        return builder.toString();
    }
}
