package org.json.assertion.tree;

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

    private String name;

    private DataType(String name) {
        this.name = name;
    }
}
