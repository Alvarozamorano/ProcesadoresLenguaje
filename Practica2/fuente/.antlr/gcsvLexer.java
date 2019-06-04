// Generated from c:\Users\tromp\Desktop\PECL2_PPL\pl2\fuente/gcsvLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gcsvLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXTO=1, CADENA=2, INTRO=3, SEPARADOR=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TEXTO", "CADENA", "INTRO", "SEPARADOR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEXTO", "CADENA", "INTRO", "SEPARADOR"
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


	public gcsvLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gcsvLexer.g4"; }

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
		case 1:
			CADENA_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CADENA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1,getText().length()-1).replaceAll("\\\\(.)","$1"));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6(\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\r\n\2\r\2\16\2\16\3\3\3\3\3\3\3\3\7\3\25"+
		"\n\3\f\3\16\3\30\13\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\6\4"+
		"#\n\4\r\4\16\4$\3\5\3\5\2\2\6\3\3\5\4\7\5\t\6\3\2\5\6\2\f\f\17\17$$.."+
		"\3\2$$\4\2\f\f\17\17\2,\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\3\f\3\2\2\2\5\20\3\2\2\2\7\"\3\2\2\2\t&\3\2\2\2\13\r\n\2\2\2\f\13\3"+
		"\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\4\3\2\2\2\20\26\7$\2"+
		"\2\21\22\7$\2\2\22\25\7$\2\2\23\25\n\3\2\2\24\21\3\2\2\2\24\23\3\2\2\2"+
		"\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\34\3\2\2\2\30\26\3\2\2\2"+
		"\31\33\7$\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2"+
		"\35\37\3\2\2\2\36\34\3\2\2\2\37 \b\3\2\2 \6\3\2\2\2!#\t\4\2\2\"!\3\2\2"+
		"\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\b\3\2\2\2&\'\7.\2\2\'\n\3\2\2\2\b\2"+
		"\16\24\26\34$\3\3\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}