package org.json.assertion.tree;

import java.util.ArrayList;
import java.util.List;

public class ErrorList {

    // Fix: Thread Local
    private List<Error> list = new ArrayList<>();

    private static ErrorList errorList = new ErrorList();

    private ErrorList() {
    }

    public static ErrorList getInstance() {
        return errorList;
    }

    public void add(Error error) {
        list.add(error);
    }

    public void clear() {
        list.clear();
    }

    public void clear(int fromIndex) {
        list.subList(fromIndex, list.size()).clear();
    }

    public int size() {
        return list.size();
    }

    public List<Error> getList() {
        return list;
    }

    public Error get(int i) {
        return list.get(i);
    }
}
