package org.json.assertion.exception;

public class AssertionFailedError extends AssertionError {
    public AssertionFailedError(String message) {
        super(message, null);
    }

    public AssertionFailedError(String message, Throwable cause) {
        super(message, cause);
    }
}
