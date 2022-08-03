package org.json.assertion.tree;


import lombok.AllArgsConstructor;
import org.json.assertion.error.InvalidContextError;
import org.json.assertion.tree.nodes.JTFunction;
import org.json.assertion.utils.JsonScope;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class ImportFunction {

    @AllArgsConstructor
    private class FunctionTuple {
        public Object object;
        public Method method;
    }

    private SchemaContext schemaContext;
    private HashMap<String, FunctionTuple> functionMap = new HashMap<>();

    public ImportFunction(SchemaContext schemaContext) {
        this.schemaContext = schemaContext;
    }

    public void addClass(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            Object object = clazz.getConstructor(SchemaContext.class)
                    .newInstance(schemaContext);

            for (Method m : clazz.getDeclaredMethods()) {
                if(!Modifier.isPublic(m.getModifiers())) continue;
                functionMap.put(m.getName(), new FunctionTuple(object, m));
            }
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void invokeFunction(JTFunction function, JsonScope input) {
        try {
            String functionName = function.getName().substring(1);
            FunctionTuple tuple = functionMap.get(functionName);
            tuple.method.invoke(tuple.object, function, input);
        } catch (Exception e) {
            handleException(e);
        }
    }

    private void handleException(Exception exception) {
        Throwable throwable = exception;
        if(exception.getCause() != null) throwable = exception.getCause();
        schemaContext.getErrorStack().push(new InvalidContextError(
                throwable.getMessage(), throwable));
    }

    public void clear() {
        functionMap.clear();
    }
}
