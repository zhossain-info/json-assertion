package org.json.assertion.exception;

import org.antlr.v4.runtime.ParserRuleContext;

public class InvalidContextError extends Error {

    private ParserRuleContext context;
    public InvalidContextError(ParserRuleContext context) {
        this.context = context;
    }

    public InvalidContextError(String message, Throwable e) {
        super(message, e);
    }
}
