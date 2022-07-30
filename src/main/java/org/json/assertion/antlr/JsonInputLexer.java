// Generated from /home/zahid/Projects/intellij-ws1/json-assertion/json-assertion/src/main/java/org/json/assertion/antlr/JsonInput.g4 by ANTLR 4.10.1
package org.json.assertion.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonInputLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, BOOLEAN=7, STRING=8, DECIMAL=9, 
		FLOAT=10, INTEGER=11, NULL=12, WHITE_SPACE=13, MULTILINE_COMMENTS=14, 
		LINE_COMMENTS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "BOOLEAN", "STRING", 
			"ESCAPE", "UNICODE", "HEXADECIMAL", "DECIMAL", "FLOAT", "INTEGER", "EXPONENT", 
			"INTDIGIT", "DIGIT", "NULL", "WHITE_SPACE", "MULTILINE_COMMENTS", "LINE_COMMENTS"
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


	public JsonInputLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonInput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000f\u00aa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006A\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007F\b\u0007\n\u0007\f\u0007I\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\bP\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b]\b\u000b\u000b\u000b\f\u000b^\u0003\u000b"+
		"a\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\fh\b\f"+
		"\u000b\f\f\fi\u0001\r\u0003\rm\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0003\u000es\b\u000e\u0001\u000e\u0004\u000ev\b\u000e\u000b\u000e\f\u000e"+
		"w\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f}\b\u000f\n\u000f\f\u000f"+
		"\u0080\t\u000f\u0003\u000f\u0082\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004"+
		"\u0012\u008c\b\u0012\u000b\u0012\f\u0012\u008d\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0096\b\u0013"+
		"\n\u0013\f\u0013\u0099\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00a4\b\u0014\n\u0014\f\u0014\u00a7\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0097\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\u0000\u0013\u0000\u0015\u0000"+
		"\u0017\t\u0019\n\u001b\u000b\u001d\u0000\u001f\u0000!\u0000#\f%\r\'\u000e"+
		")\u000f\u0001\u0000\u0007\u0002\u0000\"\"\\\\\b\u0000\"\"//\\\\bbffnn"+
		"rrtt\u0003\u000009AFaf\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n"+
		"\r\r  \u0002\u0000\n\n\r\r\u00b2\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003"+
		"-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001"+
		"\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000"+
		"\u0000\r@\u0001\u0000\u0000\u0000\u000fB\u0001\u0000\u0000\u0000\u0011"+
		"L\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015W\u0001"+
		"\u0000\u0000\u0000\u0017Y\u0001\u0000\u0000\u0000\u0019d\u0001\u0000\u0000"+
		"\u0000\u001bl\u0001\u0000\u0000\u0000\u001dp\u0001\u0000\u0000\u0000\u001f"+
		"\u0081\u0001\u0000\u0000\u0000!\u0083\u0001\u0000\u0000\u0000#\u0085\u0001"+
		"\u0000\u0000\u0000%\u008b\u0001\u0000\u0000\u0000\'\u0091\u0001\u0000"+
		"\u0000\u0000)\u009f\u0001\u0000\u0000\u0000+,\u0005{\u0000\u0000,\u0002"+
		"\u0001\u0000\u0000\u0000-.\u0005,\u0000\u0000.\u0004\u0001\u0000\u0000"+
		"\u0000/0\u0005}\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005:\u0000"+
		"\u00002\b\u0001\u0000\u0000\u000034\u0005[\u0000\u00004\n\u0001\u0000"+
		"\u0000\u000056\u0005]\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005t"+
		"\u0000\u000089\u0005r\u0000\u00009:\u0005u\u0000\u0000:A\u0005e\u0000"+
		"\u0000;<\u0005f\u0000\u0000<=\u0005a\u0000\u0000=>\u0005l\u0000\u0000"+
		">?\u0005s\u0000\u0000?A\u0005e\u0000\u0000@7\u0001\u0000\u0000\u0000@"+
		";\u0001\u0000\u0000\u0000A\u000e\u0001\u0000\u0000\u0000BG\u0005\"\u0000"+
		"\u0000CF\b\u0000\u0000\u0000DF\u0003\u0011\b\u0000EC\u0001\u0000\u0000"+
		"\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JK\u0005\"\u0000\u0000K\u0010\u0001\u0000\u0000\u0000"+
		"LO\u0005\\\u0000\u0000MP\u0007\u0001\u0000\u0000NP\u0003\u0013\t\u0000"+
		"OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0012\u0001\u0000"+
		"\u0000\u0000QR\u0005u\u0000\u0000RS\u0003\u0015\n\u0000ST\u0003\u0015"+
		"\n\u0000TU\u0003\u0015\n\u0000UV\u0003\u0015\n\u0000V\u0014\u0001\u0000"+
		"\u0000\u0000WX\u0007\u0002\u0000\u0000X\u0016\u0001\u0000\u0000\u0000"+
		"Y`\u0003\u001b\r\u0000Z\\\u0005.\u0000\u0000[]\u0003!\u0010\u0000\\[\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0003\u001d"+
		"\u000e\u0000c\u0018\u0001\u0000\u0000\u0000de\u0003\u001b\r\u0000eg\u0005"+
		".\u0000\u0000fh\u0003!\u0010\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u001a"+
		"\u0001\u0000\u0000\u0000km\u0005-\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0003\u001f\u000f"+
		"\u0000o\u001c\u0001\u0000\u0000\u0000pr\u0007\u0003\u0000\u0000qs\u0007"+
		"\u0004\u0000\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"su\u0001\u0000\u0000\u0000tv\u0003\u001f\u000f\u0000ut\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x\u001e\u0001\u0000\u0000\u0000y\u0082\u00050\u0000\u0000"+
		"z~\u000219\u0000{}\u0003!\u0010\u0000|{\u0001\u0000\u0000\u0000}\u0080"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081y\u0001\u0000\u0000\u0000\u0081z\u0001\u0000\u0000\u0000\u0082"+
		" \u0001\u0000\u0000\u0000\u0083\u0084\u000209\u0000\u0084\"\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005n\u0000\u0000\u0086\u0087\u0005u\u0000\u0000"+
		"\u0087\u0088\u0005l\u0000\u0000\u0088\u0089\u0005l\u0000\u0000\u0089$"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0007\u0005\u0000\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0006\u0012\u0000\u0000\u0090&\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005/\u0000\u0000\u0092\u0093\u0005*\u0000"+
		"\u0000\u0093\u0097\u0001\u0000\u0000\u0000\u0094\u0096\t\u0000\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005*\u0000\u0000\u009b\u009c\u0005/\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0006\u0013\u0000\u0000\u009e(\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005/\u0000\u0000\u00a0\u00a1\u0005/\u0000"+
		"\u0000\u00a1\u00a5\u0001\u0000\u0000\u0000\u00a2\u00a4\b\u0006\u0000\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0006\u0014\u0000\u0000\u00a9*\u0001\u0000\u0000\u0000\u0010"+
		"\u0000@EGO^`ilrw~\u0081\u008d\u0097\u00a5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}