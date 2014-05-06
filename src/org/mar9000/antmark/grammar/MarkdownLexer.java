// Generated from src/org/mar9000/antmark/grammar/MarkdownLexer.g4 by ANTLR 4.2
package org.mar9000.antmark.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, TAB=2, EMPH=3, MINUS=4, UNDERSCORE=5, CLOSE_ANGLE_BRACKET=6, 
		OPEN_PAREN=7, CLOSE_PAREN=8, OPEN_SB=9, CLOSE_SB=10, DOUBLE_QUOTE=11, 
		SINGLE_QUOTE=12, COLON=13, SEMI_COLON=14, AT=15, EXCLAMATION_MARK=16, 
		HTML_COMMENT_OPEN=17, SLASH=18, PERIOD=19, EQUAL=20, AMPERSAND=21, BACKSLASH=22, 
		BACKTICK=23, PLUS=24, OPEN_CURLY=25, CLOSE_CURLY=26, D=27, I=28, V=29, 
		S=30, P=31, A=32, N=33, H=34, R=35, SETEXT_BOTTOM_1=36, SETEXT_BOTTOM_2=37, 
		ATX_START=38, SHARP=39, LINE_BREAK=40, BLANK_LINE=41, NEWLINE=42, HEX_CHAR=43, 
		NORMAL_CHAR=44, DIGIT=45, OPEN_ANGLE_BRACKET=46, SPECIAL_CHAR=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"' '", "'\t'", "'*'", "'-'", "'_'", "'>'", "'('", "')'", "'['", "']'", 
		"'\"'", "'''", "':'", "';'", "'@'", "'!'", "HTML_COMMENT_OPEN", "'/'", 
		"'.'", "'='", "'&'", "'\\'", "'`'", "'+'", "'{'", "'}'", "D", "I", "V", 
		"S", "P", "A", "N", "H", "R", "SETEXT_BOTTOM_1", "SETEXT_BOTTOM_2", "ATX_START", 
		"'#'", "LINE_BREAK", "BLANK_LINE", "NEWLINE", "HEX_CHAR", "NORMAL_CHAR", 
		"DIGIT", "'<'", "SPECIAL_CHAR"
	};
	public static final String[] ruleNames = {
		"SPACE", "TAB", "EMPH", "MINUS", "UNDERSCORE", "CLOSE_ANGLE_BRACKET", 
		"OPEN_PAREN", "CLOSE_PAREN", "OPEN_SB", "CLOSE_SB", "DOUBLE_QUOTE", "SINGLE_QUOTE", 
		"COLON", "SEMI_COLON", "AT", "EXCLAMATION_MARK", "HTML_COMMENT_OPEN", 
		"SLASH", "PERIOD", "EQUAL", "AMPERSAND", "BACKSLASH", "BACKTICK", "PLUS", 
		"OPEN_CURLY", "CLOSE_CURLY", "D", "I", "V", "S", "P", "A", "N", "H", "R", 
		"SETEXT_BOTTOM_1", "SETEXT_BOTTOM_2", "ATX_START", "SHARP", "LINE_BREAK", 
		"BLANK_LINE", "NEWLINE", "HEX_CHAR", "NORMAL_CHAR", "DIGIT", "OPEN_ANGLE_BRACKET", 
		"SPECIAL_CHAR"
	};


	    int htmlElementCount;


	public MarkdownLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MarkdownLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 41: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: setCharPositionInLine(0); break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16: return HTML_COMMENT_OPEN_sempred((RuleContext)_localctx, predIndex);

		case 35: return SETEXT_BOTTOM_1_sempred((RuleContext)_localctx, predIndex);

		case 36: return SETEXT_BOTTOM_2_sempred((RuleContext)_localctx, predIndex);

		case 37: return ATX_START_sempred((RuleContext)_localctx, predIndex);

		case 39: return LINE_BREAK_sempred((RuleContext)_localctx, predIndex);

		case 40: return BLANK_LINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean LINE_BREAK_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return _tokenStartCharPositionInLine > 0;
		}
		return true;
	}
	private boolean SETEXT_BOTTOM_2_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return _tokenStartCharPositionInLine == 0;
		}
		return true;
	}
	private boolean BLANK_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return _tokenStartCharPositionInLine == 0;
		}
		return true;
	}
	private boolean SETEXT_BOTTOM_1_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return _tokenStartCharPositionInLine == 0;
		}
		return true;
	}
	private boolean ATX_START_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return _tokenStartCharPositionInLine == 0;
		}
		return true;
	}
	private boolean HTML_COMMENT_OPEN_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return _tokenStartCharPositionInLine == 0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u0104\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\6%\u00ad\n%\r%\16%\u00ae\3%\3%\5%\u00b3\n%\3%\3"+
		"%\3&\6&\u00b8\n&\r&\16&\u00b9\3&\3&\5&\u00be\n&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u00d7\n\'\3\'\3\'\3(\3(\3)\3)\3)\3)\7)\u00e1\n)\f)\16)\u00e4\13)\3"+
		")\3)\3)\3*\3*\7*\u00eb\n*\f*\16*\u00ee\13*\3*\3*\3*\3+\5+\u00f4\n+\3+"+
		"\3+\3+\5+\u00f9\n+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\2\2\61\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\17\4\2FFff\4\2KKkk\4\2XXxx\4\2"+
		"UUuu\4\2RRrr\4\2CCcc\4\2PPpp\4\2JJjj\4\2TTtt\6\2CHZZchzz\4\2C\\c|\3\2"+
		"\62;\t\2$$))..AA^^bb\u0080\u0080\u0112\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3"+
		"\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17m\3\2\2\2\21o\3\2\2\2\23q\3\2\2\2\25s"+
		"\3\2\2\2\27u\3\2\2\2\31w\3\2\2\2\33y\3\2\2\2\35{\3\2\2\2\37}\3\2\2\2!"+
		"\177\3\2\2\2#\u0081\3\2\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2)\u008b\3\2"+
		"\2\2+\u008d\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63"+
		"\u0095\3\2\2\2\65\u0097\3\2\2\2\67\u0099\3\2\2\29\u009b\3\2\2\2;\u009d"+
		"\3\2\2\2=\u009f\3\2\2\2?\u00a1\3\2\2\2A\u00a3\3\2\2\2C\u00a5\3\2\2\2E"+
		"\u00a7\3\2\2\2G\u00a9\3\2\2\2I\u00ac\3\2\2\2K\u00b7\3\2\2\2M\u00d6\3\2"+
		"\2\2O\u00da\3\2\2\2Q\u00dc\3\2\2\2S\u00ec\3\2\2\2U\u00f8\3\2\2\2W\u00fa"+
		"\3\2\2\2Y\u00fc\3\2\2\2[\u00fe\3\2\2\2]\u0100\3\2\2\2_\u0102\3\2\2\2a"+
		"b\7\"\2\2b\4\3\2\2\2cd\7\13\2\2d\6\3\2\2\2ef\7,\2\2f\b\3\2\2\2gh\7/\2"+
		"\2h\n\3\2\2\2ij\7a\2\2j\f\3\2\2\2kl\7@\2\2l\16\3\2\2\2mn\7*\2\2n\20\3"+
		"\2\2\2op\7+\2\2p\22\3\2\2\2qr\7]\2\2r\24\3\2\2\2st\7_\2\2t\26\3\2\2\2"+
		"uv\7$\2\2v\30\3\2\2\2wx\7)\2\2x\32\3\2\2\2yz\7<\2\2z\34\3\2\2\2{|\7=\2"+
		"\2|\36\3\2\2\2}~\7B\2\2~ \3\2\2\2\177\u0080\7#\2\2\u0080\"\3\2\2\2\u0081"+
		"\u0082\5]/\2\u0082\u0083\5!\21\2\u0083\u0084\5\t\5\2\u0084\u0085\5\t\5"+
		"\2\u0085\u0086\6\22\2\2\u0086$\3\2\2\2\u0087\u0088\7\61\2\2\u0088&\3\2"+
		"\2\2\u0089\u008a\7\60\2\2\u008a(\3\2\2\2\u008b\u008c\7?\2\2\u008c*\3\2"+
		"\2\2\u008d\u008e\7(\2\2\u008e,\3\2\2\2\u008f\u0090\7^\2\2\u0090.\3\2\2"+
		"\2\u0091\u0092\7b\2\2\u0092\60\3\2\2\2\u0093\u0094\7-\2\2\u0094\62\3\2"+
		"\2\2\u0095\u0096\7}\2\2\u0096\64\3\2\2\2\u0097\u0098\7\177\2\2\u0098\66"+
		"\3\2\2\2\u0099\u009a\t\2\2\2\u009a8\3\2\2\2\u009b\u009c\t\3\2\2\u009c"+
		":\3\2\2\2\u009d\u009e\t\4\2\2\u009e<\3\2\2\2\u009f\u00a0\t\5\2\2\u00a0"+
		">\3\2\2\2\u00a1\u00a2\t\6\2\2\u00a2@\3\2\2\2\u00a3\u00a4\t\7\2\2\u00a4"+
		"B\3\2\2\2\u00a5\u00a6\t\b\2\2\u00a6D\3\2\2\2\u00a7\u00a8\t\t\2\2\u00a8"+
		"F\3\2\2\2\u00a9\u00aa\t\n\2\2\u00aaH\3\2\2\2\u00ab\u00ad\5)\25\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b3\5U+\2\u00b1\u00b3\5Q)\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\6%\3\2\u00b5"+
		"J\3\2\2\2\u00b6\u00b8\5\t\5\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00be"+
		"\5U+\2\u00bc\u00be\5Q)\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\6&\4\2\u00c0L\3\2\2\2\u00c1\u00c2\7%\2\2\u00c2"+
		"\u00c3\7%\2\2\u00c3\u00c4\7%\2\2\u00c4\u00c5\7%\2\2\u00c5\u00c6\7%\2\2"+
		"\u00c6\u00d7\7%\2\2\u00c7\u00c8\7%\2\2\u00c8\u00c9\7%\2\2\u00c9\u00ca"+
		"\7%\2\2\u00ca\u00cb\7%\2\2\u00cb\u00d7\7%\2\2\u00cc\u00cd\7%\2\2\u00cd"+
		"\u00ce\7%\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d7\7%\2\2\u00d0\u00d1\7%\2\2"+
		"\u00d1\u00d2\7%\2\2\u00d2\u00d7\7%\2\2\u00d3\u00d4\7%\2\2\u00d4\u00d7"+
		"\7%\2\2\u00d5\u00d7\7%\2\2\u00d6\u00c1\3\2\2\2\u00d6\u00c7\3\2\2\2\u00d6"+
		"\u00cc\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\6\'\5\2\u00d9N\3\2\2\2\u00da\u00db"+
		"\7%\2\2\u00dbP\3\2\2\2\u00dc\u00dd\5\3\2\2\u00dd\u00e2\5\3\2\2\u00de\u00e1"+
		"\5\3\2\2\u00df\u00e1\5\5\3\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5U+\2\u00e6\u00e7\6)\6\2\u00e7R\3"+
		"\2\2\2\u00e8\u00eb\5\3\2\2\u00e9\u00eb\5\5\3\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\5U+\2\u00f0\u00f1"+
		"\6*\7\2\u00f1T\3\2\2\2\u00f2\u00f4\7\17\2\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9\7\f\2\2\u00f6\u00f7\7\17"+
		"\2\2\u00f7\u00f9\b+\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"V\3\2\2\2\u00fa\u00fb\t\13\2\2\u00fbX\3\2\2\2\u00fc\u00fd\t\f\2\2\u00fd"+
		"Z\3\2\2\2\u00fe\u00ff\t\r\2\2\u00ff\\\3\2\2\2\u0100\u0101\7>\2\2\u0101"+
		"^\3\2\2\2\u0102\u0103\t\16\2\2\u0103`\3\2\2\2\16\2\u00ae\u00b2\u00b9\u00bd"+
		"\u00d6\u00e0\u00e2\u00ea\u00ec\u00f3\u00f8\3\3+\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}