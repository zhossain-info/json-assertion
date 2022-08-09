package org.json.assertion.tree;

import lombok.Getter;
import org.json.assertion.antlr.JsonSchemaParserBaseListener;
import org.json.assertion.antlr.JsonSchemaParser;
import org.json.assertion.tree.nodes.*;
import org.json.assertion.utils.Location;

import java.util.Stack;

public class JsonSchemaTreeBuilder extends JsonSchemaParserBaseListener {
    @Getter
    private JTRoot root;
    private Stack<JTNode> stack = new Stack<>();

    private SchemaContext schemaContext;

    public JsonSchemaTreeBuilder(SchemaContext schemaContext) {
        this.schemaContext = schemaContext;
    }
    @Override
    public void enterClassImport(JsonSchemaParser.ClassImportContext ctx) {
        ImportFunction importFunction = schemaContext.getImportFunction();
        importFunction.addClass(ctx.CLASS_NAME().getText());
    }

    @Override
    public void enterJson(JsonSchemaParser.JsonContext ctx) {
        stack.push(new JTRoot(Location.from(ctx)));
    }

    @Override
    public void exitJson(JsonSchemaParser.JsonContext ctx) {
        this.root = (JTRoot) stack.pop();
    }

    @Override
    public void enterObject(JsonSchemaParser.ObjectContext ctx) {
        stack.push(new JTObject(stack.peek(), Location.from(ctx)));
    }

    @Override
    public void exitObject(JsonSchemaParser.ObjectContext ctx) {
        stack.pop();
    }

    @Override
    public void enterKeyValue(JsonSchemaParser.KeyValueContext ctx) {
        JTKeyValue keyValue = new JTKeyValue(stack.peek(), Location.from(ctx));
        new JTString(keyValue, Location.from(ctx), ctx.STRING().getText());
        stack.push(keyValue);
    }

    @Override
    public void exitKeyValue(JsonSchemaParser.KeyValueContext ctx) {
        stack.pop();
    }

    @Override
    public void enterArray(JsonSchemaParser.ArrayContext ctx) {
        stack.push(new JTArray(stack.peek(), Location.from(ctx)));
    }

    @Override
    public void exitArray(JsonSchemaParser.ArrayContext ctx) {
        stack.pop();
    }

    @Override
    public void enterValidator(JsonSchemaParser.ValidatorContext ctx) {
        JTValidator validator = new JTValidator(stack.peek(), Location.from(ctx));
        if(ctx.OPTIONAL() != null) validator.setOptional(true);
        stack.push(validator);
    }

    @Override
    public void exitValidator(JsonSchemaParser.ValidatorContext ctx) {
        stack.pop();
    }

    @Override
    public void enterFunction(JsonSchemaParser.FunctionContext ctx) {
        String name = ctx.FUNCTION_IDENTIFIER().getText();
        JTFunction function = new JTFunction(stack.peek(), Location.from(ctx), name);
        stack.push(function);
    }

    @Override
    public void exitFunction(JsonSchemaParser.FunctionContext ctx) {
        stack.pop();
    }

    @Override
    public void enterDataType(JsonSchemaParser.DataTypeContext ctx) {
        new JTDataType(stack.peek(), Location.from(ctx), ctx.DATATYPE().getText());
    }

    @Override
    public void enterBoolean(JsonSchemaParser.BooleanContext ctx) {
        new JTBoolean(stack.peek(), Location.from(ctx), ctx.BOOLEAN().getText());
    }

    @Override
    public void enterString(JsonSchemaParser.StringContext ctx) {
        new JTString(stack.peek(), Location.from(ctx), ctx.STRING().getText());
    }

    @Override
    public void enterInteger(JsonSchemaParser.IntegerContext ctx) {
        new JTInteger(stack.peek(), Location.from(ctx), ctx.INTEGER().getText());
    }

    @Override
    public void enterFloat(JsonSchemaParser.FloatContext ctx) {
        new JTFloat(stack.peek(), Location.from(ctx), ctx.FLOAT().getText());
    }

    @Override
    public void enterDecimal(JsonSchemaParser.DecimalContext ctx) {
        new JTDecimal(stack.peek(), Location.from(ctx), ctx.DECIMAL().getText());
    }
}
