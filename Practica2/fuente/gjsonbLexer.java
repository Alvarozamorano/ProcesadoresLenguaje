package fuente;

// Generated from gjsonbLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gjsonbLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONTEXT=1, LLAVEA=2, LLAVEC=3, CA=4, CC=5, DOSP=6, COMA=7, WS=8, INTRO=9, 
		COMILLAS=10, ID=11, NAME=12, LABEL=13, ES=14, ENG=15, PROPERTIES=16, TYPEOF=17, 
		USEDBY=18, ISLIST=19, MULTIPLICITYMAX=20, MULTIPLICITYMIN=21, INHERITS=22, 
		OPTIONAL=23, TO=24, FROM=25, REVERSENAME=26, LABELREVERSENAME=27, RUTA=28, 
		BOOL=29, TEXTO=30, GRAPHS=31, TEXTOCONTEXT=32, CLASE=33, PROPIEDAD=34, 
		RELACION=35;
	public static final int
		CONTEXT_MODE=1, ID_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CONTEXT_MODE", "ID_MODE"
	};

	public static final String[] ruleNames = {
		"CONTEXT", "LLAVEA", "LLAVEC", "CA", "CC", "DOSP", "COMA", "WS", "INTRO", 
		"COMILLAS", "ID", "NAME", "LABEL", "ES", "ENG", "PROPERTIES", "TYPEOF", 
		"USEDBY", "ISLIST", "MULTIPLICITYMAX", "MULTIPLICITYMIN", "INHERITS", 
		"OPTIONAL", "TO", "FROM", "REVERSENAME", "LABELREVERSENAME", "RUTA", "BOOL", 
		"TEXTO", "GRAPHS", "TEXTOCONTEXT", "CLASE", "NOMBRE", "PROPIEDAD", "RELACION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"@context\":'", "'{'", "'}'", "'['", "']'", "':'", "','", "' '", 
		"'\r\n'", "'\"'", null, "'\"name\":'", "'\"label\":'", "'\"es\":'", null, 
		null, "'\"typeOf\":'", "'\"usedby\":'", "'\"isList\":'", "'\"multiplicityMax\":'", 
		"'\"multiplicityMin\":'", "'\"inherits\":'", "'\"optional\":'", "'\"to\":'", 
		"'\"from\":'", "'\"reverseName\":'", "'\"labelReverseName\":'", "'\"http://'", 
		null, null, "'\"graphs\":'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CONTEXT", "LLAVEA", "LLAVEC", "CA", "CC", "DOSP", "COMA", "WS", 
		"INTRO", "COMILLAS", "ID", "NAME", "LABEL", "ES", "ENG", "PROPERTIES", 
		"TYPEOF", "USEDBY", "ISLIST", "MULTIPLICITYMAX", "MULTIPLICITYMIN", "INHERITS", 
		"OPTIONAL", "TO", "FROM", "REVERSENAME", "LABELREVERSENAME", "RUTA", "BOOL", 
		"TEXTO", "GRAPHS", "TEXTOCONTEXT", "CLASE", "PROPIEDAD", "RELACION"
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


	public gjsonbLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gjsonbLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 29:
			TEXTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			CLASE_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			PROPIEDAD_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			RELACION_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEXTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void CLASE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void PROPIEDAD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}
	private void RELACION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u01ec\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0081\n\f\f\f\16\f\u0084\13\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00aa\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00bb\n\21\f\21"+
		"\16\21\u00be\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0161\n\36"+
		"\3\37\3\37\3\37\3\37\7\37\u0167\n\37\f\37\16\37\u016a\13\37\3\37\7\37"+
		"\u016d\n\37\f\37\16\37\u0170\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3!\6!\u0181\n!\r!\16!\u0182\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\6#\u01a5\n#\r#\16#\u01a6\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\4\u0182\u01a6\2&\5\3\7\4"+
		"\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22"+
		"%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E"+
		"#G\2I$K%\5\2\3\4\3\3\2$$\2\u01f1\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\3C\3\2\2\2"+
		"\4E\3\2\2\2\4I\3\2\2\2\4K\3\2\2\2\5M\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13"+
		"_\3\2\2\2\rc\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23m\3\2\2\2\25q\3\2\2\2\27"+
		"v\3\2\2\2\31x\3\2\2\2\33\u0087\3\2\2\2\35\u008f\3\2\2\2\37\u0098\3\2\2"+
		"\2!\u00a9\3\2\2\2#\u00ab\3\2\2\2%\u00c1\3\2\2\2\'\u00cb\3\2\2\2)\u00d5"+
		"\3\2\2\2+\u00df\3\2\2\2-\u00f2\3\2\2\2/\u0105\3\2\2\2\61\u0111\3\2\2\2"+
		"\63\u011d\3\2\2\2\65\u0123\3\2\2\2\67\u012b\3\2\2\29\u013a\3\2\2\2;\u014e"+
		"\3\2\2\2=\u0160\3\2\2\2?\u0162\3\2\2\2A\u0173\3\2\2\2C\u0180\3\2\2\2E"+
		"\u0186\3\2\2\2G\u01a4\3\2\2\2I\u01a8\3\2\2\2K\u01c8\3\2\2\2MN\7$\2\2N"+
		"O\7B\2\2OP\7e\2\2PQ\7q\2\2QR\7p\2\2RS\7v\2\2ST\7g\2\2TU\7z\2\2UV\7v\2"+
		"\2VW\7$\2\2WX\7<\2\2XY\3\2\2\2YZ\b\2\2\2Z\6\3\2\2\2[\\\7}\2\2\\\b\3\2"+
		"\2\2]^\7\177\2\2^\n\3\2\2\2_`\7]\2\2`a\3\2\2\2ab\b\5\3\2b\f\3\2\2\2cd"+
		"\7_\2\2de\3\2\2\2ef\b\6\3\2f\16\3\2\2\2gh\7<\2\2h\20\3\2\2\2ij\7.\2\2"+
		"jk\3\2\2\2kl\b\b\3\2l\22\3\2\2\2mn\7\"\2\2no\3\2\2\2op\b\t\3\2p\24\3\2"+
		"\2\2qr\7\17\2\2rs\7\f\2\2st\3\2\2\2tu\b\n\3\2u\26\3\2\2\2vw\7$\2\2w\30"+
		"\3\2\2\2xy\7$\2\2yz\7B\2\2z{\7k\2\2{|\7f\2\2|}\7$\2\2}~\7<\2\2~\u0082"+
		"\3\2\2\2\177\u0081\5\23\t\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\b\f\4\2\u0086\32\3\2\2\2\u0087\u0088\7$\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7c\2\2\u008a\u008b\7o\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7$\2\2\u008d\u008e\7<\2\2\u008e\34\3\2\2\2\u008f\u0090\7$\2\2\u0090"+
		"\u0091\7n\2\2\u0091\u0092\7c\2\2\u0092\u0093\7d\2\2\u0093\u0094\7g\2\2"+
		"\u0094\u0095\7n\2\2\u0095\u0096\7$\2\2\u0096\u0097\7<\2\2\u0097\36\3\2"+
		"\2\2\u0098\u0099\7$\2\2\u0099\u009a\7g\2\2\u009a\u009b\7u\2\2\u009b\u009c"+
		"\7$\2\2\u009c\u009d\7<\2\2\u009d \3\2\2\2\u009e\u009f\7$\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7$\2\2\u00a3"+
		"\u00aa\7<\2\2\u00a4\u00a5\7$\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7p\2\2"+
		"\u00a7\u00a8\7$\2\2\u00a8\u00aa\7<\2\2\u00a9\u009e\3\2\2\2\u00a9\u00a4"+
		"\3\2\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\7r\2\2\u00ad\u00ae"+
		"\7t\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7g\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\u00b6\7u\2\2\u00b6\u00b7\7$\2\2\u00b7\u00b8\7<\2\2\u00b8\u00bc"+
		"\3\2\2\2\u00b9\u00bb\5\23\t\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c0\7]\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c3"+
		"\7v\2\2\u00c3\u00c4\7{\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7Q\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7$\2\2\u00c9\u00ca\7<\2\2"+
		"\u00ca&\3\2\2\2\u00cb\u00cc\7$\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7u\2"+
		"\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2"+
		"\7{\2\2\u00d2\u00d3\7$\2\2\u00d3\u00d4\7<\2\2\u00d4(\3\2\2\2\u00d5\u00d6"+
		"\7$\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7N\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7$\2\2"+
		"\u00dd\u00de\7<\2\2\u00de*\3\2\2\2\u00df\u00e0\7$\2\2\u00e0\u00e1\7o\2"+
		"\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7e\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7{\2\2"+
		"\u00ec\u00ed\7O\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7z\2\2\u00ef\u00f0"+
		"\7$\2\2\u00f0\u00f1\7<\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7$\2\2\u00f3\u00f4"+
		"\7o\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		"\u00f8\7k\2\2\u00f8\u00f9\7r\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7k\2\2"+
		"\u00fb\u00fc\7e\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff"+
		"\7{\2\2\u00ff\u0100\7O\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102"+
		"\u0103\7$\2\2\u0103\u0104\7<\2\2\u0104.\3\2\2\2\u0105\u0106\7$\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7p\2\2\u0108\u0109\7j\2\2\u0109\u010a\7g\2\2"+
		"\u010a\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c\u010d\7v\2\2\u010d\u010e"+
		"\7u\2\2\u010e\u010f\7$\2\2\u010f\u0110\7<\2\2\u0110\60\3\2\2\2\u0111\u0112"+
		"\7$\2\2\u0112\u0113\7q\2\2\u0113\u0114\7r\2\2\u0114\u0115\7v\2\2\u0115"+
		"\u0116\7k\2\2\u0116\u0117\7q\2\2\u0117\u0118\7p\2\2\u0118\u0119\7c\2\2"+
		"\u0119\u011a\7n\2\2\u011a\u011b\7$\2\2\u011b\u011c\7<\2\2\u011c\62\3\2"+
		"\2\2\u011d\u011e\7$\2\2\u011e\u011f\7v\2\2\u011f\u0120\7q\2\2\u0120\u0121"+
		"\7$\2\2\u0121\u0122\7<\2\2\u0122\64\3\2\2\2\u0123\u0124\7$\2\2\u0124\u0125"+
		"\7h\2\2\u0125\u0126\7t\2\2\u0126\u0127\7q\2\2\u0127\u0128\7o\2\2\u0128"+
		"\u0129\7$\2\2\u0129\u012a\7<\2\2\u012a\66\3\2\2\2\u012b\u012c\7$\2\2\u012c"+
		"\u012d\7t\2\2\u012d\u012e\7g\2\2\u012e\u012f\7x\2\2\u012f\u0130\7g\2\2"+
		"\u0130\u0131\7t\2\2\u0131\u0132\7u\2\2\u0132\u0133\7g\2\2\u0133\u0134"+
		"\7P\2\2\u0134\u0135\7c\2\2\u0135\u0136\7o\2\2\u0136\u0137\7g\2\2\u0137"+
		"\u0138\7$\2\2\u0138\u0139\7<\2\2\u01398\3\2\2\2\u013a\u013b\7$\2\2\u013b"+
		"\u013c\7n\2\2\u013c\u013d\7c\2\2\u013d\u013e\7d\2\2\u013e\u013f\7g\2\2"+
		"\u013f\u0140\7n\2\2\u0140\u0141\7T\2\2\u0141\u0142\7g\2\2\u0142\u0143"+
		"\7x\2\2\u0143\u0144\7g\2\2\u0144\u0145\7t\2\2\u0145\u0146\7u\2\2\u0146"+
		"\u0147\7g\2\2\u0147\u0148\7P\2\2\u0148\u0149\7c\2\2\u0149\u014a\7o\2\2"+
		"\u014a\u014b\7g\2\2\u014b\u014c\7$\2\2\u014c\u014d\7<\2\2\u014d:\3\2\2"+
		"\2\u014e\u014f\7$\2\2\u014f\u0150\7j\2\2\u0150\u0151\7v\2\2\u0151\u0152"+
		"\7v\2\2\u0152\u0153\7r\2\2\u0153\u0154\7<\2\2\u0154\u0155\7\61\2\2\u0155"+
		"\u0156\7\61\2\2\u0156<\3\2\2\2\u0157\u0158\7v\2\2\u0158\u0159\7t\2\2\u0159"+
		"\u015a\7w\2\2\u015a\u0161\7g\2\2\u015b\u015c\7h\2\2\u015c\u015d\7c\2\2"+
		"\u015d\u015e\7n\2\2\u015e\u015f\7u\2\2\u015f\u0161\7g\2\2\u0160\u0157"+
		"\3\2\2\2\u0160\u015b\3\2\2\2\u0161>\3\2\2\2\u0162\u0168\7$\2\2\u0163\u0164"+
		"\7$\2\2\u0164\u0167\7$\2\2\u0165\u0167\n\2\2\2\u0166\u0163\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016e\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\7$\2\2\u016c"+
		"\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\b\37\5\2\u0172"+
		"@\3\2\2\2\u0173\u0174\7$\2\2\u0174\u0175\7i\2\2\u0175\u0176\7t\2\2\u0176"+
		"\u0177\7c\2\2\u0177\u0178\7r\2\2\u0178\u0179\7j\2\2\u0179\u017a\7u\2\2"+
		"\u017a\u017b\7$\2\2\u017b\u017c\7<\2\2\u017c\u017d\3\2\2\2\u017d\u017e"+
		"\b \6\2\u017eB\3\2\2\2\u017f\u0181\13\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0185\b!\3\2\u0185D\3\2\2\2\u0186\u0187\7$\2\2\u0187\u0188"+
		"\7j\2\2\u0188\u0189\7v\2\2\u0189\u018a\7v\2\2\u018a\u018b\7r\2\2\u018b"+
		"\u018c\7<\2\2\u018c\u018d\7\61\2\2\u018d\u018e\7\61\2\2\u018e\u018f\7"+
		"R\2\2\u018f\u0190\7f\2\2\u0190\u0191\7N\2\2\u0191\u0192\7\60\2\2\u0192"+
		"\u0193\7e\2\2\u0193\u0194\7q\2\2\u0194\u0195\7o\2\2\u0195\u0196\7\61\2"+
		"\2\u0196\u0197\7e\2\2\u0197\u0198\7n\2\2\u0198\u0199\7c\2\2\u0199\u019a"+
		"\7u\2\2\u019a\u019b\7u\2\2\u019b\u019c\7%\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\5G#\2\u019e\u019f\7$\2\2\u019f\u01a0\b\"\7\2\u01a0\u01a1\3\2\2"+
		"\2\u01a1\u01a2\b\"\6\2\u01a2F\3\2\2\2\u01a3\u01a5\13\2\2\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"H\3\2\2\2\u01a8\u01a9\7$\2\2\u01a9\u01aa\7j\2\2\u01aa\u01ab\7v\2\2\u01ab"+
		"\u01ac\7v\2\2\u01ac\u01ad\7r\2\2\u01ad\u01ae\7<\2\2\u01ae\u01af\7\61\2"+
		"\2\u01af\u01b0\7\61\2\2\u01b0\u01b1\7R\2\2\u01b1\u01b2\7f\2\2\u01b2\u01b3"+
		"\7N\2\2\u01b3\u01b4\7\60\2\2\u01b4\u01b5\7e\2\2\u01b5\u01b6\7q\2\2\u01b6"+
		"\u01b7\7o\2\2\u01b7\u01b8\7\61\2\2\u01b8\u01b9\7r\2\2\u01b9\u01ba\7t\2"+
		"\2\u01ba\u01bb\7q\2\2\u01bb\u01bc\7r\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be"+
		"\7t\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0\7{\2\2\u01c0\u01c1\7%\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\5G#\2\u01c3\u01c4\7$\2\2\u01c4\u01c5\b$\b\2"+
		"\u01c5\u01c6\3\2\2\2\u01c6\u01c7\b$\6\2\u01c7J\3\2\2\2\u01c8\u01c9\7$"+
		"\2\2\u01c9\u01ca\7j\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd"+
		"\7r\2\2\u01cd\u01ce\7<\2\2\u01ce\u01cf\7\61\2\2\u01cf\u01d0\7\61\2\2\u01d0"+
		"\u01d1\7R\2\2\u01d1\u01d2\7f\2\2\u01d2\u01d3\7N\2\2\u01d3\u01d4\7\60\2"+
		"\2\u01d4\u01d5\7e\2\2\u01d5\u01d6\7q\2\2\u01d6\u01d7\7o\2\2\u01d7\u01d8"+
		"\7\61\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7g\2\2\u01da\u01db\7n\2\2\u01db"+
		"\u01dc\7c\2\2\u01dc\u01dd\7v\2\2\u01dd\u01de\7k\2\2\u01de\u01df\7q\2\2"+
		"\u01df\u01e0\7p\2\2\u01e0\u01e1\7u\2\2\u01e1\u01e2\7j\2\2\u01e2\u01e3"+
		"\7k\2\2\u01e3\u01e4\7r\2\2\u01e4\u01e5\7%\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e7\5G#\2\u01e7\u01e8\7$\2\2\u01e8\u01e9\b%\t\2\u01e9\u01ea\3\2\2\2"+
		"\u01ea\u01eb\b%\6\2\u01ebL\3\2\2\2\16\2\3\4\u0082\u00a9\u00bc\u0160\u0166"+
		"\u0168\u016e\u0182\u01a6\n\7\3\2\b\2\2\7\4\2\3\37\2\6\2\2\3\"\3\3$\4\3"+
		"%\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}