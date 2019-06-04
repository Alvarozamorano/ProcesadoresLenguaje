// Generated from c:\Users\tromp\Desktop\PECL2_PPL\0.pl2\gParamParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gParamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_JSON=1, KW_DOT=2, KW_SVG=3, KW_CSV=4, KW_LEN=5, KW_FONTCOLOR=6, KW_FONTNAME=7, 
		KW_FONTSIZE=8, KW_ARROWSIZE=9, KW_ARROWCOLOR=10, KW_PENWIDTH=11, KW_FILLCOLOR=12, 
		KW_STYLE=13, KW_SHAPE=14, KW_EDGE=15, KW_NODE=16, KW_RELA=17, KW_CLASS=18, 
		KW_PROP=19, KW_INHE=20, KW_INDI=21, S_IGUAL=22, S_GUIONB=23, S_COMILLAS=24, 
		ENTERO=25, INTRO=26, WS=27, TEXTOCON=28, TEXTOSIN=29;
	public static final int
		RULE_parametros = 0, RULE_ficheros = 1, RULE_param = 2, RULE_len = 3, 
		RULE_fontcolor = 4, RULE_fontname = 5, RULE_fontsize = 6, RULE_arrowsize = 7, 
		RULE_arrowcolor = 8, RULE_penwidth = 9, RULE_fillcolor = 10, RULE_style = 11, 
		RULE_shape = 12, RULE_json = 13, RULE_dot = 14, RULE_svg = 15, RULE_csv = 16, 
		RULE_w_json = 17, RULE_w_dot = 18, RULE_w_svg = 19, RULE_w_csv = 20, RULE_w_len = 21, 
		RULE_w_fontcolor = 22, RULE_w_fontname = 23, RULE_w_fontsize = 24, RULE_w_arrowsize = 25, 
		RULE_w_arrowcolor = 26, RULE_w_penwidth = 27, RULE_w_fillcolor = 28, RULE_w_style = 29, 
		RULE_w_shape = 30, RULE_edno = 31, RULE_edge = 32, RULE_node = 33, RULE_igual = 34, 
		RULE_guionb = 35, RULE_cadena = 36, RULE_entero = 37, RULE_w_rela = 38, 
		RULE_w_class = 39, RULE_w_prop = 40, RULE_w_inhe = 41, RULE_w_indi = 42, 
		RULE_elemento = 43, RULE_ruta = 44, RULE_ws = 45;
	public static final String[] ruleNames = {
		"parametros", "ficheros", "param", "len", "fontcolor", "fontname", "fontsize", 
		"arrowsize", "arrowcolor", "penwidth", "fillcolor", "style", "shape", 
		"json", "dot", "svg", "csv", "w_json", "w_dot", "w_svg", "w_csv", "w_len", 
		"w_fontcolor", "w_fontname", "w_fontsize", "w_arrowsize", "w_arrowcolor", 
		"w_penwidth", "w_fillcolor", "w_style", "w_shape", "edno", "edge", "node", 
		"igual", "guionb", "cadena", "entero", "w_rela", "w_class", "w_prop", 
		"w_inhe", "w_indi", "elemento", "ruta", "ws"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-JSON'", "'-DOT'", "'-SVG'", "'-CSV'", "'-len'", "'-fontcolor'", 
		"'-fontname'", "'-fontsize'", "'-arrowsize'", "'-arrowcolor'", "'-penwidth'", 
		"'-fillcolor'", "'-style'", "'-shape'", "'edge'", "'node'", "'relationship'", 
		"'class'", "'property'", "'inheritance'", "'indirect_use'", "'='", "'_'", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", "KW_LEN", "KW_FONTCOLOR", 
		"KW_FONTNAME", "KW_FONTSIZE", "KW_ARROWSIZE", "KW_ARROWCOLOR", "KW_PENWIDTH", 
		"KW_FILLCOLOR", "KW_STYLE", "KW_SHAPE", "KW_EDGE", "KW_NODE", "KW_RELA", 
		"KW_CLASS", "KW_PROP", "KW_INHE", "KW_INDI", "S_IGUAL", "S_GUIONB", "S_COMILLAS", 
		"ENTERO", "INTRO", "WS", "TEXTOCON", "TEXTOSIN"
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
	public String getGrammarFileName() { return "gParamParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParamParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParametrosContext extends ParserRuleContext {
		public FicherosContext ficheros() {
			return getRuleContext(FicherosContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			ficheros();
			setState(93);
			param();
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

	public static class FicherosContext extends ParserRuleContext {
		public List<JsonContext> json() {
			return getRuleContexts(JsonContext.class);
		}
		public JsonContext json(int i) {
			return getRuleContext(JsonContext.class,i);
		}
		public List<DotContext> dot() {
			return getRuleContexts(DotContext.class);
		}
		public DotContext dot(int i) {
			return getRuleContext(DotContext.class,i);
		}
		public List<SvgContext> svg() {
			return getRuleContexts(SvgContext.class);
		}
		public SvgContext svg(int i) {
			return getRuleContext(SvgContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<CsvContext> csv() {
			return getRuleContexts(CsvContext.class);
		}
		public CsvContext csv(int i) {
			return getRuleContext(CsvContext.class,i);
		}
		public FicherosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ficheros; }
	}

	public final FicherosContext ficheros() throws RecognitionException {
		FicherosContext _localctx = new FicherosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ficheros);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case KW_JSON:
			case KW_DOT:
			case KW_SVG:
			case KW_LEN:
			case KW_FONTCOLOR:
			case KW_FONTNAME:
			case KW_FONTSIZE:
			case KW_ARROWSIZE:
			case KW_ARROWCOLOR:
			case KW_PENWIDTH:
			case KW_FILLCOLOR:
			case KW_STYLE:
			case KW_SHAPE:
			case WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_JSON) | (1L << KW_DOT) | (1L << KW_SVG) | (1L << WS))) != 0)) {
					{
					setState(99);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_JSON:
						{
						setState(95);
						json();
						}
						break;
					case KW_DOT:
						{
						setState(96);
						dot();
						}
						break;
					case KW_SVG:
						{
						setState(97);
						svg();
						}
						break;
					case WS:
						{
						setState(98);
						ws();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case KW_CSV:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					csv();
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==KW_CSV );
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(109);
					ws();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParamContext extends ParserRuleContext {
		public List<LenContext> len() {
			return getRuleContexts(LenContext.class);
		}
		public LenContext len(int i) {
			return getRuleContext(LenContext.class,i);
		}
		public List<FontcolorContext> fontcolor() {
			return getRuleContexts(FontcolorContext.class);
		}
		public FontcolorContext fontcolor(int i) {
			return getRuleContext(FontcolorContext.class,i);
		}
		public List<FontnameContext> fontname() {
			return getRuleContexts(FontnameContext.class);
		}
		public FontnameContext fontname(int i) {
			return getRuleContext(FontnameContext.class,i);
		}
		public List<FontsizeContext> fontsize() {
			return getRuleContexts(FontsizeContext.class);
		}
		public FontsizeContext fontsize(int i) {
			return getRuleContext(FontsizeContext.class,i);
		}
		public List<ArrowsizeContext> arrowsize() {
			return getRuleContexts(ArrowsizeContext.class);
		}
		public ArrowsizeContext arrowsize(int i) {
			return getRuleContext(ArrowsizeContext.class,i);
		}
		public List<ArrowcolorContext> arrowcolor() {
			return getRuleContexts(ArrowcolorContext.class);
		}
		public ArrowcolorContext arrowcolor(int i) {
			return getRuleContext(ArrowcolorContext.class,i);
		}
		public List<PenwidthContext> penwidth() {
			return getRuleContexts(PenwidthContext.class);
		}
		public PenwidthContext penwidth(int i) {
			return getRuleContext(PenwidthContext.class,i);
		}
		public List<FillcolorContext> fillcolor() {
			return getRuleContexts(FillcolorContext.class);
		}
		public FillcolorContext fillcolor(int i) {
			return getRuleContext(FillcolorContext.class,i);
		}
		public List<StyleContext> style() {
			return getRuleContexts(StyleContext.class);
		}
		public StyleContext style(int i) {
			return getRuleContext(StyleContext.class,i);
		}
		public List<ShapeContext> shape() {
			return getRuleContexts(ShapeContext.class);
		}
		public ShapeContext shape(int i) {
			return getRuleContext(ShapeContext.class,i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_LEN) | (1L << KW_FONTCOLOR) | (1L << KW_FONTNAME) | (1L << KW_FONTSIZE) | (1L << KW_ARROWSIZE) | (1L << KW_ARROWCOLOR) | (1L << KW_PENWIDTH) | (1L << KW_FILLCOLOR) | (1L << KW_STYLE) | (1L << KW_SHAPE))) != 0)) {
				{
				setState(127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_LEN:
					{
					setState(117);
					len();
					}
					break;
				case KW_FONTCOLOR:
					{
					setState(118);
					fontcolor();
					}
					break;
				case KW_FONTNAME:
					{
					setState(119);
					fontname();
					}
					break;
				case KW_FONTSIZE:
					{
					setState(120);
					fontsize();
					}
					break;
				case KW_ARROWSIZE:
					{
					setState(121);
					arrowsize();
					}
					break;
				case KW_ARROWCOLOR:
					{
					setState(122);
					arrowcolor();
					}
					break;
				case KW_PENWIDTH:
					{
					setState(123);
					penwidth();
					}
					break;
				case KW_FILLCOLOR:
					{
					setState(124);
					fillcolor();
					}
					break;
				case KW_STYLE:
					{
					setState(125);
					style();
					}
					break;
				case KW_SHAPE:
					{
					setState(126);
					shape();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(131);
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

	public static class LenContext extends ParserRuleContext {
		public W_lenContext w_len() {
			return getRuleContext(W_lenContext.class,0);
		}
		public GuionbContext guionb() {
			return getRuleContext(GuionbContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			w_len();
			setState(133);
			guionb();
			setState(134);
			elemento();
			setState(135);
			igual();
			setState(136);
			entero();
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

	public static class FontcolorContext extends ParserRuleContext {
		public W_fontcolorContext w_fontcolor() {
			return getRuleContext(W_fontcolorContext.class,0);
		}
		public List<GuionbContext> guionb() {
			return getRuleContexts(GuionbContext.class);
		}
		public GuionbContext guionb(int i) {
			return getRuleContext(GuionbContext.class,i);
		}
		public EdnoContext edno() {
			return getRuleContext(EdnoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public FontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontcolor; }
	}

	public final FontcolorContext fontcolor() throws RecognitionException {
		FontcolorContext _localctx = new FontcolorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			w_fontcolor();
			setState(139);
			guionb();
			setState(140);
			edno();
			setState(141);
			guionb();
			setState(142);
			elemento();
			setState(143);
			igual();
			setState(144);
			cadena();
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

	public static class FontnameContext extends ParserRuleContext {
		public W_fontnameContext w_fontname() {
			return getRuleContext(W_fontnameContext.class,0);
		}
		public List<GuionbContext> guionb() {
			return getRuleContexts(GuionbContext.class);
		}
		public GuionbContext guionb(int i) {
			return getRuleContext(GuionbContext.class,i);
		}
		public EdnoContext edno() {
			return getRuleContext(EdnoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public FontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontname; }
	}

	public final FontnameContext fontname() throws RecognitionException {
		FontnameContext _localctx = new FontnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			w_fontname();
			setState(147);
			guionb();
			setState(148);
			edno();
			setState(149);
			guionb();
			setState(150);
			elemento();
			setState(151);
			igual();
			setState(152);
			cadena();
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

	public static class FontsizeContext extends ParserRuleContext {
		public W_fontsizeContext w_fontsize() {
			return getRuleContext(W_fontsizeContext.class,0);
		}
		public List<GuionbContext> guionb() {
			return getRuleContexts(GuionbContext.class);
		}
		public GuionbContext guionb(int i) {
			return getRuleContext(GuionbContext.class,i);
		}
		public EdnoContext edno() {
			return getRuleContext(EdnoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public FontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize; }
	}

	public final FontsizeContext fontsize() throws RecognitionException {
		FontsizeContext _localctx = new FontsizeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			w_fontsize();
			setState(155);
			guionb();
			setState(156);
			edno();
			setState(157);
			guionb();
			setState(158);
			elemento();
			setState(159);
			igual();
			setState(160);
			entero();
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

	public static class ArrowsizeContext extends ParserRuleContext {
		public W_arrowsizeContext w_arrowsize() {
			return getRuleContext(W_arrowsizeContext.class,0);
		}
		public List<GuionbContext> guionb() {
			return getRuleContexts(GuionbContext.class);
		}
		public GuionbContext guionb(int i) {
			return getRuleContext(GuionbContext.class,i);
		}
		public EdnoContext edno() {
			return getRuleContext(EdnoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public ArrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowsize; }
	}

	public final ArrowsizeContext arrowsize() throws RecognitionException {
		ArrowsizeContext _localctx = new ArrowsizeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			w_arrowsize();
			setState(163);
			guionb();
			setState(164);
			edno();
			setState(165);
			guionb();
			setState(166);
			elemento();
			setState(167);
			igual();
			setState(168);
			entero();
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

	public static class ArrowcolorContext extends ParserRuleContext {
		public W_arrowcolorContext w_arrowcolor() {
			return getRuleContext(W_arrowcolorContext.class,0);
		}
		public List<GuionbContext> guionb() {
			return getRuleContexts(GuionbContext.class);
		}
		public GuionbContext guionb(int i) {
			return getRuleContext(GuionbContext.class,i);
		}
		public EdnoContext edno() {
			return getRuleContext(EdnoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public ArrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowcolor; }
	}

	public final ArrowcolorContext arrowcolor() throws RecognitionException {
		ArrowcolorContext _localctx = new ArrowcolorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			w_arrowcolor();
			setState(171);
			guionb();
			setState(172);
			edno();
			setState(173);
			guionb();
			setState(174);
			elemento();
			setState(175);
			igual();
			setState(176);
			cadena();
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

	public static class PenwidthContext extends ParserRuleContext {
		public W_penwidthContext w_penwidth() {
			return getRuleContext(W_penwidthContext.class,0);
		}
		public List<GuionbContext> guionb() {
			return getRuleContexts(GuionbContext.class);
		}
		public GuionbContext guionb(int i) {
			return getRuleContext(GuionbContext.class,i);
		}
		public EdnoContext edno() {
			return getRuleContext(EdnoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public PenwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penwidth; }
	}

	public final PenwidthContext penwidth() throws RecognitionException {
		PenwidthContext _localctx = new PenwidthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			w_penwidth();
			setState(179);
			guionb();
			setState(180);
			edno();
			setState(181);
			guionb();
			setState(182);
			elemento();
			setState(183);
			igual();
			setState(184);
			entero();
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

	public static class FillcolorContext extends ParserRuleContext {
		public W_fillcolorContext w_fillcolor() {
			return getRuleContext(W_fillcolorContext.class,0);
		}
		public List<GuionbContext> guionb() {
			return getRuleContexts(GuionbContext.class);
		}
		public GuionbContext guionb(int i) {
			return getRuleContext(GuionbContext.class,i);
		}
		public EdnoContext edno() {
			return getRuleContext(EdnoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public FillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillcolor; }
	}

	public final FillcolorContext fillcolor() throws RecognitionException {
		FillcolorContext _localctx = new FillcolorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			w_fillcolor();
			setState(187);
			guionb();
			setState(188);
			edno();
			setState(189);
			guionb();
			setState(190);
			elemento();
			setState(191);
			igual();
			setState(192);
			cadena();
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

	public static class StyleContext extends ParserRuleContext {
		public W_styleContext w_style() {
			return getRuleContext(W_styleContext.class,0);
		}
		public List<GuionbContext> guionb() {
			return getRuleContexts(GuionbContext.class);
		}
		public GuionbContext guionb(int i) {
			return getRuleContext(GuionbContext.class,i);
		}
		public EdnoContext edno() {
			return getRuleContext(EdnoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			w_style();
			setState(195);
			guionb();
			setState(196);
			edno();
			setState(197);
			guionb();
			setState(198);
			elemento();
			setState(199);
			igual();
			setState(200);
			cadena();
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

	public static class ShapeContext extends ParserRuleContext {
		public W_shapeContext w_shape() {
			return getRuleContext(W_shapeContext.class,0);
		}
		public List<GuionbContext> guionb() {
			return getRuleContexts(GuionbContext.class);
		}
		public GuionbContext guionb(int i) {
			return getRuleContext(GuionbContext.class,i);
		}
		public EdnoContext edno() {
			return getRuleContext(EdnoContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			w_shape();
			setState(203);
			guionb();
			setState(204);
			edno();
			setState(205);
			guionb();
			setState(206);
			elemento();
			setState(207);
			igual();
			setState(208);
			cadena();
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

	public static class JsonContext extends ParserRuleContext {
		public W_jsonContext w_json() {
			return getRuleContext(W_jsonContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			w_json();
			setState(211);
			igual();
			setState(212);
			ruta();
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

	public static class DotContext extends ParserRuleContext {
		public W_dotContext w_dot() {
			return getRuleContext(W_dotContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			w_dot();
			setState(215);
			igual();
			setState(216);
			ruta();
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

	public static class SvgContext extends ParserRuleContext {
		public W_svgContext w_svg() {
			return getRuleContext(W_svgContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public SvgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svg; }
	}

	public final SvgContext svg() throws RecognitionException {
		SvgContext _localctx = new SvgContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			w_svg();
			setState(219);
			igual();
			setState(220);
			ruta();
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

	public static class CsvContext extends ParserRuleContext {
		public W_csvContext w_csv() {
			return getRuleContext(W_csvContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public RutaContext ruta() {
			return getRuleContext(RutaContext.class,0);
		}
		public CsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csv; }
	}

	public final CsvContext csv() throws RecognitionException {
		CsvContext _localctx = new CsvContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			w_csv();
			setState(223);
			igual();
			setState(224);
			ruta();
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

	public static class W_jsonContext extends ParserRuleContext {
		public TerminalNode KW_JSON() { return getToken(gParamParser.KW_JSON, 0); }
		public W_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_json; }
	}

	public final W_jsonContext w_json() throws RecognitionException {
		W_jsonContext _localctx = new W_jsonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_w_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(KW_JSON);
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

	public static class W_dotContext extends ParserRuleContext {
		public TerminalNode KW_DOT() { return getToken(gParamParser.KW_DOT, 0); }
		public W_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_dot; }
	}

	public final W_dotContext w_dot() throws RecognitionException {
		W_dotContext _localctx = new W_dotContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_w_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(KW_DOT);
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

	public static class W_svgContext extends ParserRuleContext {
		public TerminalNode KW_SVG() { return getToken(gParamParser.KW_SVG, 0); }
		public W_svgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_svg; }
	}

	public final W_svgContext w_svg() throws RecognitionException {
		W_svgContext _localctx = new W_svgContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_w_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(KW_SVG);
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

	public static class W_csvContext extends ParserRuleContext {
		public TerminalNode KW_CSV() { return getToken(gParamParser.KW_CSV, 0); }
		public W_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_csv; }
	}

	public final W_csvContext w_csv() throws RecognitionException {
		W_csvContext _localctx = new W_csvContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_w_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(KW_CSV);
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

	public static class W_lenContext extends ParserRuleContext {
		public TerminalNode KW_LEN() { return getToken(gParamParser.KW_LEN, 0); }
		public W_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_len; }
	}

	public final W_lenContext w_len() throws RecognitionException {
		W_lenContext _localctx = new W_lenContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_w_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(KW_LEN);
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

	public static class W_fontcolorContext extends ParserRuleContext {
		public TerminalNode KW_FONTCOLOR() { return getToken(gParamParser.KW_FONTCOLOR, 0); }
		public W_fontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_fontcolor; }
	}

	public final W_fontcolorContext w_fontcolor() throws RecognitionException {
		W_fontcolorContext _localctx = new W_fontcolorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_w_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(KW_FONTCOLOR);
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

	public static class W_fontnameContext extends ParserRuleContext {
		public TerminalNode KW_FONTNAME() { return getToken(gParamParser.KW_FONTNAME, 0); }
		public W_fontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_fontname; }
	}

	public final W_fontnameContext w_fontname() throws RecognitionException {
		W_fontnameContext _localctx = new W_fontnameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_w_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(KW_FONTNAME);
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

	public static class W_fontsizeContext extends ParserRuleContext {
		public TerminalNode KW_FONTSIZE() { return getToken(gParamParser.KW_FONTSIZE, 0); }
		public W_fontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_fontsize; }
	}

	public final W_fontsizeContext w_fontsize() throws RecognitionException {
		W_fontsizeContext _localctx = new W_fontsizeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_w_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(KW_FONTSIZE);
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

	public static class W_arrowsizeContext extends ParserRuleContext {
		public TerminalNode KW_ARROWSIZE() { return getToken(gParamParser.KW_ARROWSIZE, 0); }
		public W_arrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_arrowsize; }
	}

	public final W_arrowsizeContext w_arrowsize() throws RecognitionException {
		W_arrowsizeContext _localctx = new W_arrowsizeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_w_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(KW_ARROWSIZE);
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

	public static class W_arrowcolorContext extends ParserRuleContext {
		public TerminalNode KW_ARROWCOLOR() { return getToken(gParamParser.KW_ARROWCOLOR, 0); }
		public W_arrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_arrowcolor; }
	}

	public final W_arrowcolorContext w_arrowcolor() throws RecognitionException {
		W_arrowcolorContext _localctx = new W_arrowcolorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_w_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(KW_ARROWCOLOR);
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

	public static class W_penwidthContext extends ParserRuleContext {
		public TerminalNode KW_PENWIDTH() { return getToken(gParamParser.KW_PENWIDTH, 0); }
		public W_penwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_penwidth; }
	}

	public final W_penwidthContext w_penwidth() throws RecognitionException {
		W_penwidthContext _localctx = new W_penwidthContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_w_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(KW_PENWIDTH);
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

	public static class W_fillcolorContext extends ParserRuleContext {
		public TerminalNode KW_FILLCOLOR() { return getToken(gParamParser.KW_FILLCOLOR, 0); }
		public W_fillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_fillcolor; }
	}

	public final W_fillcolorContext w_fillcolor() throws RecognitionException {
		W_fillcolorContext _localctx = new W_fillcolorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_w_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(KW_FILLCOLOR);
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

	public static class W_styleContext extends ParserRuleContext {
		public TerminalNode KW_STYLE() { return getToken(gParamParser.KW_STYLE, 0); }
		public W_styleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_style; }
	}

	public final W_styleContext w_style() throws RecognitionException {
		W_styleContext _localctx = new W_styleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_w_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(KW_STYLE);
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

	public static class W_shapeContext extends ParserRuleContext {
		public TerminalNode KW_SHAPE() { return getToken(gParamParser.KW_SHAPE, 0); }
		public W_shapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_shape; }
	}

	public final W_shapeContext w_shape() throws RecognitionException {
		W_shapeContext _localctx = new W_shapeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_w_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(KW_SHAPE);
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

	public static class EdnoContext extends ParserRuleContext {
		public EdgeContext edge() {
			return getRuleContext(EdgeContext.class,0);
		}
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public EdnoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edno; }
	}

	public final EdnoContext edno() throws RecognitionException {
		EdnoContext _localctx = new EdnoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_edno);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_EDGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				edge();
				}
				break;
			case KW_NODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				node();
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

	public static class EdgeContext extends ParserRuleContext {
		public TerminalNode KW_EDGE() { return getToken(gParamParser.KW_EDGE, 0); }
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(KW_EDGE);
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

	public static class NodeContext extends ParserRuleContext {
		public TerminalNode KW_NODE() { return getToken(gParamParser.KW_NODE, 0); }
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(KW_NODE);
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

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode S_IGUAL() { return getToken(gParamParser.S_IGUAL, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(S_IGUAL);
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

	public static class GuionbContext extends ParserRuleContext {
		public TerminalNode S_GUIONB() { return getToken(gParamParser.S_GUIONB, 0); }
		public GuionbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guionb; }
	}

	public final GuionbContext guionb() throws RecognitionException {
		GuionbContext _localctx = new GuionbContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_guionb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(S_GUIONB);
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

	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode TEXTOSIN() { return getToken(gParamParser.TEXTOSIN, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(TEXTOSIN);
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(gParamParser.ENTERO, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ENTERO);
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

	public static class W_relaContext extends ParserRuleContext {
		public TerminalNode KW_RELA() { return getToken(gParamParser.KW_RELA, 0); }
		public W_relaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_rela; }
	}

	public final W_relaContext w_rela() throws RecognitionException {
		W_relaContext _localctx = new W_relaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_w_rela);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(KW_RELA);
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

	public static class W_classContext extends ParserRuleContext {
		public TerminalNode KW_CLASS() { return getToken(gParamParser.KW_CLASS, 0); }
		public W_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_class; }
	}

	public final W_classContext w_class() throws RecognitionException {
		W_classContext _localctx = new W_classContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_w_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(KW_CLASS);
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

	public static class W_propContext extends ParserRuleContext {
		public TerminalNode KW_PROP() { return getToken(gParamParser.KW_PROP, 0); }
		public W_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_prop; }
	}

	public final W_propContext w_prop() throws RecognitionException {
		W_propContext _localctx = new W_propContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_w_prop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(KW_PROP);
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

	public static class W_inheContext extends ParserRuleContext {
		public TerminalNode KW_INHE() { return getToken(gParamParser.KW_INHE, 0); }
		public W_inheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_inhe; }
	}

	public final W_inheContext w_inhe() throws RecognitionException {
		W_inheContext _localctx = new W_inheContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_w_inhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(KW_INHE);
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

	public static class W_indiContext extends ParserRuleContext {
		public TerminalNode KW_INDI() { return getToken(gParamParser.KW_INDI, 0); }
		public W_indiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_indi; }
	}

	public final W_indiContext w_indi() throws RecognitionException {
		W_indiContext _localctx = new W_indiContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_w_indi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(KW_INDI);
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

	public static class ElementoContext extends ParserRuleContext {
		public W_relaContext w_rela() {
			return getRuleContext(W_relaContext.class,0);
		}
		public W_classContext w_class() {
			return getRuleContext(W_classContext.class,0);
		}
		public W_propContext w_prop() {
			return getRuleContext(W_propContext.class,0);
		}
		public W_inheContext w_inhe() {
			return getRuleContext(W_inheContext.class,0);
		}
		public W_indiContext w_indi() {
			return getRuleContext(W_indiContext.class,0);
		}
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elemento);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_RELA:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				w_rela();
				}
				break;
			case KW_CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				w_class();
				}
				break;
			case KW_PROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				w_prop();
				}
				break;
			case KW_INHE:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				w_inhe();
				}
				break;
			case KW_INDI:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				w_indi();
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

	public static class RutaContext extends ParserRuleContext {
		public TerminalNode TEXTOCON() { return getToken(gParamParser.TEXTOCON, 0); }
		public TerminalNode TEXTOSIN() { return getToken(gParamParser.TEXTOSIN, 0); }
		public RutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruta; }
	}

	public final RutaContext ruta() throws RecognitionException {
		RutaContext _localctx = new RutaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ruta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==TEXTOCON || _la==TEXTOSIN) ) {
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

	public static class WsContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(gParamParser.WS, 0); }
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ws);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(WS);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0126\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3f\n\3\f\3\16\3i"+
		"\13\3\3\3\6\3l\n\3\r\3\16\3m\3\3\7\3q\n\3\f\3\16\3t\13\3\5\3v\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0082\n\4\f\4\16\4\u0085\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\5!\u0103"+
		"\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3-\3-\3-\5-\u0120\n-\3.\3.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\3\3\2"+
		"\36\37\2\u010d\2^\3\2\2\2\4u\3\2\2\2\6\u0083\3\2\2\2\b\u0086\3\2\2\2\n"+
		"\u008c\3\2\2\2\f\u0094\3\2\2\2\16\u009c\3\2\2\2\20\u00a4\3\2\2\2\22\u00ac"+
		"\3\2\2\2\24\u00b4\3\2\2\2\26\u00bc\3\2\2\2\30\u00c4\3\2\2\2\32\u00cc\3"+
		"\2\2\2\34\u00d4\3\2\2\2\36\u00d8\3\2\2\2 \u00dc\3\2\2\2\"\u00e0\3\2\2"+
		"\2$\u00e4\3\2\2\2&\u00e6\3\2\2\2(\u00e8\3\2\2\2*\u00ea\3\2\2\2,\u00ec"+
		"\3\2\2\2.\u00ee\3\2\2\2\60\u00f0\3\2\2\2\62\u00f2\3\2\2\2\64\u00f4\3\2"+
		"\2\2\66\u00f6\3\2\2\28\u00f8\3\2\2\2:\u00fa\3\2\2\2<\u00fc\3\2\2\2>\u00fe"+
		"\3\2\2\2@\u0102\3\2\2\2B\u0104\3\2\2\2D\u0106\3\2\2\2F\u0108\3\2\2\2H"+
		"\u010a\3\2\2\2J\u010c\3\2\2\2L\u010e\3\2\2\2N\u0110\3\2\2\2P\u0112\3\2"+
		"\2\2R\u0114\3\2\2\2T\u0116\3\2\2\2V\u0118\3\2\2\2X\u011f\3\2\2\2Z\u0121"+
		"\3\2\2\2\\\u0123\3\2\2\2^_\5\4\3\2_`\5\6\4\2`\3\3\2\2\2af\5\34\17\2bf"+
		"\5\36\20\2cf\5 \21\2df\5\\/\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hv\3\2\2\2ig\3\2\2\2jl\5\"\22\2kj\3\2\2"+
		"\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2nr\3\2\2\2oq\5\\/\2po\3\2\2\2qt\3\2\2"+
		"\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2ug\3\2\2\2uk\3\2\2\2v\5\3\2"+
		"\2\2w\u0082\5\b\5\2x\u0082\5\n\6\2y\u0082\5\f\7\2z\u0082\5\16\b\2{\u0082"+
		"\5\20\t\2|\u0082\5\22\n\2}\u0082\5\24\13\2~\u0082\5\26\f\2\177\u0082\5"+
		"\30\r\2\u0080\u0082\5\32\16\2\u0081w\3\2\2\2\u0081x\3\2\2\2\u0081y\3\2"+
		"\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081"+
		"~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\7\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0086\u0087\5,\27\2\u0087\u0088\5H%\2\u0088\u0089\5X-\2\u0089\u008a\5"+
		"F$\2\u008a\u008b\5L\'\2\u008b\t\3\2\2\2\u008c\u008d\5.\30\2\u008d\u008e"+
		"\5H%\2\u008e\u008f\5@!\2\u008f\u0090\5H%\2\u0090\u0091\5X-\2\u0091\u0092"+
		"\5F$\2\u0092\u0093\5J&\2\u0093\13\3\2\2\2\u0094\u0095\5\60\31\2\u0095"+
		"\u0096\5H%\2\u0096\u0097\5@!\2\u0097\u0098\5H%\2\u0098\u0099\5X-\2\u0099"+
		"\u009a\5F$\2\u009a\u009b\5J&\2\u009b\r\3\2\2\2\u009c\u009d\5\62\32\2\u009d"+
		"\u009e\5H%\2\u009e\u009f\5@!\2\u009f\u00a0\5H%\2\u00a0\u00a1\5X-\2\u00a1"+
		"\u00a2\5F$\2\u00a2\u00a3\5L\'\2\u00a3\17\3\2\2\2\u00a4\u00a5\5\64\33\2"+
		"\u00a5\u00a6\5H%\2\u00a6\u00a7\5@!\2\u00a7\u00a8\5H%\2\u00a8\u00a9\5X"+
		"-\2\u00a9\u00aa\5F$\2\u00aa\u00ab\5L\'\2\u00ab\21\3\2\2\2\u00ac\u00ad"+
		"\5\66\34\2\u00ad\u00ae\5H%\2\u00ae\u00af\5@!\2\u00af\u00b0\5H%\2\u00b0"+
		"\u00b1\5X-\2\u00b1\u00b2\5F$\2\u00b2\u00b3\5J&\2\u00b3\23\3\2\2\2\u00b4"+
		"\u00b5\58\35\2\u00b5\u00b6\5H%\2\u00b6\u00b7\5@!\2\u00b7\u00b8\5H%\2\u00b8"+
		"\u00b9\5X-\2\u00b9\u00ba\5F$\2\u00ba\u00bb\5L\'\2\u00bb\25\3\2\2\2\u00bc"+
		"\u00bd\5:\36\2\u00bd\u00be\5H%\2\u00be\u00bf\5@!\2\u00bf\u00c0\5H%\2\u00c0"+
		"\u00c1\5X-\2\u00c1\u00c2\5F$\2\u00c2\u00c3\5J&\2\u00c3\27\3\2\2\2\u00c4"+
		"\u00c5\5<\37\2\u00c5\u00c6\5H%\2\u00c6\u00c7\5@!\2\u00c7\u00c8\5H%\2\u00c8"+
		"\u00c9\5X-\2\u00c9\u00ca\5F$\2\u00ca\u00cb\5J&\2\u00cb\31\3\2\2\2\u00cc"+
		"\u00cd\5> \2\u00cd\u00ce\5H%\2\u00ce\u00cf\5@!\2\u00cf\u00d0\5H%\2\u00d0"+
		"\u00d1\5X-\2\u00d1\u00d2\5F$\2\u00d2\u00d3\5J&\2\u00d3\33\3\2\2\2\u00d4"+
		"\u00d5\5$\23\2\u00d5\u00d6\5F$\2\u00d6\u00d7\5Z.\2\u00d7\35\3\2\2\2\u00d8"+
		"\u00d9\5&\24\2\u00d9\u00da\5F$\2\u00da\u00db\5Z.\2\u00db\37\3\2\2\2\u00dc"+
		"\u00dd\5(\25\2\u00dd\u00de\5F$\2\u00de\u00df\5Z.\2\u00df!\3\2\2\2\u00e0"+
		"\u00e1\5*\26\2\u00e1\u00e2\5F$\2\u00e2\u00e3\5Z.\2\u00e3#\3\2\2\2\u00e4"+
		"\u00e5\7\3\2\2\u00e5%\3\2\2\2\u00e6\u00e7\7\4\2\2\u00e7\'\3\2\2\2\u00e8"+
		"\u00e9\7\5\2\2\u00e9)\3\2\2\2\u00ea\u00eb\7\6\2\2\u00eb+\3\2\2\2\u00ec"+
		"\u00ed\7\7\2\2\u00ed-\3\2\2\2\u00ee\u00ef\7\b\2\2\u00ef/\3\2\2\2\u00f0"+
		"\u00f1\7\t\2\2\u00f1\61\3\2\2\2\u00f2\u00f3\7\n\2\2\u00f3\63\3\2\2\2\u00f4"+
		"\u00f5\7\13\2\2\u00f5\65\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7\67\3\2\2\2"+
		"\u00f8\u00f9\7\r\2\2\u00f99\3\2\2\2\u00fa\u00fb\7\16\2\2\u00fb;\3\2\2"+
		"\2\u00fc\u00fd\7\17\2\2\u00fd=\3\2\2\2\u00fe\u00ff\7\20\2\2\u00ff?\3\2"+
		"\2\2\u0100\u0103\5B\"\2\u0101\u0103\5D#\2\u0102\u0100\3\2\2\2\u0102\u0101"+
		"\3\2\2\2\u0103A\3\2\2\2\u0104\u0105\7\21\2\2\u0105C\3\2\2\2\u0106\u0107"+
		"\7\22\2\2\u0107E\3\2\2\2\u0108\u0109\7\30\2\2\u0109G\3\2\2\2\u010a\u010b"+
		"\7\31\2\2\u010bI\3\2\2\2\u010c\u010d\7\37\2\2\u010dK\3\2\2\2\u010e\u010f"+
		"\7\33\2\2\u010fM\3\2\2\2\u0110\u0111\7\23\2\2\u0111O\3\2\2\2\u0112\u0113"+
		"\7\24\2\2\u0113Q\3\2\2\2\u0114\u0115\7\25\2\2\u0115S\3\2\2\2\u0116\u0117"+
		"\7\26\2\2\u0117U\3\2\2\2\u0118\u0119\7\27\2\2\u0119W\3\2\2\2\u011a\u0120"+
		"\5N(\2\u011b\u0120\5P)\2\u011c\u0120\5R*\2\u011d\u0120\5T+\2\u011e\u0120"+
		"\5V,\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2\2\2\u011f\u011c\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120Y\3\2\2\2\u0121\u0122\t\2\2\2"+
		"\u0122[\3\2\2\2\u0123\u0124\7\35\2\2\u0124]\3\2\2\2\13egmru\u0081\u0083"+
		"\u0102\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}