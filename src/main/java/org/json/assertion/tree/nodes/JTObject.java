package org.json.assertion.tree.nodes;

import org.json.assertion.utils.Location;

import java.util.ArrayList;
import java.util.List;

public class JTObject extends JTNode {

    public JTObject(JTNode parent, Location location) {
        super(parent, location);
    }

    public JTKeyValue getKeyValue(JTString key) {
        for(JTNode n : getChildren()) {
            if(key.equals(n.getChild(0))) return (JTKeyValue) n;
        }
        return null;
    }

    public List<JTString> getKeys() {
        List<JTString> keys = new ArrayList<>();
        for(JTNode n : getChildren()) {
            if(n instanceof JTKeyValue) {
                keys.add((JTString) n.getChild(0));
            }
        }
        return keys;
    }

    @Override
    public String toJson() {
        StringBuilder builder = new StringBuilder();
        List<JTNode> keyValues = getChildren();
        builder.append('{');
        for(int i = 0; i < keyValues.size(); i++) {
            if(i > 0) builder.append(',');
            builder.append(keyValues.get(i).toJson());
        }
        builder.append('}');
        return builder.toString();
    }
}
