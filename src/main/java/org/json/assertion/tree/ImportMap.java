package org.json.assertion.tree;


import org.apache.commons.lang3.tuple.Pair;
import org.json.assertion.tree.nodes.JTFunction;
import org.json.assertion.utils.ArgInput;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class ImportMap {
    private HashMap<String, Pair<Object, Method>> map = new HashMap<>();
    private static ImportMap importMap = new ImportMap();

    private ImportMap() {
    }

    public static ImportMap getInstance() {
        return importMap;
    }

    public void addClass(String className) {

        try {
            Class<?> clazz = Class.forName(className);
            Object object = clazz.getConstructor().newInstance();

            for (Method m : clazz.getDeclaredMethods()) {
                if(!Modifier.isPublic(m.getModifiers())) continue;
                map.put(m.getName(), Pair.of(object, m));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public void invokeFunction(JTFunction function, ArgInput input) {
        try {
            Pair<Object, Method> pair = map.get(function.getName());
            pair.getRight().invoke(pair.getLeft(), function, input);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void clear() {
        map.clear();
    }
}
