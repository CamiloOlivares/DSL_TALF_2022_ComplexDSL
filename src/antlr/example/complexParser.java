// Generated from C:\Users\cml_9\Documents\NetBeansProjects\complexGrammar\src\antlr\example\complex.g4 by ANTLR 4.8
package antlr.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class complexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PR=1, GR=2, BI=3, PC=4, POL=5, TR=6, VAR=7, OPER=8, COMA=9, PLUS=10, LESS=11, 
		MUL=12, DIV=13, LPAR=14, RPAR=15, EQ=16, INT=17, IMAGI=18, E=19, STRING=20, 
		WS=21;
	public static final int
		RULE_start = 0, RULE_define = 1, RULE_printvar = 2, RULE_grafvar = 3, 
		RULE_numdef = 4, RULE_number = 5, RULE_operdef = 6, RULE_oper = 7, RULE_suma = 8, 
		RULE_resta = 9, RULE_mul = 10, RULE_div = 11, RULE_binomica = 12, RULE_polar = 13, 
		RULE_real = 14, RULE_imaginaria = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "define", "printvar", "grafvar", "numdef", "number", "operdef", 
			"oper", "suma", "resta", "mul", "div", "binomica", "polar", "real", "imaginaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'show'", "'plot'", "'binom'", "';'", "'polar'", "'trig'", "'var'", 
			"'operation'", "','", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'='", 
			null, "'i'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PR", "GR", "BI", "PC", "POL", "TR", "VAR", "OPER", "COMA", "PLUS", 
			"LESS", "MUL", "DIV", "LPAR", "RPAR", "EQ", "INT", "IMAGI", "E", "STRING", 
			"WS"
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

	@Override
	public String getGrammarFileName() { return "complex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public complexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			define();
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

	public static class DefineContext extends ParserRuleContext {
		public List<NumdefContext> numdef() {
			return getRuleContexts(NumdefContext.class);
		}
		public NumdefContext numdef(int i) {
			return getRuleContext(NumdefContext.class,i);
		}
		public List<OperdefContext> operdef() {
			return getRuleContexts(OperdefContext.class);
		}
		public OperdefContext operdef(int i) {
			return getRuleContext(OperdefContext.class,i);
		}
		public List<PrintvarContext> printvar() {
			return getRuleContexts(PrintvarContext.class);
		}
		public PrintvarContext printvar(int i) {
			return getRuleContext(PrintvarContext.class,i);
		}
		public List<GrafvarContext> grafvar() {
			return getRuleContexts(GrafvarContext.class);
		}
		public GrafvarContext grafvar(int i) {
			return getRuleContext(GrafvarContext.class,i);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitDefine(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(34);
					numdef();
					}
					break;
				case 2:
					{
					setState(35);
					operdef();
					}
					break;
				case 3:
					{
					setState(36);
					printvar();
					}
					break;
				case 4:
					{
					setState(37);
					grafvar();
					}
					break;
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PR) | (1L << GR) | (1L << VAR))) != 0) );
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

	public static class PrintvarContext extends ParserRuleContext {
		public TerminalNode PR() { return getToken(complexParser.PR, 0); }
		public TerminalNode STRING() { return getToken(complexParser.STRING, 0); }
		public TerminalNode PC() { return getToken(complexParser.PC, 0); }
		public PrintvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterPrintvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitPrintvar(this);
		}
	}

	public final PrintvarContext printvar() throws RecognitionException {
		PrintvarContext _localctx = new PrintvarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PR);
			setState(43);
			match(STRING);
			setState(44);
			match(PC);
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

	public static class GrafvarContext extends ParserRuleContext {
		public TerminalNode GR() { return getToken(complexParser.GR, 0); }
		public TerminalNode STRING() { return getToken(complexParser.STRING, 0); }
		public TerminalNode PC() { return getToken(complexParser.PC, 0); }
		public GrafvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grafvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterGrafvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitGrafvar(this);
		}
	}

	public final GrafvarContext grafvar() throws RecognitionException {
		GrafvarContext _localctx = new GrafvarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_grafvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(GR);
			setState(47);
			match(STRING);
			setState(48);
			match(PC);
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

	public static class NumdefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(complexParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(complexParser.STRING, 0); }
		public TerminalNode EQ() { return getToken(complexParser.EQ, 0); }
		public TerminalNode PC() { return getToken(complexParser.PC, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterNumdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitNumdef(this);
		}
	}

	public final NumdefContext numdef() throws RecognitionException {
		NumdefContext _localctx = new NumdefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(VAR);
			setState(51);
			match(STRING);
			setState(52);
			match(EQ);
			{
			setState(53);
			number();
			}
			setState(54);
			match(PC);
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

	public static class NumberContext extends ParserRuleContext {
		public BinomicaContext binomica() {
			return getRuleContext(BinomicaContext.class,0);
		}
		public PolarContext polar() {
			return getRuleContext(PolarContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(56);
				binomica();
				}
				break;
			case 2:
				{
				setState(57);
				polar();
				}
				break;
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

	public static class OperdefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(complexParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(complexParser.STRING, 0); }
		public TerminalNode EQ() { return getToken(complexParser.EQ, 0); }
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public OperdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterOperdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitOperdef(this);
		}
	}

	public final OperdefContext operdef() throws RecognitionException {
		OperdefContext _localctx = new OperdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(VAR);
			setState(61);
			match(STRING);
			setState(62);
			match(EQ);
			setState(63);
			oper();
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

	public static class OperContext extends ParserRuleContext {
		public TerminalNode PC() { return getToken(complexParser.PC, 0); }
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitOper(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_oper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(65);
				suma();
				}
				break;
			case 2:
				{
				setState(66);
				resta();
				}
				break;
			case 3:
				{
				setState(67);
				mul();
				}
				break;
			case 4:
				{
				setState(68);
				div();
				}
				break;
			}
			setState(71);
			match(PC);
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

	public static class SumaContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(complexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(complexParser.STRING, i);
		}
		public TerminalNode PLUS() { return getToken(complexParser.PLUS, 0); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(STRING);
			setState(74);
			match(PLUS);
			setState(75);
			match(STRING);
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

	public static class RestaContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(complexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(complexParser.STRING, i);
		}
		public TerminalNode LESS() { return getToken(complexParser.LESS, 0); }
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitResta(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(STRING);
			setState(78);
			match(LESS);
			setState(79);
			match(STRING);
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

	public static class MulContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(complexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(complexParser.STRING, i);
		}
		public TerminalNode MUL() { return getToken(complexParser.MUL, 0); }
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitMul(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(STRING);
			setState(82);
			match(MUL);
			setState(83);
			match(STRING);
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

	public static class DivContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(complexParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(complexParser.STRING, i);
		}
		public TerminalNode DIV() { return getToken(complexParser.DIV, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(STRING);
			setState(86);
			match(DIV);
			setState(87);
			match(STRING);
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

	public static class BinomicaContext extends ParserRuleContext {
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(complexParser.PLUS, 0); }
		public ImaginariaContext imaginaria() {
			return getRuleContext(ImaginariaContext.class,0);
		}
		public BinomicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binomica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterBinomica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitBinomica(this);
		}
	}

	public final BinomicaContext binomica() throws RecognitionException {
		BinomicaContext _localctx = new BinomicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binomica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			real();
			setState(90);
			match(PLUS);
			setState(91);
			imaginaria();
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

	public static class PolarContext extends ParserRuleContext {
		public List<RealContext> real() {
			return getRuleContexts(RealContext.class);
		}
		public RealContext real(int i) {
			return getRuleContext(RealContext.class,i);
		}
		public TerminalNode E() { return getToken(complexParser.E, 0); }
		public TerminalNode LPAR() { return getToken(complexParser.LPAR, 0); }
		public TerminalNode IMAGI() { return getToken(complexParser.IMAGI, 0); }
		public TerminalNode RPAR() { return getToken(complexParser.RPAR, 0); }
		public PolarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterPolar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitPolar(this);
		}
	}

	public final PolarContext polar() throws RecognitionException {
		PolarContext _localctx = new PolarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_polar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			real();
			setState(94);
			match(E);
			setState(95);
			match(LPAR);
			setState(96);
			match(IMAGI);
			setState(97);
			real();
			setState(98);
			match(RPAR);
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

	public static class RealContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(complexParser.INT, 0); }
		public TerminalNode LESS() { return getToken(complexParser.LESS, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS) {
				{
				setState(100);
				match(LESS);
				}
			}

			setState(103);
			match(INT);
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

	public static class ImaginariaContext extends ParserRuleContext {
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public TerminalNode IMAGI() { return getToken(complexParser.IMAGI, 0); }
		public ImaginariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imaginaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).enterImaginaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof complexListener ) ((complexListener)listener).exitImaginaria(this);
		}
	}

	public final ImaginariaContext imaginaria() throws RecognitionException {
		ImaginariaContext _localctx = new ImaginariaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imaginaria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			real();
			setState(106);
			match(IMAGI);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27o\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\6\3)\n\3\r\3\16\3*\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5"+
		"\tH\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\5\20h\n\20\3\20\3\20\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\2\2g\2\"\3\2\2\2\4(\3\2\2\2\6,\3\2\2\2\b\60\3"+
		"\2\2\2\n\64\3\2\2\2\f<\3\2\2\2\16>\3\2\2\2\20G\3\2\2\2\22K\3\2\2\2\24"+
		"O\3\2\2\2\26S\3\2\2\2\30W\3\2\2\2\32[\3\2\2\2\34_\3\2\2\2\36g\3\2\2\2"+
		" k\3\2\2\2\"#\5\4\3\2#\3\3\2\2\2$)\5\n\6\2%)\5\16\b\2&)\5\6\4\2\')\5\b"+
		"\5\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3"+
		"\2\2\2+\5\3\2\2\2,-\7\3\2\2-.\7\26\2\2./\7\6\2\2/\7\3\2\2\2\60\61\7\4"+
		"\2\2\61\62\7\26\2\2\62\63\7\6\2\2\63\t\3\2\2\2\64\65\7\t\2\2\65\66\7\26"+
		"\2\2\66\67\7\22\2\2\678\5\f\7\289\7\6\2\29\13\3\2\2\2:=\5\32\16\2;=\5"+
		"\34\17\2<:\3\2\2\2<;\3\2\2\2=\r\3\2\2\2>?\7\t\2\2?@\7\26\2\2@A\7\22\2"+
		"\2AB\5\20\t\2B\17\3\2\2\2CH\5\22\n\2DH\5\24\13\2EH\5\26\f\2FH\5\30\r\2"+
		"GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2IJ\7\6\2\2J\21\3\2\2"+
		"\2KL\7\26\2\2LM\7\f\2\2MN\7\26\2\2N\23\3\2\2\2OP\7\26\2\2PQ\7\r\2\2QR"+
		"\7\26\2\2R\25\3\2\2\2ST\7\26\2\2TU\7\16\2\2UV\7\26\2\2V\27\3\2\2\2WX\7"+
		"\26\2\2XY\7\17\2\2YZ\7\26\2\2Z\31\3\2\2\2[\\\5\36\20\2\\]\7\f\2\2]^\5"+
		" \21\2^\33\3\2\2\2_`\5\36\20\2`a\7\25\2\2ab\7\20\2\2bc\7\24\2\2cd\5\36"+
		"\20\2de\7\21\2\2e\35\3\2\2\2fh\7\r\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2i"+
		"j\7\23\2\2j\37\3\2\2\2kl\5\36\20\2lm\7\24\2\2m!\3\2\2\2\7(*<Gg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}