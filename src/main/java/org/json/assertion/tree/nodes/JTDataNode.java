package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;

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
