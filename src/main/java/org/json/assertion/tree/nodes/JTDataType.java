package org.json.assertion.tree.nodes;

import org.json.assertion.tree.DataType;
import org.json.assertion.utils.Location;

public class JTDataType extends JTLeafNode {

    private DataType dataType;
    public JTDataType(JTNode parent, Location location, String type) {
        super(parent, location);
        this.dataType = DataType.from(type);
    }

    public DataType getDataType() {
        return dataType;
    }

    @Override
    public String getText() {
        return dataType.getName();
    }

    @Override
    public String toJson() {
        return dataType.getName();
    }
}
