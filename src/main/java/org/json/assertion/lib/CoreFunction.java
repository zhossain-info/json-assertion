package org.json.assertion.lib;

import org.json.assertion.tree.nodes.JTFunction;
import org.json.assertion.tree.nodes.JTInteger;
import org.json.assertion.tree.nodes.JTNode;
import org.json.assertion.utils.ArgInput;

import java.util.List;

public class CoreFunction {

    public void minMax(JTFunction function, ArgInput input) {
        List<JTNode> arguments = function.getArguments();
        int arg1 = ((JTInteger) arguments.get(0)).getValue();
        int arg2 = ((JTInteger) arguments.get(1)).getValue();
        int arg3 = ((JTInteger) input.getNode()).getValue();

        if(arg1 > arg3 || arg2 < arg3) {
            System.err.println("Mismatch found: Value outside of given range");
        }
    }
}
