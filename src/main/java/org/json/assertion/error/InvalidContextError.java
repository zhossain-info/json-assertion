package org.json.assertion.error;

public class InvalidContextError extends Error {

    public InvalidContextError(String message, Throwable e) {
        super(message, e);
    }
}
