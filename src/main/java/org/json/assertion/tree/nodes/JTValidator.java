package org.json.assertion.tree.nodes;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JTValidator extends JTNode {

    private boolean optional;

    public JTValidator(JTNode parent) {
        super(parent);
    }

    public JTDataType getJTDataType() {
        return (JTDataType) getInstanceOf(JTDataType.class);
    }

    public JTFunction getJTFunction() {
        return (JTFunction) getInstanceOf(JTFunction.class);
    }

    private JTNode getInstanceOf(Class<?> clazz) {
        for(JTNode n : this.getChildren()) {
            if (clazz.isInstance(n)) return n;
        }
        return null;
    }

    @Override
    public String toJson() {
        StringBuilder builder = new StringBuilder();
        if(optional) builder.append('?');
        JTFunction function = getJTFunction();
        JTDataType dataType = getJTDataType();
        if(function != null) builder.append(function.toJson());
        if(dataType != null) builder.append(dataType.toJson());
        return builder.toString();
    }
}
