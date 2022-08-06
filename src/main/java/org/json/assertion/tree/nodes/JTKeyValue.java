package org.json.assertion.tree.nodes;

import java.util.List;

public class JTKeyValue extends JTNode {

    public JTKeyValue(JTNode parent) {
        super(parent);
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
