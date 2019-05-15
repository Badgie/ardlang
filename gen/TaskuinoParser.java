// Generated from /home/badgy/Desktop/ardlang/Taskuino.g4 by ANTLR 4.7.2
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
		IDENT=49, DIG=50, DECDIG=51, STRING=52;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_block_stmts = 2, RULE_task = 3, RULE_function = 4, 
		RULE_stmt = 5, RULE_expr = 6, RULE_dcl = 7, RULE_assign = 8, RULE_calc_expr = 9, 
		RULE_bool_expr = 10, RULE_if_stmt = 11, RULE_eif_stmt = 12, RULE_for_stmt = 13, 
		RULE_func_call = 14, RULE_calc_expr_one = 15, RULE_calc_expr_two = 16, 
		RULE_bool_condition = 17, RULE_param = 18, RULE_op_pres_one = 19, RULE_op_pres_two = 20, 
		RULE_bool_op = 21, RULE_mod_op = 22, RULE_type = 23, RULE_val = 24, RULE_bool = 25, 
		RULE_number = 26, RULE_ival = 27, RULE_fval = 28, RULE_literals = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block_stmts", "task", "function", "stmt", "expr", "dcl", 
			"assign", "calc_expr", "bool_expr", "if_stmt", "eif_stmt", "for_stmt", 
			"func_call", "calc_expr_one", "calc_expr_two", "bool_condition", "param", 
			"op_pres_one", "op_pres_two", "bool_op", "mod_op", "type", "val", "bool", 
			"number", "ival", "fval", "literals"
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
			"TYPE_BOOL", "WHITESPACE", "NEWLINE", "CAR_RETURN", "IDENT", "DIG", "DECDIG", 
			"STRING"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitProg(this);
		}
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << ASSIGN) | (1L << INCR) | (1L << DECR) | (1L << EQ) | (1L << GRT) | (1L << LESS) | (1L << GRT_EQ) | (1L << LESS_EQ) | (1L << OR) | (1L << XOR) | (1L << AND) | (1L << NOT) | (1L << ARRAY_START) | (1L << ARRAY_END) | (1L << BLOCK_START) | (1L << BLOCK_END) | (1L << PAREN_LEFT) | (1L << PAREN_RIGHT) | (1L << QUOTE) | (1L << PARAM_DELIM) | (1L << SEMICOLON) | (1L << DOT_OP) | (1L << RETURN) | (1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << FUNC) | (1L << TASK) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << NULL) | (1L << OUTPUT) | (1L << INPUT) | (1L << HIGH) | (1L << LOW) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << TYPE_DOUBLE) | (1L << TYPE_BOOL) | (1L << WHITESPACE) | (1L << NEWLINE) | (1L << CAR_RETURN) | (1L << IDENT) | (1L << DIG) | (1L << DECDIG) | (1L << STRING))) != 0)) {
				{
				{
				setState(60);
				stmts();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
		public Block_stmtsContext block_stmts() {
			return getRuleContext(Block_stmtsContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitStmts(this);
		}
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				task();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				block_stmts();
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

	public static class Block_stmtsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public Block_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterBlock_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitBlock_stmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitBlock_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_stmtsContext block_stmts() throws RecognitionException {
		Block_stmtsContext _localctx = new Block_stmtsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block_stmts);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				dcl();
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
		public IvalContext ival() {
			return getRuleContext(IvalContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public List<Block_stmtsContext> block_stmts() {
			return getRuleContexts(Block_stmtsContext.class);
		}
		public Block_stmtsContext block_stmts(int i) {
			return getRuleContext(Block_stmtsContext.class,i);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitTask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitTask(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_task);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(TASK);
			setState(79);
			match(IDENT);
			setState(80);
			match(PAREN_LEFT);
			setState(81);
			ival();
			setState(82);
			match(PAREN_RIGHT);
			setState(83);
			match(BLOCK_START);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					block_stmts();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(90);
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
		public List<Block_stmtsContext> block_stmts() {
			return getRuleContexts(Block_stmtsContext.class);
		}
		public Block_stmtsContext block_stmts(int i) {
			return getRuleContext(Block_stmtsContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(FUNC);
			setState(93);
			match(IDENT);
			setState(94);
			match(PAREN_LEFT);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					param();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(101);
			match(PAREN_RIGHT);
			setState(102);
			match(BLOCK_START);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					block_stmts();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(109);
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
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				if_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				for_stmt();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				func_call();
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

	public static class ExprContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Calc_exprContext calc_expr() {
			return getRuleContext(Calc_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				bool_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				calc_expr();
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

	public static class DclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(TaskuinoParser.ASSIGN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Calc_exprContext calc_expr() {
			return getRuleContext(Calc_exprContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode ARRAY_START() { return getToken(TaskuinoParser.ARRAY_START, 0); }
		public TerminalNode ARRAY_END() { return getToken(TaskuinoParser.ARRAY_END, 0); }
		public IvalContext ival() {
			return getRuleContext(IvalContext.class,0);
		}
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dcl);
		int _la;
		try {
			int _alt;
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				type();
				setState(122);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				type();
				setState(125);
				match(IDENT);
				setState(126);
				match(ASSIGN);
				setState(127);
				val();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				type();
				setState(130);
				match(IDENT);
				setState(131);
				match(ASSIGN);
				setState(132);
				calc_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				type();
				setState(135);
				match(IDENT);
				setState(136);
				match(ASSIGN);
				setState(137);
				func_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				type();
				setState(140);
				match(ARRAY_START);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIG) {
					{
					setState(141);
					ival();
					}
				}

				setState(144);
				match(ARRAY_END);
				setState(145);
				match(IDENT);
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(146);
					match(ASSIGN);
					setState(147);
					match(BLOCK_START);
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(148);
							param();
							}
							} 
						}
						setState(153);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					setState(154);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(TaskuinoParser.ASSIGN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Calc_exprContext calc_expr() {
			return getRuleContext(Calc_exprContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(IDENT);
				setState(160);
				match(ASSIGN);
				setState(161);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(IDENT);
				setState(163);
				match(ASSIGN);
				setState(164);
				calc_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(IDENT);
				setState(166);
				match(ASSIGN);
				setState(167);
				func_call();
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

	public static class Calc_exprContext extends ParserRuleContext {
		public Calc_expr_oneContext calc_expr_one() {
			return getRuleContext(Calc_expr_oneContext.class,0);
		}
		public Calc_expr_twoContext calc_expr_two() {
			return getRuleContext(Calc_expr_twoContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Mod_opContext mod_op() {
			return getRuleContext(Mod_opContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public Op_pres_twoContext op_pres_two() {
			return getRuleContext(Op_pres_twoContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TaskuinoParser.ASSIGN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Calc_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterCalc_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitCalc_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitCalc_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calc_exprContext calc_expr() throws RecognitionException {
		Calc_exprContext _localctx = new Calc_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_calc_expr);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				calc_expr_one();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				calc_expr_two();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				number();
				setState(173);
				mod_op();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(IDENT);
				setState(176);
				op_pres_two();
				setState(177);
				match(ASSIGN);
				setState(178);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
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
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(183);
					match(PAREN_LEFT);
					}
					break;
				}
				setState(186);
				val();
				setState(187);
				bool_op();
				setState(188);
				val();
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(189);
					match(PAREN_RIGHT);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(192);
					match(NOT);
					}
				}

				setState(195);
				bool();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(198);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(199);
					bool_op();
					setState(200);
					bool_expr(4);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public Bool_conditionContext bool_condition() {
			return getRuleContext(Bool_conditionContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public List<Block_stmtsContext> block_stmts() {
			return getRuleContexts(Block_stmtsContext.class);
		}
		public Block_stmtsContext block_stmts(int i) {
			return getRuleContext(Block_stmtsContext.class,i);
		}
		public Eif_stmtContext eif_stmt() {
			return getRuleContext(Eif_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IF);
			setState(208);
			match(PAREN_LEFT);
			setState(209);
			bool_condition();
			setState(210);
			match(PAREN_RIGHT);
			setState(211);
			match(BLOCK_START);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					block_stmts();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(218);
			match(BLOCK_END);
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(219);
				eif_stmt();
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

	public static class Eif_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TaskuinoParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(TaskuinoParser.IF, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public Bool_conditionContext bool_condition() {
			return getRuleContext(Bool_conditionContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public List<Block_stmtsContext> block_stmts() {
			return getRuleContexts(Block_stmtsContext.class);
		}
		public Block_stmtsContext block_stmts(int i) {
			return getRuleContext(Block_stmtsContext.class,i);
		}
		public List<Eif_stmtContext> eif_stmt() {
			return getRuleContexts(Eif_stmtContext.class);
		}
		public Eif_stmtContext eif_stmt(int i) {
			return getRuleContext(Eif_stmtContext.class,i);
		}
		public Eif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eif_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterEif_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitEif_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitEif_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eif_stmtContext eif_stmt() throws RecognitionException {
		Eif_stmtContext _localctx = new Eif_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eif_stmt);
		try {
			int _alt;
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(ELSE);
				setState(223);
				match(IF);
				setState(224);
				match(PAREN_LEFT);
				setState(225);
				bool_condition();
				setState(226);
				match(PAREN_RIGHT);
				setState(227);
				match(BLOCK_START);
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(228);
						block_stmts();
						}
						} 
					}
					setState(233);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(234);
				match(BLOCK_END);
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235);
						eif_stmt();
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(ELSE);
				setState(242);
				match(BLOCK_START);
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(243);
						block_stmts();
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(249);
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
		public Bool_conditionContext bool_condition() {
			return getRuleContext(Bool_conditionContext.class,0);
		}
		public Calc_exprContext calc_expr() {
			return getRuleContext(Calc_exprContext.class,0);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public TerminalNode BLOCK_START() { return getToken(TaskuinoParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public List<Block_stmtsContext> block_stmts() {
			return getRuleContexts(Block_stmtsContext.class);
		}
		public Block_stmtsContext block_stmts(int i) {
			return getRuleContext(Block_stmtsContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(FOR);
			setState(253);
			match(PAREN_LEFT);
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(254);
				number();
				}
				break;
			case 2:
				{
				setState(255);
				dcl();
				}
				break;
			}
			setState(258);
			match(SEMICOLON);
			setState(259);
			bool_condition();
			setState(260);
			match(SEMICOLON);
			setState(261);
			calc_expr();
			setState(262);
			match(PAREN_RIGHT);
			setState(263);
			match(BLOCK_START);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					block_stmts();
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(270);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(IDENT);
			setState(273);
			match(PAREN_LEFT);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					param();
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(280);
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

	public static class Calc_expr_oneContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<Op_pres_oneContext> op_pres_one() {
			return getRuleContexts(Op_pres_oneContext.class);
		}
		public Op_pres_oneContext op_pres_one(int i) {
			return getRuleContext(Op_pres_oneContext.class,i);
		}
		public Calc_expr_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_expr_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterCalc_expr_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitCalc_expr_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitCalc_expr_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calc_expr_oneContext calc_expr_one() throws RecognitionException {
		Calc_expr_oneContext _localctx = new Calc_expr_oneContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_calc_expr_one);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			number();
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					op_pres_one();
					setState(284);
					number();
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Calc_expr_twoContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<Op_pres_twoContext> op_pres_two() {
			return getRuleContexts(Op_pres_twoContext.class);
		}
		public Op_pres_twoContext op_pres_two(int i) {
			return getRuleContext(Op_pres_twoContext.class,i);
		}
		public List<Calc_expr_oneContext> calc_expr_one() {
			return getRuleContexts(Calc_expr_oneContext.class);
		}
		public Calc_expr_oneContext calc_expr_one(int i) {
			return getRuleContext(Calc_expr_oneContext.class,i);
		}
		public Calc_expr_twoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_expr_two; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterCalc_expr_two(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitCalc_expr_two(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitCalc_expr_two(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calc_expr_twoContext calc_expr_two() throws RecognitionException {
		Calc_expr_twoContext _localctx = new Calc_expr_twoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_calc_expr_two);
		try {
			int _alt;
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				number();
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(292);
						op_pres_two();
						setState(293);
						calc_expr_one();
						}
						} 
					}
					setState(299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				number();
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

	public static class Bool_conditionContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Bool_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterBool_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitBool_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitBool_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_conditionContext bool_condition() throws RecognitionException {
		Bool_conditionContext _localctx = new Bool_conditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_condition);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				bool_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				func_call();
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
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_param);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				val();
				setState(308);
				match(PARAM_DELIM);
				setState(309);
				param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
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

	public static class Op_pres_oneContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(TaskuinoParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(TaskuinoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TaskuinoParser.MOD, 0); }
		public Op_pres_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_pres_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterOp_pres_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitOp_pres_one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitOp_pres_one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_pres_oneContext op_pres_one() throws RecognitionException {
		Op_pres_oneContext _localctx = new Op_pres_oneContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op_pres_one);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterOp_pres_two(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitOp_pres_two(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitOp_pres_two(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_pres_twoContext op_pres_two() throws RecognitionException {
		Op_pres_twoContext _localctx = new Op_pres_twoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_op_pres_two);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		public TerminalNode XOR() { return getToken(TaskuinoParser.XOR, 0); }
		public TerminalNode AND() { return getToken(TaskuinoParser.AND, 0); }
		public Bool_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterBool_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitBool_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitBool_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_opContext bool_op() throws RecognitionException {
		Bool_opContext _localctx = new Bool_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GRT) | (1L << LESS) | (1L << GRT_EQ) | (1L << LESS_EQ) | (1L << OR) | (1L << XOR) | (1L << AND))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterMod_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitMod_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitMod_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_opContext mod_op() throws RecognitionException {
		Mod_opContext _localctx = new Mod_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mod_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << TYPE_DOUBLE) | (1L << TYPE_BOOL))) != 0)) ) {
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TaskuinoParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_val);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				literals();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				func_call();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
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

	public static class NumberContext extends ParserRuleContext {
		public IvalContext ival() {
			return getRuleContext(IvalContext.class,0);
		}
		public FvalContext fval() {
			return getRuleContext(FvalContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TaskuinoParser.IDENT, 0); }
		public TerminalNode ARRAY_START() { return getToken(TaskuinoParser.ARRAY_START, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ARRAY_END() { return getToken(TaskuinoParser.ARRAY_END, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_number);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				ival();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				fval();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(IDENT);
				setState(337);
				match(ARRAY_START);
				setState(338);
				number();
				setState(339);
				match(ARRAY_END);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterIval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitIval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitIval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IvalContext ival() throws RecognitionException {
		IvalContext _localctx = new IvalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ival);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterFval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitFval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitFval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FvalContext fval() throws RecognitionException {
		FvalContext _localctx = new FvalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fval);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(DIG);
				setState(346);
				matchWildcard();
				setState(347);
				match(DECDIG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				matchWildcard();
				setState(349);
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

	public static class LiteralsContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(TaskuinoParser.OUTPUT, 0); }
		public TerminalNode INPUT() { return getToken(TaskuinoParser.INPUT, 0); }
		public TerminalNode HIGH() { return getToken(TaskuinoParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(TaskuinoParser.LOW, 0); }
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		case 10:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0165\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\5\4O\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\7\6c\n\6\f\6\16\6f\13\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6"+
		"\3\6\3\7\3\7\3\7\5\7u\n\7\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0091"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b\13\t\3\t\5\t\u009e"+
		"\n\t\5\t\u00a0\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ab\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b7\n\13\3\f\3"+
		"\f\5\f\u00bb\n\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3\f\5\f\u00c4\n\f\3\f\5"+
		"\f\u00c7\n\f\3\f\3\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00d8\n\r\f\r\16\r\u00db\13\r\3\r\3\r\5\r\u00df\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e8\n\16\f\16\16\16\u00eb"+
		"\13\16\3\16\3\16\7\16\u00ef\n\16\f\16\16\16\u00f2\13\16\3\16\3\16\3\16"+
		"\7\16\u00f7\n\16\f\16\16\16\u00fa\13\16\3\16\5\16\u00fd\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u0103\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u010c"+
		"\n\17\f\17\16\17\u010f\13\17\3\17\3\17\3\20\3\20\3\20\7\20\u0116\n\20"+
		"\f\20\16\20\u0119\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0121\n\21"+
		"\f\21\16\21\u0124\13\21\3\22\3\22\3\22\3\22\7\22\u012a\n\22\f\22\16\22"+
		"\u012d\13\22\3\22\5\22\u0130\n\22\3\23\3\23\5\23\u0134\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u013b\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u014c\n\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0158\n\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0161\n\36\3\37\3\37\3\37\2\3\26 \2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\t\3\2\5\7\3\2\3\4\3\2\13"+
		"\22\3\2\t\n\3\2,/\4\2$%\63\63\3\2(+\2\u0179\2A\3\2\2\2\4I\3\2\2\2\6N\3"+
		"\2\2\2\bP\3\2\2\2\n^\3\2\2\2\ft\3\2\2\2\16y\3\2\2\2\20\u009f\3\2\2\2\22"+
		"\u00aa\3\2\2\2\24\u00b6\3\2\2\2\26\u00c6\3\2\2\2\30\u00d1\3\2\2\2\32\u00fc"+
		"\3\2\2\2\34\u00fe\3\2\2\2\36\u0112\3\2\2\2 \u011c\3\2\2\2\"\u012f\3\2"+
		"\2\2$\u0133\3\2\2\2&\u013a\3\2\2\2(\u013c\3\2\2\2*\u013e\3\2\2\2,\u0140"+
		"\3\2\2\2.\u0142\3\2\2\2\60\u0144\3\2\2\2\62\u014b\3\2\2\2\64\u014d\3\2"+
		"\2\2\66\u0157\3\2\2\28\u0159\3\2\2\2:\u0160\3\2\2\2<\u0162\3\2\2\2>@\5"+
		"\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7"+
		"\2\2\3E\3\3\2\2\2FJ\5\b\5\2GJ\5\n\6\2HJ\5\6\4\2IF\3\2\2\2IG\3\2\2\2IH"+
		"\3\2\2\2J\5\3\2\2\2KO\5\f\7\2LO\5\16\b\2MO\5\20\t\2NK\3\2\2\2NL\3\2\2"+
		"\2NM\3\2\2\2O\7\3\2\2\2PQ\7#\2\2QR\7\63\2\2RS\7\30\2\2ST\58\35\2TU\7\31"+
		"\2\2UY\7\26\2\2VX\5\6\4\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3"+
		"\2\2\2[Y\3\2\2\2\\]\7\27\2\2]\t\3\2\2\2^_\7\"\2\2_`\7\63\2\2`d\7\30\2"+
		"\2ac\5&\24\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2"+
		"\2gh\7\31\2\2hl\7\26\2\2ik\5\6\4\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2mo\3\2\2\2nl\3\2\2\2op\7\27\2\2p\13\3\2\2\2qu\5\30\r\2ru\5\34\17\2"+
		"su\5\36\20\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\r\3\2\2\2vz\5\22\n\2wz\5\26"+
		"\f\2xz\5\24\13\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\17\3\2\2\2{|\5\60\31\2"+
		"|}\7\63\2\2}\u00a0\3\2\2\2~\177\5\60\31\2\177\u0080\7\63\2\2\u0080\u0081"+
		"\7\b\2\2\u0081\u0082\5\62\32\2\u0082\u00a0\3\2\2\2\u0083\u0084\5\60\31"+
		"\2\u0084\u0085\7\63\2\2\u0085\u0086\7\b\2\2\u0086\u0087\5\24\13\2\u0087"+
		"\u00a0\3\2\2\2\u0088\u0089\5\60\31\2\u0089\u008a\7\63\2\2\u008a\u008b"+
		"\7\b\2\2\u008b\u008c\5\36\20\2\u008c\u00a0\3\2\2\2\u008d\u008e\5\60\31"+
		"\2\u008e\u0090\7\24\2\2\u008f\u0091\58\35\2\u0090\u008f\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\25\2\2\u0093\u009d\7"+
		"\63\2\2\u0094\u0095\7\b\2\2\u0095\u0099\7\26\2\2\u0096\u0098\5&\24\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7\27\2\2\u009d"+
		"\u0094\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f{\3\2\2\2"+
		"\u009f~\3\2\2\2\u009f\u0083\3\2\2\2\u009f\u0088\3\2\2\2\u009f\u008d\3"+
		"\2\2\2\u00a0\21\3\2\2\2\u00a1\u00a2\7\63\2\2\u00a2\u00a3\7\b\2\2\u00a3"+
		"\u00ab\5\62\32\2\u00a4\u00a5\7\63\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00ab"+
		"\5\24\13\2\u00a7\u00a8\7\63\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00ab\5\36\20"+
		"\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\23"+
		"\3\2\2\2\u00ac\u00b7\5 \21\2\u00ad\u00b7\5\"\22\2\u00ae\u00af\5\66\34"+
		"\2\u00af\u00b0\5.\30\2\u00b0\u00b7\3\2\2\2\u00b1\u00b2\7\63\2\2\u00b2"+
		"\u00b3\5*\26\2\u00b3\u00b4\7\b\2\2\u00b4\u00b5\5\62\32\2\u00b5\u00b7\3"+
		"\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6"+
		"\u00b1\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00ba\b\f\1\2\u00b9\u00bb\7\30\2"+
		"\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\5\62\32\2\u00bd\u00be\5,\27\2\u00be\u00c0\5\62\32\2\u00bf\u00c1\7\31"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c7\3\2\2\2\u00c2"+
		"\u00c4\7\23\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c7\5\64\33\2\u00c6\u00b8\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7"+
		"\u00ce\3\2\2\2\u00c8\u00c9\f\5\2\2\u00c9\u00ca\5,\27\2\u00ca\u00cb\5\26"+
		"\f\6\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00ce\3\2\2"+
		"\2\u00d1\u00d2\7 \2\2\u00d2\u00d3\7\30\2\2\u00d3\u00d4\5$\23\2\u00d4\u00d5"+
		"\7\31\2\2\u00d5\u00d9\7\26\2\2\u00d6\u00d8\5\6\4\2\u00d7\u00d6\3\2\2\2"+
		"\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\7\27\2\2\u00dd\u00df\5\32\16"+
		"\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00e1"+
		"\7!\2\2\u00e1\u00e2\7 \2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4\5$\23\2\u00e4"+
		"\u00e5\7\31\2\2\u00e5\u00e9\7\26\2\2\u00e6\u00e8\5\6\4\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\7\27\2\2\u00ed\u00ef\5"+
		"\32\16\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00fd\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7!"+
		"\2\2\u00f4\u00f8\7\26\2\2\u00f5\u00f7\5\6\4\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\27\2\2\u00fc\u00e0\3\2\2\2\u00fc"+
		"\u00f3\3\2\2\2\u00fd\33\3\2\2\2\u00fe\u00ff\7\37\2\2\u00ff\u0102\7\30"+
		"\2\2\u0100\u0103\5\66\34\2\u0101\u0103\5\20\t\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\34\2\2\u0105\u0106\5"+
		"$\23\2\u0106\u0107\7\34\2\2\u0107\u0108\5\24\13\2\u0108\u0109\7\31\2\2"+
		"\u0109\u010d\7\26\2\2\u010a\u010c\5\6\4\2\u010b\u010a\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\7\27\2\2\u0111\35\3\2\2\2\u0112\u0113\7\63"+
		"\2\2\u0113\u0117\7\30\2\2\u0114\u0116\5&\24\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\31\2\2\u011b\37\3\2\2\2\u011c\u0122"+
		"\5\66\34\2\u011d\u011e\5(\25\2\u011e\u011f\5\66\34\2\u011f\u0121\3\2\2"+
		"\2\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123!\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u012b\5\66\34\2\u0126"+
		"\u0127\5*\26\2\u0127\u0128\5 \21\2\u0128\u012a\3\2\2\2\u0129\u0126\3\2"+
		"\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u0130\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\5\66\34\2\u012f\u0125\3"+
		"\2\2\2\u012f\u012e\3\2\2\2\u0130#\3\2\2\2\u0131\u0134\5\26\f\2\u0132\u0134"+
		"\5\36\20\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134%\3\2\2\2\u0135"+
		"\u0136\5\62\32\2\u0136\u0137\7\33\2\2\u0137\u0138\5&\24\2\u0138\u013b"+
		"\3\2\2\2\u0139\u013b\5\62\32\2\u013a\u0135\3\2\2\2\u013a\u0139\3\2\2\2"+
		"\u013b\'\3\2\2\2\u013c\u013d\t\2\2\2\u013d)\3\2\2\2\u013e\u013f\t\3\2"+
		"\2\u013f+\3\2\2\2\u0140\u0141\t\4\2\2\u0141-\3\2\2\2\u0142\u0143\t\5\2"+
		"\2\u0143/\3\2\2\2\u0144\u0145\t\6\2\2\u0145\61\3\2\2\2\u0146\u014c\5\66"+
		"\34\2\u0147\u014c\7\66\2\2\u0148\u014c\5\64\33\2\u0149\u014c\5<\37\2\u014a"+
		"\u014c\5\36\20\2\u014b\u0146\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3"+
		"\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\63\3\2\2\2\u014d"+
		"\u014e\t\7\2\2\u014e\65\3\2\2\2\u014f\u0158\58\35\2\u0150\u0158\5:\36"+
		"\2\u0151\u0158\7\63\2\2\u0152\u0153\7\63\2\2\u0153\u0154\7\24\2\2\u0154"+
		"\u0155\5\66\34\2\u0155\u0156\7\25\2\2\u0156\u0158\3\2\2\2\u0157\u014f"+
		"\3\2\2\2\u0157\u0150\3\2\2\2\u0157\u0151\3\2\2\2\u0157\u0152\3\2\2\2\u0158"+
		"\67\3\2\2\2\u0159\u015a\7\64\2\2\u015a9\3\2\2\2\u015b\u015c\7\64\2\2\u015c"+
		"\u015d\13\2\2\2\u015d\u0161\7\65\2\2\u015e\u015f\13\2\2\2\u015f\u0161"+
		"\7\65\2\2\u0160\u015b\3\2\2\2\u0160\u015e\3\2\2\2\u0161;\3\2\2\2\u0162"+
		"\u0163\t\b\2\2\u0163=\3\2\2\2&AINYdlty\u0090\u0099\u009d\u009f\u00aa\u00b6"+
		"\u00ba\u00c0\u00c3\u00c6\u00ce\u00d9\u00de\u00e9\u00f0\u00f8\u00fc\u0102"+
		"\u010d\u0117\u0122\u012b\u012f\u0133\u013a\u014b\u0157\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}