package org.json.assertion.lib;

import org.json.assertion.SchemaValidator;
import org.json.assertion.error.SchemaAssertionError;
import org.json.assertion.tree.ErrorStack;
import org.json.assertion.tree.SchemaContext;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.utils.JsonScope;

import java.util.List;
import java.util.regex.Pattern;

public class CoreFunction {

    private SchemaValidator validator;
    private ErrorStack errorStack;

    public CoreFunction(ErrorStack errorStack) {
        this.validator = new SchemaValidator();
        this.errorStack = errorStack;
    }

    public void numMinmax(JTFunction function, JsonScope json) {
        double arg1 = ((JTNumber) function.getArgument(0)).doubleValue();
        double arg2 = ((JTNumber) function.getArgument(1)).doubleValue();
        double arg3 = ((JTNumber) json.getNode()).doubleValue();

        if (arg1 > arg3 || arg2 < arg3) {
            errorStack.push(new SchemaAssertionError("Value outside of given range"));
        }
    }

    public void intMinmax(JTFunction function, JsonScope json) {
        double arg1 = ((JTInteger) function.getArgument(0)).longValue();
        double arg2 = ((JTInteger) function.getArgument(1)).longValue();
        double arg3 = ((JTInteger) json.getNode()).longValue();

        if (arg1 > arg3 || arg2 < arg3) {
            errorStack.push(new SchemaAssertionError("Value outside of given range"));
        }
    }

    public void arrContainsAt(JTFunction function, JsonScope json) {
        int arg1 = ((JTInteger) function.getArgument(0)).intValue();
        List<JTNode> arguments = function.getArguments();
        List<JTNode> args = arguments.subList(1, arguments.size());
        JTNode parent = json.getParent();
        JTNode node = parent.getChild(arg1);
        for (JTNode n : args) {
            validator.reset();
            validator.matchCommon(n, node);
            if (validator.getErrorStack().size() == 0) return;
        }
        errorStack.push(new SchemaAssertionError("No alternative match with input in the position"));
    }

    public void arrElementOf(JTFunction function, JsonScope json) {
        JTNode arg1 = function.getArgument(0);
        List<JTNode> allArgs = function.getArguments();
        List<JTNode> args = allArgs.subList(1, allArgs.size());
        List<JTNode> jChildren = json.getParent().getChildren();
        for (JTNode n : args) {
            JTNode jChild = jChildren.get(((JTInteger) n).intValue());
            validator.reset();
            validator.matchCommon(arg1, jChild);
            if (validator.getErrorStack().size() == 0) return;
        }
        errorStack.push(new SchemaAssertionError("Element does not match with alternatives"));
    }

    public void objContainsKeys(JTFunction function, JsonScope json) {
        List<JTNode> arguments = function.getArguments();
        JTObject object = (JTObject) json.getParent();
        List<JTString> keys = object.getKeys();
        for (JTNode n : arguments) {
            if(!keys.contains(n)) {
                errorStack.push(new SchemaAssertionError(((JTString) n).getText()
                        + " not found in containsKey"));
            }
        }
    }

    public void regex(JTFunction function, JsonScope json) {
        JTString regex = (JTString) function.getArgument(0);
        JTLeafNode node = (JTLeafNode) json.getNode();
        if(!Pattern.matches(regex.getText(), node.getText())) {
            errorStack.push(new SchemaAssertionError(String.format(
                    "Regex %s does not match with %s", regex.getText(), node.getText())));
        }
    }

    public void strlenMinmax(JTFunction function, JsonScope json) {
        int arg1 = ((JTInteger) function.getArgument(0)).intValue();
        int arg2 = ((JTInteger) function.getArgument(1)).intValue();
        int length = ((JTLeafNode) json.getNode()).getText().length();
        if(arg1 > length || arg2 < length) {
            errorStack.push(new SchemaAssertionError("Length outside of given range"));
        }
    }

    public void arrlenMinmax(JTFunction function, JsonScope json) {
        int arg1 = ((JTInteger) function.getArgument(0)).intValue();
        int arg2 = ((JTInteger) function.getArgument(1)).intValue();
        int length = ((JTArray) json.getParent()).getChildren().size();
        if(arg1 > length || arg2 < length) {
            errorStack.push(new SchemaAssertionError("Length outside of given range"));
        }
    }
}
