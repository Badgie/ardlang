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
		RULE_calc_expr_three = 17, RULE_bool_condition = 18, RULE_param = 19, 
		RULE_op_pres_one = 20, RULE_op_pres_two = 21, RULE_bool_op = 22, RULE_mod_op = 23, 
		RULE_type = 24, RULE_val = 25, RULE_bool = 26, RULE_number = 27, RULE_ival = 28, 
		RULE_fval = 29, RULE_literals = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block_stmts", "task", "function", "stmt", "expr", "dcl", 
			"assign", "calc_expr", "bool_expr", "if_stmt", "eif_stmt", "for_stmt", 
			"func_call", "calc_expr_one", "calc_expr_two", "calc_expr_three", "bool_condition", 
			"param", "op_pres_one", "op_pres_two", "bool_op", "mod_op", "type", "val", 
			"bool", "number", "ival", "fval", "literals"
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << ASSIGN) | (1L << INCR) | (1L << DECR) | (1L << EQ) | (1L << GRT) | (1L << LESS) | (1L << GRT_EQ) | (1L << LESS_EQ) | (1L << OR) | (1L << XOR) | (1L << AND) | (1L << NOT) | (1L << ARRAY_START) | (1L << ARRAY_END) | (1L << BLOCK_START) | (1L << BLOCK_END) | (1L << PAREN_LEFT) | (1L << PAREN_RIGHT) | (1L << QUOTE) | (1L << PARAM_DELIM) | (1L << SEMICOLON) | (1L << DOT_OP) | (1L << RETURN) | (1L << FOR) | (1L << IF) | (1L << ELSE) | (1L << FUNC) | (1L << TASK) | (1L << TRUE) | (1L << FALSE) | (1L << VOID) | (1L << NULL) | (1L << OUTPUT) | (1L << INPUT) | (1L << HIGH) | (1L << LOW) | (1L << TYPE_INT) | (1L << TYPE_STRING) | (1L << TYPE_DOUBLE) | (1L << TYPE_BOOL) | (1L << WHITESPACE) | (1L << NEWLINE) | (1L << CAR_RETURN) | (1L << IDENT) | (1L << DIG) | (1L << DECDIG) | (1L << STRING))) != 0)) {
				{
				{
				setState(62);
				stmts();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				task();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
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
			setState(80);
			match(TASK);
			setState(81);
			match(IDENT);
			setState(82);
			match(PAREN_LEFT);
			setState(83);
			ival();
			setState(84);
			match(PAREN_RIGHT);
			setState(85);
			match(BLOCK_START);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					block_stmts();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(92);
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
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
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
			setState(94);
			match(FUNC);
			setState(95);
			match(IDENT);
			setState(96);
			match(PAREN_LEFT);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(97);
				param();
				}
				break;
			}
			setState(100);
			match(PAREN_RIGHT);
			setState(101);
			match(BLOCK_START);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					block_stmts();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(108);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				if_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				for_stmt();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				bool_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
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
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(TaskuinoParser.BLOCK_END, 0); }
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				type();
				setState(121);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				type();
				setState(124);
				match(IDENT);
				setState(125);
				match(ASSIGN);
				setState(126);
				val();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				type();
				setState(129);
				match(IDENT);
				setState(130);
				match(ASSIGN);
				setState(131);
				calc_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				type();
				setState(134);
				match(IDENT);
				setState(135);
				match(ASSIGN);
				setState(136);
				func_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				type();
				setState(139);
				match(ARRAY_START);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIG) {
					{
					setState(140);
					ival();
					}
				}

				setState(143);
				match(ARRAY_END);
				setState(144);
				match(IDENT);
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(145);
					match(ASSIGN);
					setState(146);
					match(BLOCK_START);
					setState(147);
					param();
					setState(148);
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(IDENT);
				setState(155);
				match(ASSIGN);
				setState(156);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(IDENT);
				setState(158);
				match(ASSIGN);
				setState(159);
				calc_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(IDENT);
				setState(161);
				match(ASSIGN);
				setState(162);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				calc_expr_one();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				calc_expr_two();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				number();
				setState(168);
				mod_op();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(IDENT);
				setState(171);
				op_pres_two();
				setState(172);
				match(ASSIGN);
				setState(173);
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

	public static class Bool_exprContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Bool_opContext bool_op() {
			return getRuleContext(Bool_opContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode PAREN_LEFT() { return getToken(TaskuinoParser.PAREN_LEFT, 0); }
		public TerminalNode PAREN_RIGHT() { return getToken(TaskuinoParser.PAREN_RIGHT, 0); }
		public TerminalNode NOT() { return getToken(TaskuinoParser.NOT, 0); }
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
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool_expr);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				bool();
				setState(178);
				bool_op();
				setState(179);
				bool_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(181);
					match(PAREN_LEFT);
					}
					break;
				}
				setState(184);
				val();
				setState(185);
				bool_op();
				setState(186);
				val();
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(187);
					match(PAREN_RIGHT);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(190);
					match(NOT);
					}
				}

				setState(193);
				bool();
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
		public List<Eif_stmtContext> eif_stmt() {
			return getRuleContexts(Eif_stmtContext.class);
		}
		public Eif_stmtContext eif_stmt(int i) {
			return getRuleContext(Eif_stmtContext.class,i);
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
			setState(196);
			match(IF);
			setState(197);
			match(PAREN_LEFT);
			setState(198);
			bool_condition();
			setState(199);
			match(PAREN_RIGHT);
			setState(200);
			match(BLOCK_START);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					block_stmts();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(207);
			match(BLOCK_END);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					eif_stmt();
					}
					} 
				}
				setState(213);
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
		public Eif_stmtContext eif_stmt() {
			return getRuleContext(Eif_stmtContext.class,0);
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ELSE);
				setState(215);
				match(IF);
				setState(216);
				match(PAREN_LEFT);
				setState(217);
				bool_condition();
				setState(218);
				match(PAREN_RIGHT);
				setState(219);
				match(BLOCK_START);
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(220);
						block_stmts();
						}
						} 
					}
					setState(225);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(226);
				match(BLOCK_END);
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(227);
					eif_stmt();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(ELSE);
				setState(231);
				match(BLOCK_START);
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(232);
						block_stmts();
						}
						} 
					}
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(238);
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
			setState(241);
			match(FOR);
			setState(242);
			match(PAREN_LEFT);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(243);
				number();
				}
				break;
			case 2:
				{
				setState(244);
				dcl();
				}
				break;
			}
			setState(247);
			match(SEMICOLON);
			setState(248);
			bool_condition();
			setState(249);
			match(SEMICOLON);
			setState(250);
			calc_expr();
			setState(251);
			match(PAREN_RIGHT);
			setState(252);
			match(BLOCK_START);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					block_stmts();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(259);
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
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IDENT);
			setState(262);
			match(PAREN_LEFT);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(263);
				param();
				}
				break;
			}
			setState(266);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Op_pres_oneContext op_pres_one() {
			return getRuleContext(Op_pres_oneContext.class,0);
		}
		public Calc_expr_threeContext calc_expr_three() {
			return getRuleContext(Calc_expr_threeContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			number();
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(269);
				op_pres_one();
				setState(270);
				calc_expr_three();
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

	public static class Calc_expr_twoContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Op_pres_twoContext op_pres_two() {
			return getRuleContext(Op_pres_twoContext.class,0);
		}
		public Calc_expr_oneContext calc_expr_one() {
			return getRuleContext(Calc_expr_oneContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			number();
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(275);
				op_pres_two();
				setState(276);
				calc_expr_one();
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

	public static class Calc_expr_threeContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Calc_expr_twoContext calc_expr_two() {
			return getRuleContext(Calc_expr_twoContext.class,0);
		}
		public Calc_expr_threeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_expr_three; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).enterCalc_expr_three(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskuinoListener ) ((TaskuinoListener)listener).exitCalc_expr_three(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskuinoVisitor ) return ((TaskuinoVisitor<? extends T>)visitor).visitCalc_expr_three(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calc_expr_threeContext calc_expr_three() throws RecognitionException {
		Calc_expr_threeContext _localctx = new Calc_expr_threeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_calc_expr_three);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				calc_expr_two();
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
		enterRule(_localctx, 36, RULE_bool_condition);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				bool_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
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
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> PARAM_DELIM() { return getTokens(TaskuinoParser.PARAM_DELIM); }
		public TerminalNode PARAM_DELIM(int i) {
			return getToken(TaskuinoParser.PARAM_DELIM, i);
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
		enterRule(_localctx, 38, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			val();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM_DELIM) {
				{
				{
				setState(289);
				match(PARAM_DELIM);
				setState(290);
				val();
				}
				}
				setState(295);
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
		enterRule(_localctx, 40, RULE_op_pres_one);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		enterRule(_localctx, 42, RULE_op_pres_two);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		enterRule(_localctx, 44, RULE_bool_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		enterRule(_localctx, 46, RULE_mod_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 50, RULE_val);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				bool();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				literals();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
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
		enterRule(_localctx, 52, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		enterRule(_localctx, 54, RULE_number);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				ival();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				fval();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(IDENT);
				setState(319);
				match(ARRAY_START);
				setState(320);
				number();
				setState(321);
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
		enterRule(_localctx, 56, RULE_ival);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		enterRule(_localctx, 58, RULE_fval);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(DIG);
				setState(328);
				matchWildcard();
				setState(329);
				match(DECDIG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				matchWildcard();
				setState(331);
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
		public TerminalNode NULL() { return getToken(TaskuinoParser.NULL, 0); }
		public TerminalNode VOID() { return getToken(TaskuinoParser.VOID, 0); }
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
		enterRule(_localctx, 60, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << NULL) | (1L << OUTPUT) | (1L << INPUT) | (1L << HIGH) | (1L << LOW))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0153\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\5\4"+
		"Q\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6e\n\6\3\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6\3\7"+
		"\3\7\3\7\5\7t\n\7\3\b\3\b\3\b\5\by\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\5\t\u009b\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00a6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00b2\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00b9\n\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00bf\n\f\3\f\5\f\u00c2\n\f\3\f\5\f\u00c5\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\r\3\r\7\r\u00d4\n\r"+
		"\f\r\16\r\u00d7\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00e0\n\16"+
		"\f\16\16\16\u00e3\13\16\3\16\3\16\5\16\u00e7\n\16\3\16\3\16\3\16\7\16"+
		"\u00ec\n\16\f\16\16\16\u00ef\13\16\3\16\5\16\u00f2\n\16\3\17\3\17\3\17"+
		"\3\17\5\17\u00f8\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0101\n"+
		"\17\f\17\16\17\u0104\13\17\3\17\3\17\3\20\3\20\3\20\5\20\u010b\n\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\5\21\u0113\n\21\3\22\3\22\3\22\3\22\5\22"+
		"\u0119\n\22\3\23\3\23\5\23\u011d\n\23\3\24\3\24\5\24\u0121\n\24\3\25\3"+
		"\25\3\25\7\25\u0126\n\25\f\25\16\25\u0129\13\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u013a\n\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0146\n\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u014f\n\37\3 \3 \3 \2\2!\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\t\3\2\5\7\3\2"+
		"\3\4\3\2\13\22\3\2\t\n\3\2,/\4\2$%\63\63\3\2&+\2\u0165\2C\3\2\2\2\4K\3"+
		"\2\2\2\6P\3\2\2\2\bR\3\2\2\2\n`\3\2\2\2\fs\3\2\2\2\16x\3\2\2\2\20\u009a"+
		"\3\2\2\2\22\u00a5\3\2\2\2\24\u00b1\3\2\2\2\26\u00c4\3\2\2\2\30\u00c6\3"+
		"\2\2\2\32\u00f1\3\2\2\2\34\u00f3\3\2\2\2\36\u0107\3\2\2\2 \u010e\3\2\2"+
		"\2\"\u0114\3\2\2\2$\u011c\3\2\2\2&\u0120\3\2\2\2(\u0122\3\2\2\2*\u012a"+
		"\3\2\2\2,\u012c\3\2\2\2.\u012e\3\2\2\2\60\u0130\3\2\2\2\62\u0132\3\2\2"+
		"\2\64\u0139\3\2\2\2\66\u013b\3\2\2\28\u0145\3\2\2\2:\u0147\3\2\2\2<\u014e"+
		"\3\2\2\2>\u0150\3\2\2\2@B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2DF\3\2\2\2EC\3\2\2\2FG\7\2\2\3G\3\3\2\2\2HL\5\b\5\2IL\5\n\6\2JL\5"+
		"\6\4\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MQ\5\f\7\2NQ\5\16\b\2O"+
		"Q\5\20\t\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\7\3\2\2\2RS\7#\2\2ST\7\63\2"+
		"\2TU\7\30\2\2UV\5:\36\2VW\7\31\2\2W[\7\26\2\2XZ\5\6\4\2YX\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\27\2\2_\t\3\2\2\2"+
		"`a\7\"\2\2ab\7\63\2\2bd\7\30\2\2ce\5(\25\2dc\3\2\2\2de\3\2\2\2ef\3\2\2"+
		"\2fg\7\31\2\2gk\7\26\2\2hj\5\6\4\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2ln\3\2\2\2mk\3\2\2\2no\7\27\2\2o\13\3\2\2\2pt\5\30\r\2qt\5\34\17\2"+
		"rt\5\36\20\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\r\3\2\2\2uy\5\22\n\2vy\5\26"+
		"\f\2wy\5\24\13\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\17\3\2\2\2z{\5\62\32\2"+
		"{|\7\63\2\2|\u009b\3\2\2\2}~\5\62\32\2~\177\7\63\2\2\177\u0080\7\b\2\2"+
		"\u0080\u0081\5\64\33\2\u0081\u009b\3\2\2\2\u0082\u0083\5\62\32\2\u0083"+
		"\u0084\7\63\2\2\u0084\u0085\7\b\2\2\u0085\u0086\5\24\13\2\u0086\u009b"+
		"\3\2\2\2\u0087\u0088\5\62\32\2\u0088\u0089\7\63\2\2\u0089\u008a\7\b\2"+
		"\2\u008a\u008b\5\36\20\2\u008b\u009b\3\2\2\2\u008c\u008d\5\62\32\2\u008d"+
		"\u008f\7\24\2\2\u008e\u0090\5:\36\2\u008f\u008e\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\25\2\2\u0092\u0098\7\63\2\2\u0093"+
		"\u0094\7\b\2\2\u0094\u0095\7\26\2\2\u0095\u0096\5(\25\2\u0096\u0097\7"+
		"\27\2\2\u0097\u0099\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009az\3\2\2\2\u009a}\3\2\2\2\u009a\u0082\3\2\2\2\u009a"+
		"\u0087\3\2\2\2\u009a\u008c\3\2\2\2\u009b\21\3\2\2\2\u009c\u009d\7\63\2"+
		"\2\u009d\u009e\7\b\2\2\u009e\u00a6\5\64\33\2\u009f\u00a0\7\63\2\2\u00a0"+
		"\u00a1\7\b\2\2\u00a1\u00a6\5\24\13\2\u00a2\u00a3\7\63\2\2\u00a3\u00a4"+
		"\7\b\2\2\u00a4\u00a6\5\36\20\2\u00a5\u009c\3\2\2\2\u00a5\u009f\3\2\2\2"+
		"\u00a5\u00a2\3\2\2\2\u00a6\23\3\2\2\2\u00a7\u00b2\5 \21\2\u00a8\u00b2"+
		"\5\"\22\2\u00a9\u00aa\58\35\2\u00aa\u00ab\5\60\31\2\u00ab\u00b2\3\2\2"+
		"\2\u00ac\u00ad\7\63\2\2\u00ad\u00ae\5,\27\2\u00ae\u00af\7\b\2\2\u00af"+
		"\u00b0\58\35\2\u00b0\u00b2\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00a8\3\2"+
		"\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b4"+
		"\5\66\34\2\u00b4\u00b5\5.\30\2\u00b5\u00b6\5\26\f\2\u00b6\u00c5\3\2\2"+
		"\2\u00b7\u00b9\7\30\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\5\64\33\2\u00bb\u00bc\5.\30\2\u00bc\u00be\5"+
		"\64\33\2\u00bd\u00bf\7\31\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00c5\3\2\2\2\u00c0\u00c2\7\23\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\5\66\34\2\u00c4\u00b3\3\2\2\2"+
		"\u00c4\u00b8\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\27\3\2\2\2\u00c6\u00c7"+
		"\7 \2\2\u00c7\u00c8\7\30\2\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\7\31\2\2"+
		"\u00ca\u00ce\7\26\2\2\u00cb\u00cd\5\6\4\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d5\7\27\2\2\u00d2\u00d4\5\32\16\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\31\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7!\2\2\u00d9\u00da\7 \2\2"+
		"\u00da\u00db\7\30\2\2\u00db\u00dc\5&\24\2\u00dc\u00dd\7\31\2\2\u00dd\u00e1"+
		"\7\26\2\2\u00de\u00e0\5\6\4\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2"+
		"\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e6\7\27\2\2\u00e5\u00e7\5\32\16\2\u00e6\u00e5\3\2\2"+
		"\2\u00e6\u00e7\3\2\2\2\u00e7\u00f2\3\2\2\2\u00e8\u00e9\7!\2\2\u00e9\u00ed"+
		"\7\26\2\2\u00ea\u00ec\5\6\4\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f2\7\27\2\2\u00f1\u00d8\3\2\2\2\u00f1\u00e8\3\2\2\2"+
		"\u00f2\33\3\2\2\2\u00f3\u00f4\7\37\2\2\u00f4\u00f7\7\30\2\2\u00f5\u00f8"+
		"\58\35\2\u00f6\u00f8\5\20\t\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\34\2\2\u00fa\u00fb\5&\24\2\u00fb\u00fc"+
		"\7\34\2\2\u00fc\u00fd\5\24\13\2\u00fd\u00fe\7\31\2\2\u00fe\u0102\7\26"+
		"\2\2\u00ff\u0101\5\6\4\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0106\7\27\2\2\u0106\35\3\2\2\2\u0107\u0108\7\63\2\2\u0108"+
		"\u010a\7\30\2\2\u0109\u010b\5(\25\2\u010a\u0109\3\2\2\2\u010a\u010b\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\31\2\2\u010d\37\3\2\2\2\u010e"+
		"\u0112\58\35\2\u010f\u0110\5*\26\2\u0110\u0111\5$\23\2\u0111\u0113\3\2"+
		"\2\2\u0112\u010f\3\2\2\2\u0112\u0113\3\2\2\2\u0113!\3\2\2\2\u0114\u0118"+
		"\58\35\2\u0115\u0116\5,\27\2\u0116\u0117\5 \21\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0118\u0119\3\2\2\2\u0119#\3\2\2\2\u011a\u011d\58\35\2"+
		"\u011b\u011d\5\"\22\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d%\3"+
		"\2\2\2\u011e\u0121\5\26\f\2\u011f\u0121\5\36\20\2\u0120\u011e\3\2\2\2"+
		"\u0120\u011f\3\2\2\2\u0121\'\3\2\2\2\u0122\u0127\5\64\33\2\u0123\u0124"+
		"\7\33\2\2\u0124\u0126\5\64\33\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2"+
		"\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128)\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u012b\t\2\2\2\u012b+\3\2\2\2\u012c\u012d\t\3\2\2\u012d"+
		"-\3\2\2\2\u012e\u012f\t\4\2\2\u012f/\3\2\2\2\u0130\u0131\t\5\2\2\u0131"+
		"\61\3\2\2\2\u0132\u0133\t\6\2\2\u0133\63\3\2\2\2\u0134\u013a\58\35\2\u0135"+
		"\u013a\7\66\2\2\u0136\u013a\5\66\34\2\u0137\u013a\5> \2\u0138\u013a\5"+
		"\36\20\2\u0139\u0134\3\2\2\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\65\3\2\2\2\u013b\u013c\t\7\2"+
		"\2\u013c\67\3\2\2\2\u013d\u0146\5:\36\2\u013e\u0146\5<\37\2\u013f\u0146"+
		"\7\63\2\2\u0140\u0141\7\63\2\2\u0141\u0142\7\24\2\2\u0142\u0143\58\35"+
		"\2\u0143\u0144\7\25\2\2\u0144\u0146\3\2\2\2\u0145\u013d\3\2\2\2\u0145"+
		"\u013e\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0140\3\2\2\2\u01469\3\2\2\2"+
		"\u0147\u0148\7\64\2\2\u0148;\3\2\2\2\u0149\u014a\7\64\2\2\u014a\u014b"+
		"\13\2\2\2\u014b\u014f\7\65\2\2\u014c\u014d\13\2\2\2\u014d\u014f\7\65\2"+
		"\2\u014e\u0149\3\2\2\2\u014e\u014c\3\2\2\2\u014f=\3\2\2\2\u0150\u0151"+
		"\t\b\2\2\u0151?\3\2\2\2$CKP[dksx\u008f\u0098\u009a\u00a5\u00b1\u00b8\u00be"+
		"\u00c1\u00c4\u00ce\u00d5\u00e1\u00e6\u00ed\u00f1\u00f7\u0102\u010a\u0112"+
		"\u0118\u011c\u0120\u0127\u0139\u0145\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}