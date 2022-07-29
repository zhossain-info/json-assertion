package org.json.assertion.tree.nodes;

import lombok.Getter;
import lombok.Setter;
import org.json.assertion.tree.DataType;

import java.util.List;

@Getter @Setter
public class JTFunction extends JTNode {
    private String name;
    private int level;
    private boolean optional;

    public JTFunction(JTNode parent, String name, int level) {
        super(parent);
        this.name = name;
        this.level = level;
    }

    public List<JTNode> getArguments() {
        JTArgument argument = (JTArgument) getChild(0);
        return argument.getChildren();
    }
}
