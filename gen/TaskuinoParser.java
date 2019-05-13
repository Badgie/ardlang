// Generated from C:/Users/Bruger/IdeaProjects/meh/ardlang\Taskuino.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaskuinoParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_task = 2, RULE_function = 3, RULE_stmt = 4, 
		RULE_assign_stmt = 5, RULE_assign_comp_stmt = 6, RULE_calc_stmt = 7, RULE_bool_stmt = 8, 
		RULE_if_stmt = 9, RULE_for_stmt = 10, RULE_dcl_stmt = 11, RULE_method_stmt = 12, 
		RULE_func_stmt = 13, RULE_type_assign = 14, RULE_typeless_assign = 15, 
		RULE_calc_stmt_one = 16, RULE_calc_stmt_two = 17, RULE_if_cond = 18, RULE_comp_param = 19, 
		RULE_param = 20, RULE_op_pres_one = 21, RULE_op_pres_two = 22, RULE_bool_op = 23, 
		RULE_mod_op = 24, RULE_type = 25, RULE_var = 26, RULE_bool = 27, RULE_val = 28, 
		RULE_ival = 29, RULE_fval = 30, RULE_lconst = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "task", "function", "stmt", "assign_stmt", "assign_comp_stmt", 
			"calc_stmt", "bool_stmt", "if_stmt", "for_stmt", "dcl_stmt", "method_stmt", 
			"func_stmt", "type_assign", "typeless_assign", "calc_stmt_one", "calc_stmt_two", 
			"if_cond", "comp_param", "param", "op_pres_one", "op_pres_two", "bool_op", 
			"mod_op", "type", "var", "bool", "val", "ival", "fval", "lconst"
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

	@Override
	public String getGrammarFileName() { return "Taskuino.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TaskuinoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TaskuinoParser.EOF, 0); }
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << ASSIGN) | (1L << INCR) | (1L << DECR) | (1L << EQ) | (1L << GRT) | (1L << LESS) | (1L << GRT_EQ) | (1L << LESS_EQ) | (1L << OR) | (1L << XOR) | (1L << AND) | (1L << NOT) | (1L << ARRAY_START) | (1L << ARRAY_END) | (1L << BLOCK_START) | (1L << BLOCK_END) | (1L << PAREN_LEFT) | (1L << PAREN_RIGHT) | (1L << QUOTE) | (1L << PARAM_DELIM) | (1L << SEMICOLON) | (1L << DOT_OP) | (1L << RETURN) | (1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << FUNC) | (1L << TASK) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << NULL) | (1L << OUTPUT) | (1L << INPUT) | (1L << HIGH) | (1L << LOW) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << TYPE_DOUBLE) | (1L << TYPE_BOOL) | (1L << WHITESPACE) | (1L << NEWLINE) | (1L << CAR_RETURN) | (1L << COMP_DCL) | (1L << IDENT) | (1L << DIG) | (1L << DECDIG) | (1L << STRING))) != 0)) {
				{
				{
				setState(64);
				stmts();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(EOF);
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

	public static class StmtsContext extends ParserRuleContext {
		public TaskContext task() {
			return getRuleContext(TaskContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				task();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				stmt();
				}
				break;
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

	public static class TaskContext extends ParserRuleContext {
		public TerminalNode TASK() { return getToken(TaskuinoParser.TASK, 0); }
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_task);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(TASK);
			setState(78);
			match(IDENT);
			setState(79);
			match(PAREN_LEFT);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					param();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(86);
			match(PAREN_RIGHT);
			setState(87);
			match(BLOCK_START);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					stmt();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(94);
			match(BLOCK_END);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(TaskuinoParser.FUNC, 0); }
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(FUNC);
			setState(97);
			match(IDENT);
			setState(98);
			match(PAREN_LEFT);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					param();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(105);
			match(PAREN_RIGHT);
			setState(106);
			match(BLOCK_START);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					stmt();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(113);
			match(BLOCK_END);
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

	public static class StmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Assign_comp_stmtContext assign_comp_stmt() {
			return getRuleContext(Assign_comp_stmtContext.class,0);
		}
		public Calc_stmtContext calc_stmt() {
			return getRuleContext(Calc_stmtContext.class,0);
		}
		public Bool_stmtContext bool_stmt() {
			return getRuleContext(Bool_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Dcl_stmtContext dcl_stmt() {
			return getRuleContext(Dcl_stmtContext.class,0);
		}
		public Method_stmtContext method_stmt() {
			return getRuleContext(Method_stmtContext.class,0);
		}
		public Func_stmtContext func_stmt() {
			return getRuleContext(Func_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				assign_comp_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				calc_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				bool_stmt(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				if_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				for_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				dcl_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				method_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				func_stmt();
				}
				break;
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public Type_assignContext type_assign() {
			return getRuleContext(Type_assignContext.class,0);
		}
		public Typeless_assignContext typeless_assign() {
			return getRuleContext(Typeless_assignContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_stmt);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_STRING:
			case TYPE_DOUBLE:
			case TYPE_BOOL:
			case COMP_DCL:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				type_assign();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				typeless_assign();
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

	public static class Assign_comp_stmtContext extends ParserRuleContext {
		public TerminalNode COMP_DCL() { return getToken(TaskuinoParser.COMP_DCL, 0); }
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(TaskuinoParser.ASSIGN, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public List<Comp_paramContext> comp_param() {
			return getRuleContexts(Comp_paramContext.class);
		}
		public Comp_paramContext comp_param(int i) {
			return getRuleContext(Comp_paramContext.class,i);
		}
		public Assign_comp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_comp_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitAssign_comp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_comp_stmtContext assign_comp_stmt() throws RecognitionException {
		Assign_comp_stmtContext _localctx = new Assign_comp_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_comp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(COMP_DCL);
			setState(131);
			match(IDENT);
			setState(132);
			match(ASSIGN);
			setState(133);
			match(BLOCK_START);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(134);
				comp_param();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(BLOCK_END);
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

	public static class Calc_stmtContext extends ParserRuleContext {
		public Calc_stmt_oneContext calc_stmt_one() {
			return getRuleContext(Calc_stmt_oneContext.class,0);
		}
		public Calc_stmt_twoContext calc_stmt_two() {
			return getRuleContext(Calc_stmt_twoContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Mod_opContext mod_op() {
			return getRuleContext(Mod_opContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public Op_pres_twoContext op_pres_two() {
			return getRuleContext(Op_pres_twoContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TaskuinoParser.ASSIGN, 0); }
		public Calc_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitCalc_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calc_stmtContext calc_stmt() throws RecognitionException {
		Calc_stmtContext _localctx = new Calc_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_calc_stmt);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				calc_stmt_one();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				calc_stmt_two();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				var();
				setState(145);
				mod_op();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(IDENT);
				setState(148);
				op_pres_two();
				setState(149);
				match(ASSIGN);
				setState(150);
				var();
				}
				break;
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

	public static class Bool_stmtContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class,0);
		}
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TaskuinoParser.NOT, 0); }
		public Method_stmtContext method_stmt() {
			return getRuleContext(Method_stmtContext.class,0);
		}
		public List<Bool_stmtContext> bool_stmt() {
			return getRuleContexts(Bool_stmtContext.class);
		}
		public Bool_stmtContext bool_stmt(int i) {
			return getRuleContext(Bool_stmtContext.class,i);
		}
		public Bool_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitBool_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_stmtContext bool_stmt() throws RecognitionException {
		return bool_stmt(0);
	}

	private Bool_stmtContext bool_stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_stmtContext _localctx = new Bool_stmtContext(_ctx, _parentState);
		Bool_stmtContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_bool_stmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(155);
					match(PAREN_LEFT);
					}
					break;
				}
				setState(158);
				var();
				setState(159);
				bool_op();
				setState(160);
				var();
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(161);
					match(PAREN_RIGHT);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(164);
					match(NOT);
					}
				}

				setState(167);
				bool();
				}
				break;
			case 3:
				{
				setState(168);
				var();
				}
				break;
			case 4:
				{
				setState(169);
				method_stmt();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_stmtContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_stmt);
					setState(172);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(173);
					bool_op();
					setState(174);
					bool_stmt(6);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TaskuinoParser.IF, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<If_stmtContext> if_stmt() {
			return getRuleContexts(If_stmtContext.class);
		}
		public If_stmtContext if_stmt(int i) {
			return getRuleContext(If_stmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TaskuinoParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		try {
			int _alt;
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(IF);
				setState(182);
				match(PAREN_LEFT);
				setState(183);
				if_cond();
				setState(184);
				match(PAREN_RIGHT);
				setState(185);
				match(BLOCK_START);
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(186);
						stmt();
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(192);
				match(BLOCK_END);
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						if_stmt();
						}
						} 
					}
					setState(198);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(ELSE);
				setState(200);
				match(IF);
				setState(201);
				match(PAREN_LEFT);
				setState(202);
				if_cond();
				setState(203);
				match(PAREN_RIGHT);
				setState(204);
				match(BLOCK_START);
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(205);
						stmt();
						}
						} 
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(211);
				match(BLOCK_END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(ELSE);
				setState(214);
				match(BLOCK_START);
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(215);
						stmt();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(221);
				match(BLOCK_END);
				}
				break;
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TaskuinoParser.FOR, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(TaskuinoParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(TaskuinoParser.SEMICOLON, i);
		}
		public Bool_stmtContext bool_stmt() {
			return getRuleContext(Bool_stmtContext.class,0);
		}
		public Calc_stmtContext calc_stmt() {
			return getRuleContext(Calc_stmtContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(FOR);
			setState(225);
			match(PAREN_LEFT);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(226);
				var();
				}
				break;
			case 2:
				{
				setState(227);
				assign_stmt();
				}
				break;
			}
			setState(230);
			match(SEMICOLON);
			setState(231);
			bool_stmt(0);
			setState(232);
			match(SEMICOLON);
			setState(233);
			calc_stmt();
			setState(234);
			match(PAREN_RIGHT);
			setState(235);
			match(BLOCK_START);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					stmt();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(242);
			match(BLOCK_END);
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

	public static class Dcl_stmtContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode COMP_DCL() { return getToken(TaskuinoParser.COMP_DCL, 0); }
		public TerminalNode ARRAY_START() { return getToken(TaskuinoParser.ARRAY_START, 0); }
		public TerminalNode ARRAY_END() { return getToken(TaskuinoParser.ARRAY_END, 0); }
		public IvalContext ival() {
			return getRuleContext(IvalContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TaskuinoParser.ASSIGN, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Dcl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitDcl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl_stmtContext dcl_stmt() throws RecognitionException {
		Dcl_stmtContext _localctx = new Dcl_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dcl_stmt);
		int _la;
		try {
			int _alt;
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				type();
				setState(245);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(COMP_DCL);
				setState(248);
				match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				type();
				setState(250);
				match(ARRAY_START);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIG) {
					{
					setState(251);
					ival();
					}
				}

				setState(254);
				match(ARRAY_END);
				setState(255);
				match(IDENT);
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(256);
					match(ASSIGN);
					setState(257);
					match(BLOCK_START);
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(258);
							param();
							}
							} 
						}
						setState(263);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					setState(264);
					match(BLOCK_END);
					}
					break;
				}
				}
				break;
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

	public static class Method_stmtContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(TaskuinoParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TaskuinoParser.IDENT, i);
		}
		public TerminalNode DOT_OP() { return getToken(TaskuinoParser.DOT_OP, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Method_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitMethod_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_stmtContext method_stmt() throws RecognitionException {
		Method_stmtContext _localctx = new Method_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(IDENT);
			setState(270);
			match(DOT_OP);
			setState(271);
			match(IDENT);
			setState(272);
			match(PAREN_LEFT);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					param();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(279);
			match(PAREN_RIGHT);
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

	public static class Func_stmtContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Func_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitFunc_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_stmtContext func_stmt() throws RecognitionException {
		Func_stmtContext _localctx = new Func_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IDENT);
			setState(282);
			match(PAREN_LEFT);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					param();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(289);
			match(PAREN_RIGHT);
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

	public static class Type_assignContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(TaskuinoParser.ASSIGN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Type_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitType_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_assignContext type_assign() throws RecognitionException {
		Type_assignContext _localctx = new Type_assignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_assign);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				type();
				setState(292);
				match(IDENT);
				setState(293);
				match(ASSIGN);
				setState(294);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				type();
				setState(297);
				match(IDENT);
				setState(298);
				match(ASSIGN);
				setState(299);
				stmt();
				}
				break;
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

	public static class Typeless_assignContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(TaskuinoParser.ASSIGN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Calc_stmtContext calc_stmt() {
			return getRuleContext(Calc_stmtContext.class,0);
		}
		public Typeless_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeless_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitTypeless_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typeless_assignContext typeless_assign() throws RecognitionException {
		Typeless_assignContext _localctx = new Typeless_assignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeless_assign);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(IDENT);
				setState(304);
				match(ASSIGN);
				setState(305);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(IDENT);
				setState(307);
				match(ASSIGN);
				setState(308);
				calc_stmt();
				}
				break;
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

	public static class Calc_stmt_oneContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<Op_pres_oneContext> op_pres_one() {
			return getRuleContexts(Op_pres_oneContext.class);
		}
		public Op_pres_oneContext op_pres_one(int i) {
			return getRuleContext(Op_pres_oneContext.class,i);
		}
		public Calc_stmt_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_stmt_one; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitCalc_stmt_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calc_stmt_oneContext calc_stmt_one() throws RecognitionException {
		Calc_stmt_oneContext _localctx = new Calc_stmt_oneContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_calc_stmt_one);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			val();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					op_pres_one();
					setState(313);
					val();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class Calc_stmt_twoContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public List<Op_pres_twoContext> op_pres_two() {
			return getRuleContexts(Op_pres_twoContext.class);
		}
		public Op_pres_twoContext op_pres_two(int i) {
			return getRuleContext(Op_pres_twoContext.class,i);
		}
		public List<Calc_stmt_oneContext> calc_stmt_one() {
			return getRuleContexts(Calc_stmt_oneContext.class);
		}
		public Calc_stmt_oneContext calc_stmt_one(int i) {
			return getRuleContext(Calc_stmt_oneContext.class,i);
		}
		public Calc_stmt_twoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_stmt_two; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitCalc_stmt_two(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calc_stmt_twoContext calc_stmt_two() throws RecognitionException {
		Calc_stmt_twoContext _localctx = new Calc_stmt_twoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_calc_stmt_two);
		try {
			int _alt;
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				val();
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(321);
						op_pres_two();
						setState(322);
						calc_stmt_one();
						}
						} 
					}
					setState(328);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				val();
				}
				break;
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

	public static class If_condContext extends ParserRuleContext {
		public Bool_stmtContext bool_stmt() {
			return getRuleContext(Bool_stmtContext.class,0);
		}
		public Method_stmtContext method_stmt() {
			return getRuleContext(Method_stmtContext.class,0);
		}
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitIf_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_cond);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				bool_stmt(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				method_stmt();
				}
				break;
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

	public static class Comp_paramContext extends ParserRuleContext {
		public Typeless_assignContext typeless_assign() {
			return getRuleContext(Typeless_assignContext.class,0);
		}
		public TerminalNode PARAM_DELIM() { return getToken(TaskuinoParser.PARAM_DELIM, 0); }
		public Comp_paramContext comp_param() {
			return getRuleContext(Comp_paramContext.class,0);
		}
		public Comp_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitComp_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_paramContext comp_param() throws RecognitionException {
		Comp_paramContext _localctx = new Comp_paramContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comp_param);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				typeless_assign();
				setState(337);
				match(PARAM_DELIM);
				setState(338);
				comp_param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				typeless_assign();
				}
				break;
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode PARAM_DELIM() { return getToken(TaskuinoParser.PARAM_DELIM, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_param);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				var();
				setState(344);
				match(PARAM_DELIM);
				setState(345);
				param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				var();
				}
				break;
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

	public static class Op_pres_oneContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(TaskuinoParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(TaskuinoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TaskuinoParser.MOD, 0); }
		public Op_pres_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_pres_one; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitOp_pres_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_pres_oneContext op_pres_one() throws RecognitionException {
		Op_pres_oneContext _localctx = new Op_pres_oneContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_pres_one);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class Op_pres_twoContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TaskuinoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TaskuinoParser.MINUS, 0); }
		public Op_pres_twoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_pres_two; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitOp_pres_two(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_pres_twoContext op_pres_two() throws RecognitionException {
		Op_pres_twoContext _localctx = new Op_pres_twoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_pres_two);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class Bool_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TaskuinoParser.EQ, 0); }
		public TerminalNode GRT() { return getToken(TaskuinoParser.GRT, 0); }
		public TerminalNode LESS() { return getToken(TaskuinoParser.LESS, 0); }
		public TerminalNode GRT_EQ() { return getToken(TaskuinoParser.GRT_EQ, 0); }
		public TerminalNode LESS_EQ() { return getToken(TaskuinoParser.LESS_EQ, 0); }
		public TerminalNode OR() { return getToken(TaskuinoParser.OR, 0); }
		public TerminalNode AND() { return getToken(TaskuinoParser.AND, 0); }
		public Bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitBool_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GRT) | (1L << LESS) | (1L << GRT_EQ) | (1L << LESS_EQ) | (1L << OR) | (1L << AND))) != 0)) ) {
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

	public static class Mod_opContext extends ParserRuleContext {
		public TerminalNode INCR() { return getToken(TaskuinoParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(TaskuinoParser.DECR, 0); }
		public Mod_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitMod_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_opContext mod_op() throws RecognitionException {
		Mod_opContext _localctx = new Mod_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mod_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(TaskuinoParser.TYPE_INT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(TaskuinoParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_DOUBLE() { return getToken(TaskuinoParser.TYPE_DOUBLE, 0); }
		public TerminalNode TYPE_BOOL() { return getToken(TaskuinoParser.TYPE_BOOL, 0); }
		public TerminalNode COMP_DCL() { return getToken(TaskuinoParser.COMP_DCL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << TYPE_DOUBLE) | (1L << TYPE_BOOL) | (1L << COMP_DCL))) != 0)) ) {
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

	public static class VarContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TaskuinoParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public LconstContext lconst() {
			return getRuleContext(LconstContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_var);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				lconst();
				}
				break;
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(TaskuinoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TaskuinoParser.FALSE, 0); }
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << IDENT))) != 0)) ) {
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

	public static class ValContext extends ParserRuleContext {
		public IvalContext ival() {
			return getRuleContext(IvalContext.class,0);
		}
		public FvalContext fval() {
			return getRuleContext(FvalContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode ARRAY_START() { return getToken(TaskuinoParser.ARRAY_START, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ARRAY_END() { return getToken(TaskuinoParser.ARRAY_END, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_val);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				ival();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				fval();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(IDENT);
				setState(371);
				match(ARRAY_START);
				setState(372);
				var();
				setState(373);
				match(ARRAY_END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				match(IDENT);
				}
				break;
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

	public static class IvalContext extends ParserRuleContext {
		public TerminalNode DIG() { return getToken(TaskuinoParser.DIG, 0); }
		public IvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ival; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitIval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IvalContext ival() throws RecognitionException {
		IvalContext _localctx = new IvalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ival);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(DIG);
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

	public static class FvalContext extends ParserRuleContext {
		public TerminalNode DIG() { return getToken(TaskuinoParser.DIG, 0); }
		public TerminalNode DECDIG() { return getToken(TaskuinoParser.DECDIG, 0); }
		public FvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitFval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FvalContext fval() throws RecognitionException {
		FvalContext _localctx = new FvalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fval);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(DIG);
				setState(381);
				matchWildcard();
				setState(382);
				match(DECDIG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				matchWildcard();
				setState(384);
				match(DECDIG);
				}
				break;
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

	public static class LconstContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(TaskuinoParser.OUTPUT, 0); }
		public TerminalNode INPUT() { return getToken(TaskuinoParser.INPUT, 0); }
		public TerminalNode HIGH() { return getToken(TaskuinoParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(TaskuinoParser.LOW, 0); }
		public LconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lconst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitLconst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LconstContext lconst() throws RecognitionException {
		LconstContext _localctx = new LconstContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lconst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OUTPUT) | (1L << INPUT) | (1L << HIGH) | (1L << LOW))) != 0)) ) {
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
		case 8:
			return bool_stmt_sempred((Bool_stmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_stmt_sempred(Bool_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0188\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3"+
		"\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\3\5\7\5o\n\5\f"+
		"\5\16\5r\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6"+
		"\3\7\3\7\5\7\u0083\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3"+
		"\n\3\n\5\n\u009f\n\n\3\n\3\n\3\n\3\n\5\n\u00a5\n\n\3\n\5\n\u00a8\n\n\3"+
		"\n\3\n\3\n\5\n\u00ad\n\n\3\n\3\n\3\n\3\n\7\n\u00b3\n\n\f\n\16\n\u00b6"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00be\n\13\f\13\16\13\u00c1\13"+
		"\13\3\13\3\13\7\13\u00c5\n\13\f\13\16\13\u00c8\13\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u00d1\n\13\f\13\16\13\u00d4\13\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00db\n\13\f\13\16\13\u00de\13\13\3\13\5\13\u00e1\n"+
		"\13\3\f\3\f\3\f\3\f\5\f\u00e7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f0"+
		"\n\f\f\f\16\f\u00f3\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ff"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0106\n\r\f\r\16\r\u0109\13\r\3\r\5\r\u010c"+
		"\n\r\5\r\u010e\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u0115\n\16\f\16\16\16"+
		"\u0118\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u011f\n\17\f\17\16\17\u0122"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0130\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0138\n\21\3\22\3\22\3"+
		"\22\3\22\7\22\u013e\n\22\f\22\16\22\u0141\13\22\3\23\3\23\3\23\3\23\7"+
		"\23\u0147\n\23\f\23\16\23\u014a\13\23\3\23\5\23\u014d\n\23\3\24\3\24\5"+
		"\24\u0151\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0158\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u015f\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\5\34\u016f\n\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u017b\n\36\3\37\3\37\3 \3 \3 \3 \3 \5 \u0184"+
		"\n \3!\3!\3!\2\3\22\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@\2\t\3\2\5\7\3\2\3\4\4\2\13\20\22\22\3\2\t\n\4\2,/\63"+
		"\63\4\2$%\64\64\3\2(+\2\u01a0\2E\3\2\2\2\4M\3\2\2\2\6O\3\2\2\2\bb\3\2"+
		"\2\2\n~\3\2\2\2\f\u0082\3\2\2\2\16\u0084\3\2\2\2\20\u009a\3\2\2\2\22\u00ac"+
		"\3\2\2\2\24\u00e0\3\2\2\2\26\u00e2\3\2\2\2\30\u010d\3\2\2\2\32\u010f\3"+
		"\2\2\2\34\u011b\3\2\2\2\36\u012f\3\2\2\2 \u0137\3\2\2\2\"\u0139\3\2\2"+
		"\2$\u014c\3\2\2\2&\u0150\3\2\2\2(\u0157\3\2\2\2*\u015e\3\2\2\2,\u0160"+
		"\3\2\2\2.\u0162\3\2\2\2\60\u0164\3\2\2\2\62\u0166\3\2\2\2\64\u0168\3\2"+
		"\2\2\66\u016e\3\2\2\28\u0170\3\2\2\2:\u017a\3\2\2\2<\u017c\3\2\2\2>\u0183"+
		"\3\2\2\2@\u0185\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2FH\3\2\2\2GE\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JN\5\6\4\2KN\5\b\5\2LN\5"+
		"\n\6\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\5\3\2\2\2OP\7#\2\2PQ\7\64\2\2QU"+
		"\7\30\2\2RT\5*\26\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2"+
		"WU\3\2\2\2XY\7\31\2\2Y]\7\26\2\2Z\\\5\n\6\2[Z\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\27\2\2a\7\3\2\2\2bc\7\"\2\2cd\7"+
		"\64\2\2dh\7\30\2\2eg\5*\26\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i"+
		"k\3\2\2\2jh\3\2\2\2kl\7\31\2\2lp\7\26\2\2mo\5\n\6\2nm\3\2\2\2or\3\2\2"+
		"\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\27\2\2t\t\3\2\2\2u\177"+
		"\5\f\7\2v\177\5\16\b\2w\177\5\20\t\2x\177\5\22\n\2y\177\5\24\13\2z\177"+
		"\5\26\f\2{\177\5\30\r\2|\177\5\32\16\2}\177\5\34\17\2~u\3\2\2\2~v\3\2"+
		"\2\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2"+
		"\2\2\177\13\3\2\2\2\u0080\u0083\5\36\20\2\u0081\u0083\5 \21\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0081\3\2\2\2\u0083\r\3\2\2\2\u0084\u0085\7\63\2\2\u0085"+
		"\u0086\7\64\2\2\u0086\u0087\7\b\2\2\u0087\u008b\7\26\2\2\u0088\u008a\5"+
		"(\25\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\27"+
		"\2\2\u008f\17\3\2\2\2\u0090\u009b\5\"\22\2\u0091\u009b\5$\23\2\u0092\u0093"+
		"\5\66\34\2\u0093\u0094\5\62\32\2\u0094\u009b\3\2\2\2\u0095\u0096\7\64"+
		"\2\2\u0096\u0097\5.\30\2\u0097\u0098\7\b\2\2\u0098\u0099\5\66\34\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0090\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0092\3\2"+
		"\2\2\u009a\u0095\3\2\2\2\u009b\21\3\2\2\2\u009c\u009e\b\n\1\2\u009d\u009f"+
		"\7\30\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u00a1\5\66\34\2\u00a1\u00a2\5\60\31\2\u00a2\u00a4\5\66\34\2\u00a3"+
		"\u00a5\7\31\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ad\3"+
		"\2\2\2\u00a6\u00a8\7\23\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ad\58\35\2\u00aa\u00ad\5\66\34\2\u00ab\u00ad\5"+
		"\32\16\2\u00ac\u009c\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00af\f\7\2\2\u00af\u00b0\5\60"+
		"\31\2\u00b0\u00b1\5\22\n\b\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\23\3\2\2"+
		"\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7 \2\2\u00b8\u00b9\7\30\2\2\u00b9\u00ba"+
		"\5&\24\2\u00ba\u00bb\7\31\2\2\u00bb\u00bf\7\26\2\2\u00bc\u00be\5\n\6\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c6\7\27\2\2"+
		"\u00c3\u00c5\5\24\13\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00e1\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7!\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\5&\24"+
		"\2\u00cd\u00ce\7\31\2\2\u00ce\u00d2\7\26\2\2\u00cf\u00d1\5\n\6\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\27\2\2\u00d6"+
		"\u00e1\3\2\2\2\u00d7\u00d8\7!\2\2\u00d8\u00dc\7\26\2\2\u00d9\u00db\5\n"+
		"\6\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\7\27"+
		"\2\2\u00e0\u00b7\3\2\2\2\u00e0\u00c9\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e1"+
		"\25\3\2\2\2\u00e2\u00e3\7\37\2\2\u00e3\u00e6\7\30\2\2\u00e4\u00e7\5\66"+
		"\34\2\u00e5\u00e7\5\f\7\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7\34\2\2\u00e9\u00ea\5\22\n\2\u00ea\u00eb\7"+
		"\34\2\2\u00eb\u00ec\5\20\t\2\u00ec\u00ed\7\31\2\2\u00ed\u00f1\7\26\2\2"+
		"\u00ee\u00f0\5\n\6\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\7\27\2\2\u00f5\27\3\2\2\2\u00f6\u00f7\5\64\33\2\u00f7\u00f8\7\64"+
		"\2\2\u00f8\u010e\3\2\2\2\u00f9\u00fa\7\63\2\2\u00fa\u010e\7\64\2\2\u00fb"+
		"\u00fc\5\64\33\2\u00fc\u00fe\7\24\2\2\u00fd\u00ff\5<\37\2\u00fe\u00fd"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\25\2\2"+
		"\u0101\u010b\7\64\2\2\u0102\u0103\7\b\2\2\u0103\u0107\7\26\2\2\u0104\u0106"+
		"\5*\26\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7\27"+
		"\2\2\u010b\u0102\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u00f6\3\2\2\2\u010d\u00f9\3\2\2\2\u010d\u00fb\3\2\2\2\u010e\31\3\2\2"+
		"\2\u010f\u0110\7\64\2\2\u0110\u0111\7\35\2\2\u0111\u0112\7\64\2\2\u0112"+
		"\u0116\7\30\2\2\u0113\u0115\5*\26\2\u0114\u0113\3\2\2\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011a\7\31\2\2\u011a\33\3\2\2\2\u011b\u011c\7\64"+
		"\2\2\u011c\u0120\7\30\2\2\u011d\u011f\5*\26\2\u011e\u011d\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\31\2\2\u0124\35\3\2\2\2\u0125\u0126"+
		"\5\64\33\2\u0126\u0127\7\64\2\2\u0127\u0128\7\b\2\2\u0128\u0129\5\66\34"+
		"\2\u0129\u0130\3\2\2\2\u012a\u012b\5\64\33\2\u012b\u012c\7\64\2\2\u012c"+
		"\u012d\7\b\2\2\u012d\u012e\5\n\6\2\u012e\u0130\3\2\2\2\u012f\u0125\3\2"+
		"\2\2\u012f\u012a\3\2\2\2\u0130\37\3\2\2\2\u0131\u0132\7\64\2\2\u0132\u0133"+
		"\7\b\2\2\u0133\u0138\5\66\34\2\u0134\u0135\7\64\2\2\u0135\u0136\7\b\2"+
		"\2\u0136\u0138\5\20\t\2\u0137\u0131\3\2\2\2\u0137\u0134\3\2\2\2\u0138"+
		"!\3\2\2\2\u0139\u013f\5:\36\2\u013a\u013b\5,\27\2\u013b\u013c\5:\36\2"+
		"\u013c\u013e\3\2\2\2\u013d\u013a\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140#\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0148\5:\36\2\u0143\u0144\5.\30\2\u0144\u0145\5\"\22\2\u0145\u0147\3"+
		"\2\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014d\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\5:"+
		"\36\2\u014c\u0142\3\2\2\2\u014c\u014b\3\2\2\2\u014d%\3\2\2\2\u014e\u0151"+
		"\5\22\n\2\u014f\u0151\5\32\16\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2"+
		"\2\u0151\'\3\2\2\2\u0152\u0153\5 \21\2\u0153\u0154\7\33\2\2\u0154\u0155"+
		"\5(\25\2\u0155\u0158\3\2\2\2\u0156\u0158\5 \21\2\u0157\u0152\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158)\3\2\2\2\u0159\u015a\5\66\34\2\u015a\u015b\7\33\2"+
		"\2\u015b\u015c\5*\26\2\u015c\u015f\3\2\2\2\u015d\u015f\5\66\34\2\u015e"+
		"\u0159\3\2\2\2\u015e\u015d\3\2\2\2\u015f+\3\2\2\2\u0160\u0161\t\2\2\2"+
		"\u0161-\3\2\2\2\u0162\u0163\t\3\2\2\u0163/\3\2\2\2\u0164\u0165\t\4\2\2"+
		"\u0165\61\3\2\2\2\u0166\u0167\t\5\2\2\u0167\63\3\2\2\2\u0168\u0169\t\6"+
		"\2\2\u0169\65\3\2\2\2\u016a\u016f\5:\36\2\u016b\u016f\7\67\2\2\u016c\u016f"+
		"\58\35\2\u016d\u016f\5@!\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\67\3\2\2\2\u0170\u0171\t\7\2"+
		"\2\u01719\3\2\2\2\u0172\u017b\5<\37\2\u0173\u017b\5> \2\u0174\u0175\7"+
		"\64\2\2\u0175\u0176\7\24\2\2\u0176\u0177\5\66\34\2\u0177\u0178\7\25\2"+
		"\2\u0178\u017b\3\2\2\2\u0179\u017b\7\64\2\2\u017a\u0172\3\2\2\2\u017a"+
		"\u0173\3\2\2\2\u017a\u0174\3\2\2\2\u017a\u0179\3\2\2\2\u017b;\3\2\2\2"+
		"\u017c\u017d\7\65\2\2\u017d=\3\2\2\2\u017e\u017f\7\65\2\2\u017f\u0180"+
		"\13\2\2\2\u0180\u0184\7\66\2\2\u0181\u0182\13\2\2\2\u0182\u0184\7\66\2"+
		"\2\u0183\u017e\3\2\2\2\u0183\u0181\3\2\2\2\u0184?\3\2\2\2\u0185\u0186"+
		"\t\b\2\2\u0186A\3\2\2\2)EMU]hp~\u0082\u008b\u009a\u009e\u00a4\u00a7\u00ac"+
		"\u00b4\u00bf\u00c6\u00d2\u00dc\u00e0\u00e6\u00f1\u00fe\u0107\u010b\u010d"+
		"\u0116\u0120\u012f\u0137\u013f\u0148\u014c\u0150\u0157\u015e\u016e\u017a"+
		"\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}