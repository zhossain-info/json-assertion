// Generated from /home/zahid/Projects/intellij-ws1/json-assertion/json-assertion/src/main/java/org/json/assertion/antlr/JsonSchema.g4 by ANTLR 4.10.1
package org.json.assertion.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonSchemaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, DATATYPE=11, BOOLEAN=12, NULL=13, IDENTIFIER=14, CLASS_NAME=15, 
		STRING=16, DECIMAL=17, FLOAT=18, INTEGER=19, OPTIONAL=20, WHITE_SPACE=21, 
		MULTILINE_COMMENTS=22, LINE_COMMENTS=23;
	public static final int
		RULE_json = 0, RULE_classImport = 1, RULE_object = 2, RULE_keyValueFunction = 3, 
		RULE_keyValue = 4, RULE_array = 5, RULE_value = 6, RULE_validator = 7, 
		RULE_function = 8, RULE_dataType = 9, RULE_primitive = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "classImport", "object", "keyValueFunction", "keyValue", "array", 
			"value", "validator", "function", "dataType", "primitive"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'{'", "','", "'}'", "':'", "'['", "']'", "'@'", "'('", 
			"')'", null, null, "'null'", null, null, null, null, null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "DATATYPE", 
			"BOOLEAN", "NULL", "IDENTIFIER", "CLASS_NAME", "STRING", "DECIMAL", "FLOAT", 
			"INTEGER", "OPTIONAL", "WHITE_SPACE", "MULTILINE_COMMENTS", "LINE_COMMENTS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JsonSchema.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonSchemaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JsonContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public List<ClassImportContext> classImport() {
			return getRuleContexts(ClassImportContext.class);
		}
		public ClassImportContext classImport(int i) {
			return getRuleContext(ClassImportContext.class,i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(22);
					classImport();
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				object();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(29);
					classImport();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35);
				array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassImportContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(JsonSchemaParser.CLASS_NAME, 0); }
		public ClassImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterClassImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitClassImport(this);
		}
	}

	public final ClassImportContext classImport() throws RecognitionException {
		ClassImportContext _localctx = new ClassImportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(CLASS_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public List<KeyValueFunctionContext> keyValueFunction() {
			return getRuleContexts(KeyValueFunctionContext.class);
		}
		public KeyValueFunctionContext keyValueFunction(int i) {
			return getRuleContext(KeyValueFunctionContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__1);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==STRING) {
				{
				setState(42);
				keyValueFunction();
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(43);
					match(T__2);
					setState(44);
					keyValueFunction();
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(52);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyValueFunctionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public KeyValueFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValueFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterKeyValueFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitKeyValueFunction(this);
		}
	}

	public final KeyValueFunctionContext keyValueFunction() throws RecognitionException {
		KeyValueFunctionContext _localctx = new KeyValueFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyValueFunction);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				function();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				keyValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JsonSchemaParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitKeyValue(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(STRING);
			setState(59);
			match(T__4);
			setState(60);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__5);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << DATATYPE) | (1L << BOOLEAN) | (1L << NULL) | (1L << STRING) | (1L << DECIMAL) | (1L << FLOAT) | (1L << INTEGER) | (1L << OPTIONAL))) != 0)) {
				{
				setState(63);
				value();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(64);
					match(T__2);
					setState(65);
					value();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(73);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValidatorContext validator() {
			return getRuleContext(ValidatorContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case DATATYPE:
			case OPTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				validator();
				}
				break;
			case BOOLEAN:
			case NULL:
			case STRING:
			case DECIMAL:
			case FLOAT:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				primitive();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				array();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidatorContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(JsonSchemaParser.OPTIONAL, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ValidatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterValidator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitValidator(this);
		}
	}

	public final ValidatorContext validator() throws RecognitionException {
		ValidatorContext _localctx = new ValidatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_validator);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(81);
					match(OPTIONAL);
					}
				}

				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(84);
					function();
					}
				}

				setState(87);
				dataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(88);
					match(OPTIONAL);
					}
				}

				setState(91);
				function();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DATATYPE) {
					{
					setState(92);
					dataType();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JsonSchemaParser.IDENTIFIER, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__7);
			setState(98);
			match(IDENTIFIER);
			setState(99);
			match(T__8);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << DATATYPE) | (1L << BOOLEAN) | (1L << NULL) | (1L << STRING) | (1L << DECIMAL) | (1L << FLOAT) | (1L << INTEGER) | (1L << OPTIONAL))) != 0)) {
				{
				setState(100);
				value();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(101);
					match(T__2);
					setState(102);
					value();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(110);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(JsonSchemaParser.DATATYPE, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(DATATYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	 
		public PrimitiveContext() { }
		public void copyFrom(PrimitiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerContext extends PrimitiveContext {
		public TerminalNode INTEGER() { return getToken(JsonSchemaParser.INTEGER, 0); }
		public IntegerContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitInteger(this);
		}
	}
	public static class FloatContext extends PrimitiveContext {
		public TerminalNode FLOAT() { return getToken(JsonSchemaParser.FLOAT, 0); }
		public FloatContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitFloat(this);
		}
	}
	public static class NullContext extends PrimitiveContext {
		public TerminalNode NULL() { return getToken(JsonSchemaParser.NULL, 0); }
		public NullContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitNull(this);
		}
	}
	public static class DecimalContext extends PrimitiveContext {
		public TerminalNode DECIMAL() { return getToken(JsonSchemaParser.DECIMAL, 0); }
		public DecimalContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitDecimal(this);
		}
	}
	public static class StringContext extends PrimitiveContext {
		public TerminalNode STRING() { return getToken(JsonSchemaParser.STRING, 0); }
		public StringContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitString(this);
		}
	}
	public static class BooleanContext extends PrimitiveContext {
		public TerminalNode BOOLEAN() { return getToken(JsonSchemaParser.BOOLEAN, 0); }
		public BooleanContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonSchemaListener ) ((JsonSchemaListener)listener).exitBoolean(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primitive);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(BOOLEAN);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(STRING);
				}
				break;
			case INTEGER:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(FLOAT);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(DECIMAL);
				}
				break;
			case NULL:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0003\u0002"+
		"3\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"9\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005C\b\u0005\n\u0005\f\u0005"+
		"F\t\u0005\u0003\u0005H\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006P\b\u0006\u0001\u0007\u0003"+
		"\u0007S\b\u0007\u0001\u0007\u0003\u0007V\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007Z\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007^\b\u0007\u0003"+
		"\u0007`\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\bh\b\b\n\b\f\bk\t\b\u0003\bm\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ny\b\n\u0001\n\u0000"+
		"\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0000\u0086\u0000$\u0001\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000"+
		"\u0004)\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b:\u0001"+
		"\u0000\u0000\u0000\n>\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000"+
		"\u000e_\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012p"+
		"\u0001\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016\u0018\u0003"+
		"\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001c%\u0003\u0004\u0002\u0000\u001d\u001f\u0003\u0002"+
		"\u0001\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#%\u0003\n\u0005\u0000$\u0019"+
		"\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000%\u0001\u0001\u0000"+
		"\u0000\u0000&\'\u0005\u0001\u0000\u0000\'(\u0005\u000f\u0000\u0000(\u0003"+
		"\u0001\u0000\u0000\u0000)2\u0005\u0002\u0000\u0000*/\u0003\u0006\u0003"+
		"\u0000+,\u0005\u0003\u0000\u0000,.\u0003\u0006\u0003\u0000-+\u0001\u0000"+
		"\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"2*\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000045\u0005\u0004\u0000\u00005\u0005\u0001\u0000\u0000\u000069\u0003"+
		"\u0010\b\u000079\u0003\b\u0004\u000086\u0001\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u0010\u0000"+
		"\u0000;<\u0005\u0005\u0000\u0000<=\u0003\f\u0006\u0000=\t\u0001\u0000"+
		"\u0000\u0000>G\u0005\u0006\u0000\u0000?D\u0003\f\u0006\u0000@A\u0005\u0003"+
		"\u0000\u0000AC\u0003\f\u0006\u0000B@\u0001\u0000\u0000\u0000CF\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EH\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0005\u0007\u0000"+
		"\u0000J\u000b\u0001\u0000\u0000\u0000KP\u0003\u000e\u0007\u0000LP\u0003"+
		"\u0014\n\u0000MP\u0003\n\u0005\u0000NP\u0003\u0004\u0002\u0000OK\u0001"+
		"\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000P\r\u0001\u0000\u0000\u0000QS\u0005\u0014\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000"+
		"\u0000\u0000TV\u0003\u0010\b\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W`\u0003\u0012\t\u0000XZ\u0005\u0014"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[]\u0003\u0010\b\u0000\\^\u0003\u0012\t\u0000]\\\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000"+
		"_R\u0001\u0000\u0000\u0000_Y\u0001\u0000\u0000\u0000`\u000f\u0001\u0000"+
		"\u0000\u0000ab\u0005\b\u0000\u0000bc\u0005\u000e\u0000\u0000cl\u0005\t"+
		"\u0000\u0000di\u0003\f\u0006\u0000ef\u0005\u0003\u0000\u0000fh\u0003\f"+
		"\u0006\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000ld\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000o\u0011\u0001\u0000"+
		"\u0000\u0000pq\u0005\u000b\u0000\u0000q\u0013\u0001\u0000\u0000\u0000"+
		"ry\u0005\f\u0000\u0000sy\u0005\u0010\u0000\u0000ty\u0005\u0013\u0000\u0000"+
		"uy\u0005\u0012\u0000\u0000vy\u0005\u0011\u0000\u0000wy\u0005\r\u0000\u0000"+
		"xr\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000"+
		"\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000y\u0015\u0001\u0000\u0000\u0000\u0011\u0019 $/28DGORUY]_i"+
		"lx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}