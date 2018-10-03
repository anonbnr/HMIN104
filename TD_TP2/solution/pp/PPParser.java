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
		RULE_programme = 0, RULE_declaration = 1, RULE_var = 2, RULE_definition = 3, 
		RULE_instruction = 4, RULE_variable = 5, RULE_type = 6, RULE_fonction = 7, 
		RULE_expression = 8, RULE_cible = 9, RULE_constante = 10, RULE_bop = 11;
	public static final String[] ruleNames = {
		"programme", "declaration", "var", "definition", "instruction", "variable", 
		"type", "fonction", "expression", "cible", "constante", "bop"
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
		public Programme p;
		public DeclarationContext g;
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(24);
				((ProgrammeContext)_localctx).g = declaration();
				_localctx.p.globals = ((ProgrammeContext)_localctx).g.variables;
				}
			}

			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(29);
					definition();
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(35);
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
		public ArrayList<Pair<String,Type>> variables;
		public VarContext v;
		public TerminalNode VAR() { return getToken(PPParser.VAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
			setState(37);
			match(VAR);
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					((DeclarationContext)_localctx).v = var();
					_localctx.variables.add(((DeclarationContext)_localctx).v.pair);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
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

	public static class VarContext extends ParserRuleContext {
		public Pair<String,Type> pair;
		public VariableContext s;
		public TypeContext t;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PPListener ) ((PPListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		((VarContext)_localctx).pair =  new Pair<String,Type>();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((VarContext)_localctx).s = variable();
			_localctx.pair.left = (((VarContext)_localctx).s!=null?_input.getText(((VarContext)_localctx).s.start,((VarContext)_localctx).s.stop):null);
			setState(47);
			match(T__0);
			setState(48);
			((VarContext)_localctx).t = type();
			_localctx.pair.right = ((VarContext)_localctx).t.T;
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			fonction();
			setState(52);
			match(T__1);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(53);
				var();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(T__2);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(60);
				match(T__0);
				setState(61);
				type();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(64);
				declaration();
				}
			}

			setState(67);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_instruction, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(70);
				variable();
				setState(71);
				match(ASSIGNMENT);
				setState(72);
				expression(0);
				}
				break;
			case 2:
				{
				setState(74);
				expression(0);
				setState(75);
				match(T__3);
				setState(76);
				expression(0);
				setState(77);
				match(T__4);
				setState(78);
				match(ASSIGNMENT);
				setState(79);
				expression(0);
				}
				break;
			case 3:
				{
				setState(81);
				match(IF);
				setState(82);
				expression(0);
				setState(83);
				match(THEN);
				setState(84);
				instruction(0);
				setState(85);
				match(ELSE);
				setState(86);
				match(T__5);
				setState(87);
				instruction(0);
				setState(88);
				match(T__6);
				}
				break;
			case 4:
				{
				setState(90);
				match(WHILE);
				setState(91);
				expression(0);
				setState(92);
				match(DO);
				setState(93);
				match(T__5);
				setState(94);
				instruction(0);
				setState(95);
				match(T__6);
				}
				break;
			case 5:
				{
				setState(97);
				cible();
				setState(98);
				match(T__1);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << ARRAY_ALLOCATION) | (1L << LOGNOT) | (1L << SUB) | (1L << LITTRUE) | (1L << LITFALSE) | (1L << LITENT) | (1L << ID))) != 0)) {
					{
					{
					setState(99);
					expression(0);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(107);
				match(SK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
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
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(111);
					match(T__7);
					setState(112);
					instruction(2);
					}
					} 
				}
				setState(117);
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
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(INT);
				((TypeContext)_localctx).T =  new Int();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(BOOL);
				((TypeContext)_localctx).T =  new Bool();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(ARRAY);
				setState(125);
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
		public Fonction f;
		public Token name;
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
		enterRule(_localctx, 14, RULE_fonction);
		((FonctionContext)_localctx).f =  new Fonction();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((FonctionContext)_localctx).name = match(ID);
			_localctx.f.name = (((FonctionContext)_localctx).name!=null?((FonctionContext)_localctx).name.getText():null);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(134);
				constante();
				}
				break;
			case 2:
				{
				setState(135);
				variable();
				}
				break;
			case 3:
				{
				setState(136);
				match(SUB);
				setState(137);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).value =  new Inv(((ExpressionContext)_localctx).e.value);
				}
				break;
			case 4:
				{
				setState(140);
				match(LOGNOT);
				setState(141);
				((ExpressionContext)_localctx).e = expression(5);
				((ExpressionContext)_localctx).value =  new Not(((ExpressionContext)_localctx).e.value);
				}
				break;
			case 5:
				{
				setState(144);
				cible();
				setState(145);
				match(T__1);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << OUT) | (1L << ARRAY_ALLOCATION) | (1L << LOGNOT) | (1L << SUB) | (1L << LITTRUE) | (1L << LITFALSE) | (1L << LITENT) | (1L << ID))) != 0)) {
					{
					{
					setState(146);
					expression(0);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(154);
				match(ARRAY_ALLOCATION);
				setState(155);
				match(ARRAY);
				setState(156);
				type();
				setState(157);
				match(T__3);
				setState(158);
				expression(0);
				setState(159);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(164);
						bop();
						setState(165);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(168);
						match(T__3);
						setState(169);
						expression(0);
						setState(170);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(176);
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
		enterRule(_localctx, 18, RULE_cible);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(IN);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(OUT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
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
		enterRule(_localctx, 20, RULE_constante);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(LITENT);
				((ConstanteContext)_localctx).E =  new Constante(LITENT);
				}
				break;
			case LITTRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(LITTRUE);
				((ConstanteContext)_localctx).E =  new ConstanteTrue();
				}
				break;
			case LITFALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
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
		enterRule(_localctx, 22, RULE_bop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\5\2\36\n\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\5\3\5\3\5\5\5A\n\5\3\5\5\5D\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6g\n\6"+
		"\f\6\16\6j\13\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6\7\6t\n\6\f\6\16\6w\13"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0096\n\n\f"+
		"\n\16\n\u0099\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a4\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00af\n\n\f\n\16\n\u00b2\13\n\3"+
		"\13\3\13\3\13\5\13\u00b7\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bf\n\f\3"+
		"\r\3\r\3\r\2\4\n\22\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\32%\2\u00d1"+
		"\2\35\3\2\2\2\4\'\3\2\2\2\6/\3\2\2\2\b\65\3\2\2\2\nn\3\2\2\2\fx\3\2\2"+
		"\2\16\u0082\3\2\2\2\20\u0084\3\2\2\2\22\u00a3\3\2\2\2\24\u00b6\3\2\2\2"+
		"\26\u00be\3\2\2\2\30\u00c0\3\2\2\2\32\33\5\4\3\2\33\34\b\2\1\2\34\36\3"+
		"\2\2\2\35\32\3\2\2\2\35\36\3\2\2\2\36\"\3\2\2\2\37!\5\b\5\2 \37\3\2\2"+
		"\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\5\n\6\2&\3\3"+
		"\2\2\2\'+\7\20\2\2()\5\6\4\2)*\b\3\1\2*,\3\2\2\2+(\3\2\2\2,-\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/\60\5\f\7\2\60\61\b\4\1\2\61\62\7\3\2\2"+
		"\62\63\5\16\b\2\63\64\b\4\1\2\64\7\3\2\2\2\65\66\5\20\t\2\66:\7\4\2\2"+
		"\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2"+
		"\2\2=@\7\5\2\2>?\7\3\2\2?A\5\16\b\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\5"+
		"\4\3\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\n\6\2F\t\3\2\2\2GH\b\6\1\2HI"+
		"\5\f\7\2IJ\7\27\2\2JK\5\22\n\2Ko\3\2\2\2LM\5\22\n\2MN\7\6\2\2NO\5\22\n"+
		"\2OP\7\7\2\2PQ\7\27\2\2QR\5\22\n\2Ro\3\2\2\2ST\7\21\2\2TU\5\22\n\2UV\7"+
		"\22\2\2VW\5\n\6\2WX\7\23\2\2XY\7\b\2\2YZ\5\n\6\2Z[\7\t\2\2[o\3\2\2\2\\"+
		"]\7\24\2\2]^\5\22\n\2^_\7\25\2\2_`\7\b\2\2`a\5\n\6\2ab\7\t\2\2bo\3\2\2"+
		"\2cd\5\24\13\2dh\7\4\2\2eg\5\22\n\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\5\2\2lo\3\2\2\2mo\7\26\2\2nG\3\2\2\2nL"+
		"\3\2\2\2nS\3\2\2\2n\\\3\2\2\2nc\3\2\2\2nm\3\2\2\2ou\3\2\2\2pq\f\3\2\2"+
		"qr\7\n\2\2rt\5\n\6\4sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\13\3\2\2"+
		"\2wu\3\2\2\2xy\7)\2\2y\r\3\2\2\2z{\7\13\2\2{\u0083\b\b\1\2|}\7\f\2\2}"+
		"\u0083\b\b\1\2~\177\7\r\2\2\177\u0080\5\16\b\2\u0080\u0081\b\b\1\2\u0081"+
		"\u0083\3\2\2\2\u0082z\3\2\2\2\u0082|\3\2\2\2\u0082~\3\2\2\2\u0083\17\3"+
		"\2\2\2\u0084\u0085\7)\2\2\u0085\u0086\b\t\1\2\u0086\21\3\2\2\2\u0087\u0088"+
		"\b\n\1\2\u0088\u00a4\5\26\f\2\u0089\u00a4\5\f\7\2\u008a\u008b\7\35\2\2"+
		"\u008b\u008c\5\22\n\b\u008c\u008d\b\n\1\2\u008d\u00a4\3\2\2\2\u008e\u008f"+
		"\7\31\2\2\u008f\u0090\5\22\n\7\u0090\u0091\b\n\1\2\u0091\u00a4\3\2\2\2"+
		"\u0092\u0093\5\24\13\2\u0093\u0097\7\4\2\2\u0094\u0096\5\22\n\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\5\2\2\u009b"+
		"\u00a4\3\2\2\2\u009c\u009d\7\30\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5"+
		"\16\b\2\u009f\u00a0\7\6\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\7\7\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u0087\3\2\2\2\u00a3\u0089\3\2\2\2\u00a3\u008a\3\2"+
		"\2\2\u00a3\u008e\3\2\2\2\u00a3\u0092\3\2\2\2\u00a3\u009c\3\2\2\2\u00a4"+
		"\u00b0\3\2\2\2\u00a5\u00a6\f\6\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\5"+
		"\22\n\7\u00a8\u00af\3\2\2\2\u00a9\u00aa\f\4\2\2\u00aa\u00ab\7\6\2\2\u00ab"+
		"\u00ac\5\22\n\2\u00ac\u00ad\7\7\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a5\3"+
		"\2\2\2\u00ae\u00a9\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\23\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b7\7\16\2"+
		"\2\u00b4\u00b7\7\17\2\2\u00b5\u00b7\5\20\t\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00b9\7(\2\2"+
		"\u00b9\u00bf\b\f\1\2\u00ba\u00bb\7&\2\2\u00bb\u00bf\b\f\1\2\u00bc\u00bd"+
		"\7\'\2\2\u00bd\u00bf\b\f\1\2\u00be\u00b8\3\2\2\2\u00be\u00ba\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00c1\t\2\2\2\u00c1\31\3\2\2\2\22"+
		"\35\"-:@Chnu\u0082\u0097\u00a3\u00ae\u00b0\u00b6\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}