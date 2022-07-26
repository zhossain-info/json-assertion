package org.json.assertion.tree;

import org.json.assertion.DataType;

import java.util.Locale;

public class JTDataType extends JTLeafNode {

    private DataType dataType;
    public JTDataType(JTNode parent, String type) {
        super(parent);
        this.dataType = DataType.valueOf(type.toUpperCase().substring(1));
    }

    public DataType getDataType() {
        return dataType;
    }
}
