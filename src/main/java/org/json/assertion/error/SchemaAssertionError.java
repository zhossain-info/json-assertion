package org.json.assertion.error;

import org.json.assertion.utils.Location;

public class SchemaAssertionError extends AssertionError {
    private String expected;
    private String actual;

    public SchemaAssertionError(String message, String expected, String actual) {
        super(buildMessage(message, expected, actual, null, null), null);
        this.expected = expected;
        this.actual = actual;
    }

    private static String buildMessage(String message, String expected, String actual,
                                       Location expectedLocation, Location actualLocation) {
        StringBuilder builder = new StringBuilder();
        builder.append(message).append(System.lineSeparator());
        builder.append(expected).append(System.lineSeparator());
        builder.append(actual).append(System.lineSeparator());
        return builder.toString();
    }
}
