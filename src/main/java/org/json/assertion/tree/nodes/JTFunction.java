package org.json.assertion.tree.nodes;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class JTFunction extends JTNode {
    private String name;
    //private boolean optional;

    public JTFunction(JTNode parent, String name) {
        super(parent);
        this.name = name;
    }

    public List<JTNode> getArguments() {
        JTArgument argument = (JTArgument) getChild(0);
        return argument.getChildren();
    }

    public JTNode getArgument(int index) {
        JTArgument argument = (JTArgument) getChild(0);
        return argument.getChildren().get(index);
    }

    @Override
    public String toJson() {
        StringBuilder builder = new StringBuilder();
        //if(optional) builder.append('?');
        builder.append(name).append('(');
        List<JTNode> args = getArguments();
        for(int i = 0; i < args.size(); i++) {
            if(i > 0) builder.append(',');
            builder.append(args.get(i).toJson());
        }
        return builder.toString();
    }
}
