// Generated from d:/Universidad/2 AÑO/SSL/Proyecto/grammarProject/grammarProject.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class grammarProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOW=1, STATE=2, START=3, END=4, ROLE=5, CAN=6, CREATE=7, REFUSE=8, REVISE=9, 
		APPROVE=10, ARCHIVE=11, FROM=12, TO=13, WHEN=14, ACTION=15, ASSIGN=16, 
		REGISTER=17, NOTIFY=18, WITH=19, BOOLEAN=20, SEMICOLON=21, LPAREN=22, 
		RPAREN=23, ASSIGNVALUE=24, ISEQUAL=25, DOT=26, LBRACKET=27, RBRACKET=28, 
		LBRACE=29, RBRACE=30, COMMA=31, DOBLEQUOTE=32, COLON=33, STRING=34, ID=35, 
		NUMBER=36, WS=37;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_state = 2, RULE_role = 3, 
		RULE_permission = 4, RULE_transition = 5, RULE_condition = 6, RULE_action = 7, 
		RULE_instruction = 8, RULE_notification = 9, RULE_value = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "state", "role", "permission", "transition", 
			"condition", "action", "instruction", "notification", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'flujo'", "'estado'", "'inicial'", "'final'", "'rol'", "'puede'", 
			"'crear'", "'rechazar'", "'revisar'", "'aprobar'", "'archivar'", "'desde'", 
			"'hacia'", "'cuando'", "'accion'", "'asignar'", "'registrar'", "'notificar'", 
			"'con'", null, "';'", "'('", "')'", "'='", "'=='", "'.'", "'['", "']'", 
			"'{'", "'}'", "','", "'\"'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOW", "STATE", "START", "END", "ROLE", "CAN", "CREATE", "REFUSE", 
			"REVISE", "APPROVE", "ARCHIVE", "FROM", "TO", "WHEN", "ACTION", "ASSIGN", 
			"REGISTER", "NOTIFY", "WITH", "BOOLEAN", "SEMICOLON", "LPAREN", "RPAREN", 
			"ASSIGNVALUE", "ISEQUAL", "DOT", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", 
			"COMMA", "DOBLEQUOTE", "COLON", "STRING", "ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "grammarProject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarProjectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode FLOW() { return getToken(grammarProjectParser.FLOW, 0); }
		public TerminalNode ID() { return getToken(grammarProjectParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(grammarProjectParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(grammarProjectParser.RBRACE, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(FLOW);
			setState(23);
			match(ID);
			setState(24);
			match(LBRACE);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 299044L) != 0)) {
				{
				{
				setState(25);
				definition();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public NotificationContext notification() {
			return getRuleContext(NotificationContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				state();
				}
				break;
			case ROLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				role();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				transition();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				action();
				}
				break;
			case NOTIFY:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				notification();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(grammarProjectParser.STATE, 0); }
		public TerminalNode ID() { return getToken(grammarProjectParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarProjectParser.SEMICOLON, 0); }
		public TerminalNode START() { return getToken(grammarProjectParser.START, 0); }
		public TerminalNode END() { return getToken(grammarProjectParser.END, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(STATE);
			setState(41);
			match(ID);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START || _la==END) {
				{
				setState(42);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(45);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoleContext extends ParserRuleContext {
		public TerminalNode ROLE() { return getToken(grammarProjectParser.ROLE, 0); }
		public TerminalNode ID() { return getToken(grammarProjectParser.ID, 0); }
		public TerminalNode CAN() { return getToken(grammarProjectParser.CAN, 0); }
		public TerminalNode LBRACKET() { return getToken(grammarProjectParser.LBRACKET, 0); }
		public List<PermissionContext> permission() {
			return getRuleContexts(PermissionContext.class);
		}
		public PermissionContext permission(int i) {
			return getRuleContext(PermissionContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(grammarProjectParser.RBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarProjectParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(grammarProjectParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammarProjectParser.COMMA, i);
		}
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitRole(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_role);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ROLE);
			setState(48);
			match(ID);
			setState(49);
			match(CAN);
			setState(50);
			match(LBRACKET);
			setState(51);
			permission();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(52);
				match(COMMA);
				setState(53);
				permission();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(RBRACKET);
			setState(60);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PermissionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(grammarProjectParser.CREATE, 0); }
		public TerminalNode REFUSE() { return getToken(grammarProjectParser.REFUSE, 0); }
		public TerminalNode REVISE() { return getToken(grammarProjectParser.REVISE, 0); }
		public TerminalNode APPROVE() { return getToken(grammarProjectParser.APPROVE, 0); }
		public TerminalNode ARCHIVE() { return getToken(grammarProjectParser.ARCHIVE, 0); }
		public PermissionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterPermission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitPermission(this);
		}
	}

	public final PermissionContext permission() throws RecognitionException {
		PermissionContext _localctx = new PermissionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_permission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(grammarProjectParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(grammarProjectParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(grammarProjectParser.ID, i);
		}
		public TerminalNode TO() { return getToken(grammarProjectParser.TO, 0); }
		public TerminalNode WHEN() { return getToken(grammarProjectParser.WHEN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(grammarProjectParser.SEMICOLON, 0); }
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(FROM);
			setState(65);
			match(ID);
			setState(66);
			match(TO);
			setState(67);
			match(ID);
			setState(68);
			match(WHEN);
			setState(69);
			condition();
			setState(70);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarProjectParser.ID, 0); }
		public TerminalNode DOT() { return getToken(grammarProjectParser.DOT, 0); }
		public PermissionContext permission() {
			return getRuleContext(PermissionContext.class,0);
		}
		public TerminalNode ISEQUAL() { return getToken(grammarProjectParser.ISEQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(ID);
				setState(73);
				match(DOT);
				setState(74);
				permission();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ID);
				setState(76);
				match(ISEQUAL);
				setState(77);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(grammarProjectParser.ACTION, 0); }
		public TerminalNode ID() { return getToken(grammarProjectParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(grammarProjectParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(grammarProjectParser.RBRACE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ACTION);
			setState(81);
			match(ID);
			setState(82);
			match(LBRACE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGN || _la==REGISTER) {
				{
				{
				setState(83);
				instruction();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(grammarProjectParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(grammarProjectParser.ID, 0); }
		public TerminalNode ASSIGNVALUE() { return getToken(grammarProjectParser.ASSIGNVALUE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(grammarProjectParser.SEMICOLON, 0); }
		public TerminalNode REGISTER() { return getToken(grammarProjectParser.REGISTER, 0); }
		public TerminalNode LPAREN() { return getToken(grammarProjectParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(grammarProjectParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(grammarProjectParser.RPAREN, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruction);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ASSIGN);
				setState(92);
				match(ID);
				setState(93);
				match(ASSIGNVALUE);
				setState(94);
				value();
				setState(95);
				match(SEMICOLON);
				}
				break;
			case REGISTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(REGISTER);
				setState(98);
				match(LPAREN);
				setState(99);
				match(STRING);
				setState(100);
				match(RPAREN);
				setState(101);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NotificationContext extends ParserRuleContext {
		public TerminalNode NOTIFY() { return getToken(grammarProjectParser.NOTIFY, 0); }
		public TerminalNode ID() { return getToken(grammarProjectParser.ID, 0); }
		public TerminalNode WITH() { return getToken(grammarProjectParser.WITH, 0); }
		public TerminalNode STRING() { return getToken(grammarProjectParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarProjectParser.SEMICOLON, 0); }
		public NotificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterNotification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitNotification(this);
		}
	}

	public final NotificationContext notification() throws RecognitionException {
		NotificationContext _localctx = new NotificationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_notification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(NOTIFY);
			setState(105);
			match(ID);
			setState(106);
			match(WITH);
			setState(107);
			match(STRING);
			setState(108);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(grammarProjectParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(grammarProjectParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(grammarProjectParser.ID, 0); }
		public TerminalNode STRING() { return getToken(grammarProjectParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarProjectListener ) ((grammarProjectListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120260132864L) != 0)) ) {
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
		"\u0004\u0001%q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00037\b"+
		"\u0003\n\u0003\f\u0003:\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006O\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007U\b\u0007\n\u0007"+
		"\f\u0007X\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bg\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0003\u0001\u0000\u0003\u0004\u0001\u0000\u0007\u000b\u0002\u0000"+
		"\u0014\u0014\"$o\u0000\u0016\u0001\u0000\u0000\u0000\u0002&\u0001\u0000"+
		"\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000"+
		"\b>\u0001\u0000\u0000\u0000\n@\u0001\u0000\u0000\u0000\fN\u0001\u0000"+
		"\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000"+
		"\u0012h\u0001\u0000\u0000\u0000\u0014n\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0005\u0001\u0000\u0000\u0017\u0018\u0005#\u0000\u0000\u0018\u001c\u0005"+
		"\u001d\u0000\u0000\u0019\u001b\u0003\u0002\u0001\u0000\u001a\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001"+
		"\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f \u0005\u001e"+
		"\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!\'\u0003\u0004\u0002\u0000"+
		"\"\'\u0003\u0006\u0003\u0000#\'\u0003\n\u0005\u0000$\'\u0003\u000e\u0007"+
		"\u0000%\'\u0003\u0012\t\u0000&!\u0001\u0000\u0000\u0000&\"\u0001\u0000"+
		"\u0000\u0000&#\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&%\u0001"+
		"\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005\u0002\u0000"+
		"\u0000)+\u0005#\u0000\u0000*,\u0007\u0000\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0015"+
		"\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005\u0005\u0000\u0000"+
		"01\u0005#\u0000\u000012\u0005\u0006\u0000\u000023\u0005\u001b\u0000\u0000"+
		"38\u0003\b\u0004\u000045\u0005\u001f\u0000\u000057\u0003\b\u0004\u0000"+
		"64\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000;<\u0005\u001c\u0000\u0000<=\u0005\u0015\u0000\u0000=\u0007"+
		"\u0001\u0000\u0000\u0000>?\u0007\u0001\u0000\u0000?\t\u0001\u0000\u0000"+
		"\u0000@A\u0005\f\u0000\u0000AB\u0005#\u0000\u0000BC\u0005\r\u0000\u0000"+
		"CD\u0005#\u0000\u0000DE\u0005\u000e\u0000\u0000EF\u0003\f\u0006\u0000"+
		"FG\u0005\u0015\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0005#\u0000"+
		"\u0000IJ\u0005\u001a\u0000\u0000JO\u0003\b\u0004\u0000KL\u0005#\u0000"+
		"\u0000LM\u0005\u0019\u0000\u0000MO\u0003\u0014\n\u0000NH\u0001\u0000\u0000"+
		"\u0000NK\u0001\u0000\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005\u000f"+
		"\u0000\u0000QR\u0005#\u0000\u0000RV\u0005\u001d\u0000\u0000SU\u0003\u0010"+
		"\b\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u001e\u0000\u0000Z\u000f\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0010\u0000\u0000\\]\u0005#\u0000\u0000]^\u0005\u0018"+
		"\u0000\u0000^_\u0003\u0014\n\u0000_`\u0005\u0015\u0000\u0000`g\u0001\u0000"+
		"\u0000\u0000ab\u0005\u0011\u0000\u0000bc\u0005\u0016\u0000\u0000cd\u0005"+
		"\"\u0000\u0000de\u0005\u0017\u0000\u0000eg\u0005\u0015\u0000\u0000f[\u0001"+
		"\u0000\u0000\u0000fa\u0001\u0000\u0000\u0000g\u0011\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0012\u0000\u0000ij\u0005#\u0000\u0000jk\u0005\u0013\u0000"+
		"\u0000kl\u0005\"\u0000\u0000lm\u0005\u0015\u0000\u0000m\u0013\u0001\u0000"+
		"\u0000\u0000no\u0007\u0002\u0000\u0000o\u0015\u0001\u0000\u0000\u0000"+
		"\u0007\u001c&+8NVf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}