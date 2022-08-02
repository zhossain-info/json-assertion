package org.json.assertion.tree;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.json.assertion.antlr.JsonInputLexer;
import org.json.assertion.antlr.JsonInputParser;
import org.json.assertion.error.JsonInputParserError;
import org.json.assertion.tree.nodes.JTRoot;
import org.json.assertion.utils.CommonErrorListener;

public class JsonInputTree {

    private ErrorStack errorStack;

    public JsonInputTree(ErrorStack errorStack) {
        this.errorStack = errorStack;
    }

    public JTRoot getRoot(String input) {
        Lexer lexer = new JsonInputLexer(CharStreams.fromString(input));
        JsonInputParser parser = new JsonInputParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new CommonErrorListener(errorStack,
                (message, cause) -> new JsonInputParserError(message, cause)));
        ParseTree tree = parser.json();
        JsonInputTreeBuilder treeBuilder = new JsonInputTreeBuilder();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(treeBuilder, tree);
        return treeBuilder.getRoot();
    }
}
