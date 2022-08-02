package org.json.assertion.lib;

import org.json.assertion.SchemaValidator;
import org.json.assertion.error.SchemaAssertionError;
import org.json.assertion.tree.ErrorStack;
import org.json.assertion.tree.SchemaContext;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.utils.TreeInput;

import java.util.List;

public class CoreFunction {

    private SchemaContext schemaContext;
    private SchemaValidator schemaValidator;
    private ErrorStack errorStack;

    public CoreFunction(SchemaContext schemaContext) {
        this.schemaContext = schemaContext;
        this.errorStack = schemaContext.getErrorStack();
        this.schemaValidator = schemaContext.getValidator();
    }

    public void minMax(JTFunction function, TreeInput input) {
        List<JTNode> arguments = function.getArguments();
        int arg1 = ((JTInteger) arguments.get(0)).getValue();
        int arg2 = ((JTInteger) arguments.get(1)).getValue();
        int arg3 = ((JTInteger) input.getInputChild()).getValue();

        if (arg1 > arg3 || arg2 < arg3) {
            //System.err.println("Mismatch found: Value outside of given range");
            errorStack.push(new SchemaAssertionError("Mismatch found: Value outside of given range"));
        }
    }

    public void containsAt(JTFunction function, TreeInput input) {
        List<JTNode> arguments = function.getArguments();
        int arg1 = ((JTInteger) arguments.get(0)).getValue();
        List<JTNode> args = arguments.subList(1, arguments.size());
        JTNode parent = input.getInputParent();
        JTNode node = parent.getChild(arg1);
        for (JTNode n : args) {
            int size = errorStack.size();
            schemaValidator.matchCommon(n, node);
            if (errorStack.size() == size) return;
            else errorStack.clear(size);
        }
        //System.err.println("no alternative match with input in containsAt");
        errorStack.push(new SchemaAssertionError("no alternative match with input in containsAt"));
    }

    public void containsKeys(JTFunction function, TreeInput input) {
        List<JTNode> arguments = function.getArguments();
        JTObject object = (JTObject) input.getInputParent();
        List<JTString> keys = object.getKeys();
        for (JTNode n : arguments) {
            if(!keys.contains(n)) {
                errorStack.push(new SchemaAssertionError(((JTString) n).getText()
                        + " not found in containsKey"));
            }
        }
    }
}
