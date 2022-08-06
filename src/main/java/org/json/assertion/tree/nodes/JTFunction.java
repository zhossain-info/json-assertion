package org.json.assertion.tree.nodes;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class JTFunction extends JTNode {
    private String name;

    public JTFunction(JTNode parent, String name) {
        super(parent);
        this.name = name;
    }

    public List<JTNode> getArguments() {
        return getChildren();
    }

    public JTNode getArgument(int index) {
        return getChildren().get(index);
    }

    @Override
    public String toJson() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append('(');
        List<JTNode> args = getArguments();
        for(int i = 0; i < args.size(); i++) {
            if(i > 0) builder.append(',');
            builder.append(args.get(i).toJson());
        }
        builder.append(')');
        return builder.toString();
    }
}
