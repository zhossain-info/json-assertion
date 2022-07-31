package org.json.assertion.tree;

import java.util.Stack;

public class ErrorStack {

    private Stack<Error> stack = new Stack<>();

    public ErrorStack() {
    }

    public void push(Error error) {
        stack.push(error);
    }

    public void clear() {
        stack.clear();
    }

    public void clear(int fromIndex) {
        stack.subList(fromIndex, stack.size()).clear();
    }

    public int size() {
        return stack.size();
    }

    public Stack<Error> getStack() {
        return stack;
    }

    public Error get(int i) {
        return stack.get(i);
    }
}
