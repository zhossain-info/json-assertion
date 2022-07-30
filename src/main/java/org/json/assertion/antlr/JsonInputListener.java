// Generated from /home/zahid/Projects/intellij-ws1/json-assertion/json-assertion/src/main/java/org/json/assertion/antlr/JsonInput.g4 by ANTLR 4.10.1
package org.json.assertion.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonInputParser}.
 */
public interface JsonInputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonInputParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonInputParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonInputParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonInputParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonInputParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JsonInputParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonInputParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JsonInputParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonInputParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(JsonInputParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonInputParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(JsonInputParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonInputParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JsonInputParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonInputParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JsonInputParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonInputParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JsonInputParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonInputParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JsonInputParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(JsonInputParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(JsonInputParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterString(JsonInputParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitString(JsonInputParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterInteger(JsonInputParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitInteger(JsonInputParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterFloat(JsonInputParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitFloat(JsonInputParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Decimal}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(JsonInputParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Decimal}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(JsonInputParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterNull(JsonInputParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitNull(JsonInputParser.NullContext ctx);
}