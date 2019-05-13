// Generated from C:/Users/Bruger/IdeaProjects/Taskuino\Taskuino.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaskuinoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULT=3, DIV=4, MOD=5, ASSIGN=6, INCR=7, DECR=8, EQ=9, 
		GRT=10, LESS=11, GRT_EQ=12, LESS_EQ=13, OR=14, XOR=15, AND=16, NOT=17, 
		ARRAY_START=18, ARRAY_END=19, BLOCK_START=20, BLOCK_END=21, PAREN_LEFT=22, 
		PAREN_RIGHT=23, QUOTE=24, PARAM_DELIM=25, SEMICOLON=26, DOT_OP=27, RETURN=28, 
		FOR=29, IF=30, ELSE=31, FUNC=32, TASK=33, TRUE=34, FALSE=35, VOID=36, 
		NULL=37, OUTPUT=38, INPUT=39, HIGH=40, LOW=41, TYPE_INT=42, TYPE_STRING=43, 
		TYPE_DOUBLE=44, TYPE_BOOL=45, WHITESPACE=46, NEWLINE=47, CAR_RETURN=48, 
		COMP_DCL=49, IDENT=50, DIG=51, DECDIG=52, STRING=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "ASSIGN", "INCR", "DECR", "EQ", 
			"GRT", "LESS", "GRT_EQ", "LESS_EQ", "OR", "XOR", "AND", "NOT", "ARRAY_START", 
			"ARRAY_END", "BLOCK_START", "BLOCK_END", "PAREN_LEFT", "PAREN_RIGHT", 
			"QUOTE", "PARAM_DELIM", "SEMICOLON", "DOT_OP", "RETURN", "FOR", "IF", 
			"ELSE", "FUNC", "TASK", "TRUE", "FALSE", "VOID", "NULL", "OUTPUT", "INPUT", 
			"HIGH", "LOW", "TYPE_INT", "TYPE_STRING", "TYPE_DOUBLE", "TYPE_BOOL", 
			"WHITESPACE", "NEWLINE", "CAR_RETURN", "COMP_DCL", "IDENT", "DIG", "DECDIG", 
			"CHARS", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'++'", "'--'", "'is'", 
			"'>'", "'<'", "'>='", "'<='", "'or'", "'xor'", "'and'", "'!'", "'['", 
			"']'", "'{'", "'}'", "'('", "')'", "'\"'", "','", "';'", "'.'", "'return'", 
			"'for'", "'if'", "'else'", "'func'", "'task'", "'true'", "'false'", "'void'", 
			"'null'", "'OUTPUT'", "'INPUT'", "'HIGH'", "'LOW'", "'int'", "'str'", 
			"'dbl'", "'bool'", "' '", "'\n'", "'\r'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULT", "DIV", "MOD", "ASSIGN", "INCR", "DECR", 
			"EQ", "GRT", "LESS", "GRT_EQ", "LESS_EQ", "OR", "XOR", "AND", "NOT", 
			"ARRAY_START", "ARRAY_END", "BLOCK_START", "BLOCK_END", "PAREN_LEFT", 
			"PAREN_RIGHT", "QUOTE", "PARAM_DELIM", "SEMICOLON", "DOT_OP", "RETURN", 
			"FOR", "IF", "ELSE", "FUNC", "TASK", "TRUE", "FALSE", "VOID", "NULL", 
			"OUTPUT", "INPUT", "HIGH", "LOW", "TYPE_INT", "TYPE_STRING", "TYPE_DOUBLE", 
			"TYPE_BOOL", "WHITESPACE", "NEWLINE", "CAR_RETURN", "COMP_DCL", "IDENT", 
			"DIG", "DECDIG", "STRING"
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


	public TaskuinoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Taskuino.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u013d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\7\62\u0117\n\62\f\62\16\62\u011a\13\62\3\63\3\63\7\63\u011e\n\63\f"+
		"\63\16\63\u0121\13\63\5\63\u0123\n\63\3\64\3\64\7\64\u0127\n\64\f\64\16"+
		"\64\u012a\13\64\3\64\5\64\u012d\n\64\3\65\6\65\u0130\n\65\r\65\16\65\u0131"+
		"\3\66\7\66\u0135\n\66\f\66\16\66\u0138\13\66\3\67\3\67\3\67\3\67\2\28"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\67"+
		"\3\2\t\3\2C\\\4\2C\\c|\5\2\62;C\\c|\3\2\63;\3\2\62;\3\2\62\62\3\2\60\60"+
		"\2\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2m\3\2\2\2"+
		"\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17"+
		"{\3\2\2\2\21~\3\2\2\2\23\u0081\3\2\2\2\25\u0084\3\2\2\2\27\u0086\3\2\2"+
		"\2\31\u0088\3\2\2\2\33\u008b\3\2\2\2\35\u008e\3\2\2\2\37\u0091\3\2\2\2"+
		"!\u0095\3\2\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u009f\3"+
		"\2\2\2+\u00a1\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63"+
		"\u00a9\3\2\2\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2\2\2;\u00b6"+
		"\3\2\2\2=\u00ba\3\2\2\2?\u00bd\3\2\2\2A\u00c2\3\2\2\2C\u00c7\3\2\2\2E"+
		"\u00cc\3\2\2\2G\u00d1\3\2\2\2I\u00d7\3\2\2\2K\u00dc\3\2\2\2M\u00e1\3\2"+
		"\2\2O\u00e8\3\2\2\2Q\u00ee\3\2\2\2S\u00f3\3\2\2\2U\u00f7\3\2\2\2W\u00fb"+
		"\3\2\2\2Y\u00ff\3\2\2\2[\u0103\3\2\2\2]\u0108\3\2\2\2_\u010c\3\2\2\2a"+
		"\u0110\3\2\2\2c\u0114\3\2\2\2e\u011b\3\2\2\2g\u012c\3\2\2\2i\u012f\3\2"+
		"\2\2k\u0136\3\2\2\2m\u0139\3\2\2\2op\7-\2\2p\4\3\2\2\2qr\7/\2\2r\6\3\2"+
		"\2\2st\7,\2\2t\b\3\2\2\2uv\7\61\2\2v\n\3\2\2\2wx\7\'\2\2x\f\3\2\2\2yz"+
		"\7?\2\2z\16\3\2\2\2{|\7-\2\2|}\7-\2\2}\20\3\2\2\2~\177\7/\2\2\177\u0080"+
		"\7/\2\2\u0080\22\3\2\2\2\u0081\u0082\7k\2\2\u0082\u0083\7u\2\2\u0083\24"+
		"\3\2\2\2\u0084\u0085\7@\2\2\u0085\26\3\2\2\2\u0086\u0087\7>\2\2\u0087"+
		"\30\3\2\2\2\u0088\u0089\7@\2\2\u0089\u008a\7?\2\2\u008a\32\3\2\2\2\u008b"+
		"\u008c\7>\2\2\u008c\u008d\7?\2\2\u008d\34\3\2\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7t\2\2\u0090\36\3\2\2\2\u0091\u0092\7z\2\2\u0092\u0093\7q\2\2\u0093"+
		"\u0094\7t\2\2\u0094 \3\2\2\2\u0095\u0096\7c\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0098\7f\2\2\u0098\"\3\2\2\2\u0099\u009a\7#\2\2\u009a$\3\2\2\2\u009b"+
		"\u009c\7]\2\2\u009c&\3\2\2\2\u009d\u009e\7_\2\2\u009e(\3\2\2\2\u009f\u00a0"+
		"\7}\2\2\u00a0*\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2,\3\2\2\2\u00a3\u00a4"+
		"\7*\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\60\3\2\2\2\u00a7\u00a8"+
		"\7$\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7.\2\2\u00aa\64\3\2\2\2\u00ab\u00ac"+
		"\7=\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae8\3\2\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7w\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\u00b5\7p\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7"+
		"\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\u00bc\7h\2\2\u00bc>\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7n\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c1\7g\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3"+
		"\u00c4\7w\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7e\2\2\u00c6B\3\2\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7m\2\2"+
		"\u00cbD\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2"+
		"\2\u00cf\u00d0\7g\2\2\u00d0F\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7"+
		"c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6H"+
		"\3\2\2\2\u00d7\u00d8\7x\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7k\2\2\u00da"+
		"\u00db\7f\2\2\u00dbJ\3\2\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7w\2\2\u00de"+
		"\u00df\7n\2\2\u00df\u00e0\7n\2\2\u00e0L\3\2\2\2\u00e1\u00e2\7Q\2\2\u00e2"+
		"\u00e3\7W\2\2\u00e3\u00e4\7V\2\2\u00e4\u00e5\7R\2\2\u00e5\u00e6\7W\2\2"+
		"\u00e6\u00e7\7V\2\2\u00e7N\3\2\2\2\u00e8\u00e9\7K\2\2\u00e9\u00ea\7P\2"+
		"\2\u00ea\u00eb\7R\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7V\2\2\u00edP\3\2"+
		"\2\2\u00ee\u00ef\7J\2\2\u00ef\u00f0\7K\2\2\u00f0\u00f1\7I\2\2\u00f1\u00f2"+
		"\7J\2\2\u00f2R\3\2\2\2\u00f3\u00f4\7N\2\2\u00f4\u00f5\7Q\2\2\u00f5\u00f6"+
		"\7Y\2\2\u00f6T\3\2\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7v\2\2\u00faV\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe"+
		"\7t\2\2\u00feX\3\2\2\2\u00ff\u0100\7f\2\2\u0100\u0101\7d\2\2\u0101\u0102"+
		"\7n\2\2\u0102Z\3\2\2\2\u0103\u0104\7d\2\2\u0104\u0105\7q\2\2\u0105\u0106"+
		"\7q\2\2\u0106\u0107\7n\2\2\u0107\\\3\2\2\2\u0108\u0109\7\"\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\b/\2\2\u010b^\3\2\2\2\u010c\u010d\7\f\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\b\60\2\2\u010f`\3\2\2\2\u0110\u0111\7\17\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\b\61\2\2\u0113b\3\2\2\2\u0114\u0118\t\2\2\2"+
		"\u0115\u0117\t\3\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119d\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u0122\t\3\2\2\u011c\u011e\t\4\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123f\3\2\2\2"+
		"\u0124\u0128\t\5\2\2\u0125\u0127\t\6\2\2\u0126\u0125\3\2\2\2\u0127\u012a"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012d\t\7\2\2\u012c\u0124\3\2\2\2\u012c\u012b\3\2"+
		"\2\2\u012dh\3\2\2\2\u012e\u0130\t\6\2\2\u012f\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132j\3\2\2\2\u0133"+
		"\u0135\n\b\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137l\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a"+
		"\5\61\31\2\u013a\u013b\5k\66\2\u013b\u013c\5\61\31\2\u013cn\3\2\2\2\n"+
		"\2\u0118\u011f\u0122\u0128\u012c\u0131\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}