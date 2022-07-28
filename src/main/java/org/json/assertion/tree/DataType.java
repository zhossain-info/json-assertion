package org.json.assertion.tree;

import lombok.Getter;

import java.util.TreeMap;

public enum DataType {
    OBJECT("object"),
    KEY_VALUE("keyValue"),
    KEY_STRING("keyString"),
    ARRAY("array"),
    STRING("string"),
    INTEGER("integer"),
    FLOAT("float"),
    DECIMAL("decimal"),
    BOOLEAN("boolean"),
    NULL("null");

    private static TreeMap<String, DataType> dataTypeMap = new TreeMap<>();

    static {
        for(DataType d : values()) {
            dataTypeMap.put(d.getName(), d);
        }
    }

    @Getter
    private String name;

    private DataType(String name) {
        this.name = name;
    }

    public static DataType from(String string) {
        if(string.startsWith("#")) string = string.substring(1);
        return dataTypeMap.get(string);
    }
}
