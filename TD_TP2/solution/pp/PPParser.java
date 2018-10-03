// Generated from PP.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PPParser extends Parser {
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
	public static final int
		RULE_programme = 0, RULE_declaration = 1, RULE_definition = 2, RULE_instruction = 3, 
		RULE_variable = 4, RULE_type = 5, RULE_fonction = 6, RULE_expression = 7, 
		RULE_cible = 8, RULE_constante = 9, RULE_bop = 10;
	public static final String[] ruleNames = {
		"programme", "declaration", "definition", "instruction", "variable", "type", 
		"fonction", "expression", "cible", "constante", "bop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "'integer'", 
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

	@Override
	public String getGrammarFileName() { return "PP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammeContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitProgramme(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(22);
				declaration();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(25);
					definition();
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(31);
			instruction(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PPParser.VAR, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(VAR);
			setState(38); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					variable();
					setState(35);
					match(T__0);
					setState(36);
					type();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DefinitionContext extends ParserRuleContext {
		public FonctionContext fonction() {
			return getRuleContext(FonctionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			fonction();
			setState(43);
			match(T__1);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(44);
				variable();
				setState(45);
				match(T__0);
				setState(46);
				type();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(T__2);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(54);
				match(T__0);
				setState(55);
				type();
				}
			}

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(58);
				declaration();
				}
			}

			setState(61);
			instruction(0);
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

	public static class InstructionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PPParser.ASSIGNMENT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PPParser.IF, 0); }
		public TerminalNode THEN() { return getToken(PPParser.THEN, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PPParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(PPParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(PPParser.DO, 0); }
		public CibleContext cible() {
			return getRuleContext(CibleContext.class,0);
		}
		public TerminalNode SK() { return getToken(PPParser.SK, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		return instruction(0);
	}

	private InstructionContext instruction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstructionContext _localctx = new InstructionContext(_ctx, _parentState);
		InstructionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_instruction, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(64);
				variable();
				setState(65);
				match(ASSIGNMENT);
				setState(66);
				expression(0);
				}
				break;
			case 2:
				{
				setState(68);
				expression(0);
				setState(69);
				match(T__3);
				setState(70);
				expression(0);
				setState(71);
				match(T__4);
				setState(72);
				match(ASSIGNMENT);
				setState(73);
				expression(0);
				}
				break;
			case 3:
				{
				setState(75);
				match(IF);
				setState(76);
				expression(0);
				setState(77);
				match(THEN);
				setState(78);
				instruction(0);
				setState(79);
				match(ELSE);
				setState(80);
				match(T__5);
				setState(81);
				instruction(0);
				setState(82);
				match(T__6);
				}
				break;
			case 4:
				{
				setState(84);
				match(WHILE);
				setState(85);
				expression(0);
				setState(86);
				match(DO);
				setState(87);
				match(T__5);
				setState(88);
				instruction(0);
				setState(89);
				match(T__6);
				}
				break;
			case 5:
				{
				setState(91);
				cible();
				setState(92);
				match(T__1);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << ARRAY_ALLOCATION) | (1L << LOGNOT) | (1L << SUB) | (1L << LITTRUE) | (1L << LITFALSE) | (1L << LITENT) | (1L << ID))) != 0)) {
					{
					{
					setState(93);
					expression(0);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(101);
				match(SK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstructionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instruction);
					setState(104);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(105);
					match(T__7);
					setState(106);
					instruction(2);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PPParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public Type T;
		public TypeContext t;
		public TerminalNode INT() { return getToken(PPParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(PPParser.BOOL, 0); }
		public TerminalNode ARRAY() { return getToken(PPParser.ARRAY, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(INT);
				((TypeContext)_localctx).T =  new Int();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(BOOL);
				((TypeContext)_localctx).T =  new Bool();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(ARRAY);
				setState(119);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).T =  new Array(((TypeContext)_localctx).t.T);
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

	public static class FonctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PPParser.ID, 0); }
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fonction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression value;
		public ExpressionContext e;
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGNOT() { return getToken(PPParser.LOGNOT, 0); }
		public CibleContext cible() {
			return getRuleContext(CibleContext.class,0);
		}
		public TerminalNode ARRAY_ALLOCATION() { return getToken(PPParser.ARRAY_ALLOCATION, 0); }
		public TerminalNode ARRAY() { return getToken(PPParser.ARRAY, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BopContext bop() {
			return getRuleContext(BopContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(127);
				constante();
				}
				break;
			case 2:
				{
				setState(128);
				variable();
				}
				break;
			case 3:
				{
				setState(129);
				match(SUB);
				setState(130);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).value =  new Inv(((ExpressionContext)_localctx).e.value);
				}
				break;
			case 4:
				{
				setState(133);
				match(LOGNOT);
				setState(134);
				((ExpressionContext)_localctx).e = expression(5);
				((ExpressionContext)_localctx).value =  new Not(((ExpressionContext)_localctx).e.value);
				}
				break;
			case 5:
				{
				setState(137);
				cible();
				setState(138);
				match(T__1);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << ARRAY_ALLOCATION) | (1L << LOGNOT) | (1L << SUB) | (1L << LITTRUE) | (1L << LITFALSE) | (1L << LITENT) | (1L << ID))) != 0)) {
					{
					{
					setState(139);
					expression(0);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(147);
				match(ARRAY_ALLOCATION);
				setState(148);
				match(ARRAY);
				setState(149);
				type();
				setState(150);
				match(T__3);
				setState(151);
				expression(0);
				setState(152);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(157);
						bop();
						setState(158);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(161);
						match(T__3);
						setState(162);
						expression(0);
						setState(163);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CibleContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(PPParser.IN, 0); }
		public TerminalNode OUT() { return getToken(PPParser.OUT, 0); }
		public FonctionContext fonction() {
			return getRuleContext(FonctionContext.class,0);
		}
		public CibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterCible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitCible(this);
		}
	}

	public final CibleContext cible() throws RecognitionException {
		CibleContext _localctx = new CibleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cible);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(IN);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(OUT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				fonction();
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

	public static class ConstanteContext extends ParserRuleContext {
		public Expression E;
		public TerminalNode LITENT() { return getToken(PPParser.LITENT, 0); }
		public TerminalNode LITTRUE() { return getToken(PPParser.LITTRUE, 0); }
		public TerminalNode LITFALSE() { return getToken(PPParser.LITFALSE, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitConstante(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constante);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(LITENT);
				((ConstanteContext)_localctx).E =  new Constante(LITENT);
				}
				break;
			case LITTRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(LITTRUE);
				((ConstanteContext)_localctx).E =  new ConstanteTrue();
				}
				break;
			case LITFALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(LITFALSE);
				((ConstanteContext)_localctx).E =  new ConstanteFalse();
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

	public static class BopContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PPParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PPParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(PPParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PPParser.DIV, 0); }
		public TerminalNode LOGAND() { return getToken(PPParser.LOGAND, 0); }
		public TerminalNode LOGOR() { return getToken(PPParser.LOGOR, 0); }
		public TerminalNode LTH() { return getToken(PPParser.LTH, 0); }
		public TerminalNode LTEQ() { return getToken(PPParser.LTEQ, 0); }
		public TerminalNode EQU() { return getToken(PPParser.EQU, 0); }
		public TerminalNode DIFF() { return getToken(PPParser.DIFF, 0); }
		public TerminalNode GTH() { return getToken(PPParser.GTH, 0); }
		public TerminalNode GTEQ() { return getToken(PPParser.GTEQ, 0); }
		public BopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterBop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitBop(this);
		}
	}

	public final BopContext bop() throws RecognitionException {
		BopContext _localctx = new BopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << LOGAND) | (1L << LOGOR) | (1L << LTH) | (1L << LTEQ) | (1L << EQU) | (1L << DIFF) | (1L << GTH) | (1L << GTEQ))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return instruction_sempred((InstructionContext)_localctx, predIndex);
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean instruction_sempred(InstructionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\5\2\32\n\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\6\3)\n\3\r\3\16\3*\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f"+
		"\4\16\4\66\13\4\3\4\3\4\3\4\5\4;\n\4\3\4\5\4>\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\5"+
		"\3\5\3\5\5\5i\n\5\3\5\3\5\3\5\7\5n\n\5\f\5\16\5q\13\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16\t\u0092\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u00a8\n\t\f\t\16\t\u00ab\13\t\3\n\3\n\3\n\5\n\u00b0\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b8\n\13\3\f\3\f\3\f\2\4\b\20\r\2"+
		"\4\6\b\n\f\16\20\22\24\26\2\3\3\2\32%\2\u00cb\2\31\3\2\2\2\4#\3\2\2\2"+
		"\6,\3\2\2\2\bh\3\2\2\2\nr\3\2\2\2\f|\3\2\2\2\16~\3\2\2\2\20\u009c\3\2"+
		"\2\2\22\u00af\3\2\2\2\24\u00b7\3\2\2\2\26\u00b9\3\2\2\2\30\32\5\4\3\2"+
		"\31\30\3\2\2\2\31\32\3\2\2\2\32\36\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2"+
		"\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\5"+
		"\b\5\2\"\3\3\2\2\2#(\7\20\2\2$%\5\n\6\2%&\7\3\2\2&\'\5\f\7\2\')\3\2\2"+
		"\2($\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,-\5\16\b\2-\64\7"+
		"\4\2\2./\5\n\6\2/\60\7\3\2\2\60\61\5\f\7\2\61\63\3\2\2\2\62.\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67"+
		":\7\5\2\289\7\3\2\29;\5\f\7\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<>\5\4\3\2"+
		"=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\b\5\2@\7\3\2\2\2AB\b\5\1\2BC\5\n\6"+
		"\2CD\7\27\2\2DE\5\20\t\2Ei\3\2\2\2FG\5\20\t\2GH\7\6\2\2HI\5\20\t\2IJ\7"+
		"\7\2\2JK\7\27\2\2KL\5\20\t\2Li\3\2\2\2MN\7\21\2\2NO\5\20\t\2OP\7\22\2"+
		"\2PQ\5\b\5\2QR\7\23\2\2RS\7\b\2\2ST\5\b\5\2TU\7\t\2\2Ui\3\2\2\2VW\7\24"+
		"\2\2WX\5\20\t\2XY\7\25\2\2YZ\7\b\2\2Z[\5\b\5\2[\\\7\t\2\2\\i\3\2\2\2]"+
		"^\5\22\n\2^b\7\4\2\2_a\5\20\t\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2ce\3\2\2\2db\3\2\2\2ef\7\5\2\2fi\3\2\2\2gi\7\26\2\2hA\3\2\2\2hF\3\2"+
		"\2\2hM\3\2\2\2hV\3\2\2\2h]\3\2\2\2hg\3\2\2\2io\3\2\2\2jk\f\3\2\2kl\7\n"+
		"\2\2ln\5\b\5\4mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\t\3\2\2\2qo\3"+
		"\2\2\2rs\7)\2\2s\13\3\2\2\2tu\7\13\2\2u}\b\7\1\2vw\7\f\2\2w}\b\7\1\2x"+
		"y\7\r\2\2yz\5\f\7\2z{\b\7\1\2{}\3\2\2\2|t\3\2\2\2|v\3\2\2\2|x\3\2\2\2"+
		"}\r\3\2\2\2~\177\7)\2\2\177\17\3\2\2\2\u0080\u0081\b\t\1\2\u0081\u009d"+
		"\5\24\13\2\u0082\u009d\5\n\6\2\u0083\u0084\7\35\2\2\u0084\u0085\5\20\t"+
		"\b\u0085\u0086\b\t\1\2\u0086\u009d\3\2\2\2\u0087\u0088\7\31\2\2\u0088"+
		"\u0089\5\20\t\7\u0089\u008a\b\t\1\2\u008a\u009d\3\2\2\2\u008b\u008c\5"+
		"\22\n\2\u008c\u0090\7\4\2\2\u008d\u008f\5\20\t\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\5\2\2\u0094\u009d\3\2\2\2\u0095"+
		"\u0096\7\30\2\2\u0096\u0097\7\r\2\2\u0097\u0098\5\f\7\2\u0098\u0099\7"+
		"\6\2\2\u0099\u009a\5\20\t\2\u009a\u009b\7\7\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0080\3\2\2\2\u009c\u0082\3\2\2\2\u009c\u0083\3\2\2\2\u009c\u0087\3\2"+
		"\2\2\u009c\u008b\3\2\2\2\u009c\u0095\3\2\2\2\u009d\u00a9\3\2\2\2\u009e"+
		"\u009f\f\6\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\5\20\t\7\u00a1\u00a8\3"+
		"\2\2\2\u00a2\u00a3\f\4\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5\20\t\2\u00a5"+
		"\u00a6\7\7\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a2\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\21\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b0\7\16\2\2\u00ad\u00b0\7\17"+
		"\2\2\u00ae\u00b0\5\16\b\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\23\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2\u00b8\b\13\1"+
		"\2\u00b3\u00b4\7&\2\2\u00b4\u00b8\b\13\1\2\u00b5\u00b6\7\'\2\2\u00b6\u00b8"+
		"\b\13\1\2\u00b7\u00b1\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b8\25\3\2\2\2\u00b9\u00ba\t\2\2\2\u00ba\27\3\2\2\2\22\31\36*\64:="+
		"bho|\u0090\u009c\u00a7\u00a9\u00af\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}