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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, BOOL=8, ARRAY=9, 
		IN=10, OUT=11, VAR=12, IF=13, THEN=14, ELSE=15, WHILE=16, DO=17, SK=18, 
		ASSIGNMENT=19, ARRAY_ALLOCATION=20, LOGNOT=21, MUL=22, DIV=23, ADD=24, 
		SUB=25, LOGAND=26, LOGOR=27, LTH=28, LTEQ=29, EQU=30, DIFF=31, GTH=32, 
		GTEQ=33, LITTRUE=34, LITFALSE=35, LITENT=36, ID=37, WS=38;
	public static final int
		RULE_programme = 0, RULE_declaration = 1, RULE_definition = 2, RULE_instruction = 3, 
		RULE_variable = 4, RULE_type = 5, RULE_fonction = 6, RULE_expression = 7, 
		RULE_cible = 8, RULE_constante = 9, RULE_bop = 10;
	public static final String[] ruleNames = {
		"programme", "declaration", "definition", "instruction", "variable", "type", 
		"fonction", "expression", "cible", "constante", "bop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'('", "')'", "'['", "']'", "';'", "'integer'", "'boolean'", 
		"'array of'", "'read'", "'write'", "'var'", "'if'", "'then'", "'else'", 
		"'while'", "'do'", "'skip'", "':='", "'new'", "'not'", "'*'", "'/'", "'+'", 
		"'-'", "'and'", "'or'", "'<'", "'<='", "'='", "'!='", "'>'", "'>='", "'true'", 
		"'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "INT", "BOOL", "ARRAY", "IN", 
		"OUT", "VAR", "IF", "THEN", "ELSE", "WHILE", "DO", "SK", "ASSIGNMENT", 
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
			setState(98);
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
				instruction(5);
				}
				break;
			case 4:
				{
				setState(82);
				match(WHILE);
				setState(83);
				expression(0);
				setState(84);
				match(DO);
				setState(85);
				instruction(4);
				}
				break;
			case 5:
				{
				setState(87);
				cible();
				setState(88);
				match(T__1);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << ARRAY_ALLOCATION) | (1L << LOGNOT) | (1L << SUB) | (1L << LITTRUE) | (1L << LITFALSE) | (1L << LITENT) | (1L << ID))) != 0)) {
					{
					{
					setState(89);
					expression(0);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(97);
				match(SK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
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
					setState(100);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(101);
					match(T__5);
					setState(102);
					instruction(2);
					}
					} 
				}
				setState(107);
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
			setState(108);
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(INT);
				((TypeContext)_localctx).T =  new Int();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(BOOL);
				((TypeContext)_localctx).T =  new Bool();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(ARRAY);
				setState(115);
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
			setState(120);
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
		public ConstanteContext c;
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LOGNOT() { return getToken(PPParser.LOGNOT, 0); }
		public CibleContext cible() {
			return getRuleContext(CibleContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(123);
				constante();
				}
				break;
			case 2:
				{
				setState(124);
				variable();
				}
				break;
			case 3:
				{
				setState(125);
				match(SUB);
				setState(126);
				((ExpressionContext)_localctx).c = constante();
				((ExpressionContext)_localctx).value =  new Inv(((ExpressionContext)_localctx).c.E);
				}
				break;
			case 4:
				{
				setState(129);
				match(LOGNOT);
				setState(130);
				((ExpressionContext)_localctx).c = constante();
				((ExpressionContext)_localctx).value =  new Not(((ExpressionContext)_localctx).c.E);
				}
				break;
			case 5:
				{
				setState(133);
				cible();
				setState(134);
				match(T__1);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << ARRAY_ALLOCATION) | (1L << LOGNOT) | (1L << SUB) | (1L << LITTRUE) | (1L << LITFALSE) | (1L << LITENT) | (1L << ID))) != 0)) {
					{
					{
					setState(135);
					expression(0);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(143);
				match(ARRAY_ALLOCATION);
				setState(144);
				match(ARRAY);
				setState(145);
				type();
				setState(146);
				match(T__3);
				setState(147);
				expression(0);
				setState(148);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(153);
						bop();
						setState(154);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(157);
						match(T__3);
						setState(158);
						expression(0);
						setState(159);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(165);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(IN);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(OUT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
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
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(LITENT);
				((ConstanteContext)_localctx).E =  new Constante(LITENT);
				}
				break;
			case LITTRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(LITTRUE);
				((ConstanteContext)_localctx).E =  new ConstanteTrue();
				}
				break;
			case LITFALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
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
			setState(179);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\5\2\32\n\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\6\3)\n\3\r\3\16\3*\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f"+
		"\4\16\4\66\13\4\3\4\3\4\3\4\5\4;\n\4\3\4\5\4>\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\5\3\5\3\5\5\5e\n"+
		"\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7y\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0099\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a4"+
		"\n\t\f\t\16\t\u00a7\13\t\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00b4\n\13\3\f\3\f\3\f\2\4\b\20\r\2\4\6\b\n\f\16\20\22"+
		"\24\26\2\3\3\2\30#\2\u00c7\2\31\3\2\2\2\4#\3\2\2\2\6,\3\2\2\2\bd\3\2\2"+
		"\2\nn\3\2\2\2\fx\3\2\2\2\16z\3\2\2\2\20\u0098\3\2\2\2\22\u00ab\3\2\2\2"+
		"\24\u00b3\3\2\2\2\26\u00b5\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\31\32\3"+
		"\2\2\2\32\36\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2"+
		"\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\5\b\5\2\"\3\3\2\2\2#(\7"+
		"\16\2\2$%\5\n\6\2%&\7\3\2\2&\'\5\f\7\2\')\3\2\2\2($\3\2\2\2)*\3\2\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,-\5\16\b\2-\64\7\4\2\2./\5\n\6\2/\60\7"+
		"\3\2\2\60\61\5\f\7\2\61\63\3\2\2\2\62.\3\2\2\2\63\66\3\2\2\2\64\62\3\2"+
		"\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67:\7\5\2\289\7\3\2\29"+
		";\5\f\7\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<>\5\4\3\2=<\3\2\2\2=>\3\2\2\2"+
		">?\3\2\2\2?@\5\b\5\2@\7\3\2\2\2AB\b\5\1\2BC\5\n\6\2CD\7\25\2\2DE\5\20"+
		"\t\2Ee\3\2\2\2FG\5\20\t\2GH\7\6\2\2HI\5\20\t\2IJ\7\7\2\2JK\7\25\2\2KL"+
		"\5\20\t\2Le\3\2\2\2MN\7\17\2\2NO\5\20\t\2OP\7\20\2\2PQ\5\b\5\2QR\7\21"+
		"\2\2RS\5\b\5\7Se\3\2\2\2TU\7\22\2\2UV\5\20\t\2VW\7\23\2\2WX\5\b\5\6Xe"+
		"\3\2\2\2YZ\5\22\n\2Z^\7\4\2\2[]\5\20\t\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\5\2\2be\3\2\2\2ce\7\24\2\2dA\3\2"+
		"\2\2dF\3\2\2\2dM\3\2\2\2dT\3\2\2\2dY\3\2\2\2dc\3\2\2\2ek\3\2\2\2fg\f\3"+
		"\2\2gh\7\b\2\2hj\5\b\5\4if\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\t\3"+
		"\2\2\2mk\3\2\2\2no\7\'\2\2o\13\3\2\2\2pq\7\t\2\2qy\b\7\1\2rs\7\n\2\2s"+
		"y\b\7\1\2tu\7\13\2\2uv\5\f\7\2vw\b\7\1\2wy\3\2\2\2xp\3\2\2\2xr\3\2\2\2"+
		"xt\3\2\2\2y\r\3\2\2\2z{\7\'\2\2{\17\3\2\2\2|}\b\t\1\2}\u0099\5\24\13\2"+
		"~\u0099\5\n\6\2\177\u0080\7\33\2\2\u0080\u0081\5\24\13\2\u0081\u0082\b"+
		"\t\1\2\u0082\u0099\3\2\2\2\u0083\u0084\7\27\2\2\u0084\u0085\5\24\13\2"+
		"\u0085\u0086\b\t\1\2\u0086\u0099\3\2\2\2\u0087\u0088\5\22\n\2\u0088\u008c"+
		"\7\4\2\2\u0089\u008b\5\20\t\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0090\7\5\2\2\u0090\u0099\3\2\2\2\u0091\u0092\7\26\2\2"+
		"\u0092\u0093\7\13\2\2\u0093\u0094\5\f\7\2\u0094\u0095\7\6\2\2\u0095\u0096"+
		"\5\20\t\2\u0096\u0097\7\7\2\2\u0097\u0099\3\2\2\2\u0098|\3\2\2\2\u0098"+
		"~\3\2\2\2\u0098\177\3\2\2\2\u0098\u0083\3\2\2\2\u0098\u0087\3\2\2\2\u0098"+
		"\u0091\3\2\2\2\u0099\u00a5\3\2\2\2\u009a\u009b\f\6\2\2\u009b\u009c\5\26"+
		"\f\2\u009c\u009d\5\20\t\7\u009d\u00a4\3\2\2\2\u009e\u009f\f\4\2\2\u009f"+
		"\u00a0\7\6\2\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\7\7\2\2\u00a2\u00a4\3"+
		"\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009e\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\21\3\2\2\2\u00a7\u00a5\3\2\2"+
		"\2\u00a8\u00ac\7\f\2\2\u00a9\u00ac\7\r\2\2\u00aa\u00ac\5\16\b\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\23\3\2\2"+
		"\2\u00ad\u00ae\7&\2\2\u00ae\u00b4\b\13\1\2\u00af\u00b0\7$\2\2\u00b0\u00b4"+
		"\b\13\1\2\u00b1\u00b2\7%\2\2\u00b2\u00b4\b\13\1\2\u00b3\u00ad\3\2\2\2"+
		"\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\25\3\2\2\2\u00b5\u00b6"+
		"\t\2\2\2\u00b6\27\3\2\2\2\22\31\36*\64:=^dkx\u008c\u0098\u00a3\u00a5\u00ab"+
		"\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}