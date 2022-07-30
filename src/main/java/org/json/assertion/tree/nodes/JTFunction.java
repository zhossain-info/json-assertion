package org.json.assertion.tree.nodes;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class JTFunction extends JTNode {
    private String name;
    private boolean optional;

    public JTFunction(JTNode parent, String name) {
        super(parent);
        this.name = name;
    }

    public List<JTNode> getArguments() {
        JTArgument argument = (JTArgument) getChild(0);
        return argument.getChildren();
    }
}
