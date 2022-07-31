package org.json.assertion.exception;

import org.antlr.v4.runtime.ParserRuleContext;

public class InvalidContextError extends Error {

    public InvalidContextError(String message, Throwable e) {
        super(message, e);
    }
}
