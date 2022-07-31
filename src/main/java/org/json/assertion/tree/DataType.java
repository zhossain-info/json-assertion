package org.json.assertion.tree;

import lombok.Getter;
import org.json.assertion.tree.nodes.*;

import java.util.TreeMap;

public enum DataType {
    OBJECT("object", JTObject.class),
    ARRAY("array", JTArray.class),
    STRING("string", JTString.class),
    INTEGER("integer", JTInteger.class),
    FLOAT("float", JTFloat.class),
    DECIMAL("decimal", JTDecimal.class),
    BOOLEAN("boolean", JTBoolean.class),
    NULL("null", JTNull.class),
    NUMBER("number", JTInteger.class, JTFloat.class, JTDecimal.class),
    ANY("any", JTObject.class, JTArray.class, JTString.class, JTInteger.class,
            JTFloat.class, JTDecimal.class, JTBoolean.class, JTNull.class);


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
