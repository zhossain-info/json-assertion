package org.json.assertion.tree.nodes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.json.assertion.utils.Location;
import org.json.assertion.utils.Utilities;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class JTNode {

    private JTNode parent;
    private Location location;
    private List<JTNode> children = new ArrayList<>();

    public JTNode(Location location) {
        this.location = location;
    }

    public JTNode(JTNode parent, Location location) {
        this.parent = parent;
        this.location = location;
        parent.addChild(this);
    }

    public void addChild(JTNode child) {
        children.add(child);
    }

    public JTNode getChild(int index) {
        return children.get(index);
    }

    public abstract String toJson();

    @Override
    public String toString() {
        return Utilities.toString(this);
    }
}
