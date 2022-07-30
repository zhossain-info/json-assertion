// Generated from /home/zahid/Projects/intellij-ws1/json-assertion/json-assertion/src/main/java/org/json/assertion/antlr/JsonSchema.g4 by ANTLR 4.10.1
package org.json.assertion.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonSchemaParser}.
 */
public interface JsonSchemaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonSchemaParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonSchemaParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#classImport}.
	 * @param ctx the parse tree
	 */
	void enterClassImport(JsonSchemaParser.ClassImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#classImport}.
	 * @param ctx the parse tree
	 */
	void exitClassImport(JsonSchemaParser.ClassImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JsonSchemaParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JsonSchemaParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#keyValueFunction}.
	 * @param ctx the parse tree
	 */
	void enterKeyValueFunction(JsonSchemaParser.KeyValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#keyValueFunction}.
	 * @param ctx the parse tree
	 */
	void exitKeyValueFunction(JsonSchemaParser.KeyValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(JsonSchemaParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(JsonSchemaParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JsonSchemaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JsonSchemaParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JsonSchemaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JsonSchemaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#validator}.
	 * @param ctx the parse tree
	 */
	void enterValidator(JsonSchemaParser.ValidatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#validator}.
	 * @param ctx the parse tree
	 */
	void exitValidator(JsonSchemaParser.ValidatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JsonSchemaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JsonSchemaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonSchemaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(JsonSchemaParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonSchemaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(JsonSchemaParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(JsonSchemaParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(JsonSchemaParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterString(JsonSchemaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitString(JsonSchemaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterInteger(JsonSchemaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitInteger(JsonSchemaParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterFloat(JsonSchemaParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitFloat(JsonSchemaParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decimal}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(JsonSchemaParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decimal}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(JsonSchemaParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterNull(JsonSchemaParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JsonSchemaParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitNull(JsonSchemaParser.NullContext ctx);
}