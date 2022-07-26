package org.json.assertion.walker;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.json.assertion.antlr.JsonSchemaLexer;
import org.json.assertion.antlr.JsonSchemaParser;
import org.json.assertion.exception.InvalidContextException;
import org.json.assertion.tree.*;

public class JsonSchemaWalker {

    public JTRoot walk(String schema) {
        JsonSchemaLexer lexer = new JsonSchemaLexer(CharStreams.fromString(schema));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonSchemaParser parser = new JsonSchemaParser(tokens);
        JTRoot root = new JTRoot();
        walk(root, parser.json());
        return root;
    }

    public JTNode walk(JTNode parent, JsonSchemaParser.JsonContext ctx) {
        if(ctx.object() != null) return walk(parent, ctx.object());
        if(ctx.array() != null) return walk(parent, ctx.array());
        throw new InvalidContextException(ctx);
    }

    private JTNode walk(JTNode parent, JsonSchemaParser.ObjectContext ctx) {
        JTObject object = new JTObject(parent);
        for(JsonSchemaParser.KeyValueContext c : ctx.keyValue()) {
            JTKeyValue keyValue = new JTKeyValue(object);
            JTKey key = new JTKey(keyValue, c.KEY().getText());
            JTNode node = walk(keyValue, c.value());
        }
        return object;
    }

    private JTNode walk(JTNode parent, JsonSchemaParser.ArrayContext ctx) {
        JTArray array = new JTArray(parent);
        for(JsonSchemaParser.ValueContext c : ctx.value()) {
            walk(array, c);
        }
        return array;
    }

    private JTNode walk(JTNode parent, JsonSchemaParser.ValueContext ctx) {
        if(ctx.primitive() != null) return walk(parent, ctx.primitive());
        if(ctx.array() != null) return walk(parent, ctx.array());
        if(ctx.object() != null) return walk(parent, ctx.object());
        throw new InvalidContextException(ctx);
    }

    private JTNode walk(JTNode parent, JsonSchemaParser.PrimitiveContext ctx) {
        if(ctx.DATATYPE() != null) return new JTDataType(parent, ctx.DATATYPE().getText());
        throw new InvalidContextException(ctx);
    }
}
