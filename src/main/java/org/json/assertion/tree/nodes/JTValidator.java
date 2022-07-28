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
        for(JTNode n : this.getChildren()) {
            if(n instanceof JTDataType) return (JTDataType) n;
        }
        return null;
    }
}
