package org.json.assertion.tree;

import lombok.Getter;
import org.json.assertion.antlr.JsonInputParser;
import org.json.assertion.antlr.JsonSchemaBaseListener;
import org.json.assertion.antlr.JsonSchemaParser;
import org.json.assertion.tree.nodes.*;

import java.util.Stack;

public class JsonSchemaTreeBuilder extends JsonSchemaBaseListener {
    @Getter
    private JTRoot root;
    private Stack<JTNode> stack = new Stack<>();

    @Override
    public void enterJson(JsonSchemaParser.JsonContext ctx) {
        stack.push(new JTRoot());
    }

    @Override
    public void exitJson(JsonSchemaParser.JsonContext ctx) {
        this.root = (JTRoot) stack.pop();
    }

    @Override
    public void enterObject(JsonSchemaParser.ObjectContext ctx) {
        stack.push(new JTObject(stack.peek()));
    }

    @Override
    public void exitObject(JsonSchemaParser.ObjectContext ctx) {
        stack.pop();
    }

    @Override
    public void enterKeyValue(JsonSchemaParser.KeyValueContext ctx) {
        stack.push(new JTKeyValue(stack.peek()));
    }

    @Override
    public void exitKeyValue(JsonSchemaParser.KeyValueContext ctx) {
        stack.pop();
    }

    @Override
    public void enterArray(JsonSchemaParser.ArrayContext ctx) {
        stack.push(new JTArray(stack.peek()));
    }

    @Override
    public void exitArray(JsonSchemaParser.ArrayContext ctx) {
        stack.pop();
    }

    @Override
    public void enterKey(JsonSchemaParser.KeyContext ctx) {
        new JTKey(stack.peek(), ctx.STRING().getText());
    }

    @Override
    public void enterDataType(JsonSchemaParser.DataTypeContext ctx) {
        new JTDataType(stack.peek(), ctx.DATATYPE().getText());
    }
}
