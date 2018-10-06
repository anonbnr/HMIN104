// Generated from PP.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9, 
		BOOL=10, ARRAY=11, IN=12, OUT=13, VAR=14, IF=15, THEN=16, ELSE=17, WHILE=18, 
		DO=19, SK=20, ASSIGNMENT=21, ARRAY_ALLOCATION=22, LOGNOT=23, MUL=24, DIV=25, 
		ADD=26, SUB=27, LOGAND=28, LOGOR=29, LTH=30, LTEQ=31, EQU=32, DIFF=33, 
		GTH=34, GTEQ=35, LITTRUE=36, LITFALSE=37, LITENT=38, ID=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "INT", 
		"BOOL", "ARRAY", "IN", "OUT", "VAR", "IF", "THEN", "ELSE", "WHILE", "DO", 
		"SK", "ASSIGNMENT", "ARRAY_ALLOCATION", "LOGNOT", "MUL", "DIV", "ADD", 
		"SUB", "LOGAND", "LOGOR", "LTH", "LTEQ", "EQU", "DIFF", "GTH", "GTEQ", 
		"LITTRUE", "LITFALSE", "LITENT", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'('", "')'", "';'", "'['", "']'", "'{'", "'}'", "'integer'", 
		"'boolean'", "'array of'", "'read'", "'write'", "'var'", "'if'", "'then'", 
		"'else'", "'while'", "'do'", "'skip'", "':='", "'new'", "'not'", "'*'", 
		"'/'", "'+'", "'-'", "'and'", "'or'", "'<'", "'<='", "'='", "'!='", "'>'", 
		"'>='", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "INT", "BOOL", "ARRAY", 
		"IN", "OUT", "VAR", "IF", "THEN", "ELSE", "WHILE", "DO", "SK", "ASSIGNMENT", 
		"ARRAY_ALLOCATION", "LOGNOT", "MUL", "DIV", "ADD", "SUB", "LOGAND", "LOGOR", 
		"LTH", "LTEQ", "EQU", "DIFF", "GTH", "GTEQ", "LITTRUE", "LITFALSE", "LITENT", 
		"ID", "WS"
	};
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


	public PPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PP.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u00de\n\'\f\'\16\'\u00e1\13\'\5\'"+
		"\u00e3\n\'\3(\6(\u00e6\n(\r(\16(\u00e7\3)\3)\3)\3)\2\2*\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*\3\2\5\3\2\63;\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00ef\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3"+
		"\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3"+
		"\2\2\2\23c\3\2\2\2\25k\3\2\2\2\27s\3\2\2\2\31|\3\2\2\2\33\u0081\3\2\2"+
		"\2\35\u0087\3\2\2\2\37\u008b\3\2\2\2!\u008e\3\2\2\2#\u0093\3\2\2\2%\u0098"+
		"\3\2\2\2\'\u009e\3\2\2\2)\u00a1\3\2\2\2+\u00a6\3\2\2\2-\u00a9\3\2\2\2"+
		"/\u00ad\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67"+
		"\u00b7\3\2\2\29\u00b9\3\2\2\2;\u00bd\3\2\2\2=\u00c0\3\2\2\2?\u00c2\3\2"+
		"\2\2A\u00c5\3\2\2\2C\u00c7\3\2\2\2E\u00ca\3\2\2\2G\u00cc\3\2\2\2I\u00cf"+
		"\3\2\2\2K\u00d4\3\2\2\2M\u00e2\3\2\2\2O\u00e5\3\2\2\2Q\u00e9\3\2\2\2S"+
		"T\7<\2\2T\4\3\2\2\2UV\7*\2\2V\6\3\2\2\2WX\7+\2\2X\b\3\2\2\2YZ\7=\2\2Z"+
		"\n\3\2\2\2[\\\7]\2\2\\\f\3\2\2\2]^\7_\2\2^\16\3\2\2\2_`\7}\2\2`\20\3\2"+
		"\2\2ab\7\177\2\2b\22\3\2\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2fg\7g\2\2gh\7i"+
		"\2\2hi\7g\2\2ij\7t\2\2j\24\3\2\2\2kl\7d\2\2lm\7q\2\2mn\7q\2\2no\7n\2\2"+
		"op\7g\2\2pq\7c\2\2qr\7p\2\2r\26\3\2\2\2st\7c\2\2tu\7t\2\2uv\7t\2\2vw\7"+
		"c\2\2wx\7{\2\2xy\7\"\2\2yz\7q\2\2z{\7h\2\2{\30\3\2\2\2|}\7t\2\2}~\7g\2"+
		"\2~\177\7c\2\2\177\u0080\7f\2\2\u0080\32\3\2\2\2\u0081\u0082\7y\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7v\2\2\u0085\u0086\7g\2\2"+
		"\u0086\34\3\2\2\2\u0087\u0088\7x\2\2\u0088\u0089\7c\2\2\u0089\u008a\7"+
		"t\2\2\u008a\36\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7h\2\2\u008d \3"+
		"\2\2\2\u008e\u008f\7v\2\2\u008f\u0090\7j\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7p\2\2\u0092\"\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097$\3\2\2\2\u0098\u0099\7y\2\2\u0099"+
		"\u009a\7j\2\2\u009a\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2"+
		"\u009d&\3\2\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7q\2\2\u00a0(\3\2\2\2\u00a1"+
		"\u00a2\7u\2\2\u00a2\u00a3\7m\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7r\2\2"+
		"\u00a5*\3\2\2\2\u00a6\u00a7\7<\2\2\u00a7\u00a8\7?\2\2\u00a8,\3\2\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7y\2\2\u00ac.\3\2\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7v\2\2\u00b0\60\3\2\2\2\u00b1"+
		"\u00b2\7,\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7\61\2\2\u00b4\64\3\2\2\2\u00b5"+
		"\u00b6\7-\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7/\2\2\u00b88\3\2\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7f\2\2\u00bc:\3\2\2\2\u00bd"+
		"\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf<\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1"+
		">\3\2\2\2\u00c2\u00c3\7>\2\2\u00c3\u00c4\7?\2\2\u00c4@\3\2\2\2\u00c5\u00c6"+
		"\7?\2\2\u00c6B\3\2\2\2\u00c7\u00c8\7#\2\2\u00c8\u00c9\7?\2\2\u00c9D\3"+
		"\2\2\2\u00ca\u00cb\7@\2\2\u00cbF\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ceH\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2"+
		"\7w\2\2\u00d2\u00d3\7g\2\2\u00d3J\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6"+
		"\7c\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"L\3\2\2\2\u00da\u00e3\7\62\2\2\u00db\u00df\t\2\2\2\u00dc\u00de\t\2\2\2"+
		"\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2"+
		"\u00db\3\2\2\2\u00e3N\3\2\2\2\u00e4\u00e6\t\3\2\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8P\3"+
		"\2\2\2\u00e9\u00ea\t\4\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b)\2\2\u00ec"+
		"R\3\2\2\2\6\2\u00df\u00e2\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}