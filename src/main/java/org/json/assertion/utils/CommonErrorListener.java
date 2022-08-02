package org.json.assertion.utils;

import org.antlr.v4.runtime.*;
import org.apache.commons.lang3.StringUtils;
import org.json.assertion.tree.ErrorStack;

import java.util.List;
import java.util.stream.Collectors;

public class CommonErrorListener extends BaseErrorListener {

    private ErrorStack errorStack;
    private ErrorSupplier<Error> errorSupplier;

    public CommonErrorListener(ErrorStack errorStack, ErrorSupplier<Error> errorSupplier) {
        this.errorStack = errorStack;
        this.errorSupplier = errorSupplier;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {

        String errorMessage = String.format("line %d:%d %s%n", line, charPositionInLine, msg);
        String errorLine = markErrorLine(recognizer, (Token)offendingSymbol, line, charPositionInLine);
        errorStack.push(errorSupplier.get(errorMessage + errorLine, null));
    }

    protected String markErrorLine(Recognizer recognizer, Token offendingToken, int line,
                                   int charPositionInLine) {
        StringBuilder builder = new StringBuilder();
        CommonTokenStream tokens = (CommonTokenStream) recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        List<String> lines = input.lines().collect(Collectors.toList());
        builder.append(lines.get(line - 1)).append(System.lineSeparator());
        builder.append(StringUtils.repeat(" ", charPositionInLine));

        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if (start >= 0 && stop >= 0) {
            builder.append(StringUtils.repeat("^", stop - start + 1));
        }
        builder.append(System.lineSeparator());
        return builder.toString();
    }
}
