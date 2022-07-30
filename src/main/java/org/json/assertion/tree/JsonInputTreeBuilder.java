package org.json.assertion.tree;

import lombok.Getter;
import org.json.assertion.antlr.JsonInputBaseListener;
import org.json.assertion.antlr.JsonInputParser;
import org.json.assertion.tree.nodes.*;

import java.util.Stack;

public class JsonInputTreeBuilder extends JsonInputBaseListener {

    @Getter
    private JTRoot root;
    private Stack<JTNode> stack = new Stack<>();

    @Override
    public void enterJson(JsonInputParser.JsonContext ctx) {
        stack.push(new JTRoot());
    }

    @Override
    public void exitJson(JsonInputParser.JsonContext ctx) {
        this.root = (JTRoot) stack.pop();
    }

    @Override
    public void enterObject(JsonInputParser.ObjectContext ctx) {
        stack.push(new JTObject(stack.peek()));
    }

    @Override
    public void exitObject(JsonInputParser.ObjectContext ctx) {
        stack.pop();
    }

    @Override
    public void enterKeyValue(JsonInputParser.KeyValueContext ctx) {
        JTKeyValue keyValue = new JTKeyValue(stack.peek());
        new JTString(keyValue, ctx.STRING().getText());
        stack.push(keyValue);
    }

    @Override
    public void exitKeyValue(JsonInputParser.KeyValueContext ctx) {
        stack.pop();
    }

    @Override
    public void enterArray(JsonInputParser.ArrayContext ctx) {
        stack.push(new JTArray(stack.peek()));
    }

    @Override
    public void exitArray(JsonInputParser.ArrayContext ctx) {
        stack.pop();
    }

    @Override
    public void enterBoolean(JsonInputParser.BooleanContext ctx) {
        new JTBoolean(stack.peek(), ctx.BOOLEAN().getText());
    }

    @Override
    public void enterString(JsonInputParser.StringContext ctx) {
        new JTString(stack.peek(), ctx.STRING().getText());
    }

    @Override
    public void enterInteger(JsonInputParser.IntegerContext ctx) {
        new JTInteger(stack.peek(), ctx.INTEGER().getText());
    }

    @Override
    public void enterFloat(JsonInputParser.FloatContext ctx) {
        new JTFloat(stack.peek(), ctx.FLOAT().getText());
    }

    @Override
    public void enterDecimal(JsonInputParser.DecimalContext ctx) {
        new JTDecimal(stack.peek(), ctx.DECIMAL().getText());
    }

    @Override
    public void enterNull(JsonInputParser.NullContext ctx) {
        new JTNull(stack.peek(), ctx.NULL().getText());
    }
}
