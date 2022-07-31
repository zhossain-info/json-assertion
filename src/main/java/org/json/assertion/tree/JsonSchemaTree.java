package org.json.assertion.tree;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.json.assertion.antlr.JsonSchemaLexer;
import org.json.assertion.antlr.JsonSchemaParser;
import org.json.assertion.tree.nodes.JTRoot;

public class JsonSchemaTree {

    private SchemaContext schemaContext;
    public JsonSchemaTree(SchemaContext schemaContext) {
        this.schemaContext = schemaContext;
    }
    public JTRoot getRoot(String input) {
        Lexer lexer = new JsonSchemaLexer(CharStreams.fromString(input));
        JsonSchemaParser parser = new JsonSchemaParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.json();
        JsonSchemaTreeBuilder treeBuilder = new JsonSchemaTreeBuilder(schemaContext);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(treeBuilder, tree);
        return treeBuilder.getRoot();
    }
}
