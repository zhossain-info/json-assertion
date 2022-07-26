package org.json.assertion.tree;

import org.json.assertion.DataType;

public class JTDataNode extends JTLeafNode {

    private DataType dataType;

    public JTDataNode(JTNode parent, DataType dataType) {
        super(parent);
        this.dataType = dataType;
    }

    public DataType getDataType() {
        return dataType;
    }
}
