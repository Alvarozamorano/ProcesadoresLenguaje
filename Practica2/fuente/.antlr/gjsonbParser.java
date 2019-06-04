// Generated from c:\antlr\json_bueno\gjsonbParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gjsonbParser extends Parser {
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
		RULE_fichero = 0, RULE_context = 1, RULE_textoc = 2, RULE_graphs = 3, 
		RULE_grafo = 4, RULE_dentroGrafo = 5, RULE_nodo = 6, RULE_id = 7, RULE_name = 8, 
		RULE_label = 9, RULE_properties = 10, RULE_prop = 11, RULE_reverseName = 12, 
		RULE_labelReverseName = 13, RULE_from = 14, RULE_to = 15, RULE_typeOf = 16, 
		RULE_usedby = 17, RULE_multiplicityMax = 18, RULE_multiplicityMin = 19, 
		RULE_inherits = 20, RULE_optional = 21, RULE_isList = 22, RULE_clase = 23, 
		RULE_propiedad = 24, RULE_relacion = 25, RULE_textoEs = 26, RULE_textoIn = 27, 
		RULE_textoEsReverse = 28, RULE_textoInReverse = 29, RULE_nombreGrafo = 30, 
		RULE_tipoGrafo = 31;
	public static final String[] ruleNames = {
		"fichero", "context", "textoc", "graphs", "grafo", "dentroGrafo", "nodo", 
		"id", "name", "label", "properties", "prop", "reverseName", "labelReverseName", 
		"from", "to", "typeOf", "usedby", "multiplicityMax", "multiplicityMin", 
		"inherits", "optional", "isList", "clase", "propiedad", "relacion", "textoEs", 
		"textoIn", "textoEsReverse", "textoInReverse", "nombreGrafo", "tipoGrafo"
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

	@Override
	public String getGrammarFileName() { return "gjsonbParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gjsonbParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FicheroContext extends ParserRuleContext {
		public TerminalNode LLAVEA() { return getToken(gjsonbParser.LLAVEA, 0); }
		public ContextContext context() {
			return getRuleContext(ContextContext.class,0);
		}
		public GraphsContext graphs() {
			return getRuleContext(GraphsContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(gjsonbParser.LLAVEC, 0); }
		public FicheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fichero; }
	}

	public final FicheroContext fichero() throws RecognitionException {
		FicheroContext _localctx = new FicheroContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fichero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(LLAVEA);
			setState(65);
			context();
			setState(66);
			graphs();
			setState(67);
			match(LLAVEC);
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

	public static class ContextContext extends ParserRuleContext {
		public TerminalNode CONTEXT() { return getToken(gjsonbParser.CONTEXT, 0); }
		public List<TextocContext> textoc() {
			return getRuleContexts(TextocContext.class);
		}
		public TextocContext textoc(int i) {
			return getRuleContext(TextocContext.class,i);
		}
		public ContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context; }
	}

	public final ContextContext context() throws RecognitionException {
		ContextContext _localctx = new ContextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_context);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(CONTEXT);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTOCONTEXT) {
				{
				{
				setState(70);
				textoc();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TextocContext extends ParserRuleContext {
		public TerminalNode TEXTOCONTEXT() { return getToken(gjsonbParser.TEXTOCONTEXT, 0); }
		public TextocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textoc; }
	}

	public final TextocContext textoc() throws RecognitionException {
		TextocContext _localctx = new TextocContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_textoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(TEXTOCONTEXT);
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

	public static class GraphsContext extends ParserRuleContext {
		public TerminalNode GRAPHS() { return getToken(gjsonbParser.GRAPHS, 0); }
		public List<GrafoContext> grafo() {
			return getRuleContexts(GrafoContext.class);
		}
		public GrafoContext grafo(int i) {
			return getRuleContext(GrafoContext.class,i);
		}
		public GraphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphs; }
	}

	public final GraphsContext graphs() throws RecognitionException {
		GraphsContext _localctx = new GraphsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_graphs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(GRAPHS);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LLAVEA) {
				{
				{
				setState(79);
				grafo();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class GrafoContext extends ParserRuleContext {
		public TerminalNode LLAVEA() { return getToken(gjsonbParser.LLAVEA, 0); }
		public NombreGrafoContext nombreGrafo() {
			return getRuleContext(NombreGrafoContext.class,0);
		}
		public DentroGrafoContext dentroGrafo() {
			return getRuleContext(DentroGrafoContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(gjsonbParser.LLAVEC, 0); }
		public TerminalNode DOSP() { return getToken(gjsonbParser.DOSP, 0); }
		public GrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grafo; }
	}

	public final GrafoContext grafo() throws RecognitionException {
		GrafoContext _localctx = new GrafoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_grafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LLAVEA);
			setState(86);
			nombreGrafo();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOSP) {
				{
				setState(87);
				match(DOSP);
				}
			}

			setState(90);
			dentroGrafo();
			setState(91);
			match(LLAVEC);
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

	public static class DentroGrafoContext extends ParserRuleContext {
		public TerminalNode LLAVEA() { return getToken(gjsonbParser.LLAVEA, 0); }
		public TipoGrafoContext tipoGrafo() {
			return getRuleContext(TipoGrafoContext.class,0);
		}
		public TerminalNode DOSP() { return getToken(gjsonbParser.DOSP, 0); }
		public TerminalNode LLAVEC() { return getToken(gjsonbParser.LLAVEC, 0); }
		public List<NodoContext> nodo() {
			return getRuleContexts(NodoContext.class);
		}
		public NodoContext nodo(int i) {
			return getRuleContext(NodoContext.class,i);
		}
		public DentroGrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dentroGrafo; }
	}

	public final DentroGrafoContext dentroGrafo() throws RecognitionException {
		DentroGrafoContext _localctx = new DentroGrafoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dentroGrafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LLAVEA);
			setState(94);
			tipoGrafo();
			setState(95);
			match(DOSP);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LLAVEA) {
				{
				{
				setState(96);
				nodo();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(LLAVEC);
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

	public static class NodoContext extends ParserRuleContext {
		public TerminalNode LLAVEA() { return getToken(gjsonbParser.LLAVEA, 0); }
		public TerminalNode LLAVEC() { return getToken(gjsonbParser.LLAVEC, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public List<ReverseNameContext> reverseName() {
			return getRuleContexts(ReverseNameContext.class);
		}
		public ReverseNameContext reverseName(int i) {
			return getRuleContext(ReverseNameContext.class,i);
		}
		public List<LabelReverseNameContext> labelReverseName() {
			return getRuleContexts(LabelReverseNameContext.class);
		}
		public LabelReverseNameContext labelReverseName(int i) {
			return getRuleContext(LabelReverseNameContext.class,i);
		}
		public List<FromContext> from() {
			return getRuleContexts(FromContext.class);
		}
		public FromContext from(int i) {
			return getRuleContext(FromContext.class,i);
		}
		public List<ToContext> to() {
			return getRuleContexts(ToContext.class);
		}
		public ToContext to(int i) {
			return getRuleContext(ToContext.class,i);
		}
		public List<TypeOfContext> typeOf() {
			return getRuleContexts(TypeOfContext.class);
		}
		public TypeOfContext typeOf(int i) {
			return getRuleContext(TypeOfContext.class,i);
		}
		public List<UsedbyContext> usedby() {
			return getRuleContexts(UsedbyContext.class);
		}
		public UsedbyContext usedby(int i) {
			return getRuleContext(UsedbyContext.class,i);
		}
		public List<MultiplicityMaxContext> multiplicityMax() {
			return getRuleContexts(MultiplicityMaxContext.class);
		}
		public MultiplicityMaxContext multiplicityMax(int i) {
			return getRuleContext(MultiplicityMaxContext.class,i);
		}
		public List<MultiplicityMinContext> multiplicityMin() {
			return getRuleContexts(MultiplicityMinContext.class);
		}
		public MultiplicityMinContext multiplicityMin(int i) {
			return getRuleContext(MultiplicityMinContext.class,i);
		}
		public List<InheritsContext> inherits() {
			return getRuleContexts(InheritsContext.class);
		}
		public InheritsContext inherits(int i) {
			return getRuleContext(InheritsContext.class,i);
		}
		public List<OptionalContext> optional() {
			return getRuleContexts(OptionalContext.class);
		}
		public OptionalContext optional(int i) {
			return getRuleContext(OptionalContext.class,i);
		}
		public List<IsListContext> isList() {
			return getRuleContexts(IsListContext.class);
		}
		public IsListContext isList(int i) {
			return getRuleContext(IsListContext.class,i);
		}
		public NodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodo; }
	}

	public final NodoContext nodo() throws RecognitionException {
		NodoContext _localctx = new NodoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(LLAVEA);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NAME) | (1L << LABEL) | (1L << PROPERTIES) | (1L << TYPEOF) | (1L << USEDBY) | (1L << ISLIST) | (1L << MULTIPLICITYMAX) | (1L << MULTIPLICITYMIN) | (1L << INHERITS) | (1L << OPTIONAL) | (1L << TO) | (1L << FROM) | (1L << REVERSENAME) | (1L << LABELREVERSENAME))) != 0)) {
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(105);
					id();
					}
					break;
				case NAME:
					{
					setState(106);
					name();
					}
					break;
				case LABEL:
					{
					setState(107);
					label();
					}
					break;
				case PROPERTIES:
					{
					setState(108);
					properties();
					}
					break;
				case REVERSENAME:
					{
					setState(109);
					reverseName();
					}
					break;
				case LABELREVERSENAME:
					{
					setState(110);
					labelReverseName();
					}
					break;
				case FROM:
					{
					setState(111);
					from();
					}
					break;
				case TO:
					{
					setState(112);
					to();
					}
					break;
				case TYPEOF:
					{
					setState(113);
					typeOf();
					}
					break;
				case USEDBY:
					{
					setState(114);
					usedby();
					}
					break;
				case MULTIPLICITYMAX:
					{
					setState(115);
					multiplicityMax();
					}
					break;
				case MULTIPLICITYMIN:
					{
					setState(116);
					multiplicityMin();
					}
					break;
				case INHERITS:
					{
					setState(117);
					inherits();
					}
					break;
				case OPTIONAL:
					{
					setState(118);
					optional();
					}
					break;
				case ISLIST:
					{
					setState(119);
					isList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(LLAVEC);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gjsonbParser.ID, 0); }
		public ClaseContext clase() {
			return getRuleContext(ClaseContext.class,0);
		}
		public PropiedadContext propiedad() {
			return getRuleContext(PropiedadContext.class,0);
		}
		public RelacionContext relacion() {
			return getRuleContext(RelacionContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ID);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASE:
				{
				setState(128);
				clase();
				}
				break;
			case PROPIEDAD:
				{
				setState(129);
				propiedad();
				}
				break;
			case RELACION:
				{
				setState(130);
				relacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(gjsonbParser.NAME, 0); }
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NAME);
			setState(134);
			match(TEXTO);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(gjsonbParser.LABEL, 0); }
		public TerminalNode LLAVEA() { return getToken(gjsonbParser.LLAVEA, 0); }
		public TerminalNode LLAVEC() { return getToken(gjsonbParser.LLAVEC, 0); }
		public List<TerminalNode> ES() { return getTokens(gjsonbParser.ES); }
		public TerminalNode ES(int i) {
			return getToken(gjsonbParser.ES, i);
		}
		public List<TextoEsContext> textoEs() {
			return getRuleContexts(TextoEsContext.class);
		}
		public TextoEsContext textoEs(int i) {
			return getRuleContext(TextoEsContext.class,i);
		}
		public List<TerminalNode> ENG() { return getTokens(gjsonbParser.ENG); }
		public TerminalNode ENG(int i) {
			return getToken(gjsonbParser.ENG, i);
		}
		public List<TextoInContext> textoIn() {
			return getRuleContexts(TextoInContext.class);
		}
		public TextoInContext textoIn(int i) {
			return getRuleContext(TextoInContext.class,i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			match(LABEL);
			setState(137);
			match(LLAVEA);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ES || _la==ENG) {
				{
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ES:
					{
					{
					setState(138);
					match(ES);
					setState(139);
					textoEs();
					}
					}
					break;
				case ENG:
					{
					{
					setState(140);
					match(ENG);
					setState(141);
					textoIn();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(LLAVEC);
			}
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

	public static class PropertiesContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(gjsonbParser.PROPERTIES, 0); }
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(PROPERTIES);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTO) {
				{
				{
				setState(150);
				prop();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class PropContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(TEXTO);
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

	public static class ReverseNameContext extends ParserRuleContext {
		public TerminalNode REVERSENAME() { return getToken(gjsonbParser.REVERSENAME, 0); }
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public ReverseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverseName; }
	}

	public final ReverseNameContext reverseName() throws RecognitionException {
		ReverseNameContext _localctx = new ReverseNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_reverseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(REVERSENAME);
			setState(159);
			match(TEXTO);
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

	public static class LabelReverseNameContext extends ParserRuleContext {
		public TerminalNode LABELREVERSENAME() { return getToken(gjsonbParser.LABELREVERSENAME, 0); }
		public TerminalNode LLAVEA() { return getToken(gjsonbParser.LLAVEA, 0); }
		public TerminalNode LLAVEC() { return getToken(gjsonbParser.LLAVEC, 0); }
		public List<TerminalNode> ES() { return getTokens(gjsonbParser.ES); }
		public TerminalNode ES(int i) {
			return getToken(gjsonbParser.ES, i);
		}
		public List<TextoEsReverseContext> textoEsReverse() {
			return getRuleContexts(TextoEsReverseContext.class);
		}
		public TextoEsReverseContext textoEsReverse(int i) {
			return getRuleContext(TextoEsReverseContext.class,i);
		}
		public List<TerminalNode> ENG() { return getTokens(gjsonbParser.ENG); }
		public TerminalNode ENG(int i) {
			return getToken(gjsonbParser.ENG, i);
		}
		public List<TextoInReverseContext> textoInReverse() {
			return getRuleContexts(TextoInReverseContext.class);
		}
		public TextoInReverseContext textoInReverse(int i) {
			return getRuleContext(TextoInReverseContext.class,i);
		}
		public LabelReverseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelReverseName; }
	}

	public final LabelReverseNameContext labelReverseName() throws RecognitionException {
		LabelReverseNameContext _localctx = new LabelReverseNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_labelReverseName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			match(LABELREVERSENAME);
			setState(162);
			match(LLAVEA);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ES || _la==ENG) {
				{
				setState(167);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ES:
					{
					{
					setState(163);
					match(ES);
					setState(164);
					textoEsReverse();
					}
					}
					break;
				case ENG:
					{
					{
					setState(165);
					match(ENG);
					setState(166);
					textoInReverse();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(LLAVEC);
			}
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(gjsonbParser.FROM, 0); }
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(FROM);
			setState(175);
			match(TEXTO);
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

	public static class ToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(gjsonbParser.TO, 0); }
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(TO);
			setState(178);
			match(TEXTO);
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

	public static class TypeOfContext extends ParserRuleContext {
		public TerminalNode TYPEOF() { return getToken(gjsonbParser.TYPEOF, 0); }
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public TypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOf; }
	}

	public final TypeOfContext typeOf() throws RecognitionException {
		TypeOfContext _localctx = new TypeOfContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeOf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(TYPEOF);
			setState(181);
			match(TEXTO);
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

	public static class UsedbyContext extends ParserRuleContext {
		public TerminalNode USEDBY() { return getToken(gjsonbParser.USEDBY, 0); }
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public UsedbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usedby; }
	}

	public final UsedbyContext usedby() throws RecognitionException {
		UsedbyContext _localctx = new UsedbyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_usedby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(USEDBY);
			setState(184);
			match(TEXTO);
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

	public static class MultiplicityMaxContext extends ParserRuleContext {
		public TerminalNode MULTIPLICITYMAX() { return getToken(gjsonbParser.MULTIPLICITYMAX, 0); }
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public MultiplicityMaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicityMax; }
	}

	public final MultiplicityMaxContext multiplicityMax() throws RecognitionException {
		MultiplicityMaxContext _localctx = new MultiplicityMaxContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplicityMax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(MULTIPLICITYMAX);
			setState(187);
			match(TEXTO);
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

	public static class MultiplicityMinContext extends ParserRuleContext {
		public TerminalNode MULTIPLICITYMIN() { return getToken(gjsonbParser.MULTIPLICITYMIN, 0); }
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public MultiplicityMinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicityMin; }
	}

	public final MultiplicityMinContext multiplicityMin() throws RecognitionException {
		MultiplicityMinContext _localctx = new MultiplicityMinContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplicityMin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(MULTIPLICITYMIN);
			setState(190);
			match(TEXTO);
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

	public static class InheritsContext extends ParserRuleContext {
		public TerminalNode INHERITS() { return getToken(gjsonbParser.INHERITS, 0); }
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public InheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherits; }
	}

	public final InheritsContext inherits() throws RecognitionException {
		InheritsContext _localctx = new InheritsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(INHERITS);
			setState(193);
			match(TEXTO);
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

	public static class OptionalContext extends ParserRuleContext {
		public TerminalNode OPTIONAL() { return getToken(gjsonbParser.OPTIONAL, 0); }
		public TerminalNode BOOL() { return getToken(gjsonbParser.BOOL, 0); }
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_optional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(OPTIONAL);
			setState(196);
			match(BOOL);
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

	public static class IsListContext extends ParserRuleContext {
		public TerminalNode ISLIST() { return getToken(gjsonbParser.ISLIST, 0); }
		public TerminalNode BOOL() { return getToken(gjsonbParser.BOOL, 0); }
		public IsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isList; }
	}

	public final IsListContext isList() throws RecognitionException {
		IsListContext _localctx = new IsListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_isList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ISLIST);
			setState(199);
			match(BOOL);
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

	public static class ClaseContext extends ParserRuleContext {
		public TerminalNode CLASE() { return getToken(gjsonbParser.CLASE, 0); }
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_clase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(CLASE);
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

	public static class PropiedadContext extends ParserRuleContext {
		public TerminalNode PROPIEDAD() { return getToken(gjsonbParser.PROPIEDAD, 0); }
		public PropiedadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propiedad; }
	}

	public final PropiedadContext propiedad() throws RecognitionException {
		PropiedadContext _localctx = new PropiedadContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_propiedad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(PROPIEDAD);
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

	public static class RelacionContext extends ParserRuleContext {
		public TerminalNode RELACION() { return getToken(gjsonbParser.RELACION, 0); }
		public RelacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacion; }
	}

	public final RelacionContext relacion() throws RecognitionException {
		RelacionContext _localctx = new RelacionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(RELACION);
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

	public static class TextoEsContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public TextoEsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textoEs; }
	}

	public final TextoEsContext textoEs() throws RecognitionException {
		TextoEsContext _localctx = new TextoEsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_textoEs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(TEXTO);
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

	public static class TextoInContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public TextoInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textoIn; }
	}

	public final TextoInContext textoIn() throws RecognitionException {
		TextoInContext _localctx = new TextoInContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_textoIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(TEXTO);
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

	public static class TextoEsReverseContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public TextoEsReverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textoEsReverse; }
	}

	public final TextoEsReverseContext textoEsReverse() throws RecognitionException {
		TextoEsReverseContext _localctx = new TextoEsReverseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_textoEsReverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TEXTO);
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

	public static class TextoInReverseContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public TextoInReverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textoInReverse; }
	}

	public final TextoInReverseContext textoInReverse() throws RecognitionException {
		TextoInReverseContext _localctx = new TextoInReverseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_textoInReverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(TEXTO);
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

	public static class NombreGrafoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public TerminalNode PROPERTIES() { return getToken(gjsonbParser.PROPERTIES, 0); }
		public NombreGrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreGrafo; }
	}

	public final NombreGrafoContext nombreGrafo() throws RecognitionException {
		NombreGrafoContext _localctx = new NombreGrafoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nombreGrafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==PROPERTIES || _la==TEXTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TipoGrafoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(gjsonbParser.TEXTO, 0); }
		public TipoGrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoGrafo; }
	}

	public final TipoGrafoContext tipoGrafo() throws RecognitionException {
		TipoGrafoContext _localctx = new TipoGrafoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tipoGrafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(TEXTO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4\3\5\3"+
		"\5\7\5S\n\5\f\5\16\5V\13\5\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\7\7d\n\7\f\7\16\7g\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0091\n\13\f\13\16\13\u0094\13\13\3\13\3\13\3\f\3\f\7\f\u009a\n\f\f\f"+
		"\16\f\u009d\13\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00aa\n\17\f\17\16\17\u00ad\13\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2\2\"\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\3\4\2"+
		"\22\22  \2\u00d7\2B\3\2\2\2\4G\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\nW\3\2\2"+
		"\2\f_\3\2\2\2\16j\3\2\2\2\20\u0081\3\2\2\2\22\u0087\3\2\2\2\24\u008a\3"+
		"\2\2\2\26\u0097\3\2\2\2\30\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00a3\3\2"+
		"\2\2\36\u00b0\3\2\2\2 \u00b3\3\2\2\2\"\u00b6\3\2\2\2$\u00b9\3\2\2\2&\u00bc"+
		"\3\2\2\2(\u00bf\3\2\2\2*\u00c2\3\2\2\2,\u00c5\3\2\2\2.\u00c8\3\2\2\2\60"+
		"\u00cb\3\2\2\2\62\u00cd\3\2\2\2\64\u00cf\3\2\2\2\66\u00d1\3\2\2\28\u00d3"+
		"\3\2\2\2:\u00d5\3\2\2\2<\u00d7\3\2\2\2>\u00d9\3\2\2\2@\u00db\3\2\2\2B"+
		"C\7\4\2\2CD\5\4\3\2DE\5\b\5\2EF\7\5\2\2F\3\3\2\2\2GK\7\3\2\2HJ\5\6\4\2"+
		"IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5\3\2\2\2MK\3\2\2\2NO\7\"\2"+
		"\2O\7\3\2\2\2PT\7!\2\2QS\5\n\6\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2U\t\3\2\2\2VT\3\2\2\2WX\7\4\2\2XZ\5> \2Y[\7\b\2\2ZY\3\2\2\2Z[\3\2\2"+
		"\2[\\\3\2\2\2\\]\5\f\7\2]^\7\5\2\2^\13\3\2\2\2_`\7\4\2\2`a\5@!\2ae\7\b"+
		"\2\2bd\5\16\b\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3"+
		"\2\2\2hi\7\5\2\2i\r\3\2\2\2j|\7\4\2\2k{\5\20\t\2l{\5\22\n\2m{\5\24\13"+
		"\2n{\5\26\f\2o{\5\32\16\2p{\5\34\17\2q{\5\36\20\2r{\5 \21\2s{\5\"\22\2"+
		"t{\5$\23\2u{\5&\24\2v{\5(\25\2w{\5*\26\2x{\5,\27\2y{\5.\30\2zk\3\2\2\2"+
		"zl\3\2\2\2zm\3\2\2\2zn\3\2\2\2zo\3\2\2\2zp\3\2\2\2zq\3\2\2\2zr\3\2\2\2"+
		"zs\3\2\2\2zt\3\2\2\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2"+
		"{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\5\2"+
		"\2\u0080\17\3\2\2\2\u0081\u0085\7\r\2\2\u0082\u0086\5\60\31\2\u0083\u0086"+
		"\5\62\32\2\u0084\u0086\5\64\33\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2"+
		"\2\u0085\u0084\3\2\2\2\u0086\21\3\2\2\2\u0087\u0088\7\16\2\2\u0088\u0089"+
		"\7 \2\2\u0089\23\3\2\2\2\u008a\u008b\7\17\2\2\u008b\u0092\7\4\2\2\u008c"+
		"\u008d\7\20\2\2\u008d\u0091\5\66\34\2\u008e\u008f\7\21\2\2\u008f\u0091"+
		"\58\35\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0096\7\5\2\2\u0096\25\3\2\2\2\u0097\u009b\7\22\2\2\u0098\u009a"+
		"\5\30\r\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f"+
		"\7 \2\2\u009f\31\3\2\2\2\u00a0\u00a1\7\34\2\2\u00a1\u00a2\7 \2\2\u00a2"+
		"\33\3\2\2\2\u00a3\u00a4\7\35\2\2\u00a4\u00ab\7\4\2\2\u00a5\u00a6\7\20"+
		"\2\2\u00a6\u00aa\5:\36\2\u00a7\u00a8\7\21\2\2\u00a8\u00aa\5<\37\2\u00a9"+
		"\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7\5\2\2\u00af\35\3\2\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00b2\7 \2"+
		"\2\u00b2\37\3\2\2\2\u00b3\u00b4\7\32\2\2\u00b4\u00b5\7 \2\2\u00b5!\3\2"+
		"\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00b8\7 \2\2\u00b8#\3\2\2\2\u00b9\u00ba"+
		"\7\24\2\2\u00ba\u00bb\7 \2\2\u00bb%\3\2\2\2\u00bc\u00bd\7\26\2\2\u00bd"+
		"\u00be\7 \2\2\u00be\'\3\2\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7 \2\2"+
		"\u00c1)\3\2\2\2\u00c2\u00c3\7\30\2\2\u00c3\u00c4\7 \2\2\u00c4+\3\2\2\2"+
		"\u00c5\u00c6\7\31\2\2\u00c6\u00c7\7\37\2\2\u00c7-\3\2\2\2\u00c8\u00c9"+
		"\7\25\2\2\u00c9\u00ca\7\37\2\2\u00ca/\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc"+
		"\61\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce\63\3\2\2\2\u00cf\u00d0\7%\2\2\u00d0"+
		"\65\3\2\2\2\u00d1\u00d2\7 \2\2\u00d2\67\3\2\2\2\u00d3\u00d4\7 \2\2\u00d4"+
		"9\3\2\2\2\u00d5\u00d6\7 \2\2\u00d6;\3\2\2\2\u00d7\u00d8\7 \2\2\u00d8="+
		"\3\2\2\2\u00d9\u00da\t\2\2\2\u00da?\3\2\2\2\u00db\u00dc\7 \2\2\u00dcA"+
		"\3\2\2\2\16KTZez|\u0085\u0090\u0092\u009b\u00a9\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}