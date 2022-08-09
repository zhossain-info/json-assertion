package org.json.assertion.tree;

import lombok.Getter;
import org.antlr.v4.runtime.Token;
import org.json.assertion.antlr.JsonInputParserBaseListener;
import org.json.assertion.antlr.JsonInputParser;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.utils.Location;

import java.util.Stack;

public class JsonInputTreeBuilder extends JsonInputParserBaseListener {

    @Getter
    private JTRoot root;
    private Stack<JTNode> stack = new Stack<>();

    @Override
    public void enterJson(JsonInputParser.JsonContext ctx) {
        stack.push(new JTRoot(Location.from(ctx)));
    }

    @Override
    public void exitJson(JsonInputParser.JsonContext ctx) {
        this.root = (JTRoot) stack.pop();
    }

    @Override
    public void enterObject(JsonInputParser.ObjectContext ctx) {
        stack.push(new JTObject(stack.peek(), Location.from(ctx)));
    }

    @Override
    public void exitObject(JsonInputParser.ObjectContext ctx) {
        stack.pop();
    }

    @Override
    public void enterKeyValue(JsonInputParser.KeyValueContext ctx) {
        JTKeyValue keyValue = new JTKeyValue(stack.peek(), Location.from(ctx));
        new JTString(keyValue, Location.from(ctx), ctx.STRING().getText());
        stack.push(keyValue);
    }

    @Override
    public void exitKeyValue(JsonInputParser.KeyValueContext ctx) {
        stack.pop();
    }

    @Override
    public void enterArray(JsonInputParser.ArrayContext ctx) {
        stack.push(new JTArray(stack.peek(), Location.from(ctx)));
    }

    @Override
    public void exitArray(JsonInputParser.ArrayContext ctx) {
        stack.pop();
    }

    @Override
    public void enterBoolean(JsonInputParser.BooleanContext ctx) {
        new JTBoolean(stack.peek(), Location.from(ctx), ctx.BOOLEAN().getText());
    }

    @Override
    public void enterString(JsonInputParser.StringContext ctx) {
        new JTString(stack.peek(), Location.from(ctx), ctx.STRING().getText());
    }

    @Override
    public void enterInteger(JsonInputParser.IntegerContext ctx) {
        new JTInteger(stack.peek(), Location.from(ctx), ctx.INTEGER().getText());
    }

    @Override
    public void enterFloat(JsonInputParser.FloatContext ctx) {
        new JTFloat(stack.peek(), Location.from(ctx), ctx.FLOAT().getText());
    }

    @Override
    public void enterDecimal(JsonInputParser.DecimalContext ctx) {
        new JTDecimal(stack.peek(), Location.from(ctx), ctx.DECIMAL().getText());
    }

    @Override
    public void enterNull(JsonInputParser.NullContext ctx) {
        new JTNull(stack.peek(), Location.from(ctx), ctx.NULL().getText());
    }
}
