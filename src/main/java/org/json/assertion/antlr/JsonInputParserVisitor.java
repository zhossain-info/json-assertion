// Generated from /home/zahid/Projects/intellij-ws1/json-assertion/json-assertion/src/main/java/org/json/assertion/antlr/JsonInputParser.g4 by ANTLR 4.10.1
package org.json.assertion.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonInputParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonInputParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonInputParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JsonInputParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonInputParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(JsonInputParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonInputParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(JsonInputParser.KeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonInputParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JsonInputParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonInputParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JsonInputParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(JsonInputParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JsonInputParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(JsonInputParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(JsonInputParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Decimal}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(JsonInputParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link JsonInputParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(JsonInputParser.NullContext ctx);
}