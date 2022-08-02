package org.json.assertion.error;

public class SchemaAssertionError extends AssertionError {
    public SchemaAssertionError(String message) {
        super(message, null);
    }

    public SchemaAssertionError(String message, Throwable cause) {
        super(message, cause);
    }
}
