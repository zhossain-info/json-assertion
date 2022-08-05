package org.json.assertion.error;

public class SchemaAssertionError extends AssertionError {
    private String expected;
    private String actual;

    public SchemaAssertionError(String message) {
        super(message, null);
    }

    public SchemaAssertionError(String message, Throwable cause) {
        super(message, cause);
    }

    public SchemaAssertionError(String message, String expected, String actual) {
        super(buildMessage(message, expected, actual), null);
        this.expected = expected;
        this.actual = actual;
    }

    private static String buildMessage(String message, String expected, String actual) {
        return String.format("%s%nExpected: %s%nActual: %s", message, expected, actual);
    }
}
