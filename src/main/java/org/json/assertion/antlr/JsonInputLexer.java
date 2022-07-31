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
		FLOAT=10, INTEGER=11, NULL=12, WHITE_SPACE=13;
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
			"INTDIGIT", "DIGIT", "NULL", "WHITE_SPACE"
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
			"FLOAT", "INTEGER", "NULL", "WHITE_SPACE"
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
		"\u0004\u0000\r\u008d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006=\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007B\b\u0007\n\u0007"+
		"\f\u0007E\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\bL\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000bY\b\u000b\u000b\u000b"+
		"\f\u000bZ\u0003\u000b]\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0004\fd\b\f\u000b\f\f\fe\u0001\r\u0003\ri\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0003\u000eo\b\u000e\u0001\u000e\u0004\u000e"+
		"r\b\u000e\u000b\u000e\f\u000es\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000fy\b\u000f\n\u000f\f\u000f|\t\u000f\u0003\u000f~\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0004\u0012\u0088\b\u0012\u000b\u0012\f\u0012\u0089\u0001"+
		"\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\u0000\u0013\u0000"+
		"\u0015\u0000\u0017\t\u0019\n\u001b\u000b\u001d\u0000\u001f\u0000!\u0000"+
		"#\f%\r\u0001\u0000\u0006\u0002\u0000\"\"\\\\\b\u0000\"\"//\\\\bbffnnr"+
		"rtt\u0003\u000009AFaf\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n"+
		"\r\r  \u0093\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000"+
		"\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r<\u0001"+
		"\u0000\u0000\u0000\u000f>\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000"+
		"\u0000\u0013M\u0001\u0000\u0000\u0000\u0015S\u0001\u0000\u0000\u0000\u0017"+
		"U\u0001\u0000\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001bh\u0001"+
		"\u0000\u0000\u0000\u001dl\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000"+
		"\u0000!\u007f\u0001\u0000\u0000\u0000#\u0081\u0001\u0000\u0000\u0000%"+
		"\u0087\u0001\u0000\u0000\u0000\'(\u0005{\u0000\u0000(\u0002\u0001\u0000"+
		"\u0000\u0000)*\u0005,\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005"+
		"}\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005:\u0000\u0000.\b\u0001"+
		"\u0000\u0000\u0000/0\u0005[\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005"+
		"]\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005t\u0000\u000045\u0005"+
		"r\u0000\u000056\u0005u\u0000\u00006=\u0005e\u0000\u000078\u0005f\u0000"+
		"\u000089\u0005a\u0000\u00009:\u0005l\u0000\u0000:;\u0005s\u0000\u0000"+
		";=\u0005e\u0000\u0000<3\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000"+
		"=\u000e\u0001\u0000\u0000\u0000>C\u0005\"\u0000\u0000?B\b\u0000\u0000"+
		"\u0000@B\u0003\u0011\b\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005"+
		"\"\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HK\u0005\\\u0000\u0000IL"+
		"\u0007\u0001\u0000\u0000JL\u0003\u0013\t\u0000KI\u0001\u0000\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005u\u0000"+
		"\u0000NO\u0003\u0015\n\u0000OP\u0003\u0015\n\u0000PQ\u0003\u0015\n\u0000"+
		"QR\u0003\u0015\n\u0000R\u0014\u0001\u0000\u0000\u0000ST\u0007\u0002\u0000"+
		"\u0000T\u0016\u0001\u0000\u0000\u0000U\\\u0003\u001b\r\u0000VX\u0005."+
		"\u0000\u0000WY\u0003!\u0010\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001"+
		"\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^_\u0003\u001d\u000e\u0000_\u0018\u0001\u0000"+
		"\u0000\u0000`a\u0003\u001b\r\u0000ac\u0005.\u0000\u0000bd\u0003!\u0010"+
		"\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\u001a\u0001\u0000\u0000\u0000"+
		"gi\u0005-\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0003\u001f\u000f\u0000k\u001c\u0001\u0000"+
		"\u0000\u0000ln\u0007\u0003\u0000\u0000mo\u0007\u0004\u0000\u0000nm\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000"+
		"pr\u0003\u001f\u000f\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u001e\u0001"+
		"\u0000\u0000\u0000u~\u00050\u0000\u0000vz\u000219\u0000wy\u0003!\u0010"+
		"\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}u\u0001\u0000\u0000\u0000}v\u0001\u0000\u0000\u0000"+
		"~ \u0001\u0000\u0000\u0000\u007f\u0080\u000209\u0000\u0080\"\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005n\u0000\u0000\u0082\u0083\u0005u\u0000\u0000"+
		"\u0083\u0084\u0005l\u0000\u0000\u0084\u0085\u0005l\u0000\u0000\u0085$"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0007\u0005\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0006\u0012\u0000\u0000\u008c&\u0001"+
		"\u0000\u0000\u0000\u000e\u0000<ACKZ\\ehnsz}\u0089\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}