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

    private SchemaContext schemaContext;
    private ErrorStack errorStack;

    public CoreFunction(SchemaContext schemaContext) {
        this.schemaContext = schemaContext;
        this.errorStack = schemaContext.getErrorStack();
    }

    public void min(JTFunction function, JsonScope json) {
        double arg1 = ((JTNumber) function.getArgument(0)).doubleValue();
        double arg2 = ((JTNumber) json.getNode()).doubleValue();

        if (arg1 > arg2) {
            errorStack.push(new SchemaAssertionError("Value less than minimum"));
        }
    }

    public void max(JTFunction function, JsonScope json) {
        double arg1 = ((JTNumber) function.getArgument(0)).doubleValue();
        double arg2 = ((JTNumber) json.getNode()).doubleValue();

        if (arg1 < arg2) {
            errorStack.push(new SchemaAssertionError("Value greater than maximum"));
        }
    }

    public void minMax(JTFunction function, JsonScope json) {
        double arg1 = ((JTNumber) function.getArgument(0)).doubleValue();
        double arg2 = ((JTNumber) function.getArgument(1)).doubleValue();
        double arg3 = ((JTNumber) json.getNode()).doubleValue();

        if (arg1 > arg3 || arg2 < arg3) {
            errorStack.push(new SchemaAssertionError("Value outside of given range"));
        }
    }

    public void containsAt(JTFunction function, JsonScope json) {
        int arg1 = (int) ((JTInteger) function.getArgument(0)).getValue();
        List<JTNode> arguments = function.getArguments();
        List<JTNode> args = arguments.subList(1, arguments.size());
        JTNode parent = json.getParent();
        JTNode node = parent.getChild(arg1);
        for (JTNode n : args) {
            SchemaValidator validator = new SchemaValidator();
            validator.matchCommon(n, node);
            if (errorStack.size() == 0) return;
        }
        errorStack.push(new SchemaAssertionError("No alternative match with input in the position"));
    }

    public void containsKeys(JTFunction function, JsonScope json) {
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

    public void strLenMinMax(JTFunction function, JsonScope json) {
        int arg1 = (int) ((JTInteger) function.getArgument(0)).getValue();
        int arg2 = (int) ((JTInteger) function.getArgument(1)).getValue();
        int length = ((JTLeafNode) json.getNode()).getText().length();
        if(arg1 > length || arg2 < length) {
            errorStack.push(new SchemaAssertionError("Length outside of given range"));
        }
    }

    public void arrLenMinMax(JTFunction function, JsonScope json) {
        int arg1 = (int) ((JTInteger) function.getArgument(0)).getValue();
        int arg2 = (int) ((JTInteger) function.getArgument(1)).getValue();
        int length = ((JTArray) json.getParent()).getChildren().size();
        if(arg1 > length || arg2 < length) {
            errorStack.push(new SchemaAssertionError("Length outside of given range"));
        }
    }
}
