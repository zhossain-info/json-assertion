package org.json.assertion.tree;

import lombok.Getter;
import org.json.assertion.tree.nodes.*;

import java.util.TreeMap;

public enum DataType {
    VALIDATOR("validator", JTValidator.class),
    FUNCTION("function", JTFunction.class),
    ARGUMENT("argument", JTArgument.class),
    DATA_TYPE("dataType", JTDataType.class),
    OBJECT("object", JTObject.class),
    KEY_VALUE("keyValue", JTKeyValue.class),
    ARRAY("array", JTArray.class),
    STRING("string", JTString.class),
    INTEGER("integer", JTInteger.class),
    FLOAT("float", JTFloat.class),
    DECIMAL("decimal", JTDecimal.class),
    NUMBER("number", JTInteger.class, JTFloat.class, JTDecimal.class),
    BOOLEAN("boolean", JTBoolean.class),
    NULL("null", JTNull.class);

    private static TreeMap<String, DataType> dataTypeMap = new TreeMap<>();

    static {
        for(DataType d : values()) {
            dataTypeMap.put(d.getName(), d);
        }
    }

    @Getter
    private String name;

    @Getter
    private Class<?>[] nodeClasses;

    private DataType(String name, Class<?>... nodeClasses) {
        this.name = name;
        this.nodeClasses = nodeClasses;
    }

    public static DataType from(String string) {
        if(string.startsWith("#")) string = string.substring(1);
        return dataTypeMap.get(string);
    }
}
