package org.json.assertion.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

@AllArgsConstructor
@Getter
public class Location {
    int line;
    int charPosition;

    public static Location from(ParserRuleContext context) {
        Token token = context.getStart();
        return new Location(token.getLine(), token.getCharPositionInLine());
    }

    public String toString() {
        return String.format("[Line %s:%s]", line, charPosition);
    }
}
