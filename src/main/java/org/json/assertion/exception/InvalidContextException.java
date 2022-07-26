package org.json.assertion.exception;

import org.antlr.v4.runtime.ParserRuleContext;

public class InvalidContextException extends RuntimeException {

    private ParserRuleContext context;
    public InvalidContextException(ParserRuleContext context) {
        this.context = context;
    }
}
