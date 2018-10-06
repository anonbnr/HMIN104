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
		RULE_programme = 0, RULE_declaration = 1, RULE_pairvar = 2, RULE_definition = 3, 
		RULE_instruction = 4, RULE_affectation = 5, RULE_condition = 6, RULE_variable = 7, 
		RULE_type = 8, RULE_expression = 9, RULE_cible = 10, RULE_constante = 11, 
		RULE_bop = 12;
	public static final String[] ruleNames = {
		"programme", "declaration", "pairvar", "definition", "instruction", "affectation", 
		"condition", "variable", "type", "expression", "cible", "constante", "bop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'integer'", 
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
		public Programme p;
		public DeclarationContext g;
		public DefinitionContext def;
		public InstructionContext inst;
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
		((ProgrammeContext)_localctx).p =  new Programme();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(26);
				((ProgrammeContext)_localctx).g = declaration();
				_localctx.p.globals = ((ProgrammeContext)_localctx).g.variables;
				}
			}

			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(31);
					((ProgrammeContext)_localctx).def = definition();
					_localctx.p.defs.add(((ProgrammeContext)_localctx).def.d);
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(39);
			((ProgrammeContext)_localctx).inst = instruction(0);
			_localctx.p.code = ((ProgrammeContext)_localctx).inst.i;
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
		public ArrayList<Pair<String,Type>> variables;
		public PairvarContext v;
		public TerminalNode VAR() { return getToken(PPParser.VAR, 0); }
		public List<PairvarContext> pairvar() {
			return getRuleContexts(PairvarContext.class);
		}
		public PairvarContext pairvar(int i) {
			return getRuleContext(PairvarContext.class,i);
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
		((DeclarationContext)_localctx).variables =  new ArrayList<Pair<String,Type>>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(VAR);
			setState(46); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(43);
					((DeclarationContext)_localctx).v = pairvar();
					_localctx.variables.add(((DeclarationContext)_localctx).v.pair);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48); 
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

	public static class PairvarContext extends ParserRuleContext {
		public Pair<String,Type> pair;
		public VariableContext s;
		public TypeContext t;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PairvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterPairvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitPairvar(this);
		}
	}

	public final PairvarContext pairvar() throws RecognitionException {
		PairvarContext _localctx = new PairvarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pairvar);
		((PairvarContext)_localctx).pair =  new Pair<String,Type>();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((PairvarContext)_localctx).s = variable();
			_localctx.pair.left = ((PairvarContext)_localctx).s.v.name;
			setState(52);
			match(T__0);
			setState(53);
			((PairvarContext)_localctx).t = type();
			_localctx.pair.right = ((PairvarContext)_localctx).t.T;
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
		public Definition d;
		public Token name;
		public PairvarContext arg;
		public TypeContext t;
		public DeclarationContext loc;
		public InstructionContext inst;
		public TerminalNode ID() { return getToken(PPParser.ID, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<PairvarContext> pairvar() {
			return getRuleContexts(PairvarContext.class);
		}
		public PairvarContext pairvar(int i) {
			return getRuleContext(PairvarContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 6, RULE_definition);
		((DefinitionContext)_localctx).d =  new Procedure();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((DefinitionContext)_localctx).name = match(ID);
			_localctx.d.name = (((DefinitionContext)_localctx).name!=null?((DefinitionContext)_localctx).name.getText():null);
			setState(58);
			match(T__1);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(59);
				((DefinitionContext)_localctx).arg = pairvar();
				_localctx.d.args.add(((DefinitionContext)_localctx).arg.pair);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__2);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(68);
				match(T__0);
				setState(69);
				((DefinitionContext)_localctx).t = type();
				((DefinitionContext)_localctx).d =  new Fonction(_localctx.d.name, _localctx.d.args, ((DefinitionContext)_localctx).t.T);
				}
			}

			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(74);
				((DefinitionContext)_localctx).loc = declaration();
				_localctx.d.locals = ((DefinitionContext)_localctx).loc.variables;
				}
			}

			setState(79);
			((DefinitionContext)_localctx).inst = instruction(0);
			_localctx.d.code = ((DefinitionContext)_localctx).inst.i;
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
		public Instruction i;
		public AffectationContext a;
		public ConditionContext cond;
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PPParser.WHILE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DO() { return getToken(PPParser.DO, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PPParser.ASSIGNMENT, 0); }
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_instruction, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(83);
				((InstructionContext)_localctx).a = affectation();
				((InstructionContext)_localctx).i =  ((InstructionContext)_localctx).a.a;
				}
				break;
			case 2:
				{
				setState(86);
				((InstructionContext)_localctx).cond = condition();
				((InstructionContext)_localctx).i =  ((InstructionContext)_localctx).cond.c;
				}
				break;
			case 3:
				{
				setState(89);
				match(WHILE);
				setState(90);
				expression(0);
				setState(91);
				match(DO);
				setState(92);
				match(T__3);
				setState(93);
				instruction(0);
				setState(94);
				match(T__4);
				}
				break;
			case 4:
				{
				setState(96);
				expression(0);
				setState(97);
				match(T__5);
				setState(98);
				expression(0);
				setState(99);
				match(T__6);
				setState(100);
				match(ASSIGNMENT);
				setState(101);
				expression(0);
				}
				break;
			case 5:
				{
				setState(103);
				cible();
				setState(104);
				match(T__1);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << ARRAY_ALLOCATION) | (1L << LOGNOT) | (1L << SUB) | (1L << LITTRUE) | (1L << LITFALSE) | (1L << LITENT) | (1L << ID))) != 0)) {
					{
					{
					setState(105);
					expression(0);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(113);
				match(SK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
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
					setState(116);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(117);
					match(T__7);
					setState(118);
					instruction(2);
					}
					} 
				}
				setState(123);
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

	public static class AffectationContext extends ParserRuleContext {
		public Affectation a;
		public VariableContext v;
		public ExpressionContext e;
		public TerminalNode ASSIGNMENT() { return getToken(PPParser.ASSIGNMENT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitAffectation(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_affectation);
		((AffectationContext)_localctx).a =  new Affectation();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((AffectationContext)_localctx).v = variable();
			_localctx.a.name = ((AffectationContext)_localctx).v.v.name;
			setState(126);
			match(ASSIGNMENT);
			setState(127);
			((AffectationContext)_localctx).e = expression(0);
			_localctx.a.val = ((AffectationContext)_localctx).e.value;
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

	public static class ConditionContext extends ParserRuleContext {
		public Condition c;
		public ExpressionContext e;
		public InstructionContext inst1;
		public InstructionContext inst2;
		public TerminalNode IF() { return getToken(PPParser.IF, 0); }
		public TerminalNode THEN() { return getToken(PPParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(PPParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		((ConditionContext)_localctx).c =  new Condition();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IF);
			setState(131);
			((ConditionContext)_localctx).e = expression(0);
			_localctx.c.cond = ((ConditionContext)_localctx).e.value;
			setState(133);
			match(THEN);
			setState(134);
			((ConditionContext)_localctx).inst1 = instruction(0);
			_localctx.c.i1 = ((ConditionContext)_localctx).inst1.i;
			setState(136);
			match(ELSE);
			setState(137);
			match(T__3);
			setState(138);
			((ConditionContext)_localctx).inst2 = instruction(0);
			_localctx.c.i2 = ((ConditionContext)_localctx).inst2.i;
			setState(140);
			match(T__4);
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

	public static class VariableContext extends ParserRuleContext {
		public Variable v;
		public Token name;
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
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((VariableContext)_localctx).name = match(ID);
			((VariableContext)_localctx).v =  new Variable((((VariableContext)_localctx).name!=null?((VariableContext)_localctx).name.getText():null));
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
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(INT);
				((TypeContext)_localctx).T =  new Int();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(BOOL);
				((TypeContext)_localctx).T =  new Bool();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(ARRAY);
				setState(150);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression value;
		public ConstanteContext c;
		public VariableContext v;
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				((ExpressionContext)_localctx).c = constante();
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).c.E;
				}
				break;
			case 2:
				{
				setState(159);
				((ExpressionContext)_localctx).v = variable();
				((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).v.v;
				}
				break;
			case 3:
				{
				setState(162);
				match(SUB);
				setState(163);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).value =  new Inv(((ExpressionContext)_localctx).e.value);
				}
				break;
			case 4:
				{
				setState(166);
				match(LOGNOT);
				setState(167);
				((ExpressionContext)_localctx).e = expression(5);
				((ExpressionContext)_localctx).value =  new Not(((ExpressionContext)_localctx).e.value);
				}
				break;
			case 5:
				{
				setState(170);
				cible();
				setState(171);
				match(T__1);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << ARRAY_ALLOCATION) | (1L << LOGNOT) | (1L << SUB) | (1L << LITTRUE) | (1L << LITFALSE) | (1L << LITENT) | (1L << ID))) != 0)) {
					{
					{
					setState(172);
					expression(0);
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(180);
				match(ARRAY_ALLOCATION);
				setState(181);
				match(ARRAY);
				setState(182);
				type();
				setState(183);
				match(T__5);
				setState(184);
				expression(0);
				setState(185);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(190);
						bop();
						setState(191);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(194);
						match(T__5);
						setState(195);
						expression(0);
						setState(196);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(202);
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
		public TerminalNode ID() { return getToken(PPParser.ID, 0); }
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
		enterRule(_localctx, 20, RULE_cible);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << ID))) != 0)) ) {
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

	public static class ConstanteContext extends ParserRuleContext {
		public Expression E;
		public Token c;
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
		enterRule(_localctx, 22, RULE_constante);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((ConstanteContext)_localctx).c = match(LITENT);
				((ConstanteContext)_localctx).E =  new Constante(Integer.parseInt((((ConstanteContext)_localctx).c!=null?((ConstanteContext)_localctx).c.getText():null)));
				}
				break;
			case LITTRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(LITTRUE);
				((ConstanteContext)_localctx).E =  new ConstanteTrue();
				}
				break;
			case LITFALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
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
		enterRule(_localctx, 24, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		case 4:
			return instruction_sempred((InstructionContext)_localctx, predIndex);
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\3\2\7\2%\n"+
		"\2\f\2\16\2(\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\61\n\3\r\3\16\3\62\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D\13\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3\6\5\6u\n\6\3\6\3"+
		"\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c9\n\13\f\13\16\13"+
		"\u00cc\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d6\n\r\3\16\3\16\3"+
		"\16\2\4\n\24\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\4\2\16\17))\3\2\32"+
		"%\2\u00e5\2\37\3\2\2\2\4,\3\2\2\2\6\64\3\2\2\2\b:\3\2\2\2\nt\3\2\2\2\f"+
		"~\3\2\2\2\16\u0084\3\2\2\2\20\u0090\3\2\2\2\22\u009b\3\2\2\2\24\u00bd"+
		"\3\2\2\2\26\u00cd\3\2\2\2\30\u00d5\3\2\2\2\32\u00d7\3\2\2\2\34\35\5\4"+
		"\3\2\35\36\b\2\1\2\36 \3\2\2\2\37\34\3\2\2\2\37 \3\2\2\2 &\3\2\2\2!\""+
		"\5\b\5\2\"#\b\2\1\2#%\3\2\2\2$!\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\')\3\2\2\2(&\3\2\2\2)*\5\n\6\2*+\b\2\1\2+\3\3\2\2\2,\60\7\20\2\2-.\5"+
		"\6\4\2./\b\3\1\2/\61\3\2\2\2\60-\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\5\3\2\2\2\64\65\5\20\t\2\65\66\b\4\1\2\66\67\7\3\2\2\67"+
		"8\5\22\n\289\b\4\1\29\7\3\2\2\2:;\7)\2\2;<\b\5\1\2<B\7\4\2\2=>\5\6\4\2"+
		">?\b\5\1\2?A\3\2\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2"+
		"DB\3\2\2\2EJ\7\5\2\2FG\7\3\2\2GH\5\22\n\2HI\b\5\1\2IK\3\2\2\2JF\3\2\2"+
		"\2JK\3\2\2\2KO\3\2\2\2LM\5\4\3\2MN\b\5\1\2NP\3\2\2\2OL\3\2\2\2OP\3\2\2"+
		"\2PQ\3\2\2\2QR\5\n\6\2RS\b\5\1\2S\t\3\2\2\2TU\b\6\1\2UV\5\f\7\2VW\b\6"+
		"\1\2Wu\3\2\2\2XY\5\16\b\2YZ\b\6\1\2Zu\3\2\2\2[\\\7\24\2\2\\]\5\24\13\2"+
		"]^\7\25\2\2^_\7\6\2\2_`\5\n\6\2`a\7\7\2\2au\3\2\2\2bc\5\24\13\2cd\7\b"+
		"\2\2de\5\24\13\2ef\7\t\2\2fg\7\27\2\2gh\5\24\13\2hu\3\2\2\2ij\5\26\f\2"+
		"jn\7\4\2\2km\5\24\13\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2"+
		"\2pn\3\2\2\2qr\7\5\2\2ru\3\2\2\2su\7\26\2\2tT\3\2\2\2tX\3\2\2\2t[\3\2"+
		"\2\2tb\3\2\2\2ti\3\2\2\2ts\3\2\2\2u{\3\2\2\2vw\f\3\2\2wx\7\n\2\2xz\5\n"+
		"\6\4yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}{\3\2\2\2~\177"+
		"\5\20\t\2\177\u0080\b\7\1\2\u0080\u0081\7\27\2\2\u0081\u0082\5\24\13\2"+
		"\u0082\u0083\b\7\1\2\u0083\r\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086"+
		"\5\24\13\2\u0086\u0087\b\b\1\2\u0087\u0088\7\22\2\2\u0088\u0089\5\n\6"+
		"\2\u0089\u008a\b\b\1\2\u008a\u008b\7\23\2\2\u008b\u008c\7\6\2\2\u008c"+
		"\u008d\5\n\6\2\u008d\u008e\b\b\1\2\u008e\u008f\7\7\2\2\u008f\17\3\2\2"+
		"\2\u0090\u0091\7)\2\2\u0091\u0092\b\t\1\2\u0092\21\3\2\2\2\u0093\u0094"+
		"\7\13\2\2\u0094\u009c\b\n\1\2\u0095\u0096\7\f\2\2\u0096\u009c\b\n\1\2"+
		"\u0097\u0098\7\r\2\2\u0098\u0099\5\22\n\2\u0099\u009a\b\n\1\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0097\3\2\2\2\u009c"+
		"\23\3\2\2\2\u009d\u009e\b\13\1\2\u009e\u009f\5\30\r\2\u009f\u00a0\b\13"+
		"\1\2\u00a0\u00be\3\2\2\2\u00a1\u00a2\5\20\t\2\u00a2\u00a3\b\13\1\2\u00a3"+
		"\u00be\3\2\2\2\u00a4\u00a5\7\35\2\2\u00a5\u00a6\5\24\13\b\u00a6\u00a7"+
		"\b\13\1\2\u00a7\u00be\3\2\2\2\u00a8\u00a9\7\31\2\2\u00a9\u00aa\5\24\13"+
		"\7\u00aa\u00ab\b\13\1\2\u00ab\u00be\3\2\2\2\u00ac\u00ad\5\26\f\2\u00ad"+
		"\u00b1\7\4\2\2\u00ae\u00b0\5\24\13\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00be\3\2\2\2\u00b6\u00b7\7\30"+
		"\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9\5\22\n\2\u00b9\u00ba\7\b\2\2\u00ba"+
		"\u00bb\5\24\13\2\u00bb\u00bc\7\t\2\2\u00bc\u00be\3\2\2\2\u00bd\u009d\3"+
		"\2\2\2\u00bd\u00a1\3\2\2\2\u00bd\u00a4\3\2\2\2\u00bd\u00a8\3\2\2\2\u00bd"+
		"\u00ac\3\2\2\2\u00bd\u00b6\3\2\2\2\u00be\u00ca\3\2\2\2\u00bf\u00c0\f\6"+
		"\2\2\u00c0\u00c1\5\32\16\2\u00c1\u00c2\5\24\13\7\u00c2\u00c9\3\2\2\2\u00c3"+
		"\u00c4\f\4\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c6\5\24\13\2\u00c6\u00c7\7"+
		"\t\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\25\3\2\2"+
		"\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\t\2\2\2\u00ce\27\3\2\2\2\u00cf\u00d0"+
		"\7(\2\2\u00d0\u00d6\b\r\1\2\u00d1\u00d2\7&\2\2\u00d2\u00d6\b\r\1\2\u00d3"+
		"\u00d4\7\'\2\2\u00d4\u00d6\b\r\1\2\u00d5\u00cf\3\2\2\2\u00d5\u00d1\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\31\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8\33"+
		"\3\2\2\2\21\37&\62BJOnt{\u009b\u00b1\u00bd\u00c8\u00ca\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}