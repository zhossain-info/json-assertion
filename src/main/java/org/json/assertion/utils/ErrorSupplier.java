package org.json.assertion.utils;

public interface ErrorSupplier <T> {
    public T get(String message, Throwable cause);
}
