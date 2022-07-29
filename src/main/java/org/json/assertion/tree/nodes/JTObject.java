package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

import java.util.HashMap;

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
}
