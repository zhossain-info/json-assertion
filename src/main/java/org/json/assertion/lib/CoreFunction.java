package org.json.assertion.lib;

import org.json.assertion.SchemaValidator;
import org.json.assertion.exception.AssertionFailedError;
import org.json.assertion.exception.InvalidContextError;
import org.json.assertion.tree.ErrorList;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.utils.ArgInput;
import org.json.assertion.utils.Utils;

import java.util.List;

public class CoreFunction {

    private SchemaValidator validator = new SchemaValidator();

    public void minMax(JTFunction function, ArgInput input) {
        ErrorList errorList = ErrorList.getInstance();
        try {
            List<JTNode> arguments = function.getArguments();
            int arg1 = ((JTInteger) arguments.get(0)).getValue();
            int arg2 = ((JTInteger) arguments.get(1)).getValue();
            int arg3 = ((JTInteger) input.getInputChild()).getValue();

            if (arg1 > arg3 || arg2 < arg3) {
                //System.err.println("Mismatch found: Value outside of given range");
                errorList.add(new AssertionFailedError("Mismatch found: Value outside of given range"));
            }
        } catch (Exception e) {
            errorList.add(new InvalidContextError("context of minMax function invalid", e));
        }
    }

    public void containsAt(JTFunction function, ArgInput input) {
        ErrorList errorList = ErrorList.getInstance();
        try {
            List<JTNode> arguments = function.getArguments();
            int arg1 = ((JTInteger) arguments.get(0)).getValue();
            List<JTNode> args = arguments.subList(1, arguments.size());
            JTNode parent = input.getInputParent();
            JTNode node = parent.getChild(arg1);
            for (JTNode n : args) {
                int size = errorList.size();
                validator.matchCommon(n, node);
                if (errorList.size() == size) return;
                else errorList.clear(size);
            }
            //System.err.println("no alternative match with input in containsAt");
            errorList.add(new AssertionFailedError("no alternative match with input in containsAt"));
        } catch (Exception e) {
            errorList.add(new InvalidContextError("context of containsAt function invalid", e));
        }
    }

    public void containsKeys(JTFunction function, ArgInput input) {
        ErrorList errorList = ErrorList.getInstance();
        try {
            List<JTNode> arguments = function.getArguments();
            JTObject object = (JTObject) input.getInputParent();
            List<JTKey> keys = object.getKeys();
            for (JTNode n : arguments) {
                if (!Utils.search(keys, n)) {
                    errorList.add(new AssertionFailedError(((JTString) n).getText()
                            + " not found in containsKey"));
                }
            }
        } catch (Exception e) {
            errorList.add(new InvalidContextError("context of containsKeys function invalid", e));
        }
    }
}
