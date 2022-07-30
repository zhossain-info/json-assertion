package org.json.assertion.tree.nodes;

import java.util.ArrayList;
import java.util.List;

public class JTObject extends JTNode {

    public JTObject(JTNode parent) {
        super(parent);
    }

    public JTKeyValue getKeyValue(JTKey key) {
        for(JTNode n : getChildren()) {
            if(key.equals(n.getChild(0))) return (JTKeyValue) n;
        }
        return null;
    }

    public List<JTKey> getKeys() {
        List<JTKey> keys = new ArrayList<>();
        for(JTNode n : getChildren()) {
            if(n instanceof JTKeyValue) {
                keys.add((JTKey) n.getChild(0));
            }
        }
        return keys;
    }
}
