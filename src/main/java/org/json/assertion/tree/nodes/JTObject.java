package org.json.assertion.tree.nodes;

import java.util.ArrayList;
import java.util.List;

public class JTObject extends JTNode {

    public JTObject(JTNode parent) {
        super(parent);
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
}
