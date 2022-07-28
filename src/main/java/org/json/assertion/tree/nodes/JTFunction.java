package org.json.assertion.tree.nodes;

import lombok.Getter;
import lombok.Setter;
import org.json.assertion.tree.DataType;

@Getter @Setter
public class JTFunction extends JTLeafNode {
    private String name;
    private JTArgument arguments;
    private int level;
    private boolean optional;

    public JTFunction(JTNode parent, String name, int level) {
        super(parent);
        this.name = name;
        this.level = level;
    }
}
