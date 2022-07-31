// Generated from /home/zahid/Projects/intellij-ws1/json-assertion/json-assertion/src/main/java/org/json/assertion/antlr/JsonSchema.g4 by ANTLR 4.10.1
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
public class JsonSchemaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BOOLEAN=10, NULL=11, DATATYPE=12, FUNCTION_IDENTIFIER=13, CLASS_NAME=14, 
		STRING=15, DECIMAL=16, FLOAT=17, INTEGER=18, OPTIONAL=19, WHITE_SPACE=20, 
		MULTILINE_COMMENTS=21, LINE_COMMENTS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"BOOLEAN", "NULL", "DATATYPE", "FUNCTION_IDENTIFIER", "CLASS_NAME", "IDENTIFIER", 
			"STRING", "ESCAPE", "UNICODE", "HEXADECIMAL", "DECIMAL", "FLOAT", "INTEGER", 
			"EXPONENT", "INTDIGIT", "DIGIT", "NONDIGIT", "OPTIONAL", "WHITE_SPACE", 
			"MULTILINE_COMMENTS", "LINE_COMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'{'", "','", "'}'", "':'", "'['", "']'", "'('", "')'", 
			null, "'null'", null, null, null, null, null, null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "BOOLEAN", 
			"NULL", "DATATYPE", "FUNCTION_IDENTIFIER", "CLASS_NAME", "STRING", "DECIMAL", 
			"FLOAT", "INTEGER", "OPTIONAL", "WHITE_SPACE", "MULTILINE_COMMENTS", 
			"LINE_COMMENTS"
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


	public JsonSchemaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonSchema.g4"; }

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
		"\u0004\u0000\u0016\u00e4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t^\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0004\u000b"+
		"g\b\u000b\u000b\u000b\f\u000bh\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0005\rq\b\r\n\r\f\rt\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000ey\b\u000e\n\u000e\f\u000e|\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0081\b\u000f\n\u000f\f\u000f\u0084\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u008b"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0004"+
		"\u0013\u0098\b\u0013\u000b\u0013\f\u0013\u0099\u0003\u0013\u009c\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014"+
		"\u00a3\b\u0014\u000b\u0014\f\u0014\u00a4\u0001\u0015\u0003\u0015\u00a8"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00ae"+
		"\b\u0016\u0001\u0016\u0004\u0016\u00b1\b\u0016\u000b\u0016\f\u0016\u00b2"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00b8\b\u0017\n\u0017"+
		"\f\u0017\u00bb\t\u0017\u0003\u0017\u00bd\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b"+
		"\u00c6\b\u001b\u000b\u001b\f\u001b\u00c7\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00d0\b\u001c\n"+
		"\u001c\f\u001c\u00d3\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u00de\b\u001d\n\u001d\f\u001d\u00e1\t\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u00d1\u0000\u001e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u0000\u001f\u000f!\u0000#\u0000%\u0000\'"+
		"\u0010)\u0011+\u0012-\u0000/\u00001\u00003\u00005\u00137\u00149\u0015"+
		";\u0016\u0001\u0000\u000b\u0001\u0000az\u0002\u0000\"\"\\\\\b\u0000\""+
		"\"//\\\\bbffnnrrtt\u0003\u000009AFaf\u0002\u0000EEee\u0002\u0000++--\u0001"+
		"\u000019\u0001\u000009\u0003\u0000AZ__az\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"\n\n\r\r\u00ee\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000\u0003"+
		"D\u0001\u0000\u0000\u0000\u0005F\u0001\u0000\u0000\u0000\u0007H\u0001"+
		"\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000"+
		"\u0000\rN\u0001\u0000\u0000\u0000\u000fP\u0001\u0000\u0000\u0000\u0011"+
		"R\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015_\u0001"+
		"\u0000\u0000\u0000\u0017d\u0001\u0000\u0000\u0000\u0019j\u0001\u0000\u0000"+
		"\u0000\u001bm\u0001\u0000\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001f"+
		"}\u0001\u0000\u0000\u0000!\u0087\u0001\u0000\u0000\u0000#\u008c\u0001"+
		"\u0000\u0000\u0000%\u0092\u0001\u0000\u0000\u0000\'\u0094\u0001\u0000"+
		"\u0000\u0000)\u009f\u0001\u0000\u0000\u0000+\u00a7\u0001\u0000\u0000\u0000"+
		"-\u00ab\u0001\u0000\u0000\u0000/\u00bc\u0001\u0000\u0000\u00001\u00be"+
		"\u0001\u0000\u0000\u00003\u00c0\u0001\u0000\u0000\u00005\u00c2\u0001\u0000"+
		"\u0000\u00007\u00c5\u0001\u0000\u0000\u00009\u00cb\u0001\u0000\u0000\u0000"+
		";\u00d9\u0001\u0000\u0000\u0000=>\u0005i\u0000\u0000>?\u0005m\u0000\u0000"+
		"?@\u0005p\u0000\u0000@A\u0005o\u0000\u0000AB\u0005r\u0000\u0000BC\u0005"+
		"t\u0000\u0000C\u0002\u0001\u0000\u0000\u0000DE\u0005{\u0000\u0000E\u0004"+
		"\u0001\u0000\u0000\u0000FG\u0005,\u0000\u0000G\u0006\u0001\u0000\u0000"+
		"\u0000HI\u0005}\u0000\u0000I\b\u0001\u0000\u0000\u0000JK\u0005:\u0000"+
		"\u0000K\n\u0001\u0000\u0000\u0000LM\u0005[\u0000\u0000M\f\u0001\u0000"+
		"\u0000\u0000NO\u0005]\u0000\u0000O\u000e\u0001\u0000\u0000\u0000PQ\u0005"+
		"(\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005)\u0000\u0000S\u0012"+
		"\u0001\u0000\u0000\u0000TU\u0005t\u0000\u0000UV\u0005r\u0000\u0000VW\u0005"+
		"u\u0000\u0000W^\u0005e\u0000\u0000XY\u0005f\u0000\u0000YZ\u0005a\u0000"+
		"\u0000Z[\u0005l\u0000\u0000[\\\u0005s\u0000\u0000\\^\u0005e\u0000\u0000"+
		"]T\u0001\u0000\u0000\u0000]X\u0001\u0000\u0000\u0000^\u0014\u0001\u0000"+
		"\u0000\u0000_`\u0005n\u0000\u0000`a\u0005u\u0000\u0000ab\u0005l\u0000"+
		"\u0000bc\u0005l\u0000\u0000c\u0016\u0001\u0000\u0000\u0000df\u0005#\u0000"+
		"\u0000eg\u0007\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0018"+
		"\u0001\u0000\u0000\u0000jk\u0005@\u0000\u0000kl\u0003\u001d\u000e\u0000"+
		"l\u001a\u0001\u0000\u0000\u0000mr\u0003\u001d\u000e\u0000no\u0005.\u0000"+
		"\u0000oq\u0003\u001d\u000e\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u001c"+
		"\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uz\u00033\u0019\u0000"+
		"vy\u00033\u0019\u0000wy\u00031\u0018\u0000xv\u0001\u0000\u0000\u0000x"+
		"w\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{\u001e\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}\u0082\u0005\"\u0000\u0000~\u0081\b\u0001\u0000\u0000"+
		"\u007f\u0081\u0003!\u0010\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\"\u0000\u0000\u0086 \u0001\u0000\u0000\u0000\u0087\u008a\u0005"+
		"\\\u0000\u0000\u0088\u008b\u0007\u0002\u0000\u0000\u0089\u008b\u0003#"+
		"\u0011\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\"\u0001\u0000\u0000\u0000\u008c\u008d\u0005u\u0000"+
		"\u0000\u008d\u008e\u0003%\u0012\u0000\u008e\u008f\u0003%\u0012\u0000\u008f"+
		"\u0090\u0003%\u0012\u0000\u0090\u0091\u0003%\u0012\u0000\u0091$\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0007\u0003\u0000\u0000\u0093&\u0001\u0000"+
		"\u0000\u0000\u0094\u009b\u0003+\u0015\u0000\u0095\u0097\u0005.\u0000\u0000"+
		"\u0096\u0098\u00031\u0018\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b"+
		"\u0095\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0003-\u0016\u0000\u009e(\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0003+\u0015\u0000\u00a0\u00a2\u0005.\u0000"+
		"\u0000\u00a1\u00a3\u00031\u0018\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5*\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0005-\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0003/\u0017\u0000\u00aa,\u0001\u0000\u0000\u0000\u00ab\u00ad\u0007\u0004"+
		"\u0000\u0000\u00ac\u00ae\u0007\u0005\u0000\u0000\u00ad\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0003/\u0017\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3.\u0001\u0000\u0000\u0000"+
		"\u00b4\u00bd\u00050\u0000\u0000\u00b5\u00b9\u0007\u0006\u0000\u0000\u00b6"+
		"\u00b8\u00031\u0018\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00b5"+
		"\u0001\u0000\u0000\u0000\u00bd0\u0001\u0000\u0000\u0000\u00be\u00bf\u0007"+
		"\u0007\u0000\u0000\u00bf2\u0001\u0000\u0000\u0000\u00c0\u00c1\u0007\b"+
		"\u0000\u0000\u00c14\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005?\u0000\u0000"+
		"\u00c36\u0001\u0000\u0000\u0000\u00c4\u00c6\u0007\t\u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0006\u001b\u0000\u0000\u00ca"+
		"8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005/\u0000\u0000\u00cc\u00cd\u0005"+
		"*\u0000\u0000\u00cd\u00d1\u0001\u0000\u0000\u0000\u00ce\u00d0\t\u0000"+
		"\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005*\u0000\u0000\u00d5\u00d6\u0005/\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0006\u001c\u0000\u0000"+
		"\u00d8:\u0001\u0000\u0000\u0000\u00d9\u00da\u0005/\u0000\u0000\u00da\u00db"+
		"\u0005/\u0000\u0000\u00db\u00df\u0001\u0000\u0000\u0000\u00dc\u00de\b"+
		"\n\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0006\u001d\u0000\u0000\u00e3<\u0001\u0000\u0000"+
		"\u0000\u0014\u0000]hrxz\u0080\u0082\u008a\u0099\u009b\u00a4\u00a7\u00ad"+
		"\u00b2\u00b9\u00bc\u00c7\u00d1\u00df\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}