// Generated from /home/zahid/Projects/intellij-ws1/json-assertion/json-assertion/src/main/java/org/json/assertion/antlr/JsonInput.g4 by ANTLR 4.10.1
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
public class JsonInputParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BOOLEAN=7, STRING=8, DECIMAL=9, 
		FLOAT=10, INTEGER=11, NULL=12, WHITE_SPACE=13, MULTILINE_COMMENTS=14, 
		LINE_COMMENTS=15;
	public static final int
		RULE_json = 0, RULE_object = 1, RULE_keyValue = 2, RULE_array = 3, RULE_value = 4, 
		RULE_primitive = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"json", "object", "keyValue", "array", "value", "primitive"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", null, null, null, null, 
			null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "BOOLEAN", "STRING", "DECIMAL", 
			"FLOAT", "INTEGER", "NULL", "WHITE_SPACE", "MULTILINE_COMMENTS", "LINE_COMMENTS"
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
	public String getGrammarFileName() { return "JsonInput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonInputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class JsonContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
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
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				object();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				array();
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

	public static class ObjectContext extends ParserRuleContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(17);
				keyValue();
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(18);
					match(T__1);
					setState(19);
					keyValue();
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(27);
			match(T__2);
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
		public TerminalNode STRING() { return getToken(JsonInputParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitKeyValue(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(STRING);
			setState(30);
			match(T__3);
			setState(31);
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
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__4);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << BOOLEAN) | (1L << STRING) | (1L << DECIMAL) | (1L << FLOAT) | (1L << INTEGER) | (1L << NULL))) != 0)) {
				{
				setState(34);
				value();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(35);
					match(T__1);
					setState(36);
					value();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(44);
			match(T__5);
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
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case STRING:
			case DECIMAL:
			case FLOAT:
			case INTEGER:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				primitive();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				array();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
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
		public TerminalNode INTEGER() { return getToken(JsonInputParser.INTEGER, 0); }
		public IntegerContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitInteger(this);
		}
	}
	public static class FloatContext extends PrimitiveContext {
		public TerminalNode FLOAT() { return getToken(JsonInputParser.FLOAT, 0); }
		public FloatContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitFloat(this);
		}
	}
	public static class NullContext extends PrimitiveContext {
		public TerminalNode NULL() { return getToken(JsonInputParser.NULL, 0); }
		public NullContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitNull(this);
		}
	}
	public static class DecimalContext extends PrimitiveContext {
		public TerminalNode DECIMAL() { return getToken(JsonInputParser.DECIMAL, 0); }
		public DecimalContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitDecimal(this);
		}
	}
	public static class StringContext extends PrimitiveContext {
		public TerminalNode STRING() { return getToken(JsonInputParser.STRING, 0); }
		public StringContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitString(this);
		}
	}
	public static class BooleanContext extends PrimitiveContext {
		public TerminalNode BOOLEAN() { return getToken(JsonInputParser.BOOLEAN, 0); }
		public BooleanContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonInputListener ) ((JsonInputListener)listener).exitBoolean(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primitive);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(BOOLEAN);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(STRING);
				}
				break;
			case INTEGER:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(FLOAT);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(DECIMAL);
				}
				break;
			case NULL:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
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
		"\u0004\u0001\u000f<\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0003\u0000\u000f\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0015\b\u0001\n"+
		"\u0001\f\u0001\u0018\t\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003&\b\u0003\n\u0003\f\u0003)\t"+
		"\u0003\u0003\u0003+\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u00042\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005:\b\u0005\u0001"+
		"\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000A\u0000"+
		"\u000e\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000\u0004"+
		"\u001d\u0001\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b1\u0001"+
		"\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\f\u000f\u0003\u0002\u0001"+
		"\u0000\r\u000f\u0003\u0006\u0003\u0000\u000e\f\u0001\u0000\u0000\u0000"+
		"\u000e\r\u0001\u0000\u0000\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010"+
		"\u0019\u0005\u0001\u0000\u0000\u0011\u0016\u0003\u0004\u0002\u0000\u0012"+
		"\u0013\u0005\u0002\u0000\u0000\u0013\u0015\u0003\u0004\u0002\u0000\u0014"+
		"\u0012\u0001\u0000\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019"+
		"\u0011\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c"+
		"\u0003\u0001\u0000\u0000\u0000\u001d\u001e\u0005\b\u0000\u0000\u001e\u001f"+
		"\u0005\u0004\u0000\u0000\u001f \u0003\b\u0004\u0000 \u0005\u0001\u0000"+
		"\u0000\u0000!*\u0005\u0005\u0000\u0000\"\'\u0003\b\u0004\u0000#$\u0005"+
		"\u0002\u0000\u0000$&\u0003\b\u0004\u0000%#\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*\"\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0005\u0006"+
		"\u0000\u0000-\u0007\u0001\u0000\u0000\u0000.2\u0003\n\u0005\u0000/2\u0003"+
		"\u0006\u0003\u000002\u0003\u0002\u0001\u00001.\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\t\u0001\u0000\u0000"+
		"\u00003:\u0005\u0007\u0000\u00004:\u0005\b\u0000\u00005:\u0005\u000b\u0000"+
		"\u00006:\u0005\n\u0000\u00007:\u0005\t\u0000\u00008:\u0005\f\u0000\u0000"+
		"93\u0001\u0000\u0000\u000094\u0001\u0000\u0000\u000095\u0001\u0000\u0000"+
		"\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:\u000b\u0001\u0000\u0000\u0000\u0007\u000e\u0016\u0019\'"+
		"*19";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}