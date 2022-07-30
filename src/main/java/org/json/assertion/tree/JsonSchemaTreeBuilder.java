package org.json.assertion.tree;

import lombok.Getter;
import org.json.assertion.antlr.JsonSchemaBaseListener;
import org.json.assertion.antlr.JsonSchemaParser;
import org.json.assertion.tree.nodes.*;

import java.util.Stack;

public class JsonSchemaTreeBuilder extends JsonSchemaBaseListener {
    @Getter
    private JTRoot root;
    private Stack<JTNode> stack = new Stack<>();

    @Override
    public void enterClassImport(JsonSchemaParser.ClassImportContext ctx) {
        ImportMap importMap = ImportMap.getInstance();
        importMap.addClass(ctx.CLASS_NAME().getText());
    }

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
        JTKeyValue keyValue = new JTKeyValue(stack.peek());
        new JTString(keyValue, ctx.STRING().getText());
        stack.push(keyValue);
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
    public void enterValidator(JsonSchemaParser.ValidatorContext ctx) {
        JTValidator validator = new JTValidator(stack.peek());
        if(ctx.OPTIONAL() != null) validator.setOptional(true);
        stack.push(validator);
    }

    @Override
    public void exitValidator(JsonSchemaParser.ValidatorContext ctx) {
        stack.pop();
    }

    @Override
    public void enterFunction(JsonSchemaParser.FunctionContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        int level = ctx.APPLY_LEVEL().getText().length();
        JTFunction function = new JTFunction(stack.peek(), name, level);
        JTArgument argument = new JTArgument(function);
        stack.push(argument);
    }

    @Override
    public void exitFunction(JsonSchemaParser.FunctionContext ctx) {
        stack.pop();
    }

    @Override
    public void enterDataType(JsonSchemaParser.DataTypeContext ctx) {
        new JTDataType(stack.peek(), ctx.DATATYPE().getText());
    }

    @Override
    public void enterBoolean(JsonSchemaParser.BooleanContext ctx) {
        new JTBoolean(stack.peek(), ctx.BOOLEAN().getText());
    }

    @Override
    public void enterString(JsonSchemaParser.StringContext ctx) {
        new JTString(stack.peek(), ctx.STRING().getText());
    }

    @Override
    public void enterInteger(JsonSchemaParser.IntegerContext ctx) {
        new JTInteger(stack.peek(), ctx.INTEGER().getText());
    }

    @Override
    public void enterFloat(JsonSchemaParser.FloatContext ctx) {
        new JTFloat(stack.peek(), ctx.FLOAT().getText());
    }

    @Override
    public void enterDecimal(JsonSchemaParser.DecimalContext ctx) {
        new JTDecimal(stack.peek(), ctx.DECIMAL().getText());
    }
}
