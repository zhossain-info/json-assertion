package org.json.assertion.tree;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.json.assertion.antlr.JsonInputLexer;
import org.json.assertion.antlr.JsonInputParser;
import org.json.assertion.tree.nodes.JTRoot;

public class JsonInputTree {

    public JTRoot getRoot(String input) {
        Lexer lexer = new JsonInputLexer(CharStreams.fromString(input));
        JsonInputParser parser = new JsonInputParser(new CommonTokenStream(lexer));
//        parser.addErrorListener(new BaseErrorListener() {
//            @Override
//            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
//                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
//            }
//        });
        ParseTree tree = parser.json();
        JsonInputTreeBuilder treeBuilder = new JsonInputTreeBuilder();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(treeBuilder, tree);
        return treeBuilder.getRoot();
    }
}
