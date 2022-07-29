package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

public class JTDataType extends JTLeafNode {

    private DataType dataType;
    public JTDataType(JTNode parent, String type) {
        super(parent);
        this.dataType = DataType.from(type);
    }

    public DataType getDataType() {
        return dataType;
    }

    @Override
    public String getText() {
        return dataType.getName();
    }
}
