package org.json.assertion.tree.nodes;

import lombok.*;
import org.json.assertion.tree.DataType;

import java.util.List;

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
}
