// Generated from /home/zahid/Projects/intellij-ws1/json-assertion/json-assertion/src/main/java/org/json/assertion/antlr/JsonInputLexer.g4 by ANTLR 4.10.1
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
		STRING=1, DECIMAL=2, FLOAT=3, INTEGER=4, BOOLEAN=5, NULL=6, LBRACKET=7, 
		RBRACKET=8, LBRACE=9, RBRACE=10, COMMA=11, COLON=12, WHITE_SPACE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "ESCAPE", "UNICODE", "HEXADECIMAL", "DECIMAL", "FLOAT", "INTEGER", 
			"EXPONENT", "INTDIGIT", "DIGIT", "BOOLEAN", "NULL", "LBRACKET", "RBRACKET", 
			"LBRACE", "RBRACE", "COMMA", "COLON", "WHITE_SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'null'", "'['", "']'", "'{'", "'}'", 
			"','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "DECIMAL", "FLOAT", "INTEGER", "BOOLEAN", "NULL", "LBRACKET", 
			"RBRACKET", "LBRACE", "RBRACE", "COMMA", "COLON", "WHITE_SPACE"
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
	public String getGrammarFileName() { return "JsonInputLexer.g4"; }

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
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000+\b"+
		"\u0000\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0004\u0004B\b\u0004\u000b\u0004\f\u0004"+
		"C\u0003\u0004F\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005M\b\u0005\u000b\u0005\f\u0005N\u0001\u0006\u0003"+
		"\u0006R\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007X\b\u0007\u0001\u0007\u0004\u0007[\b\u0007\u000b\u0007\f\u0007\\"+
		"\u0001\b\u0001\b\u0001\b\u0005\bb\b\b\n\b\f\be\t\b\u0003\bg\b\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\nt\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0004\u0012\u0088\b\u0012\u000b\u0012\f\u0012\u0089\u0001\u0012"+
		"\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0000\u0005\u0000\u0007"+
		"\u0000\t\u0002\u000b\u0003\r\u0004\u000f\u0000\u0011\u0000\u0013\u0000"+
		"\u0015\u0005\u0017\u0006\u0019\u0007\u001b\b\u001d\t\u001f\n!\u000b#\f"+
		"%\r\u0001\u0000\u0006\u0002\u0000\"\"\\\\\b\u0000\"\"//\\\\bbffnnrrtt"+
		"\u0003\u000009AFaf\u0002\u0000EEee\u0002\u0000++--\u0003\u0000\t\n\r\r"+
		"  \u0093\u0000\u0001\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u00031\u0001"+
		"\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u0007<\u0001\u0000\u0000"+
		"\u0000\t>\u0001\u0000\u0000\u0000\u000bI\u0001\u0000\u0000\u0000\rQ\u0001"+
		"\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011f\u0001\u0000\u0000"+
		"\u0000\u0013h\u0001\u0000\u0000\u0000\u0015s\u0001\u0000\u0000\u0000\u0017"+
		"u\u0001\u0000\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b|\u0001"+
		"\u0000\u0000\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u0080\u0001\u0000"+
		"\u0000\u0000!\u0082\u0001\u0000\u0000\u0000#\u0084\u0001\u0000\u0000\u0000"+
		"%\u0087\u0001\u0000\u0000\u0000\',\u0005\"\u0000\u0000(+\b\u0000\u0000"+
		"\u0000)+\u0003\u0003\u0001\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/0\u0005\"\u0000\u00000\u0002\u0001\u0000\u0000\u000014\u0005\\\u0000"+
		"\u000025\u0007\u0001\u0000\u000035\u0003\u0005\u0002\u000042\u0001\u0000"+
		"\u0000\u000043\u0001\u0000\u0000\u00005\u0004\u0001\u0000\u0000\u0000"+
		"67\u0005u\u0000\u000078\u0003\u0007\u0003\u000089\u0003\u0007\u0003\u0000"+
		"9:\u0003\u0007\u0003\u0000:;\u0003\u0007\u0003\u0000;\u0006\u0001\u0000"+
		"\u0000\u0000<=\u0007\u0002\u0000\u0000=\b\u0001\u0000\u0000\u0000>E\u0003"+
		"\r\u0006\u0000?A\u0005.\u0000\u0000@B\u0003\u0013\t\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0003\u000f\u0007"+
		"\u0000H\n\u0001\u0000\u0000\u0000IJ\u0003\r\u0006\u0000JL\u0005.\u0000"+
		"\u0000KM\u0003\u0013\t\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\f\u0001\u0000"+
		"\u0000\u0000PR\u0005-\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0003\u0011\b\u0000T\u000e\u0001"+
		"\u0000\u0000\u0000UW\u0007\u0003\u0000\u0000VX\u0007\u0004\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000"+
		"\u0000Y[\u0003\u0011\b\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0010"+
		"\u0001\u0000\u0000\u0000^g\u00050\u0000\u0000_c\u000219\u0000`b\u0003"+
		"\u0013\t\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000f_\u0001\u0000\u0000"+
		"\u0000g\u0012\u0001\u0000\u0000\u0000hi\u000209\u0000i\u0014\u0001\u0000"+
		"\u0000\u0000jk\u0005t\u0000\u0000kl\u0005r\u0000\u0000lm\u0005u\u0000"+
		"\u0000mt\u0005e\u0000\u0000no\u0005f\u0000\u0000op\u0005a\u0000\u0000"+
		"pq\u0005l\u0000\u0000qr\u0005s\u0000\u0000rt\u0005e\u0000\u0000sj\u0001"+
		"\u0000\u0000\u0000sn\u0001\u0000\u0000\u0000t\u0016\u0001\u0000\u0000"+
		"\u0000uv\u0005n\u0000\u0000vw\u0005u\u0000\u0000wx\u0005l\u0000\u0000"+
		"xy\u0005l\u0000\u0000y\u0018\u0001\u0000\u0000\u0000z{\u0005[\u0000\u0000"+
		"{\u001a\u0001\u0000\u0000\u0000|}\u0005]\u0000\u0000}\u001c\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005{\u0000\u0000\u007f\u001e\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005}\u0000\u0000\u0081 \u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005,\u0000\u0000\u0083\"\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		":\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086\u0088\u0007\u0005\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0006\u0012\u0000"+
		"\u0000\u008c&\u0001\u0000\u0000\u0000\u000e\u0000*,4CENQW\\cfs\u0089\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}