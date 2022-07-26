package org.json.assertion.walker;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.json.assertion.antlr.JsonInputLexer;
import org.json.assertion.antlr.JsonInputParser;
import org.json.assertion.exception.InvalidContextException;
import org.json.assertion.tree.*;

public class JsonInputWalker {

    public JTRoot walk(String json) {
        JsonInputLexer lexer = new JsonInputLexer(CharStreams.fromString(json));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonInputParser parser = new JsonInputParser(tokens);
        JTRoot root = new JTRoot();
        walk(root, parser.json());
        return root;
    }

    public JTNode walk(JTNode parent, JsonInputParser.JsonContext ctx) {
        if(ctx.object() != null) return walk(parent, ctx.object());
        if(ctx.array() != null) return walk(parent, ctx.array());
        throw new InvalidContextException(ctx);
    }

    private JTNode walk(JTNode parent, JsonInputParser.ObjectContext ctx) {
        JTObject object = new JTObject(parent);
        for(JsonInputParser.KeyValueContext c : ctx.keyValue()) {
            JTKeyValue keyValue = new JTKeyValue(object);
            JTKey key = new JTKey(keyValue, c.STRING().getText());
            JTNode node = walk(keyValue, c.value());
        }
        return object;
    }

    private JTNode walk(JTNode parent, JsonInputParser.ArrayContext ctx) {
        JTArray array = new JTArray(parent);
        for(JsonInputParser.ValueContext c : ctx.value()) {
            walk(array, c);
        }
        return array;
    }

    private JTNode walk(JTNode parent, JsonInputParser.ValueContext ctx) {
        if(ctx.primitive() != null) return walk(parent, ctx.primitive());
        if(ctx.array() != null) return walk(parent, ctx.array());
        if(ctx.object() != null) return walk(parent, ctx.object());
        throw new InvalidContextException(ctx);
    }

    private JTNode walk(JTNode parent, JsonInputParser.PrimitiveContext ctx) {
        if(ctx.BOOLEAN() != null) return new JTBoolean(parent, ctx.BOOLEAN().getText());
        if(ctx.STRING() != null) return new JTString(parent, ctx.STRING().getText());
        if(ctx.INTEGER() != null) return new JTInteger(parent, ctx.INTEGER().getText());
        if(ctx.FLOAT() != null) return new JTFloat(parent, ctx.FLOAT().getText());
        if(ctx.DOUBLE() != null) return new JTDouble(parent, ctx.DOUBLE().getText());
        if(ctx.NULL() != null) return new JTNull(parent, ctx.NULL().getText());
        throw new InvalidContextException(ctx);
    }
}
