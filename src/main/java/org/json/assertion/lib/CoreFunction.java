package org.json.assertion.lib;

import org.json.assertion.SchemaValidator;
import org.json.assertion.error.SchemaAssertionError;
import org.json.assertion.tree.ErrorStack;
import org.json.assertion.tree.SchemaContext;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.utils.AssertionBuilder;
import org.json.assertion.utils.JsonScope;

import java.util.List;
import java.util.regex.Pattern;

import static org.json.assertion.utils.AssertionBuilder.Type.*;


public class CoreFunction {

    private SchemaValidator validator;
    private ErrorStack errorStack;

    public CoreFunction(SchemaContext schemaContext) {
        this.validator = schemaContext.getSchemaValidator();
        this.errorStack = schemaContext.getErrorStack();
    }

    public void numMinmax(JTFunction function, JsonScope json) {
        double arg1 = ((JTNumber) function.getArgument(0)).doubleValue();
        double arg2 = ((JTNumber) function.getArgument(1)).doubleValue();
        double arg3 = ((JTNumber) json.getNode()).doubleValue();

        if (arg1 > arg3 || arg2 < arg3) {
            AssertionBuilder expected = new AssertionBuilder(EXPECTED);
            AssertionBuilder actual = new AssertionBuilder(ACTUAL);
            errorStack.push(new SchemaAssertionError(
                    "Value outside of given range",
                    expected.asRange(function.getArguments(0, 2)),
                    actual.asValue(json.getNode())));
        }
    }

    public void intMinmax(JTFunction function, JsonScope json) {
        double arg1 = ((JTInteger) function.getArgument(0)).longValue();
        double arg2 = ((JTInteger) function.getArgument(1)).longValue();
        double arg3 = ((JTInteger) json.getNode()).longValue();

        if (arg1 > arg3 || arg2 < arg3) {
            AssertionBuilder expected = new AssertionBuilder(EXPECTED);
            AssertionBuilder actual = new AssertionBuilder(ACTUAL);
            errorStack.push(new SchemaAssertionError(
                    "Value outside of given range",
                    expected.asRange(function.getArguments(0, 2)),
                    actual.asValue(json.getNode())));
        }
    }

    public void arrContainsAt(JTFunction function, JsonScope json) {
        AssertionBuilder expected = new AssertionBuilder(EXPECTED);
        AssertionBuilder actual = new AssertionBuilder(ACTUAL);
        int arg1 = ((JTInteger) function.getArgument(0)).intValue();
        List<JTNode> args = function.getArguments(1);
        JTNode parent = json.getParent();
        JTNode node = parent.getChild(arg1);
        for (JTNode n : args) {
            expected.add(n);
            if(matchCommon(n, node)) return;
        }
        errorStack.push(new SchemaAssertionError(
                "No alternative match with the element of index",
                expected.asAlternative(),
                actual.asValue(node)));
    }

    public void arrElementOf(JTFunction function, JsonScope json) {
        AssertionBuilder expected = new AssertionBuilder(EXPECTED);
        AssertionBuilder actual = new AssertionBuilder(ACTUAL);
        JTNode arg1 = function.getArgument(0);
        List<JTNode> args = function.getArguments(1);
        List<JTNode> jChildren = json.getParent().getChildren();
        for (JTNode n : args) {
            JTNode jChild = jChildren.get(((JTInteger) n).intValue());
            actual.add(jChild);
            if(matchCommon(arg1, jChild)) return;
        }
        errorStack.push(new SchemaAssertionError(
                "Element does not match with any alternatives",
                expected.asValue(arg1),
                actual.asAlternative()));
    }

    public void objContainsKeys(JTFunction function, JsonScope json) {
        List<JTNode> arguments = function.getArguments();
        JTObject object = (JTObject) json.getParent();
        List<JTString> keys = object.getKeys();
        for (JTNode n : arguments) {
            if(!keys.contains(n)) {
                AssertionBuilder expected = new AssertionBuilder(EXPECTED);
                AssertionBuilder actual = new AssertionBuilder(ACTUAL);
                errorStack.push(new SchemaAssertionError(
                        "Mandatory key not found",
                        expected.asValue(n),
                        actual.asNotFound(object)));
            }
        }
    }

    public void arrContainsElement(JTFunction function, JsonScope json) {
        List<JTNode> arguments = function.getArguments();
        JTArray array = (JTArray) json.getParent();
        List<JTNode> elements = array.getChildren();
        for (JTNode n : arguments) {
            if(!contains(n, elements)) {
                AssertionBuilder expected = new AssertionBuilder(EXPECTED);
                AssertionBuilder actual = new AssertionBuilder(ACTUAL);
                errorStack.push(new SchemaAssertionError(
                        "Mandatory element not found in array",
                        expected.asValue(n),
                        actual.asNotFound(array)));
            }
        }
    }

    private boolean contains(JTNode n, List<JTNode> elements) {
        for(JTNode e : elements) {
            if(matchCommon(n, e)) {
                return true;
            }
        }
        return false;
    }

    public void regex(JTFunction function, JsonScope json) {
        JTString regex = (JTString) function.getArgument(0);
        JTLeafNode node = (JTLeafNode) json.getNode();
        if(!Pattern.matches(regex.getText(), node.getText())) {
            AssertionBuilder expected = new AssertionBuilder(EXPECTED);
            AssertionBuilder actual = new AssertionBuilder(ACTUAL);
            errorStack.push(new SchemaAssertionError(
                    "Text not match with regex",
                    expected.asValue(regex),
                    actual.asValue(node)));
        }
    }

    public void strlenMinmax(JTFunction function, JsonScope json) {
        int arg1 = ((JTInteger) function.getArgument(0)).intValue();
        int arg2 = ((JTInteger) function.getArgument(1)).intValue();
        int length = ((JTLeafNode) json.getNode()).getText().length();
        if(arg1 > length || arg2 < length) {
            AssertionBuilder expected = new AssertionBuilder(EXPECTED);
            AssertionBuilder actual = new AssertionBuilder(ACTUAL);
            errorStack.push(new SchemaAssertionError("String length outside of given range",
                    expected.asRange(function.getArguments(0, 2)),
                    actual.asObject(json.getNode(), length)));
        }
    }

    public void arrlenMinmax(JTFunction function, JsonScope json) {
        int arg1 = ((JTInteger) function.getArgument(0)).intValue();
        int arg2 = ((JTInteger) function.getArgument(1)).intValue();
        int length = ((JTArray) json.getParent()).getChildren().size();
        if(arg1 > length || arg2 < length) {
            AssertionBuilder expected = new AssertionBuilder(EXPECTED);
            AssertionBuilder actual = new AssertionBuilder(ACTUAL);
            errorStack.push(new SchemaAssertionError("Array length outside of given range",
                    expected.asRange(function.getArguments(0, 2)),
                    actual.asObject(json.getParent(), length)));
        }
    }

    private boolean matchCommon(JTNode schema, JTNode json) {
        int mark = errorStack.size();
        validator.matchCommon(schema, json);
        if(errorStack.size() == mark) return true;
        errorStack.clear(mark);
        return false;
    }
}
