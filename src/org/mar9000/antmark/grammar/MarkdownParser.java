// Generated from src/org/mar9000/antmark/grammar/MarkdownParser.g4 by ANTLR 4.2
package org.mar9000.antmark.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkdownParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		D=27, EXCLAMATION_MARK=16, A=32, SHARP=39, OPEN_ANGLE_BRACKET=46, ATX_START=38, 
		NORMAL_CHAR=44, HEX_CHAR=43, N=33, CLOSE_CURLY=26, DOUBLE_QUOTE=11, PERIOD=19, 
		H=34, HTML_COMMENT_OPEN=17, SPECIAL_CHAR=47, I=28, TAB=2, AMPERSAND=21, 
		OPEN_PAREN=7, V=29, UNDERSCORE=5, OPEN_SB=9, SEMI_COLON=14, BLANK_LINE=41, 
		P=31, EMPH=3, OPEN_CURLY=25, S=30, R=35, MINUS=4, SPACE=1, COLON=13, AT=15, 
		BACKTICK=23, SINGLE_QUOTE=12, LINE_BREAK=40, SETEXT_BOTTOM_2=37, SLASH=18, 
		NEWLINE=42, SETEXT_BOTTOM_1=36, EQUAL=20, PLUS=24, CLOSE_SB=10, CLOSE_PAREN=8, 
		DIGIT=45, CLOSE_ANGLE_BRACKET=6, BACKSLASH=22;
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "'\t'", "'*'", "'-'", "'_'", "'>'", "'('", "')'", 
		"'['", "']'", "'\"'", "'''", "':'", "';'", "'@'", "'!'", "HTML_COMMENT_OPEN", 
		"'/'", "'.'", "'='", "'&'", "'\\'", "'`'", "'+'", "'{'", "'}'", "D", "I", 
		"V", "S", "P", "A", "N", "H", "R", "SETEXT_BOTTOM_1", "SETEXT_BOTTOM_2", 
		"ATX_START", "'#'", "LINE_BREAK", "BLANK_LINE", "NEWLINE", "HEX_CHAR", 
		"NORMAL_CHAR", "DIGIT", "'<'", "SPECIAL_CHAR"
	};
	public static final int
		RULE_document = 0, RULE_block = 1, RULE_htmlBlockTags = 2, RULE_htmlBlockSelfClosing = 3, 
		RULE_heading = 4, RULE_setextHeading = 5, RULE_setextHeading1 = 6, RULE_setextHeading2 = 7, 
		RULE_atxHeading = 8, RULE_rawLine = 9, RULE_nonIndentSpace = 10, RULE_blockQuote = 11, 
		RULE_blockQuoteBlankLine = 12, RULE_verbatim = 13, RULE_verbatimBlankLine = 14, 
		RULE_horizontalRule = 15, RULE_references = 16, RULE_reference = 17, RULE_referenceLabel = 18, 
		RULE_referenceId = 19, RULE_referenceUrl = 20, RULE_referenceTitle = 21, 
		RULE_referenceTitleSingle = 22, RULE_referenceTitleDouble = 23, RULE_referenceTitleParens = 24, 
		RULE_orderedList = 25, RULE_bulletList = 26, RULE_orderedListItem = 27, 
		RULE_bulletListItem = 28, RULE_inlineListItem = 29, RULE_listItemBlankLine = 30, 
		RULE_para = 31, RULE_inline = 32, RULE_span = 33, RULE_emph = 34, RULE_emphStar = 35, 
		RULE_emphUl = 36, RULE_strong = 37, RULE_strongStar = 38, RULE_strongUl = 39, 
		RULE_image = 40, RULE_imageLink = 41, RULE_explicitImageLink = 42, RULE_imageAlt = 43, 
		RULE_referenceImageLink = 44, RULE_link = 45, RULE_linkContent = 46, RULE_explicitLink = 47, 
		RULE_linkUrl = 48, RULE_linkTitle = 49, RULE_linkTitleSingle = 50, RULE_linkTitleDouble = 51, 
		RULE_referenceLink = 52, RULE_entity = 53, RULE_hexEntityName = 54, RULE_decEntityName = 55, 
		RULE_charEntityName = 56, RULE_escapedChar = 57, RULE_code = 58, RULE_backtickCode = 59, 
		RULE_doubleBacktickCode = 60, RULE_spaceBacktickCode = 61, RULE_attributeName = 62, 
		RULE_htmlAttributeS = 63, RULE_htmlAttributeD = 64, RULE_htmlBlockOpenDiv = 65, 
		RULE_htmlBlockCloseDiv = 66, RULE_htmlBlockDiv = 67, RULE_htmlBlockOpenSpan = 68, 
		RULE_htmlBlockCloseSpan = 69, RULE_htmlBlockSpan = 70, RULE_htmlBlockHr = 71, 
		RULE_htmlBlockInTags = 72, RULE_htmlBlockInSelfClosing = 73, RULE_htmlComment = 74, 
		RULE_autolink = 75;
	public static final String[] ruleNames = {
		"document", "block", "htmlBlockTags", "htmlBlockSelfClosing", "heading", 
		"setextHeading", "setextHeading1", "setextHeading2", "atxHeading", "rawLine", 
		"nonIndentSpace", "blockQuote", "blockQuoteBlankLine", "verbatim", "verbatimBlankLine", 
		"horizontalRule", "references", "reference", "referenceLabel", "referenceId", 
		"referenceUrl", "referenceTitle", "referenceTitleSingle", "referenceTitleDouble", 
		"referenceTitleParens", "orderedList", "bulletList", "orderedListItem", 
		"bulletListItem", "inlineListItem", "listItemBlankLine", "para", "inline", 
		"span", "emph", "emphStar", "emphUl", "strong", "strongStar", "strongUl", 
		"image", "imageLink", "explicitImageLink", "imageAlt", "referenceImageLink", 
		"link", "linkContent", "explicitLink", "linkUrl", "linkTitle", "linkTitleSingle", 
		"linkTitleDouble", "referenceLink", "entity", "hexEntityName", "decEntityName", 
		"charEntityName", "escapedChar", "code", "backtickCode", "doubleBacktickCode", 
		"spaceBacktickCode", "attributeName", "htmlAttributeS", "htmlAttributeD", 
		"htmlBlockOpenDiv", "htmlBlockCloseDiv", "htmlBlockDiv", "htmlBlockOpenSpan", 
		"htmlBlockCloseSpan", "htmlBlockSpan", "htmlBlockHr", "htmlBlockInTags", 
		"htmlBlockInSelfClosing", "htmlComment", "autolink"
	};

	@Override
	public String getGrammarFileName() { return "MarkdownParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private static final boolean debug = false;
	private boolean tokenStartsWith(int la, String value) {
	    Token t = _input.LT(la);
	    return t.getText().startsWith(value);
	}
	private boolean tokenEndsWith(int la, String value) {
	    Token t = _input.LT(la);
	    return t.getText().endsWith(value);
	}
	private boolean tokenIs(int la, int type) {
	    Token t = _input.LT(la);
	    return t.getType() == type;
	}
	/**
	 * Count spaces at the begin of the line.
	 * Return int array with spaces at 0 and type at 1.
	 * Return spaces -1 if not at the begin of the line.
	 */
	private int[] countSpaces(int index, int level, boolean skipBL) {
	    int la = index;
	    int[] retValue = new int[]{-1, -1};
	    while (skipBL && _input.LT(la).getType() == BLANK_LINE) {
	        la++;
	    }
	    if (_input.LT(la).getCharPositionInLine() != 0)
	        return retValue;
	    int spaces = 0;
	    int type = 0;
	    do {
	        Token t = _input.LT(la++);
	        type = t.getType();
	        if (type == SPACE)
	            spaces++;
	        else if (type == TAB)
	            spaces += 4;
		} while (type == SPACE || type == TAB);
		retValue[0] = spaces;
		retValue[1] = type;
		return retValue;
	}
	/* Redcarpet or the reference implementation Markdown.pl have tricky handling of spaces in front of list items.
	 * Here I look at the pegdown implementation that simply counts spaces 0-3 level 0, 4-7 level1 ecc.
	 * This way I should not track how many spaces each level has at the beginning.
	 * For instance:
	 *   * l0
	 *  * l1
	 *  * l1
	 * for me is counter intuitive.
	 */
	private boolean followListItem(int index, int level) {
	    return followListItem(index, level, false);
	}
	private boolean followListItem(int index, int level, boolean skipBL) {
	    if (level < 0)
	        return false;

	    int[] spacesAndType = countSpaces(index, level, skipBL);
	    int spaces = spacesAndType[0];
	    int type = spacesAndType[1];

		int minSpaces = level*4;
		int maxSpaces = minSpaces+3;
		
		boolean retValue = spaces >= minSpaces && spaces <= maxSpaces;
		if (retValue) {   // Check also token type.
		    // TODO: checking for DIGIT is an incomplete check.
		    retValue = (type == EMPH || type == MINUS || type == PLUS || type == DIGIT);
		}
		if (debug)
		    System.out.println("followListItem(" + level
		    + "): line: " + _input.LT(index).getLine()
		    + ", skipBL: " + skipBL
		    + ", " + retValue);
		return retValue;
	}
	private boolean followVerbatim(int level) {
	    return followVerbatim(level, false);
	}
	private boolean followVerbatim(int level, boolean skipBL) {
	    if (level < 0)
	        return false;

	    int[] spacesAndType = countSpaces(1, level, skipBL);
	    int spaces = spacesAndType[0];

		boolean retValue = spaces >= (level+1)*4;

	    if (debug)
		    System.out.println("followVerbatim(" + level
		    + "): line: " + _input.LT(1).getLine()
		    + ", skipBL: " + skipBL
		    + ", " + retValue);
		
		return retValue;
	}
	// List item continuation should have same number of spaces of verbatim with the lower level.
	private boolean followContinuation(int level) {
	    return followContinuation(level, false);
	}
	private boolean followContinuation(int level, boolean skipBL) {
	    if (level < 0)
	        return false;

	    int[] spacesAndType = countSpaces(1, level, skipBL);
	    int spaces = spacesAndType[0];

		boolean retValue = spaces >= (level+1)*4;

	    if (debug)
		    System.out.println("followContinuation(" + level
		    + "): line: " + _input.LT(1).getLine()
		    + ", skipBL: " + skipBL
		    + ", " + retValue);
		
		return retValue;
	}
	private boolean followBlockquote(int level) {
	    if (level < 0)
	        return false;

	    int[] spacesAndType = countSpaces(1, level, true);
	    int spaces = spacesAndType[0];
	    int type = spacesAndType[1];

		int minSpaces = level*4;
		int maxSpaces = minSpaces+3;
		boolean retValue = spaces >= minSpaces && spaces <= maxSpaces && type == CLOSE_ANGLE_BRACKET;

	    if (debug)
	        System.out.println("followBlockquote(" + level
	        + "): line: " + _input.LT(1).getLine()
	        + ", " + retValue);
		
		return retValue;
	}

	public MarkdownParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MarkdownParser.EOF, 0); }
		public List<TerminalNode> BLANK_LINE() { return getTokens(MarkdownParser.BLANK_LINE); }
		public TerminalNode BLANK_LINE(int i) {
			return getToken(MarkdownParser.BLANK_LINE, i);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(152); block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK_LINE) {
				{
				{
				setState(157); match(BLANK_LINE);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(163); match(EOF);
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

	public static class BlockContext extends ParserRuleContext {
		public BlockQuoteContext blockQuote() {
			return getRuleContext(BlockQuoteContext.class,0);
		}
		public List<TerminalNode> BLANK_LINE() { return getTokens(MarkdownParser.BLANK_LINE); }
		public HtmlBlockSelfClosingContext htmlBlockSelfClosing() {
			return getRuleContext(HtmlBlockSelfClosingContext.class,0);
		}
		public TerminalNode BLANK_LINE(int i) {
			return getToken(MarkdownParser.BLANK_LINE, i);
		}
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public OrderedListContext orderedList() {
			return getRuleContext(OrderedListContext.class,0);
		}
		public BulletListContext bulletList() {
			return getRuleContext(BulletListContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public HtmlBlockTagsContext htmlBlockTags() {
			return getRuleContext(HtmlBlockTagsContext.class,0);
		}
		public VerbatimContext verbatim() {
			return getRuleContext(VerbatimContext.class,0);
		}
		public HorizontalRuleContext horizontalRule() {
			return getRuleContext(HorizontalRuleContext.class,0);
		}
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(166); match(BLANK_LINE);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(172); htmlBlockTags();
				}
				break;

			case 2:
				{
				setState(173); htmlBlockSelfClosing();
				}
				break;

			case 3:
				{
				setState(174); htmlComment();
				}
				break;

			case 4:
				{
				setState(175); heading();
				}
				break;

			case 5:
				{
				setState(176); horizontalRule();
				}
				break;

			case 6:
				{
				setState(177); blockQuote(0);
				}
				break;

			case 7:
				{
				setState(178); references();
				}
				break;

			case 8:
				{
				setState(179);
				if (!(followListItem(1, 0))) throw new FailedPredicateException(this, "followListItem(1, 0)");
				setState(180); orderedList(0);
				}
				break;

			case 9:
				{
				setState(181);
				if (!(followListItem(1, 0))) throw new FailedPredicateException(this, "followListItem(1, 0)");
				setState(182); bulletList(0);
				}
				break;

			case 10:
				{
				setState(183);
				if (!(followVerbatim(0))) throw new FailedPredicateException(this, "followVerbatim(0)");
				setState(184); verbatim(0);
				}
				break;

			case 11:
				{
				setState(185); para();
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

	public static class HtmlBlockTagsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public HtmlBlockInTagsContext htmlBlockInTags() {
			return getRuleContext(HtmlBlockInTagsContext.class,0);
		}
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode LINE_BREAK() { return getToken(MarkdownParser.LINE_BREAK, 0); }
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public HtmlBlockTagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockTags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockTags(this);
		}
	}

	public final HtmlBlockTagsContext htmlBlockTags() throws RecognitionException {
		HtmlBlockTagsContext _localctx = new HtmlBlockTagsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlBlockTags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); htmlBlockInTags();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==LINE_BREAK || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class HtmlBlockSelfClosingContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public HtmlBlockInSelfClosingContext htmlBlockInSelfClosing() {
			return getRuleContext(HtmlBlockInSelfClosingContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode LINE_BREAK() { return getToken(MarkdownParser.LINE_BREAK, 0); }
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public HtmlBlockSelfClosingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockSelfClosing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockSelfClosing(this);
		}
	}

	public final HtmlBlockSelfClosingContext htmlBlockSelfClosing() throws RecognitionException {
		HtmlBlockSelfClosingContext _localctx = new HtmlBlockSelfClosingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlBlockSelfClosing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); htmlBlockInSelfClosing();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==LINE_BREAK || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class HeadingContext extends ParserRuleContext {
		public AtxHeadingContext atxHeading() {
			return getRuleContext(AtxHeadingContext.class,0);
		}
		public SetextHeadingContext setextHeading() {
			return getRuleContext(SetextHeadingContext.class,0);
		}
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHeading(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_heading);
		try {
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); setextHeading();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); atxHeading();
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

	public static class SetextHeadingContext extends ParserRuleContext {
		public SetextHeading1Context setextHeading1() {
			return getRuleContext(SetextHeading1Context.class,0);
		}
		public SetextHeading2Context setextHeading2() {
			return getRuleContext(SetextHeading2Context.class,0);
		}
		public SetextHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setextHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterSetextHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitSetextHeading(this);
		}
	}

	public final SetextHeadingContext setextHeading() throws RecognitionException {
		SetextHeadingContext _localctx = new SetextHeadingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setextHeading);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); setextHeading1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); setextHeading2();
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

	public static class SetextHeading1Context extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public TerminalNode SETEXT_BOTTOM_1() { return getToken(MarkdownParser.SETEXT_BOTTOM_1, 0); }
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public SetextHeading1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setextHeading1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterSetextHeading1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitSetextHeading1(this);
		}
	}

	public final SetextHeading1Context setextHeading1() throws RecognitionException {
		SetextHeading1Context _localctx = new SetextHeading1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_setextHeading1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(214);
					if (!(!tokenIs(1, NEWLINE))) throw new FailedPredicateException(this, "!tokenIs(1, NEWLINE)");
					setState(215); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(218); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(220); match(NEWLINE);
			setState(221); match(SETEXT_BOTTOM_1);
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

	public static class SetextHeading2Context extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public TerminalNode SETEXT_BOTTOM_2() { return getToken(MarkdownParser.SETEXT_BOTTOM_2, 0); }
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public SetextHeading2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setextHeading2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterSetextHeading2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitSetextHeading2(this);
		}
	}

	public final SetextHeading2Context setextHeading2() throws RecognitionException {
		SetextHeading2Context _localctx = new SetextHeading2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_setextHeading2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(223);
					if (!(!tokenIs(1, NEWLINE))) throw new FailedPredicateException(this, "!tokenIs(1, NEWLINE)");
					setState(224); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(227); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(229); match(NEWLINE);
			setState(230); match(SETEXT_BOTTOM_2);
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

	public static class AtxHeadingContext extends ParserRuleContext {
		public List<TerminalNode> SHARP() { return getTokens(MarkdownParser.SHARP); }
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public TerminalNode ATX_START() { return getToken(MarkdownParser.ATX_START, 0); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode LINE_BREAK() { return getToken(MarkdownParser.LINE_BREAK, 0); }
		public TerminalNode SHARP(int i) {
			return getToken(MarkdownParser.SHARP, i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public AtxHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atxHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterAtxHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitAtxHeading(this);
		}
	}

	public final AtxHeadingContext atxHeading() throws RecognitionException {
		AtxHeadingContext _localctx = new AtxHeadingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atxHeading);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232); match(ATX_START);
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==SPACE || _la==TAB) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(235); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(234); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(237); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(239);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			}
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SHARP) {
					{
					{
					setState(247); match(SHARP);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(256);
			_la = _input.LA(1);
			if (_la==SPACE || _la==TAB) {
				{
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(258);
			_la = _input.LA(1);
			if ( !(_la==LINE_BREAK || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RawLineContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public RawLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterRawLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitRawLine(this);
		}
	}

	public final RawLineContext rawLine() throws RecognitionException {
		RawLineContext _localctx = new RawLineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rawLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0)) {
				{
				{
				setState(260);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266); match(NEWLINE);
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

	public static class NonIndentSpaceContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public NonIndentSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonIndentSpace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterNonIndentSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitNonIndentSpace(this);
		}
	}

	public final NonIndentSpaceContext nonIndentSpace() throws RecognitionException {
		NonIndentSpaceContext _localctx = new NonIndentSpaceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nonIndentSpace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(268); match(SPACE);
				}
				break;
			}
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(271); match(SPACE);
				}
				break;
			}
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(274); match(SPACE);
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

	public static class BlockQuoteContext extends ParserRuleContext {
		public int _level;
		public List<BlockQuoteBlankLineContext> blockQuoteBlankLine() {
			return getRuleContexts(BlockQuoteBlankLineContext.class);
		}
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode CLOSE_ANGLE_BRACKET(int i) {
			return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, i);
		}
		public List<RawLineContext> rawLine() {
			return getRuleContexts(RawLineContext.class);
		}
		public BlockQuoteBlankLineContext blockQuoteBlankLine(int i) {
			return getRuleContext(BlockQuoteBlankLineContext.class,i);
		}
		public List<TerminalNode> CLOSE_ANGLE_BRACKET() { return getTokens(MarkdownParser.CLOSE_ANGLE_BRACKET); }
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public RawLineContext rawLine(int i) {
			return getRuleContext(RawLineContext.class,i);
		}
		public BlockQuoteContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BlockQuoteContext(ParserRuleContext parent, int invokingState, int _level) {
			super(parent, invokingState);
			this._level = _level;
		}
		@Override public int getRuleIndex() { return RULE_blockQuote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterBlockQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitBlockQuote(this);
		}
	}

	public final BlockQuoteContext blockQuote(int _level) throws RecognitionException {
		BlockQuoteContext _localctx = new BlockQuoteContext(_ctx, getState(), _level);
		enterRule(_localctx, 22, RULE_blockQuote);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			if (!(followBlockquote(_localctx._level))) throw new FailedPredicateException(this, "followBlockquote($_level)");
			setState(292); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(279);
					_la = _input.LA(1);
					if (_la==BLANK_LINE) {
						{
						setState(278); blockQuoteBlankLine();
						}
					}

					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE || _la==TAB) {
						{
						{
						setState(281);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(286);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(287); match(CLOSE_ANGLE_BRACKET);
					setState(289);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(288);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					setState(291); rawLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(294); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class BlockQuoteBlankLineContext extends ParserRuleContext {
		public List<TerminalNode> BLANK_LINE() { return getTokens(MarkdownParser.BLANK_LINE); }
		public TerminalNode BLANK_LINE(int i) {
			return getToken(MarkdownParser.BLANK_LINE, i);
		}
		public BlockQuoteBlankLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockQuoteBlankLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterBlockQuoteBlankLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitBlockQuoteBlankLine(this);
		}
	}

	public final BlockQuoteBlankLineContext blockQuoteBlankLine() throws RecognitionException {
		BlockQuoteBlankLineContext _localctx = new BlockQuoteBlankLineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockQuoteBlankLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(296); match(BLANK_LINE);
				}
				}
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BLANK_LINE );
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

	public static class VerbatimContext extends ParserRuleContext {
		public int _level;
		public List<RawLineContext> rawLine() {
			return getRuleContexts(RawLineContext.class);
		}
		public VerbatimBlankLineContext verbatimBlankLine(int i) {
			return getRuleContext(VerbatimBlankLineContext.class,i);
		}
		public List<VerbatimBlankLineContext> verbatimBlankLine() {
			return getRuleContexts(VerbatimBlankLineContext.class);
		}
		public RawLineContext rawLine(int i) {
			return getRuleContext(RawLineContext.class,i);
		}
		public VerbatimContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VerbatimContext(ParserRuleContext parent, int invokingState, int _level) {
			super(parent, invokingState);
			this._level = _level;
		}
		@Override public int getRuleIndex() { return RULE_verbatim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterVerbatim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitVerbatim(this);
		}
	}

	public final VerbatimContext verbatim(int _level) throws RecognitionException {
		VerbatimContext _localctx = new VerbatimContext(_ctx, getState(), _level);
		enterRule(_localctx, 26, RULE_verbatim);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(301);
					if (!(followVerbatim(_localctx._level, true))) throw new FailedPredicateException(this, "followVerbatim($_level, true)");
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(302); verbatimBlankLine();
							}
							} 
						}
						setState(307);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					}
					setState(308); rawLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(311); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class VerbatimBlankLineContext extends ParserRuleContext {
		public TerminalNode BLANK_LINE() { return getToken(MarkdownParser.BLANK_LINE, 0); }
		public VerbatimBlankLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbatimBlankLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterVerbatimBlankLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitVerbatimBlankLine(this);
		}
	}

	public final VerbatimBlankLineContext verbatimBlankLine() throws RecognitionException {
		VerbatimBlankLineContext _localctx = new VerbatimBlankLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_verbatimBlankLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(BLANK_LINE);
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

	public static class HorizontalRuleContext extends ParserRuleContext {
		public List<TerminalNode> UNDERSCORE() { return getTokens(MarkdownParser.UNDERSCORE); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public TerminalNode EMPH(int i) {
			return getToken(MarkdownParser.EMPH, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public List<TerminalNode> MINUS() { return getTokens(MarkdownParser.MINUS); }
		public NonIndentSpaceContext nonIndentSpace() {
			return getRuleContext(NonIndentSpaceContext.class,0);
		}
		public List<TerminalNode> EMPH() { return getTokens(MarkdownParser.EMPH); }
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public TerminalNode MINUS(int i) {
			return getToken(MarkdownParser.MINUS, i);
		}
		public TerminalNode SETEXT_BOTTOM_2() { return getToken(MarkdownParser.SETEXT_BOTTOM_2, 0); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MarkdownParser.UNDERSCORE, i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public HorizontalRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_horizontalRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHorizontalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHorizontalRule(this);
		}
	}

	public final HorizontalRuleContext horizontalRule() throws RecognitionException {
		HorizontalRuleContext _localctx = new HorizontalRuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_horizontalRule);
		int _la;
		try {
			setState(375);
			switch (_input.LA(1)) {
			case SPACE:
			case EMPH:
			case MINUS:
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); nonIndentSpace();
				setState(370);
				switch (_input.LA(1)) {
				case EMPH:
					{
					setState(316); match(EMPH);
					setState(318);
					_la = _input.LA(1);
					if (_la==SPACE || _la==TAB) {
						{
						setState(317);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(320); match(EMPH);
					setState(322);
					_la = _input.LA(1);
					if (_la==SPACE || _la==TAB) {
						{
						setState(321);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(324); match(EMPH);
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH))) != 0)) {
						{
						{
						setState(326);
						_la = _input.LA(1);
						if (_la==SPACE || _la==TAB) {
							{
							setState(325);
							_la = _input.LA(1);
							if ( !(_la==SPACE || _la==TAB) ) {
							_errHandler.recoverInline(this);
							}
							consume();
							}
						}

						setState(328); match(EMPH);
						}
						}
						setState(333);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case MINUS:
					{
					setState(334); match(MINUS);
					setState(336);
					_la = _input.LA(1);
					if (_la==SPACE || _la==TAB) {
						{
						setState(335);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(338); match(MINUS);
					setState(340);
					_la = _input.LA(1);
					if (_la==SPACE || _la==TAB) {
						{
						setState(339);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(342); match(MINUS);
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << MINUS))) != 0)) {
						{
						{
						setState(344);
						_la = _input.LA(1);
						if (_la==SPACE || _la==TAB) {
							{
							setState(343);
							_la = _input.LA(1);
							if ( !(_la==SPACE || _la==TAB) ) {
							_errHandler.recoverInline(this);
							}
							consume();
							}
						}

						setState(346); match(MINUS);
						}
						}
						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case UNDERSCORE:
					{
					setState(352); match(UNDERSCORE);
					setState(354);
					_la = _input.LA(1);
					if (_la==SPACE || _la==TAB) {
						{
						setState(353);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(356); match(UNDERSCORE);
					setState(358);
					_la = _input.LA(1);
					if (_la==SPACE || _la==TAB) {
						{
						setState(357);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
					}

					setState(360); match(UNDERSCORE);
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << UNDERSCORE))) != 0)) {
						{
						{
						setState(362);
						_la = _input.LA(1);
						if (_la==SPACE || _la==TAB) {
							{
							setState(361);
							_la = _input.LA(1);
							if ( !(_la==SPACE || _la==TAB) ) {
							_errHandler.recoverInline(this);
							}
							consume();
							}
						}

						setState(364); match(UNDERSCORE);
						}
						}
						setState(369);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372); match(NEWLINE);
				}
				break;
			case SETEXT_BOTTOM_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374); match(SETEXT_BOTTOM_2);
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

	public static class ReferencesContext extends ParserRuleContext {
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferences(this);
		}
	}

	public final ReferencesContext references() throws RecognitionException {
		ReferencesContext _localctx = new ReferencesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_references);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(377); reference();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(380); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public ReferenceLabelContext referenceLabel() {
			return getRuleContext(ReferenceLabelContext.class,0);
		}
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public ReferenceUrlContext referenceUrl() {
			return getRuleContext(ReferenceUrlContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode COLON() { return getToken(MarkdownParser.COLON, 0); }
		public NonIndentSpaceContext nonIndentSpace() {
			return getRuleContext(NonIndentSpaceContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public ReferenceTitleContext referenceTitle() {
			return getRuleContext(ReferenceTitleContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); nonIndentSpace();
			setState(383); referenceLabel();
			setState(384); match(COLON);
			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(385);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE || _la==TAB );
			setState(390); referenceUrl();
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(409);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(392); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(391);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(394); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE || _la==TAB );
					}
					break;

				case 2:
					{
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE || _la==TAB) {
						{
						{
						setState(396);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(401);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(402); match(NEWLINE);
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE || _la==TAB) {
						{
						{
						setState(403);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(408);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(411); referenceTitle();
				}
				break;
			}
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420); match(NEWLINE);
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

	public static class ReferenceLabelContext extends ParserRuleContext {
		public ReferenceIdContext referenceId() {
			return getRuleContext(ReferenceIdContext.class,0);
		}
		public TerminalNode OPEN_SB() { return getToken(MarkdownParser.OPEN_SB, 0); }
		public TerminalNode CLOSE_SB() { return getToken(MarkdownParser.CLOSE_SB, 0); }
		public ReferenceLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferenceLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferenceLabel(this);
		}
	}

	public final ReferenceLabelContext referenceLabel() throws RecognitionException {
		ReferenceLabelContext _localctx = new ReferenceLabelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_referenceLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(OPEN_SB);
			setState(423); referenceId();
			setState(424); match(CLOSE_SB);
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

	public static class ReferenceIdContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<TerminalNode> CLOSE_SB() { return getTokens(MarkdownParser.CLOSE_SB); }
		public TerminalNode CLOSE_SB(int i) {
			return getToken(MarkdownParser.CLOSE_SB, i);
		}
		public ReferenceIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferenceId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferenceId(this);
		}
	}

	public final ReferenceIdContext referenceId() throws RecognitionException {
		ReferenceIdContext _localctx = new ReferenceIdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_referenceId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(426);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CLOSE_SB || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(429); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0) );
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

	public static class ReferenceUrlContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<TerminalNode> OPEN_ANGLE_BRACKET() { return getTokens(MarkdownParser.OPEN_ANGLE_BRACKET); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode CLOSE_ANGLE_BRACKET(int i) {
			return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, i);
		}
		public TerminalNode OPEN_ANGLE_BRACKET(int i) {
			return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_ANGLE_BRACKET() { return getTokens(MarkdownParser.CLOSE_ANGLE_BRACKET); }
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public ReferenceUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferenceUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferenceUrl(this);
		}
	}

	public final ReferenceUrlContext referenceUrl() throws RecognitionException {
		ReferenceUrlContext _localctx = new ReferenceUrlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_referenceUrl);
		int _la;
		try {
			int _alt;
			setState(444);
			switch (_input.LA(1)) {
			case OPEN_ANGLE_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(431); match(OPEN_ANGLE_BRACKET);
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(432);
						matchWildcard();
						}
						} 
					}
					setState(437);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(438); match(CLOSE_ANGLE_BRACKET);
				}
				break;
			case EMPH:
			case MINUS:
			case UNDERSCORE:
			case OPEN_PAREN:
			case CLOSE_PAREN:
			case OPEN_SB:
			case CLOSE_SB:
			case DOUBLE_QUOTE:
			case SINGLE_QUOTE:
			case COLON:
			case SEMI_COLON:
			case AT:
			case EXCLAMATION_MARK:
			case HTML_COMMENT_OPEN:
			case SLASH:
			case PERIOD:
			case EQUAL:
			case AMPERSAND:
			case BACKSLASH:
			case BACKTICK:
			case PLUS:
			case OPEN_CURLY:
			case CLOSE_CURLY:
			case D:
			case I:
			case V:
			case S:
			case P:
			case A:
			case N:
			case H:
			case R:
			case SETEXT_BOTTOM_1:
			case SETEXT_BOTTOM_2:
			case ATX_START:
			case SHARP:
			case LINE_BREAK:
			case BLANK_LINE:
			case HEX_CHAR:
			case NORMAL_CHAR:
			case DIGIT:
			case SPECIAL_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(440); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(439);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << CLOSE_ANGLE_BRACKET) | (1L << NEWLINE) | (1L << OPEN_ANGLE_BRACKET))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(442); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << SPECIAL_CHAR))) != 0) );
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

	public static class ReferenceTitleContext extends ParserRuleContext {
		public ReferenceTitleSingleContext referenceTitleSingle() {
			return getRuleContext(ReferenceTitleSingleContext.class,0);
		}
		public ReferenceTitleParensContext referenceTitleParens() {
			return getRuleContext(ReferenceTitleParensContext.class,0);
		}
		public ReferenceTitleDoubleContext referenceTitleDouble() {
			return getRuleContext(ReferenceTitleDoubleContext.class,0);
		}
		public ReferenceTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferenceTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferenceTitle(this);
		}
	}

	public final ReferenceTitleContext referenceTitle() throws RecognitionException {
		ReferenceTitleContext _localctx = new ReferenceTitleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_referenceTitle);
		try {
			setState(449);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(446); referenceTitleSingle();
				}
				break;
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(447); referenceTitleDouble();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(448); referenceTitleParens();
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

	public static class ReferenceTitleSingleContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(MarkdownParser.SINGLE_QUOTE, i);
		}
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(MarkdownParser.SINGLE_QUOTE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public ReferenceTitleSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceTitleSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferenceTitleSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferenceTitleSingle(this);
		}
	}

	public final ReferenceTitleSingleContext referenceTitleSingle() throws RecognitionException {
		ReferenceTitleSingleContext _localctx = new ReferenceTitleSingleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_referenceTitleSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); match(SINGLE_QUOTE);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << DOUBLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0)) {
				{
				{
				setState(452);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SINGLE_QUOTE || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458); match(SINGLE_QUOTE);
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

	public static class ReferenceTitleDoubleContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(MarkdownParser.DOUBLE_QUOTE, i);
		}
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(MarkdownParser.DOUBLE_QUOTE); }
		public ReferenceTitleDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceTitleDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferenceTitleDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferenceTitleDouble(this);
		}
	}

	public final ReferenceTitleDoubleContext referenceTitleDouble() throws RecognitionException {
		ReferenceTitleDoubleContext _localctx = new ReferenceTitleDoubleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_referenceTitleDouble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); match(DOUBLE_QUOTE);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0)) {
				{
				{
				setState(461);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==DOUBLE_QUOTE || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467); match(DOUBLE_QUOTE);
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

	public static class ReferenceTitleParensContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MarkdownParser.CLOSE_PAREN); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MarkdownParser.CLOSE_PAREN, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MarkdownParser.OPEN_PAREN, 0); }
		public ReferenceTitleParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceTitleParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferenceTitleParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferenceTitleParens(this);
		}
	}

	public final ReferenceTitleParensContext referenceTitleParens() throws RecognitionException {
		ReferenceTitleParensContext _localctx = new ReferenceTitleParensContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_referenceTitleParens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); match(OPEN_PAREN);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0)) {
				{
				{
				setState(470);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CLOSE_PAREN || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476); match(CLOSE_PAREN);
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

	public static class OrderedListContext extends ParserRuleContext {
		public int _level;
		public boolean nextItemWithPar;
		public OrderedListItemContext orderedListItem(int i) {
			return getRuleContext(OrderedListItemContext.class,i);
		}
		public List<OrderedListItemContext> orderedListItem() {
			return getRuleContexts(OrderedListItemContext.class);
		}
		public OrderedListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OrderedListContext(ParserRuleContext parent, int invokingState, int _level) {
			super(parent, invokingState);
			this._level = _level;
		}
		@Override public int getRuleIndex() { return RULE_orderedList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterOrderedList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitOrderedList(this);
		}
	}

	public final OrderedListContext orderedList(int _level) throws RecognitionException {
		OrderedListContext _localctx = new OrderedListContext(_ctx, getState(), _level);
		enterRule(_localctx, 50, RULE_orderedList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(478);
					if (!(followListItem(1, _localctx._level, true))) throw new FailedPredicateException(this, "followListItem(1, $_level, true)");
					setState(479); orderedListItem(_level);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(482); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class BulletListContext extends ParserRuleContext {
		public int _level;
		public boolean nextItemWithPar;
		public List<BulletListItemContext> bulletListItem() {
			return getRuleContexts(BulletListItemContext.class);
		}
		public BulletListItemContext bulletListItem(int i) {
			return getRuleContext(BulletListItemContext.class,i);
		}
		public BulletListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BulletListContext(ParserRuleContext parent, int invokingState, int _level) {
			super(parent, invokingState);
			this._level = _level;
		}
		@Override public int getRuleIndex() { return RULE_bulletList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterBulletList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitBulletList(this);
		}
	}

	public final BulletListContext bulletList(int _level) throws RecognitionException {
		BulletListContext _localctx = new BulletListContext(_ctx, getState(), _level);
		enterRule(_localctx, 52, RULE_bulletList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(486); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(484);
					if (!(followListItem(1, _localctx._level, true))) throw new FailedPredicateException(this, "followListItem(1, $_level, true)");
					setState(485); bulletListItem(_level);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(488); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class OrderedListItemContext extends ParserRuleContext {
		public int _level;
		public boolean isWithPar;
		public TerminalNode DIGIT(int i) {
			return getToken(MarkdownParser.DIGIT, i);
		}
		public List<BlockQuoteContext> blockQuote() {
			return getRuleContexts(BlockQuoteContext.class);
		}
		public List<TerminalNode> BLANK_LINE() { return getTokens(MarkdownParser.BLANK_LINE); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public ListItemBlankLineContext listItemBlankLine(int i) {
			return getRuleContext(ListItemBlankLineContext.class,i);
		}
		public List<InlineListItemContext> inlineListItem() {
			return getRuleContexts(InlineListItemContext.class);
		}
		public InlineListItemContext inlineListItem(int i) {
			return getRuleContext(InlineListItemContext.class,i);
		}
		public TerminalNode BLANK_LINE(int i) {
			return getToken(MarkdownParser.BLANK_LINE, i);
		}
		public VerbatimContext verbatim(int i) {
			return getRuleContext(VerbatimContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public List<OrderedListContext> orderedList() {
			return getRuleContexts(OrderedListContext.class);
		}
		public OrderedListContext orderedList(int i) {
			return getRuleContext(OrderedListContext.class,i);
		}
		public List<BulletListContext> bulletList() {
			return getRuleContexts(BulletListContext.class);
		}
		public List<ListItemBlankLineContext> listItemBlankLine() {
			return getRuleContexts(ListItemBlankLineContext.class);
		}
		public BlockQuoteContext blockQuote(int i) {
			return getRuleContext(BlockQuoteContext.class,i);
		}
		public BulletListContext bulletList(int i) {
			return getRuleContext(BulletListContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MarkdownParser.DIGIT); }
		public List<VerbatimContext> verbatim() {
			return getRuleContexts(VerbatimContext.class);
		}
		public TerminalNode PERIOD() { return getToken(MarkdownParser.PERIOD, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public OrderedListItemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OrderedListItemContext(ParserRuleContext parent, int invokingState, int _level) {
			super(parent, invokingState);
			this._level = _level;
		}
		@Override public int getRuleIndex() { return RULE_orderedListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterOrderedListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitOrderedListItem(this);
		}
	}

	public final OrderedListItemContext orderedListItem(int _level) throws RecognitionException {
		OrderedListItemContext _localctx = new OrderedListItemContext(_ctx, getState(), _level);
		enterRule(_localctx, 54, RULE_orderedListItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK_LINE) {
				{
				{
				setState(490); match(BLANK_LINE);
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(496);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502); match(DIGIT);
				}
				}
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(507); match(PERIOD);
			setState(509); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(508);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==TAB) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(511); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(513); inlineListItem(_level);
			setState(544);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(514);
				if (!(followListItem(1, _localctx._level+1))) throw new FailedPredicateException(this, "followListItem(1, $_level+1)");
				setState(517);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(515); orderedList(_level+1);
					}
					break;

				case 2:
					{
					setState(516); bulletList(_level+1);
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(540); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(519);
						if (!(followVerbatim(_localctx._level+1, true) || followListItem(1, _localctx._level+1, true) || followContinuation(_localctx._level, true))) throw new FailedPredicateException(this, "followVerbatim($_level+1, true) || followListItem(1, $_level+1, true) || followContinuation($_level, true)");
						setState(520); listItemBlankLine();
						setState(538);
						switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
						case 1:
							{
							setState(521);
							if (!(followVerbatim(_localctx._level+1, true))) throw new FailedPredicateException(this, "followVerbatim($_level+1, true)");
							setState(522); verbatim(_level+1);
							}
							break;

						case 2:
							{
							setState(523);
							if (!(followListItem(1, _localctx._level+1, true))) throw new FailedPredicateException(this, "followListItem(1, $_level+1, true)");
							setState(526);
							switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
							case 1:
								{
								setState(524); orderedList(_level+1);
								}
								break;

							case 2:
								{
								setState(525); bulletList(_level+1);
								}
								break;
							}
							}
							break;

						case 3:
							{
							setState(528);
							if (!(followBlockquote(_localctx._level+1))) throw new FailedPredicateException(this, "followBlockquote($_level+1)");
							setState(529); blockQuote(_level+1);
							}
							break;

						case 4:
							{
							setState(530);
							if (!(followContinuation(_localctx._level, true))) throw new FailedPredicateException(this, "followContinuation($_level, true)");
							setState(534);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
							while ( _alt!=2 && _alt!=-1 ) {
								if ( _alt==1 ) {
									{
									{
									setState(531);
									_la = _input.LA(1);
									if ( !(_la==SPACE || _la==TAB) ) {
									_errHandler.recoverInline(this);
									}
									consume();
									}
									} 
								}
								setState(536);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
							}
							setState(537); inlineListItem(_level);
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(542); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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

	public static class BulletListItemContext extends ParserRuleContext {
		public int _level;
		public boolean isWithPar;
		public List<BlockQuoteContext> blockQuote() {
			return getRuleContexts(BlockQuoteContext.class);
		}
		public List<TerminalNode> BLANK_LINE() { return getTokens(MarkdownParser.BLANK_LINE); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public ListItemBlankLineContext listItemBlankLine(int i) {
			return getRuleContext(ListItemBlankLineContext.class,i);
		}
		public List<InlineListItemContext> inlineListItem() {
			return getRuleContexts(InlineListItemContext.class);
		}
		public InlineListItemContext inlineListItem(int i) {
			return getRuleContext(InlineListItemContext.class,i);
		}
		public TerminalNode BLANK_LINE(int i) {
			return getToken(MarkdownParser.BLANK_LINE, i);
		}
		public VerbatimContext verbatim(int i) {
			return getRuleContext(VerbatimContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public List<OrderedListContext> orderedList() {
			return getRuleContexts(OrderedListContext.class);
		}
		public TerminalNode MINUS() { return getToken(MarkdownParser.MINUS, 0); }
		public OrderedListContext orderedList(int i) {
			return getRuleContext(OrderedListContext.class,i);
		}
		public List<BulletListContext> bulletList() {
			return getRuleContexts(BulletListContext.class);
		}
		public TerminalNode EMPH() { return getToken(MarkdownParser.EMPH, 0); }
		public List<ListItemBlankLineContext> listItemBlankLine() {
			return getRuleContexts(ListItemBlankLineContext.class);
		}
		public BlockQuoteContext blockQuote(int i) {
			return getRuleContext(BlockQuoteContext.class,i);
		}
		public BulletListContext bulletList(int i) {
			return getRuleContext(BulletListContext.class,i);
		}
		public List<VerbatimContext> verbatim() {
			return getRuleContexts(VerbatimContext.class);
		}
		public TerminalNode PLUS() { return getToken(MarkdownParser.PLUS, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public BulletListItemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BulletListItemContext(ParserRuleContext parent, int invokingState, int _level) {
			super(parent, invokingState);
			this._level = _level;
		}
		@Override public int getRuleIndex() { return RULE_bulletListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterBulletListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitBulletListItem(this);
		}
	}

	public final BulletListItemContext bulletListItem(int _level) throws RecognitionException {
		BulletListItemContext _localctx = new BulletListItemContext(_ctx, getState(), _level);
		enterRule(_localctx, 56, RULE_bulletListItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK_LINE) {
				{
				{
				setState(546); match(BLANK_LINE);
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(552);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPH) | (1L << MINUS) | (1L << PLUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(560); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(559);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==TAB) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(562); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(564); inlineListItem(_level);
			setState(595);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(565);
				if (!(followListItem(1, _localctx._level+1))) throw new FailedPredicateException(this, "followListItem(1, $_level+1)");
				setState(568);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(566); orderedList(_level+1);
					}
					break;

				case 2:
					{
					setState(567); bulletList(_level+1);
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(591); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(570);
						if (!(followVerbatim(_localctx._level+1, true) || followListItem(1, _localctx._level+1, true) || followContinuation(_localctx._level, true))) throw new FailedPredicateException(this, "followVerbatim($_level+1, true) || followListItem(1, $_level+1, true) || followContinuation($_level, true)");
						setState(571); listItemBlankLine();
						setState(589);
						switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
						case 1:
							{
							setState(572);
							if (!(followVerbatim(_localctx._level+1, true))) throw new FailedPredicateException(this, "followVerbatim($_level+1, true)");
							setState(573); verbatim(_level+1);
							}
							break;

						case 2:
							{
							setState(574);
							if (!(followListItem(1, _localctx._level+1, true))) throw new FailedPredicateException(this, "followListItem(1, $_level+1, true)");
							setState(577);
							switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
							case 1:
								{
								setState(575); orderedList(_level+1);
								}
								break;

							case 2:
								{
								setState(576); bulletList(_level+1);
								}
								break;
							}
							}
							break;

						case 3:
							{
							setState(579);
							if (!(followBlockquote(_localctx._level+1))) throw new FailedPredicateException(this, "followBlockquote($_level+1)");
							setState(580); blockQuote(_level+1);
							}
							break;

						case 4:
							{
							setState(581);
							if (!(followContinuation(_localctx._level, true))) throw new FailedPredicateException(this, "followContinuation($_level, true)");
							setState(585);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
							while ( _alt!=2 && _alt!=-1 ) {
								if ( _alt==1 ) {
									{
									{
									setState(582);
									_la = _input.LA(1);
									if ( !(_la==SPACE || _la==TAB) ) {
									_errHandler.recoverInline(this);
									}
									consume();
									}
									} 
								}
								setState(587);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
							}
							setState(588); inlineListItem(_level);
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(593); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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

	public static class InlineListItemContext extends ParserRuleContext {
		public int _level;
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public InlineListItemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InlineListItemContext(ParserRuleContext parent, int invokingState, int _level) {
			super(parent, invokingState);
			this._level = _level;
		}
		@Override public int getRuleIndex() { return RULE_inlineListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterInlineListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitInlineListItem(this);
		}
	}

	public final InlineListItemContext inlineListItem(int _level) throws RecognitionException {
		InlineListItemContext _localctx = new InlineListItemContext(_ctx, getState(), _level);
		enterRule(_localctx, 58, RULE_inlineListItem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(597);
					if (!(!followListItem(1, _localctx._level) && !followListItem(1, _localctx._level-1) && !followListItem(1, _localctx._level+1))) throw new FailedPredicateException(this, "!followListItem(1, $_level) && !followListItem(1, $_level-1) && !followListItem(1, $_level+1)");
					setState(598); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(601); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class ListItemBlankLineContext extends ParserRuleContext {
		public List<TerminalNode> BLANK_LINE() { return getTokens(MarkdownParser.BLANK_LINE); }
		public TerminalNode BLANK_LINE(int i) {
			return getToken(MarkdownParser.BLANK_LINE, i);
		}
		public ListItemBlankLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemBlankLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterListItemBlankLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitListItemBlankLine(this);
		}
	}

	public final ListItemBlankLineContext listItemBlankLine() throws RecognitionException {
		ListItemBlankLineContext _localctx = new ListItemBlankLineContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listItemBlankLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(603); match(BLANK_LINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(606); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public NonIndentSpaceContext nonIndentSpace() {
			return getRuleContext(NonIndentSpaceContext.class,0);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_para);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608); nonIndentSpace();
			setState(610); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(609); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(612); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(614); match(NEWLINE);
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

	public static class InlineContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(MarkdownParser.UNDERSCORE, 0); }
		public TerminalNode OPEN_ANGLE_BRACKET() { return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, 0); }
		public TerminalNode BACKSLASH() { return getToken(MarkdownParser.BACKSLASH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(MarkdownParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_SB() { return getToken(MarkdownParser.CLOSE_SB, 0); }
		public TerminalNode I() { return getToken(MarkdownParser.I, 0); }
		public TerminalNode NORMAL_CHAR() { return getToken(MarkdownParser.NORMAL_CHAR, 0); }
		public TerminalNode BACKTICK() { return getToken(MarkdownParser.BACKTICK, 0); }
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, 0); }
		public TerminalNode OPEN_SB() { return getToken(MarkdownParser.OPEN_SB, 0); }
		public TerminalNode AMPERSAND() { return getToken(MarkdownParser.AMPERSAND, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(MarkdownParser.SINGLE_QUOTE, 0); }
		public SpanContext span() {
			return getRuleContext(SpanContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(MarkdownParser.DIGIT, 0); }
		public TerminalNode PLUS() { return getToken(MarkdownParser.PLUS, 0); }
		public TerminalNode SPECIAL_CHAR() { return getToken(MarkdownParser.SPECIAL_CHAR, 0); }
		public TerminalNode V() { return getToken(MarkdownParser.V, 0); }
		public TerminalNode HEX_CHAR() { return getToken(MarkdownParser.HEX_CHAR, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(MarkdownParser.CLOSE_PAREN, 0); }
		public TerminalNode R() { return getToken(MarkdownParser.R, 0); }
		public TerminalNode SPACE() { return getToken(MarkdownParser.SPACE, 0); }
		public TerminalNode LINE_BREAK() { return getToken(MarkdownParser.LINE_BREAK, 0); }
		public TerminalNode MINUS() { return getToken(MarkdownParser.MINUS, 0); }
		public TerminalNode N() { return getToken(MarkdownParser.N, 0); }
		public TerminalNode AT() { return getToken(MarkdownParser.AT, 0); }
		public TerminalNode DOUBLE_QUOTE() { return getToken(MarkdownParser.DOUBLE_QUOTE, 0); }
		public TerminalNode P() { return getToken(MarkdownParser.P, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(MarkdownParser.OPEN_CURLY, 0); }
		public TerminalNode EMPH() { return getToken(MarkdownParser.EMPH, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MarkdownParser.SEMI_COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public TerminalNode SHARP() { return getToken(MarkdownParser.SHARP, 0); }
		public TerminalNode S() { return getToken(MarkdownParser.S, 0); }
		public TerminalNode D() { return getToken(MarkdownParser.D, 0); }
		public TerminalNode H() { return getToken(MarkdownParser.H, 0); }
		public TerminalNode A() { return getToken(MarkdownParser.A, 0); }
		public TerminalNode EXCLAMATION_MARK() { return getToken(MarkdownParser.EXCLAMATION_MARK, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(MarkdownParser.CLOSE_CURLY, 0); }
		public TerminalNode COLON() { return getToken(MarkdownParser.COLON, 0); }
		public TerminalNode SLASH() { return getToken(MarkdownParser.SLASH, 0); }
		public TerminalNode TAB() { return getToken(MarkdownParser.TAB, 0); }
		public TerminalNode PERIOD() { return getToken(MarkdownParser.PERIOD, 0); }
		public InlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterInline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitInline(this);
		}
	}

	public final InlineContext inline() throws RecognitionException {
		InlineContext _localctx = new InlineContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_inline);
		try {
			setState(658);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616); span();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617); match(HEX_CHAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(618); match(NORMAL_CHAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(619); match(DIGIT);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(620); match(NEWLINE);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(621); match(LINE_BREAK);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(622); match(SPACE);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(623); match(TAB);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(624); match(SPECIAL_CHAR);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(625); match(EMPH);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(626); match(UNDERSCORE);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(627); match(COLON);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(628); match(SEMI_COLON);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(629); match(SLASH);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(630); match(PERIOD);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(631); match(OPEN_ANGLE_BRACKET);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(632); match(CLOSE_ANGLE_BRACKET);
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(633); match(OPEN_PAREN);
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(634); match(CLOSE_PAREN);
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(635); match(EXCLAMATION_MARK);
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(636); match(SHARP);
				}
				break;

			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(637); match(OPEN_SB);
				}
				break;

			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(638); match(CLOSE_SB);
				}
				break;

			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(639); match(AMPERSAND);
				}
				break;

			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(640); match(BACKSLASH);
				}
				break;

			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(641); match(SINGLE_QUOTE);
				}
				break;

			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(642); match(DOUBLE_QUOTE);
				}
				break;

			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(643); match(BACKTICK);
				}
				break;

			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(644); match(PLUS);
				}
				break;

			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(645); match(MINUS);
				}
				break;

			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(646); match(OPEN_CURLY);
				}
				break;

			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(647); match(CLOSE_CURLY);
				}
				break;

			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(648); match(D);
				}
				break;

			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(649); match(I);
				}
				break;

			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(650); match(V);
				}
				break;

			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(651); match(S);
				}
				break;

			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(652); match(P);
				}
				break;

			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(653); match(A);
				}
				break;

			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(654); match(N);
				}
				break;

			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(655); match(H);
				}
				break;

			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(656); match(R);
				}
				break;

			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(657); match(AT);
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

	public static class SpanContext extends ParserRuleContext {
		public HtmlBlockInTagsContext htmlBlockInTags() {
			return getRuleContext(HtmlBlockInTagsContext.class,0);
		}
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public HtmlBlockInSelfClosingContext htmlBlockInSelfClosing() {
			return getRuleContext(HtmlBlockInSelfClosingContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public EscapedCharContext escapedChar() {
			return getRuleContext(EscapedCharContext.class,0);
		}
		public AutolinkContext autolink() {
			return getRuleContext(AutolinkContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public EmphContext emph() {
			return getRuleContext(EmphContext.class,0);
		}
		public StrongContext strong() {
			return getRuleContext(StrongContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SpanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_span; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitSpan(this);
		}
	}

	public final SpanContext span() throws RecognitionException {
		SpanContext _localctx = new SpanContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_span);
		try {
			setState(670);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660); strong();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661); emph();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(662); image();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(663); link();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(664); code();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(665); htmlBlockInTags();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(666); htmlBlockInSelfClosing();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(667); autolink();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(668); entity();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(669); escapedChar();
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

	public static class EmphContext extends ParserRuleContext {
		public EmphStarContext emphStar() {
			return getRuleContext(EmphStarContext.class,0);
		}
		public EmphUlContext emphUl() {
			return getRuleContext(EmphUlContext.class,0);
		}
		public EmphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterEmph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitEmph(this);
		}
	}

	public final EmphContext emph() throws RecognitionException {
		EmphContext _localctx = new EmphContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_emph);
		try {
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672); emphStar();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673); emphUl();
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

	public static class EmphStarContext extends ParserRuleContext {
		public TerminalNode EMPH(int i) {
			return getToken(MarkdownParser.EMPH, i);
		}
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public List<TerminalNode> EMPH() { return getTokens(MarkdownParser.EMPH); }
		public EmphStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emphStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterEmphStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitEmphStar(this);
		}
	}

	public final EmphStarContext emphStar() throws RecognitionException {
		EmphStarContext _localctx = new EmphStarContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_emphStar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			if (!(!tokenStartsWith(2, " ") && !tokenIs(2, EMPH))) throw new FailedPredicateException(this, "!tokenStartsWith(2, \" \") && !tokenIs(2, EMPH)");
			setState(677); match(EMPH);
			setState(679); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(678); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(681); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			setState(683); match(EMPH);
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

	public static class EmphUlContext extends ParserRuleContext {
		public List<TerminalNode> UNDERSCORE() { return getTokens(MarkdownParser.UNDERSCORE); }
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MarkdownParser.UNDERSCORE, i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public EmphUlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emphUl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterEmphUl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitEmphUl(this);
		}
	}

	public final EmphUlContext emphUl() throws RecognitionException {
		EmphUlContext _localctx = new EmphUlContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_emphUl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			if (!(!tokenStartsWith(2, " ") && !tokenIs(2, UNDERSCORE))) throw new FailedPredicateException(this, "!tokenStartsWith(2, \" \") && !tokenIs(2, UNDERSCORE)");
			setState(686); match(UNDERSCORE);
			setState(688); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(687); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(690); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(692); match(UNDERSCORE);
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

	public static class StrongContext extends ParserRuleContext {
		public StrongUlContext strongUl() {
			return getRuleContext(StrongUlContext.class,0);
		}
		public StrongStarContext strongStar() {
			return getRuleContext(StrongStarContext.class,0);
		}
		public StrongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterStrong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitStrong(this);
		}
	}

	public final StrongContext strong() throws RecognitionException {
		StrongContext _localctx = new StrongContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_strong);
		try {
			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694); strongStar();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695); strongUl();
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

	public static class StrongStarContext extends ParserRuleContext {
		public TerminalNode EMPH(int i) {
			return getToken(MarkdownParser.EMPH, i);
		}
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public List<TerminalNode> EMPH() { return getTokens(MarkdownParser.EMPH); }
		public StrongStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strongStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterStrongStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitStrongStar(this);
		}
	}

	public final StrongStarContext strongStar() throws RecognitionException {
		StrongStarContext _localctx = new StrongStarContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_strongStar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			if (!(!tokenStartsWith(3, " "))) throw new FailedPredicateException(this, "!tokenStartsWith(3, \" \")");
			setState(699); match(EMPH);
			setState(700); match(EMPH);
			setState(702); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(701); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(704); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			setState(706); match(EMPH);
			setState(707); match(EMPH);
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

	public static class StrongUlContext extends ParserRuleContext {
		public List<TerminalNode> UNDERSCORE() { return getTokens(MarkdownParser.UNDERSCORE); }
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public TerminalNode UNDERSCORE(int i) {
			return getToken(MarkdownParser.UNDERSCORE, i);
		}
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public StrongUlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strongUl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterStrongUl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitStrongUl(this);
		}
	}

	public final StrongUlContext strongUl() throws RecognitionException {
		StrongUlContext _localctx = new StrongUlContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_strongUl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			if (!(!tokenStartsWith(3, " "))) throw new FailedPredicateException(this, "!tokenStartsWith(3, \" \")");
			setState(710); match(UNDERSCORE);
			setState(711); match(UNDERSCORE);
			setState(713); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(712); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(715); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(717); match(UNDERSCORE);
			setState(718); match(UNDERSCORE);
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

	public static class ImageContext extends ParserRuleContext {
		public ImageLinkContext imageLink() {
			return getRuleContext(ImageLinkContext.class,0);
		}
		public TerminalNode EXCLAMATION_MARK() { return getToken(MarkdownParser.EXCLAMATION_MARK, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitImage(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720); match(EXCLAMATION_MARK);
			setState(721); imageLink();
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

	public static class ImageLinkContext extends ParserRuleContext {
		public ImageAltContext imageAlt() {
			return getRuleContext(ImageAltContext.class,0);
		}
		public ExplicitImageLinkContext explicitImageLink() {
			return getRuleContext(ExplicitImageLinkContext.class,0);
		}
		public ReferenceImageLinkContext referenceImageLink() {
			return getRuleContext(ReferenceImageLinkContext.class,0);
		}
		public ImageLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterImageLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitImageLink(this);
		}
	}

	public final ImageLinkContext imageLink() throws RecognitionException {
		ImageLinkContext _localctx = new ImageLinkContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_imageLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723); imageAlt();
			setState(726);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				setState(724); explicitImageLink();
				}
				break;
			case OPEN_SB:
				{
				setState(725); referenceImageLink();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExplicitImageLinkContext extends ParserRuleContext {
		public TerminalNode CLOSE_PAREN() { return getToken(MarkdownParser.CLOSE_PAREN, 0); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public LinkTitleContext linkTitle() {
			return getRuleContext(LinkTitleContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MarkdownParser.OPEN_PAREN, 0); }
		public LinkUrlContext linkUrl() {
			return getRuleContext(LinkUrlContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public ExplicitImageLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitImageLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterExplicitImageLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitExplicitImageLink(this);
		}
	}

	public final ExplicitImageLinkContext explicitImageLink() throws RecognitionException {
		ExplicitImageLinkContext _localctx = new ExplicitImageLinkContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_explicitImageLink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); match(OPEN_PAREN);
			setState(729); linkUrl();
			setState(736);
			_la = _input.LA(1);
			if (_la==SPACE || _la==TAB) {
				{
				setState(731); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(730);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==TAB) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(733); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE || _la==TAB );
				setState(735); linkTitle();
				}
			}

			setState(738); match(CLOSE_PAREN);
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

	public static class ImageAltContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode OPEN_SB() { return getToken(MarkdownParser.OPEN_SB, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<TerminalNode> CLOSE_SB() { return getTokens(MarkdownParser.CLOSE_SB); }
		public TerminalNode CLOSE_SB(int i) {
			return getToken(MarkdownParser.CLOSE_SB, i);
		}
		public ImageAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterImageAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitImageAlt(this);
		}
	}

	public final ImageAltContext imageAlt() throws RecognitionException {
		ImageAltContext _localctx = new ImageAltContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_imageAlt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); match(OPEN_SB);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0)) {
				{
				{
				setState(741);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CLOSE_SB || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(747); match(CLOSE_SB);
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

	public static class ReferenceImageLinkContext extends ParserRuleContext {
		public ReferenceIdContext referenceId() {
			return getRuleContext(ReferenceIdContext.class,0);
		}
		public TerminalNode OPEN_SB() { return getToken(MarkdownParser.OPEN_SB, 0); }
		public TerminalNode CLOSE_SB() { return getToken(MarkdownParser.CLOSE_SB, 0); }
		public ReferenceImageLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceImageLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferenceImageLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferenceImageLink(this);
		}
	}

	public final ReferenceImageLinkContext referenceImageLink() throws RecognitionException {
		ReferenceImageLinkContext _localctx = new ReferenceImageLinkContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_referenceImageLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749); match(OPEN_SB);
			setState(750); referenceId();
			setState(751); match(CLOSE_SB);
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

	public static class LinkContext extends ParserRuleContext {
		public ExplicitLinkContext explicitLink() {
			return getRuleContext(ExplicitLinkContext.class,0);
		}
		public LinkContentContext linkContent() {
			return getRuleContext(LinkContentContext.class,0);
		}
		public ReferenceLinkContext referenceLink() {
			return getRuleContext(ReferenceLinkContext.class,0);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753); linkContent();
			setState(756);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(754); explicitLink();
				}
				break;

			case 2:
				{
				setState(755); referenceLink();
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

	public static class LinkContentContext extends ParserRuleContext {
		public TerminalNode OPEN_SB() { return getToken(MarkdownParser.OPEN_SB, 0); }
		public InlineContext inline(int i) {
			return getRuleContext(InlineContext.class,i);
		}
		public TerminalNode CLOSE_SB() { return getToken(MarkdownParser.CLOSE_SB, 0); }
		public List<InlineContext> inline() {
			return getRuleContexts(InlineContext.class);
		}
		public LinkContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterLinkContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitLinkContent(this);
		}
	}

	public final LinkContentContext linkContent() throws RecognitionException {
		LinkContentContext _localctx = new LinkContentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_linkContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758); match(OPEN_SB);
			setState(760); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(759); inline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(762); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			setState(764); match(CLOSE_SB);
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

	public static class ExplicitLinkContext extends ParserRuleContext {
		public TerminalNode CLOSE_PAREN() { return getToken(MarkdownParser.CLOSE_PAREN, 0); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public LinkTitleContext linkTitle() {
			return getRuleContext(LinkTitleContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(MarkdownParser.OPEN_PAREN, 0); }
		public LinkUrlContext linkUrl() {
			return getRuleContext(LinkUrlContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public ExplicitLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterExplicitLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitExplicitLink(this);
		}
	}

	public final ExplicitLinkContext explicitLink() throws RecognitionException {
		ExplicitLinkContext _localctx = new ExplicitLinkContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_explicitLink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766); match(OPEN_PAREN);
			setState(768);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0)) {
				{
				setState(767); linkUrl();
				}
			}

			setState(776);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(771); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(770);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==TAB) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(773); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE || _la==TAB );
				setState(775); linkTitle();
				}
				break;
			}
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(778);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784); match(CLOSE_PAREN);
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

	public static class LinkUrlContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MarkdownParser.CLOSE_PAREN); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MarkdownParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public LinkUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterLinkUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitLinkUrl(this);
		}
	}

	public final LinkUrlContext linkUrl() throws RecognitionException {
		LinkUrlContext _localctx = new LinkUrlContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_linkUrl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(786);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << CLOSE_PAREN) | (1L << NEWLINE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(789); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0) );
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

	public static class LinkTitleContext extends ParserRuleContext {
		public LinkTitleSingleContext linkTitleSingle() {
			return getRuleContext(LinkTitleSingleContext.class,0);
		}
		public LinkTitleDoubleContext linkTitleDouble() {
			return getRuleContext(LinkTitleDoubleContext.class,0);
		}
		public LinkTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterLinkTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitLinkTitle(this);
		}
	}

	public final LinkTitleContext linkTitle() throws RecognitionException {
		LinkTitleContext _localctx = new LinkTitleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_linkTitle);
		try {
			setState(793);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(791); linkTitleSingle();
				}
				break;
			case DOUBLE_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(792); linkTitleDouble();
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

	public static class LinkTitleSingleContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(MarkdownParser.SINGLE_QUOTE, i);
		}
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(MarkdownParser.SINGLE_QUOTE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public LinkTitleSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkTitleSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterLinkTitleSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitLinkTitleSingle(this);
		}
	}

	public final LinkTitleSingleContext linkTitleSingle() throws RecognitionException {
		LinkTitleSingleContext _localctx = new LinkTitleSingleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_linkTitleSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); match(SINGLE_QUOTE);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << DOUBLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0)) {
				{
				{
				setState(796);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SINGLE_QUOTE || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802); match(SINGLE_QUOTE);
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

	public static class LinkTitleDoubleContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MarkdownParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MarkdownParser.NEWLINE, i);
		}
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(MarkdownParser.DOUBLE_QUOTE, i);
		}
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(MarkdownParser.DOUBLE_QUOTE); }
		public LinkTitleDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkTitleDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterLinkTitleDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitLinkTitleDouble(this);
		}
	}

	public final LinkTitleDoubleContext linkTitleDouble() throws RecognitionException {
		LinkTitleDoubleContext _localctx = new LinkTitleDoubleContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_linkTitleDouble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804); match(DOUBLE_QUOTE);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0)) {
				{
				{
				setState(805);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==DOUBLE_QUOTE || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811); match(DOUBLE_QUOTE);
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

	public static class ReferenceLinkContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public ReferenceIdContext referenceId() {
			return getRuleContext(ReferenceIdContext.class,0);
		}
		public TerminalNode OPEN_SB() { return getToken(MarkdownParser.OPEN_SB, 0); }
		public TerminalNode SPACE() { return getToken(MarkdownParser.SPACE, 0); }
		public TerminalNode CLOSE_SB() { return getToken(MarkdownParser.CLOSE_SB, 0); }
		public TerminalNode TAB() { return getToken(MarkdownParser.TAB, 0); }
		public ReferenceLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterReferenceLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitReferenceLink(this);
		}
	}

	public final ReferenceLinkContext referenceLink() throws RecognitionException {
		ReferenceLinkContext _localctx = new ReferenceLinkContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_referenceLink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << NEWLINE))) != 0)) {
				{
				setState(813);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << NEWLINE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(816); match(OPEN_SB);
			setState(818);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << BLANK_LINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0)) {
				{
				setState(817); referenceId();
				}
			}

			setState(820); match(CLOSE_SB);
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

	public static class EntityContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(MarkdownParser.SHARP, 0); }
		public TerminalNode SEMI_COLON() { return getToken(MarkdownParser.SEMI_COLON, 0); }
		public TerminalNode AMPERSAND() { return getToken(MarkdownParser.AMPERSAND, 0); }
		public DecEntityNameContext decEntityName() {
			return getRuleContext(DecEntityNameContext.class,0);
		}
		public HexEntityNameContext hexEntityName() {
			return getRuleContext(HexEntityNameContext.class,0);
		}
		public CharEntityNameContext charEntityName() {
			return getRuleContext(CharEntityNameContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitEntity(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822); match(AMPERSAND);
			setState(828);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(823); match(SHARP);
				setState(824); hexEntityName();
				}
				break;

			case 2:
				{
				setState(825); match(SHARP);
				setState(826); decEntityName();
				}
				break;

			case 3:
				{
				setState(827); charEntityName();
				}
				break;
			}
			setState(830); match(SEMI_COLON);
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

	public static class HexEntityNameContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(MarkdownParser.DIGIT, i);
		}
		public List<TerminalNode> HEX_CHAR() { return getTokens(MarkdownParser.HEX_CHAR); }
		public List<TerminalNode> DIGIT() { return getTokens(MarkdownParser.DIGIT); }
		public TerminalNode A(int i) {
			return getToken(MarkdownParser.A, i);
		}
		public TerminalNode D(int i) {
			return getToken(MarkdownParser.D, i);
		}
		public List<TerminalNode> D() { return getTokens(MarkdownParser.D); }
		public TerminalNode HEX_CHAR(int i) {
			return getToken(MarkdownParser.HEX_CHAR, i);
		}
		public List<TerminalNode> A() { return getTokens(MarkdownParser.A); }
		public HexEntityNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexEntityName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHexEntityName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHexEntityName(this);
		}
	}

	public final HexEntityNameContext hexEntityName() throws RecognitionException {
		HexEntityNameContext _localctx = new HexEntityNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_hexEntityName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(832);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D) | (1L << A) | (1L << HEX_CHAR) | (1L << DIGIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(835); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D) | (1L << A) | (1L << HEX_CHAR) | (1L << DIGIT))) != 0) );
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

	public static class DecEntityNameContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(MarkdownParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MarkdownParser.DIGIT); }
		public DecEntityNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decEntityName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterDecEntityName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitDecEntityName(this);
		}
	}

	public final DecEntityNameContext decEntityName() throws RecognitionException {
		DecEntityNameContext _localctx = new DecEntityNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_decEntityName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(837); match(DIGIT);
				}
				}
				setState(840); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class CharEntityNameContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(MarkdownParser.DIGIT, i);
		}
		public List<TerminalNode> V() { return getTokens(MarkdownParser.V); }
		public List<TerminalNode> HEX_CHAR() { return getTokens(MarkdownParser.HEX_CHAR); }
		public List<TerminalNode> R() { return getTokens(MarkdownParser.R); }
		public TerminalNode I(int i) {
			return getToken(MarkdownParser.I, i);
		}
		public TerminalNode R(int i) {
			return getToken(MarkdownParser.R, i);
		}
		public TerminalNode V(int i) {
			return getToken(MarkdownParser.V, i);
		}
		public TerminalNode N(int i) {
			return getToken(MarkdownParser.N, i);
		}
		public TerminalNode NORMAL_CHAR(int i) {
			return getToken(MarkdownParser.NORMAL_CHAR, i);
		}
		public TerminalNode D(int i) {
			return getToken(MarkdownParser.D, i);
		}
		public List<TerminalNode> N() { return getTokens(MarkdownParser.N); }
		public List<TerminalNode> I() { return getTokens(MarkdownParser.I); }
		public List<TerminalNode> NORMAL_CHAR() { return getTokens(MarkdownParser.NORMAL_CHAR); }
		public List<TerminalNode> P() { return getTokens(MarkdownParser.P); }
		public TerminalNode S(int i) {
			return getToken(MarkdownParser.S, i);
		}
		public List<TerminalNode> S() { return getTokens(MarkdownParser.S); }
		public TerminalNode P(int i) {
			return getToken(MarkdownParser.P, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(MarkdownParser.DIGIT); }
		public TerminalNode A(int i) {
			return getToken(MarkdownParser.A, i);
		}
		public TerminalNode HEX_CHAR(int i) {
			return getToken(MarkdownParser.HEX_CHAR, i);
		}
		public List<TerminalNode> D() { return getTokens(MarkdownParser.D); }
		public List<TerminalNode> H() { return getTokens(MarkdownParser.H); }
		public TerminalNode H(int i) {
			return getToken(MarkdownParser.H, i);
		}
		public List<TerminalNode> A() { return getTokens(MarkdownParser.A); }
		public CharEntityNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charEntityName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterCharEntityName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitCharEntityName(this);
		}
	}

	public final CharEntityNameContext charEntityName() throws RecognitionException {
		CharEntityNameContext _localctx = new CharEntityNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_charEntityName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(842);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(845); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT))) != 0) );
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

	public static class EscapedCharContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(MarkdownParser.UNDERSCORE, 0); }
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(MarkdownParser.CLOSE_PAREN); }
		public TerminalNode OPEN_ANGLE_BRACKET() { return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, 0); }
		public List<TerminalNode> BACKSLASH() { return getTokens(MarkdownParser.BACKSLASH); }
		public TerminalNode MINUS() { return getToken(MarkdownParser.MINUS, 0); }
		public TerminalNode CLOSE_SB() { return getToken(MarkdownParser.CLOSE_SB, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(MarkdownParser.OPEN_PAREN); }
		public TerminalNode BACKSLASH(int i) {
			return getToken(MarkdownParser.BACKSLASH, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(MarkdownParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, 0); }
		public TerminalNode BACKTICK() { return getToken(MarkdownParser.BACKTICK, 0); }
		public TerminalNode EMPH() { return getToken(MarkdownParser.EMPH, 0); }
		public TerminalNode SHARP() { return getToken(MarkdownParser.SHARP, 0); }
		public TerminalNode OPEN_SB() { return getToken(MarkdownParser.OPEN_SB, 0); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(MarkdownParser.CLOSE_PAREN, i);
		}
		public TerminalNode PLUS() { return getToken(MarkdownParser.PLUS, 0); }
		public TerminalNode EXCLAMATION_MARK() { return getToken(MarkdownParser.EXCLAMATION_MARK, 0); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(MarkdownParser.OPEN_PAREN, i);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(MarkdownParser.CLOSE_CURLY, 0); }
		public TerminalNode PERIOD() { return getToken(MarkdownParser.PERIOD, 0); }
		public EscapedCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterEscapedChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitEscapedChar(this);
		}
	}

	public final EscapedCharContext escapedChar() throws RecognitionException {
		EscapedCharContext _localctx = new EscapedCharContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_escapedChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847); match(BACKSLASH);
			setState(848);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << CLOSE_ANGLE_BRACKET) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << EXCLAMATION_MARK) | (1L << PERIOD) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << SHARP) | (1L << OPEN_ANGLE_BRACKET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CodeContext extends ParserRuleContext {
		public BacktickCodeContext backtickCode() {
			return getRuleContext(BacktickCodeContext.class,0);
		}
		public DoubleBacktickCodeContext doubleBacktickCode() {
			return getRuleContext(DoubleBacktickCodeContext.class,0);
		}
		public SpaceBacktickCodeContext spaceBacktickCode() {
			return getRuleContext(SpaceBacktickCodeContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_code);
		try {
			setState(853);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850); spaceBacktickCode();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(851); doubleBacktickCode();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(852); backtickCode();
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

	public static class BacktickCodeContext extends ParserRuleContext {
		public TerminalNode BACKTICK(int i) {
			return getToken(MarkdownParser.BACKTICK, i);
		}
		public List<TerminalNode> BACKTICK() { return getTokens(MarkdownParser.BACKTICK); }
		public BacktickCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backtickCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterBacktickCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitBacktickCode(this);
		}
	}

	public final BacktickCodeContext backtickCode() throws RecognitionException {
		BacktickCodeContext _localctx = new BacktickCodeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_backtickCode);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			if (!(!tokenIs(2, BACKTICK))) throw new FailedPredicateException(this, "!tokenIs(2, BACKTICK)");
			setState(856); match(BACKTICK);
			setState(859); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(857);
					if (!(!tokenIs(1, BLANK_LINE))) throw new FailedPredicateException(this, "!tokenIs(1, BLANK_LINE)");
					setState(858);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(861); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			setState(863); match(BACKTICK);
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

	public static class DoubleBacktickCodeContext extends ParserRuleContext {
		public TerminalNode BACKTICK(int i) {
			return getToken(MarkdownParser.BACKTICK, i);
		}
		public List<TerminalNode> BACKTICK() { return getTokens(MarkdownParser.BACKTICK); }
		public DoubleBacktickCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleBacktickCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterDoubleBacktickCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitDoubleBacktickCode(this);
		}
	}

	public final DoubleBacktickCodeContext doubleBacktickCode() throws RecognitionException {
		DoubleBacktickCodeContext _localctx = new DoubleBacktickCodeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_doubleBacktickCode);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			if (!(!tokenIs(3, SPACE) && !tokenIs(3, TAB))) throw new FailedPredicateException(this, "!tokenIs(3, SPACE) && !tokenIs(3, TAB)");
			setState(866); match(BACKTICK);
			setState(867); match(BACKTICK);
			setState(870); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(868);
					if (!(!tokenIs(1, BLANK_LINE))) throw new FailedPredicateException(this, "!tokenIs(1, BLANK_LINE)");
					setState(869);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(872); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			setState(874); match(BACKTICK);
			setState(875); match(BACKTICK);
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

	public static class SpaceBacktickCodeContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode BACKTICK(int i) {
			return getToken(MarkdownParser.BACKTICK, i);
		}
		public List<TerminalNode> BACKTICK() { return getTokens(MarkdownParser.BACKTICK); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public SpaceBacktickCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaceBacktickCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterSpaceBacktickCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitSpaceBacktickCode(this);
		}
	}

	public final SpaceBacktickCodeContext spaceBacktickCode() throws RecognitionException {
		SpaceBacktickCodeContext _localctx = new SpaceBacktickCodeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_spaceBacktickCode);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(877); match(BACKTICK);
			setState(878); match(BACKTICK);
			setState(879); match(SPACE);
			setState(882); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(880);
					if (!(!tokenIs(1, BLANK_LINE))) throw new FailedPredicateException(this, "!tokenIs(1, BLANK_LINE)");
					setState(881);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(884); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			setState(886); match(SPACE);
			setState(887); match(BACKTICK);
			setState(888); match(BACKTICK);
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

	public static class AttributeNameContext extends ParserRuleContext {
		public List<TerminalNode> V() { return getTokens(MarkdownParser.V); }
		public List<TerminalNode> HEX_CHAR() { return getTokens(MarkdownParser.HEX_CHAR); }
		public List<TerminalNode> R() { return getTokens(MarkdownParser.R); }
		public TerminalNode I(int i) {
			return getToken(MarkdownParser.I, i);
		}
		public TerminalNode R(int i) {
			return getToken(MarkdownParser.R, i);
		}
		public TerminalNode V(int i) {
			return getToken(MarkdownParser.V, i);
		}
		public TerminalNode N(int i) {
			return getToken(MarkdownParser.N, i);
		}
		public TerminalNode NORMAL_CHAR(int i) {
			return getToken(MarkdownParser.NORMAL_CHAR, i);
		}
		public TerminalNode D(int i) {
			return getToken(MarkdownParser.D, i);
		}
		public List<TerminalNode> N() { return getTokens(MarkdownParser.N); }
		public List<TerminalNode> I() { return getTokens(MarkdownParser.I); }
		public List<TerminalNode> NORMAL_CHAR() { return getTokens(MarkdownParser.NORMAL_CHAR); }
		public List<TerminalNode> P() { return getTokens(MarkdownParser.P); }
		public TerminalNode S(int i) {
			return getToken(MarkdownParser.S, i);
		}
		public List<TerminalNode> S() { return getTokens(MarkdownParser.S); }
		public TerminalNode P(int i) {
			return getToken(MarkdownParser.P, i);
		}
		public TerminalNode A(int i) {
			return getToken(MarkdownParser.A, i);
		}
		public TerminalNode HEX_CHAR(int i) {
			return getToken(MarkdownParser.HEX_CHAR, i);
		}
		public List<TerminalNode> D() { return getTokens(MarkdownParser.D); }
		public List<TerminalNode> H() { return getTokens(MarkdownParser.H); }
		public TerminalNode H(int i) {
			return getToken(MarkdownParser.H, i);
		}
		public List<TerminalNode> A() { return getTokens(MarkdownParser.A); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(890);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(893); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR))) != 0) );
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

	public static class HtmlAttributeSContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(MarkdownParser.SINGLE_QUOTE, i);
		}
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(MarkdownParser.SINGLE_QUOTE); }
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MarkdownParser.EQUAL, 0); }
		public HtmlAttributeSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlAttributeS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlAttributeS(this);
		}
	}

	public final HtmlAttributeSContext htmlAttributeS() throws RecognitionException {
		HtmlAttributeSContext _localctx = new HtmlAttributeSContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_htmlAttributeS);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(895); attributeName();
			setState(896); match(EQUAL);
			setState(897); match(SINGLE_QUOTE);
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(898);
					matchWildcard();
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			setState(904); match(SINGLE_QUOTE);
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

	public static class HtmlAttributeDContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MarkdownParser.EQUAL, 0); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(MarkdownParser.DOUBLE_QUOTE, i);
		}
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(MarkdownParser.DOUBLE_QUOTE); }
		public HtmlAttributeDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlAttributeD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlAttributeD(this);
		}
	}

	public final HtmlAttributeDContext htmlAttributeD() throws RecognitionException {
		HtmlAttributeDContext _localctx = new HtmlAttributeDContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_htmlAttributeD);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(906); attributeName();
			setState(907); match(EQUAL);
			setState(908); match(DOUBLE_QUOTE);
			setState(912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(909);
					matchWildcard();
					}
					} 
				}
				setState(914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(915); match(DOUBLE_QUOTE);
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

	public static class HtmlBlockOpenDivContext extends ParserRuleContext {
		public TerminalNode V() { return getToken(MarkdownParser.V, 0); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public List<HtmlAttributeSContext> htmlAttributeS() {
			return getRuleContexts(HtmlAttributeSContext.class);
		}
		public TerminalNode OPEN_ANGLE_BRACKET() { return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, 0); }
		public List<HtmlAttributeDContext> htmlAttributeD() {
			return getRuleContexts(HtmlAttributeDContext.class);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode I() { return getToken(MarkdownParser.I, 0); }
		public HtmlAttributeDContext htmlAttributeD(int i) {
			return getRuleContext(HtmlAttributeDContext.class,i);
		}
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, 0); }
		public HtmlAttributeSContext htmlAttributeS(int i) {
			return getRuleContext(HtmlAttributeSContext.class,i);
		}
		public TerminalNode D() { return getToken(MarkdownParser.D, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public HtmlBlockOpenDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockOpenDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockOpenDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockOpenDiv(this);
		}
	}

	public final HtmlBlockOpenDivContext htmlBlockOpenDiv() throws RecognitionException {
		HtmlBlockOpenDivContext _localctx = new HtmlBlockOpenDivContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlBlockOpenDiv);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(917); match(OPEN_ANGLE_BRACKET);
			setState(918); match(D);
			setState(919); match(I);
			setState(920); match(V);
			setState(932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(922); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(921);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(924); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE || _la==TAB );
					setState(928);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(926); htmlAttributeS();
						}
						break;

					case 2:
						{
						setState(927); htmlAttributeD();
						}
						break;
					}
					}
					} 
				}
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(935);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(941); match(CLOSE_ANGLE_BRACKET);
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

	public static class HtmlBlockCloseDivContext extends ParserRuleContext {
		public TerminalNode V() { return getToken(MarkdownParser.V, 0); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public TerminalNode OPEN_ANGLE_BRACKET() { return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode D() { return getToken(MarkdownParser.D, 0); }
		public TerminalNode I() { return getToken(MarkdownParser.I, 0); }
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, 0); }
		public TerminalNode SLASH() { return getToken(MarkdownParser.SLASH, 0); }
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public HtmlBlockCloseDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockCloseDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockCloseDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockCloseDiv(this);
		}
	}

	public final HtmlBlockCloseDivContext htmlBlockCloseDiv() throws RecognitionException {
		HtmlBlockCloseDivContext _localctx = new HtmlBlockCloseDivContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_htmlBlockCloseDiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943); match(OPEN_ANGLE_BRACKET);
			setState(944); match(SLASH);
			setState(945); match(D);
			setState(946); match(I);
			setState(947); match(V);
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(948);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(954); match(CLOSE_ANGLE_BRACKET);
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

	public static class HtmlBlockDivContext extends ParserRuleContext {
		public List<HtmlBlockDivContext> htmlBlockDiv() {
			return getRuleContexts(HtmlBlockDivContext.class);
		}
		public HtmlBlockDivContext htmlBlockDiv(int i) {
			return getRuleContext(HtmlBlockDivContext.class,i);
		}
		public HtmlBlockOpenDivContext htmlBlockOpenDiv() {
			return getRuleContext(HtmlBlockOpenDivContext.class,0);
		}
		public HtmlBlockCloseDivContext htmlBlockCloseDiv() {
			return getRuleContext(HtmlBlockCloseDivContext.class,0);
		}
		public HtmlBlockDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockDiv(this);
		}
	}

	public final HtmlBlockDivContext htmlBlockDiv() throws RecognitionException {
		HtmlBlockDivContext _localctx = new HtmlBlockDivContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_htmlBlockDiv);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(956); htmlBlockOpenDiv();
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(959);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(957); htmlBlockDiv();
						}
						break;

					case 2:
						{
						setState(958);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(964); htmlBlockCloseDiv();
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

	public static class HtmlBlockOpenSpanContext extends ParserRuleContext {
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public List<HtmlAttributeSContext> htmlAttributeS() {
			return getRuleContexts(HtmlAttributeSContext.class);
		}
		public TerminalNode OPEN_ANGLE_BRACKET() { return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, 0); }
		public List<HtmlAttributeDContext> htmlAttributeD() {
			return getRuleContexts(HtmlAttributeDContext.class);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public HtmlAttributeDContext htmlAttributeD(int i) {
			return getRuleContext(HtmlAttributeDContext.class,i);
		}
		public TerminalNode N() { return getToken(MarkdownParser.N, 0); }
		public TerminalNode P() { return getToken(MarkdownParser.P, 0); }
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, 0); }
		public TerminalNode S() { return getToken(MarkdownParser.S, 0); }
		public HtmlAttributeSContext htmlAttributeS(int i) {
			return getRuleContext(HtmlAttributeSContext.class,i);
		}
		public TerminalNode A() { return getToken(MarkdownParser.A, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public HtmlBlockOpenSpanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockOpenSpan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockOpenSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockOpenSpan(this);
		}
	}

	public final HtmlBlockOpenSpanContext htmlBlockOpenSpan() throws RecognitionException {
		HtmlBlockOpenSpanContext _localctx = new HtmlBlockOpenSpanContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_htmlBlockOpenSpan);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(966); match(OPEN_ANGLE_BRACKET);
			setState(967); match(S);
			setState(968); match(P);
			setState(969); match(A);
			setState(970); match(N);
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(972); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(971);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(974); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE || _la==TAB );
					setState(978);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						setState(976); htmlAttributeS();
						}
						break;

					case 2:
						{
						setState(977); htmlAttributeD();
						}
						break;
					}
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(985);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991); match(CLOSE_ANGLE_BRACKET);
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

	public static class HtmlBlockCloseSpanContext extends ParserRuleContext {
		public TerminalNode S() { return getToken(MarkdownParser.S, 0); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public TerminalNode OPEN_ANGLE_BRACKET() { return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, 0); }
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode A() { return getToken(MarkdownParser.A, 0); }
		public TerminalNode N() { return getToken(MarkdownParser.N, 0); }
		public TerminalNode P() { return getToken(MarkdownParser.P, 0); }
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, 0); }
		public TerminalNode SLASH() { return getToken(MarkdownParser.SLASH, 0); }
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public HtmlBlockCloseSpanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockCloseSpan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockCloseSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockCloseSpan(this);
		}
	}

	public final HtmlBlockCloseSpanContext htmlBlockCloseSpan() throws RecognitionException {
		HtmlBlockCloseSpanContext _localctx = new HtmlBlockCloseSpanContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_htmlBlockCloseSpan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); match(OPEN_ANGLE_BRACKET);
			setState(994); match(SLASH);
			setState(995); match(S);
			setState(996); match(P);
			setState(997); match(A);
			setState(998); match(N);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(999);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1005); match(CLOSE_ANGLE_BRACKET);
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

	public static class HtmlBlockSpanContext extends ParserRuleContext {
		public HtmlBlockCloseSpanContext htmlBlockCloseSpan() {
			return getRuleContext(HtmlBlockCloseSpanContext.class,0);
		}
		public List<HtmlBlockSpanContext> htmlBlockSpan() {
			return getRuleContexts(HtmlBlockSpanContext.class);
		}
		public HtmlBlockSpanContext htmlBlockSpan(int i) {
			return getRuleContext(HtmlBlockSpanContext.class,i);
		}
		public HtmlBlockOpenSpanContext htmlBlockOpenSpan() {
			return getRuleContext(HtmlBlockOpenSpanContext.class,0);
		}
		public HtmlBlockSpanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockSpan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockSpan(this);
		}
	}

	public final HtmlBlockSpanContext htmlBlockSpan() throws RecognitionException {
		HtmlBlockSpanContext _localctx = new HtmlBlockSpanContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_htmlBlockSpan);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); htmlBlockOpenSpan();
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(1010);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						setState(1008); htmlBlockSpan();
						}
						break;

					case 2:
						{
						setState(1009);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(1015); htmlBlockCloseSpan();
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

	public static class HtmlBlockHrContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(MarkdownParser.R, 0); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public List<HtmlAttributeSContext> htmlAttributeS() {
			return getRuleContexts(HtmlAttributeSContext.class);
		}
		public TerminalNode OPEN_ANGLE_BRACKET() { return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, 0); }
		public List<HtmlAttributeDContext> htmlAttributeD() {
			return getRuleContexts(HtmlAttributeDContext.class);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public HtmlAttributeDContext htmlAttributeD(int i) {
			return getRuleContext(HtmlAttributeDContext.class,i);
		}
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, 0); }
		public HtmlAttributeSContext htmlAttributeS(int i) {
			return getRuleContext(HtmlAttributeSContext.class,i);
		}
		public TerminalNode H() { return getToken(MarkdownParser.H, 0); }
		public TerminalNode SLASH() { return getToken(MarkdownParser.SLASH, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public HtmlBlockHrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockHr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockHr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockHr(this);
		}
	}

	public final HtmlBlockHrContext htmlBlockHr() throws RecognitionException {
		HtmlBlockHrContext _localctx = new HtmlBlockHrContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_htmlBlockHr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1017); match(OPEN_ANGLE_BRACKET);
			setState(1018); match(H);
			setState(1019); match(R);
			setState(1031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1021); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1020);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(1023); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE || _la==TAB );
					setState(1027);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(1025); htmlAttributeS();
						}
						break;

					case 2:
						{
						setState(1026); htmlAttributeD();
						}
						break;
					}
					}
					} 
				}
				setState(1033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			setState(1037);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1034);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==TAB) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(1039);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1041);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1040); match(SLASH);
				}
			}

			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(1043);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1049); match(CLOSE_ANGLE_BRACKET);
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

	public static class HtmlBlockInTagsContext extends ParserRuleContext {
		public HtmlBlockSpanContext htmlBlockSpan() {
			return getRuleContext(HtmlBlockSpanContext.class,0);
		}
		public HtmlBlockDivContext htmlBlockDiv() {
			return getRuleContext(HtmlBlockDivContext.class,0);
		}
		public HtmlBlockHrContext htmlBlockHr() {
			return getRuleContext(HtmlBlockHrContext.class,0);
		}
		public HtmlBlockInTagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockInTags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockInTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockInTags(this);
		}
	}

	public final HtmlBlockInTagsContext htmlBlockInTags() throws RecognitionException {
		HtmlBlockInTagsContext _localctx = new HtmlBlockInTagsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_htmlBlockInTags);
		try {
			setState(1054);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051); htmlBlockDiv();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052); htmlBlockSpan();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1053); htmlBlockHr();
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

	public static class HtmlBlockInSelfClosingContext extends ParserRuleContext {
		public List<HtmlAttributeSContext> htmlAttributeS() {
			return getRuleContexts(HtmlAttributeSContext.class);
		}
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public List<HtmlAttributeDContext> htmlAttributeD() {
			return getRuleContexts(HtmlAttributeDContext.class);
		}
		public TerminalNode OPEN_ANGLE_BRACKET() { return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, 0); }
		public HtmlAttributeSContext htmlAttributeS(int i) {
			return getRuleContext(HtmlAttributeSContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public HtmlAttributeDContext htmlAttributeD(int i) {
			return getRuleContext(HtmlAttributeDContext.class,i);
		}
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, 0); }
		public TerminalNode SLASH() { return getToken(MarkdownParser.SLASH, 0); }
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public HtmlBlockInSelfClosingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBlockInSelfClosing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlBlockInSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlBlockInSelfClosing(this);
		}
	}

	public final HtmlBlockInSelfClosingContext htmlBlockInSelfClosing() throws RecognitionException {
		HtmlBlockInSelfClosingContext _localctx = new HtmlBlockInSelfClosingContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_htmlBlockInSelfClosing);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056); match(OPEN_ANGLE_BRACKET);
			setState(1057); attributeName();
			setState(1069);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1059); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(1058);
						_la = _input.LA(1);
						if ( !(_la==SPACE || _la==TAB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(1061); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SPACE || _la==TAB );
					setState(1065);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						setState(1063); htmlAttributeS();
						}
						break;

					case 2:
						{
						setState(1064); htmlAttributeD();
						}
						break;
					}
					}
					} 
				}
				setState(1071);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(1072);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1078); match(SLASH);
			setState(1079); match(CLOSE_ANGLE_BRACKET);
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

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MarkdownParser.NEWLINE, 0); }
		public TerminalNode MINUS(int i) {
			return getToken(MarkdownParser.MINUS, i);
		}
		public TerminalNode TAB(int i) {
			return getToken(MarkdownParser.TAB, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(MarkdownParser.SPACE); }
		public TerminalNode LINE_BREAK() { return getToken(MarkdownParser.LINE_BREAK, 0); }
		public List<TerminalNode> MINUS() { return getTokens(MarkdownParser.MINUS); }
		public TerminalNode HTML_COMMENT_OPEN() { return getToken(MarkdownParser.HTML_COMMENT_OPEN, 0); }
		public TerminalNode CLOSE_ANGLE_BRACKET() { return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, 0); }
		public List<TerminalNode> TAB() { return getTokens(MarkdownParser.TAB); }
		public TerminalNode SPACE(int i) {
			return getToken(MarkdownParser.SPACE, i);
		}
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitHtmlComment(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_htmlComment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1081); match(HTML_COMMENT_OPEN);
			setState(1085);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1082);
					matchWildcard();
					}
					} 
				}
				setState(1087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			setState(1088); match(MINUS);
			setState(1089); match(MINUS);
			setState(1090); match(CLOSE_ANGLE_BRACKET);
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==TAB) {
				{
				{
				setState(1091);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==TAB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1097);
			_la = _input.LA(1);
			if ( !(_la==LINE_BREAK || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AutolinkContext extends ParserRuleContext {
		public List<TerminalNode> BLANK_LINE() { return getTokens(MarkdownParser.BLANK_LINE); }
		public TerminalNode OPEN_ANGLE_BRACKET() { return getToken(MarkdownParser.OPEN_ANGLE_BRACKET, 0); }
		public TerminalNode BLANK_LINE(int i) {
			return getToken(MarkdownParser.BLANK_LINE, i);
		}
		public TerminalNode CLOSE_ANGLE_BRACKET(int i) {
			return getToken(MarkdownParser.CLOSE_ANGLE_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_ANGLE_BRACKET() { return getTokens(MarkdownParser.CLOSE_ANGLE_BRACKET); }
		public AutolinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autolink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).enterAutolink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownParserListener ) ((MarkdownParserListener)listener).exitAutolink(this);
		}
	}

	public final AutolinkContext autolink() throws RecognitionException {
		AutolinkContext _localctx = new AutolinkContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_autolink);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099); match(OPEN_ANGLE_BRACKET);
			setState(1101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1100);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CLOSE_ANGLE_BRACKET || _la==BLANK_LINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(1103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << TAB) | (1L << EMPH) | (1L << MINUS) | (1L << UNDERSCORE) | (1L << OPEN_PAREN) | (1L << CLOSE_PAREN) | (1L << OPEN_SB) | (1L << CLOSE_SB) | (1L << DOUBLE_QUOTE) | (1L << SINGLE_QUOTE) | (1L << COLON) | (1L << SEMI_COLON) | (1L << AT) | (1L << EXCLAMATION_MARK) | (1L << HTML_COMMENT_OPEN) | (1L << SLASH) | (1L << PERIOD) | (1L << EQUAL) | (1L << AMPERSAND) | (1L << BACKSLASH) | (1L << BACKTICK) | (1L << PLUS) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << D) | (1L << I) | (1L << V) | (1L << S) | (1L << P) | (1L << A) | (1L << N) | (1L << H) | (1L << R) | (1L << SETEXT_BOTTOM_1) | (1L << SETEXT_BOTTOM_2) | (1L << ATX_START) | (1L << SHARP) | (1L << LINE_BREAK) | (1L << NEWLINE) | (1L << HEX_CHAR) | (1L << NORMAL_CHAR) | (1L << DIGIT) | (1L << OPEN_ANGLE_BRACKET) | (1L << SPECIAL_CHAR))) != 0) );
			setState(1105); match(CLOSE_ANGLE_BRACKET);
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
		case 1: return block_sempred((BlockContext)_localctx, predIndex);

		case 6: return setextHeading1_sempred((SetextHeading1Context)_localctx, predIndex);

		case 7: return setextHeading2_sempred((SetextHeading2Context)_localctx, predIndex);

		case 11: return blockQuote_sempred((BlockQuoteContext)_localctx, predIndex);

		case 13: return verbatim_sempred((VerbatimContext)_localctx, predIndex);

		case 25: return orderedList_sempred((OrderedListContext)_localctx, predIndex);

		case 26: return bulletList_sempred((BulletListContext)_localctx, predIndex);

		case 27: return orderedListItem_sempred((OrderedListItemContext)_localctx, predIndex);

		case 28: return bulletListItem_sempred((BulletListItemContext)_localctx, predIndex);

		case 29: return inlineListItem_sempred((InlineListItemContext)_localctx, predIndex);

		case 35: return emphStar_sempred((EmphStarContext)_localctx, predIndex);

		case 36: return emphUl_sempred((EmphUlContext)_localctx, predIndex);

		case 38: return strongStar_sempred((StrongStarContext)_localctx, predIndex);

		case 39: return strongUl_sempred((StrongUlContext)_localctx, predIndex);

		case 59: return backtickCode_sempred((BacktickCodeContext)_localctx, predIndex);

		case 60: return doubleBacktickCode_sempred((DoubleBacktickCodeContext)_localctx, predIndex);

		case 61: return spaceBacktickCode_sempred((SpaceBacktickCodeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean setextHeading2_sempred(SetextHeading2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return !tokenIs(1, NEWLINE);
		}
		return true;
	}
	private boolean setextHeading1_sempred(SetextHeading1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return !tokenIs(1, NEWLINE);
		}
		return true;
	}
	private boolean verbatim_sempred(VerbatimContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return followVerbatim(_localctx._level, true);
		}
		return true;
	}
	private boolean block_sempred(BlockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return followListItem(1, 0);

		case 1: return followListItem(1, 0);

		case 2: return followVerbatim(0);
		}
		return true;
	}
	private boolean emphStar_sempred(EmphStarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22: return !tokenStartsWith(2, " ") && !tokenIs(2, EMPH);
		}
		return true;
	}
	private boolean emphUl_sempred(EmphUlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23: return !tokenStartsWith(2, " ") && !tokenIs(2, UNDERSCORE);
		}
		return true;
	}
	private boolean doubleBacktickCode_sempred(DoubleBacktickCodeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29: return !tokenIs(1, BLANK_LINE);

		case 28: return !tokenIs(3, SPACE) && !tokenIs(3, TAB);
		}
		return true;
	}
	private boolean blockQuote_sempred(BlockQuoteContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return followBlockquote(_localctx._level);
		}
		return true;
	}
	private boolean spaceBacktickCode_sempred(SpaceBacktickCodeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30: return !tokenIs(1, BLANK_LINE);
		}
		return true;
	}
	private boolean bulletList_sempred(BulletListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return followListItem(1, _localctx._level, true);
		}
		return true;
	}
	private boolean backtickCode_sempred(BacktickCodeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27: return !tokenIs(1, BLANK_LINE);

		case 26: return !tokenIs(2, BACKTICK);
		}
		return true;
	}
	private boolean strongUl_sempred(StrongUlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25: return !tokenStartsWith(3, " ");
		}
		return true;
	}
	private boolean inlineListItem_sempred(InlineListItemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21: return !followListItem(1, _localctx._level) && !followListItem(1, _localctx._level-1) && !followListItem(1, _localctx._level+1);
		}
		return true;
	}
	private boolean bulletListItem_sempred(BulletListItemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return followVerbatim(_localctx._level+1, true);

		case 16: return followVerbatim(_localctx._level+1, true) || followListItem(1, _localctx._level+1, true) || followContinuation(_localctx._level, true);

		case 19: return followBlockquote(_localctx._level+1);

		case 18: return followListItem(1, _localctx._level+1, true);

		case 20: return followContinuation(_localctx._level, true);

		case 15: return followListItem(1, _localctx._level+1);
		}
		return true;
	}
	private boolean orderedList_sempred(OrderedListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return followListItem(1, _localctx._level, true);
		}
		return true;
	}
	private boolean orderedListItem_sempred(OrderedListItemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return followListItem(1, _localctx._level+1);

		case 10: return followVerbatim(_localctx._level+1, true) || followListItem(1, _localctx._level+1, true) || followContinuation(_localctx._level, true);

		case 11: return followVerbatim(_localctx._level+1, true);

		case 12: return followListItem(1, _localctx._level+1, true);

		case 13: return followBlockquote(_localctx._level+1);

		case 14: return followContinuation(_localctx._level, true);
		}
		return true;
	}
	private boolean strongStar_sempred(StrongStarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24: return !tokenStartsWith(3, " ");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0456\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\6\2\u009c\n\2\r\2\16\2\u009d\3\2\7\2\u00a1"+
		"\n\2\f\2\16\2\u00a4\13\2\3\2\5\2\u00a7\n\2\3\3\7\3\u00aa\n\3\f\3\16\3"+
		"\u00ad\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u00bd\n\3\3\4\3\4\7\4\u00c1\n\4\f\4\16\4\u00c4\13\4\3\4\3\4\3\5\3\5"+
		"\7\5\u00ca\n\5\f\5\16\5\u00cd\13\5\3\5\3\5\3\6\3\6\5\6\u00d3\n\6\3\7\3"+
		"\7\5\7\u00d7\n\7\3\b\3\b\6\b\u00db\n\b\r\b\16\b\u00dc\3\b\3\b\3\b\3\t"+
		"\3\t\6\t\u00e4\n\t\r\t\16\t\u00e5\3\t\3\t\3\t\3\n\3\n\3\n\6\n\u00ee\n"+
		"\n\r\n\16\n\u00ef\3\n\7\n\u00f3\n\n\f\n\16\n\u00f6\13\n\5\n\u00f8\n\n"+
		"\3\n\7\n\u00fb\n\n\f\n\16\n\u00fe\13\n\5\n\u0100\n\n\3\n\5\n\u0103\n\n"+
		"\3\n\3\n\3\13\7\13\u0108\n\13\f\13\16\13\u010b\13\13\3\13\3\13\3\f\5\f"+
		"\u0110\n\f\3\f\5\f\u0113\n\f\3\f\5\f\u0116\n\f\3\r\3\r\5\r\u011a\n\r\3"+
		"\r\7\r\u011d\n\r\f\r\16\r\u0120\13\r\3\r\3\r\5\r\u0124\n\r\3\r\6\r\u0127"+
		"\n\r\r\r\16\r\u0128\3\16\6\16\u012c\n\16\r\16\16\16\u012d\3\17\3\17\7"+
		"\17\u0132\n\17\f\17\16\17\u0135\13\17\3\17\6\17\u0138\n\17\r\17\16\17"+
		"\u0139\3\20\3\20\3\21\3\21\3\21\5\21\u0141\n\21\3\21\3\21\5\21\u0145\n"+
		"\21\3\21\3\21\5\21\u0149\n\21\3\21\7\21\u014c\n\21\f\21\16\21\u014f\13"+
		"\21\3\21\3\21\5\21\u0153\n\21\3\21\3\21\5\21\u0157\n\21\3\21\3\21\5\21"+
		"\u015b\n\21\3\21\7\21\u015e\n\21\f\21\16\21\u0161\13\21\3\21\3\21\5\21"+
		"\u0165\n\21\3\21\3\21\5\21\u0169\n\21\3\21\3\21\5\21\u016d\n\21\3\21\7"+
		"\21\u0170\n\21\f\21\16\21\u0173\13\21\5\21\u0175\n\21\3\21\3\21\3\21\5"+
		"\21\u017a\n\21\3\22\6\22\u017d\n\22\r\22\16\22\u017e\3\23\3\23\3\23\3"+
		"\23\6\23\u0185\n\23\r\23\16\23\u0186\3\23\3\23\6\23\u018b\n\23\r\23\16"+
		"\23\u018c\3\23\7\23\u0190\n\23\f\23\16\23\u0193\13\23\3\23\3\23\7\23\u0197"+
		"\n\23\f\23\16\23\u019a\13\23\5\23\u019c\n\23\3\23\5\23\u019f\n\23\3\23"+
		"\7\23\u01a2\n\23\f\23\16\23\u01a5\13\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\6\25\u01ae\n\25\r\25\16\25\u01af\3\26\3\26\7\26\u01b4\n\26\f\26"+
		"\16\26\u01b7\13\26\3\26\3\26\6\26\u01bb\n\26\r\26\16\26\u01bc\5\26\u01bf"+
		"\n\26\3\27\3\27\3\27\5\27\u01c4\n\27\3\30\3\30\7\30\u01c8\n\30\f\30\16"+
		"\30\u01cb\13\30\3\30\3\30\3\31\3\31\7\31\u01d1\n\31\f\31\16\31\u01d4\13"+
		"\31\3\31\3\31\3\32\3\32\7\32\u01da\n\32\f\32\16\32\u01dd\13\32\3\32\3"+
		"\32\3\33\3\33\6\33\u01e3\n\33\r\33\16\33\u01e4\3\34\3\34\6\34\u01e9\n"+
		"\34\r\34\16\34\u01ea\3\35\7\35\u01ee\n\35\f\35\16\35\u01f1\13\35\3\35"+
		"\7\35\u01f4\n\35\f\35\16\35\u01f7\13\35\3\35\6\35\u01fa\n\35\r\35\16\35"+
		"\u01fb\3\35\3\35\6\35\u0200\n\35\r\35\16\35\u0201\3\35\3\35\3\35\3\35"+
		"\5\35\u0208\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0211\n\35\3"+
		"\35\3\35\3\35\3\35\7\35\u0217\n\35\f\35\16\35\u021a\13\35\3\35\5\35\u021d"+
		"\n\35\6\35\u021f\n\35\r\35\16\35\u0220\5\35\u0223\n\35\3\36\7\36\u0226"+
		"\n\36\f\36\16\36\u0229\13\36\3\36\7\36\u022c\n\36\f\36\16\36\u022f\13"+
		"\36\3\36\3\36\6\36\u0233\n\36\r\36\16\36\u0234\3\36\3\36\3\36\3\36\5\36"+
		"\u023b\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0244\n\36\3\36\3"+
		"\36\3\36\3\36\7\36\u024a\n\36\f\36\16\36\u024d\13\36\3\36\5\36\u0250\n"+
		"\36\6\36\u0252\n\36\r\36\16\36\u0253\5\36\u0256\n\36\3\37\3\37\6\37\u025a"+
		"\n\37\r\37\16\37\u025b\3 \6 \u025f\n \r \16 \u0260\3!\3!\6!\u0265\n!\r"+
		"!\16!\u0266\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0295\n\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\5#\u02a1\n#\3$\3$\5$\u02a5\n$\3%\3%\3%\6%\u02aa"+
		"\n%\r%\16%\u02ab\3%\3%\3&\3&\3&\6&\u02b3\n&\r&\16&\u02b4\3&\3&\3\'\3\'"+
		"\5\'\u02bb\n\'\3(\3(\3(\3(\6(\u02c1\n(\r(\16(\u02c2\3(\3(\3(\3)\3)\3)"+
		"\3)\6)\u02cc\n)\r)\16)\u02cd\3)\3)\3)\3*\3*\3*\3+\3+\3+\5+\u02d9\n+\3"+
		",\3,\3,\6,\u02de\n,\r,\16,\u02df\3,\5,\u02e3\n,\3,\3,\3-\3-\7-\u02e9\n"+
		"-\f-\16-\u02ec\13-\3-\3-\3.\3.\3.\3.\3/\3/\3/\5/\u02f7\n/\3\60\3\60\6"+
		"\60\u02fb\n\60\r\60\16\60\u02fc\3\60\3\60\3\61\3\61\5\61\u0303\n\61\3"+
		"\61\6\61\u0306\n\61\r\61\16\61\u0307\3\61\5\61\u030b\n\61\3\61\7\61\u030e"+
		"\n\61\f\61\16\61\u0311\13\61\3\61\3\61\3\62\6\62\u0316\n\62\r\62\16\62"+
		"\u0317\3\63\3\63\5\63\u031c\n\63\3\64\3\64\7\64\u0320\n\64\f\64\16\64"+
		"\u0323\13\64\3\64\3\64\3\65\3\65\7\65\u0329\n\65\f\65\16\65\u032c\13\65"+
		"\3\65\3\65\3\66\5\66\u0331\n\66\3\66\3\66\5\66\u0335\n\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\5\67\u033f\n\67\3\67\3\67\38\68\u0344\n8"+
		"\r8\168\u0345\39\69\u0349\n9\r9\169\u034a\3:\6:\u034e\n:\r:\16:\u034f"+
		"\3;\3;\3;\3<\3<\3<\5<\u0358\n<\3=\3=\3=\3=\6=\u035e\n=\r=\16=\u035f\3"+
		"=\3=\3>\3>\3>\3>\3>\6>\u0369\n>\r>\16>\u036a\3>\3>\3>\3?\3?\3?\3?\3?\6"+
		"?\u0375\n?\r?\16?\u0376\3?\3?\3?\3?\3@\6@\u037e\n@\r@\16@\u037f\3A\3A"+
		"\3A\3A\7A\u0386\nA\fA\16A\u0389\13A\3A\3A\3B\3B\3B\3B\7B\u0391\nB\fB\16"+
		"B\u0394\13B\3B\3B\3C\3C\3C\3C\3C\6C\u039d\nC\rC\16C\u039e\3C\3C\5C\u03a3"+
		"\nC\7C\u03a5\nC\fC\16C\u03a8\13C\3C\7C\u03ab\nC\fC\16C\u03ae\13C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\7D\u03b8\nD\fD\16D\u03bb\13D\3D\3D\3E\3E\3E\7E\u03c2"+
		"\nE\fE\16E\u03c5\13E\3E\3E\3F\3F\3F\3F\3F\3F\6F\u03cf\nF\rF\16F\u03d0"+
		"\3F\3F\5F\u03d5\nF\7F\u03d7\nF\fF\16F\u03da\13F\3F\7F\u03dd\nF\fF\16F"+
		"\u03e0\13F\3F\3F\3G\3G\3G\3G\3G\3G\3G\7G\u03eb\nG\fG\16G\u03ee\13G\3G"+
		"\3G\3H\3H\3H\7H\u03f5\nH\fH\16H\u03f8\13H\3H\3H\3I\3I\3I\3I\6I\u0400\n"+
		"I\rI\16I\u0401\3I\3I\5I\u0406\nI\7I\u0408\nI\fI\16I\u040b\13I\3I\7I\u040e"+
		"\nI\fI\16I\u0411\13I\3I\5I\u0414\nI\3I\7I\u0417\nI\fI\16I\u041a\13I\3"+
		"I\3I\3J\3J\3J\5J\u0421\nJ\3K\3K\3K\6K\u0426\nK\rK\16K\u0427\3K\3K\5K\u042c"+
		"\nK\7K\u042e\nK\fK\16K\u0431\13K\3K\7K\u0434\nK\fK\16K\u0437\13K\3K\3"+
		"K\3K\3L\3L\7L\u043e\nL\fL\16L\u0441\13L\3L\3L\3L\3L\7L\u0447\nL\fL\16"+
		"L\u044a\13L\3L\3L\3M\3M\6M\u0450\nM\rM\16M\u0451\3M\3M\3M\17\u00ef\u01b5"+
		"\u02ab\u02c2\u02fc\u035f\u036a\u0376\u0387\u0392\u03c3\u03f6\u043f\2N"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\2\22\3\2\3\4\4\2**,,\3\2,,\4\2\f"+
		"\f,,\6\2\3\4\b\b,,\60\60\4\2\16\16,,\4\2\r\r,,\4\2\n\n,,\4\2\5\6\32\32"+
		"\5\2\3\4\n\n,,\4\2\3\4,,\6\2\35\35\"\"--//\4\2\35%-/\b\2\5\f\22\22\25"+
		"\25\30\34))\60\60\4\2\35%-.\4\2\b\b++\u04df\2\u009b\3\2\2\2\4\u00ab\3"+
		"\2\2\2\6\u00be\3\2\2\2\b\u00c7\3\2\2\2\n\u00d2\3\2\2\2\f\u00d6\3\2\2\2"+
		"\16\u00da\3\2\2\2\20\u00e3\3\2\2\2\22\u00ea\3\2\2\2\24\u0109\3\2\2\2\26"+
		"\u010f\3\2\2\2\30\u0117\3\2\2\2\32\u012b\3\2\2\2\34\u0137\3\2\2\2\36\u013b"+
		"\3\2\2\2 \u0179\3\2\2\2\"\u017c\3\2\2\2$\u0180\3\2\2\2&\u01a8\3\2\2\2"+
		"(\u01ad\3\2\2\2*\u01be\3\2\2\2,\u01c3\3\2\2\2.\u01c5\3\2\2\2\60\u01ce"+
		"\3\2\2\2\62\u01d7\3\2\2\2\64\u01e2\3\2\2\2\66\u01e8\3\2\2\28\u01ef\3\2"+
		"\2\2:\u0227\3\2\2\2<\u0259\3\2\2\2>\u025e\3\2\2\2@\u0262\3\2\2\2B\u0294"+
		"\3\2\2\2D\u02a0\3\2\2\2F\u02a4\3\2\2\2H\u02a6\3\2\2\2J\u02af\3\2\2\2L"+
		"\u02ba\3\2\2\2N\u02bc\3\2\2\2P\u02c7\3\2\2\2R\u02d2\3\2\2\2T\u02d5\3\2"+
		"\2\2V\u02da\3\2\2\2X\u02e6\3\2\2\2Z\u02ef\3\2\2\2\\\u02f3\3\2\2\2^\u02f8"+
		"\3\2\2\2`\u0300\3\2\2\2b\u0315\3\2\2\2d\u031b\3\2\2\2f\u031d\3\2\2\2h"+
		"\u0326\3\2\2\2j\u0330\3\2\2\2l\u0338\3\2\2\2n\u0343\3\2\2\2p\u0348\3\2"+
		"\2\2r\u034d\3\2\2\2t\u0351\3\2\2\2v\u0357\3\2\2\2x\u0359\3\2\2\2z\u0363"+
		"\3\2\2\2|\u036f\3\2\2\2~\u037d\3\2\2\2\u0080\u0381\3\2\2\2\u0082\u038c"+
		"\3\2\2\2\u0084\u0397\3\2\2\2\u0086\u03b1\3\2\2\2\u0088\u03be\3\2\2\2\u008a"+
		"\u03c8\3\2\2\2\u008c\u03e3\3\2\2\2\u008e\u03f1\3\2\2\2\u0090\u03fb\3\2"+
		"\2\2\u0092\u0420\3\2\2\2\u0094\u0422\3\2\2\2\u0096\u043b\3\2\2\2\u0098"+
		"\u044d\3\2\2\2\u009a\u009c\5\4\3\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a2\3\2\2\2\u009f"+
		"\u00a1\7+\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a7\7\2\2\3\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\3\3\2\2\2"+
		"\u00a8\u00aa\7+\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00bc\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00bd\5\6\4\2\u00af\u00bd\5\b\5\2\u00b0\u00bd\5\u0096L\2\u00b1\u00bd"+
		"\5\n\6\2\u00b2\u00bd\5 \21\2\u00b3\u00bd\5\30\r\2\u00b4\u00bd\5\"\22\2"+
		"\u00b5\u00b6\6\3\2\2\u00b6\u00bd\5\64\33\2\u00b7\u00b8\6\3\3\2\u00b8\u00bd"+
		"\5\66\34\2\u00b9\u00ba\6\3\4\2\u00ba\u00bd\5\34\17\2\u00bb\u00bd\5@!\2"+
		"\u00bc\u00ae\3\2\2\2\u00bc\u00af\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b1"+
		"\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc"+
		"\u00b5\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\5\3\2\2\2\u00be\u00c2\5\u0092J\2\u00bf\u00c1\t\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\t\3\2\2\u00c6"+
		"\7\3\2\2\2\u00c7\u00cb\5\u0094K\2\u00c8\u00ca\t\2\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\t\3\2\2\u00cf\t\3\2\2\2"+
		"\u00d0\u00d3\5\f\7\2\u00d1\u00d3\5\22\n\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\13\3\2\2\2\u00d4\u00d7\5\16\b\2\u00d5\u00d7\5\20\t\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\r\3\2\2\2\u00d8\u00d9\6\b\5\2"+
		"\u00d9\u00db\5B\"\2\u00da\u00d8\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7,\2\2\u00df"+
		"\u00e0\7&\2\2\u00e0\17\3\2\2\2\u00e1\u00e2\6\t\6\2\u00e2\u00e4\5B\"\2"+
		"\u00e3\u00e1\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\7\'\2\2\u00e9"+
		"\21\3\2\2\2\u00ea\u00eb\7(\2\2\u00eb\u00ed\t\2\2\2\u00ec\u00ee\5B\"\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f7\3\2\2\2\u00f1\u00f3\t\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00ff\3\2\2\2\u00f9\u00fb\7)\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u0103\t\2\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\t\3\2\2\u0105\23\3\2\2\2\u0106\u0108\n\4\2"+
		"\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7,\2\2\u010d"+
		"\25\3\2\2\2\u010e\u0110\7\3\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2"+
		"\2\u0110\u0112\3\2\2\2\u0111\u0113\7\3\2\2\u0112\u0111\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\7\3\2\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\27\3\2\2\2\u0117\u0126\6\r\7\3\u0118\u011a\5\32\16"+
		"\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u011d"+
		"\t\2\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\7\b"+
		"\2\2\u0122\u0124\t\2\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0127\5\24\13\2\u0126\u0119\3\2\2\2\u0127\u0128\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\31\3\2\2\2\u012a"+
		"\u012c\7+\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\33\3\2\2\2\u012f\u0133\6\17\b\3\u0130\u0132"+
		"\5\36\20\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138"+
		"\5\24\13\2\u0137\u012f\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\35\3\2\2\2\u013b\u013c\7+\2\2\u013c\37\3\2"+
		"\2\2\u013d\u0174\5\26\f\2\u013e\u0140\7\5\2\2\u013f\u0141\t\2\2\2\u0140"+
		"\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\7\5"+
		"\2\2\u0143\u0145\t\2\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u014d\7\5\2\2\u0147\u0149\t\2\2\2\u0148\u0147\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\7\5\2\2\u014b"+
		"\u0148\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0175\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\7\6\2\2\u0151"+
		"\u0153\t\2\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0156\7\6\2\2\u0155\u0157\t\2\2\2\u0156\u0155\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015f\7\6\2\2\u0159\u015b\t\2"+
		"\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015e\7\6\2\2\u015d\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0175\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0164\7\7\2\2\u0163\u0165\t\2\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0168\7\7\2\2\u0167\u0169\t\2\2\2\u0168"+
		"\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0171\7\7"+
		"\2\2\u016b\u016d\t\2\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0170\7\7\2\2\u016f\u016c\3\2\2\2\u0170\u0173\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u013e\3\2\2\2\u0174\u0150\3\2\2\2\u0174\u0162\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7,\2\2\u0177\u017a\3\2\2\2\u0178"+
		"\u017a\7\'\2\2\u0179\u013d\3\2\2\2\u0179\u0178\3\2\2\2\u017a!\3\2\2\2"+
		"\u017b\u017d\5$\23\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f#\3\2\2\2\u0180\u0181\5\26\f\2\u0181"+
		"\u0182\5&\24\2\u0182\u0184\7\17\2\2\u0183\u0185\t\2\2\2\u0184\u0183\3"+
		"\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u019e\5*\26\2\u0189\u018b\t\2\2\2\u018a\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u019c\3\2\2\2\u018e\u0190\t\2\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0198\7,\2\2\u0195\u0197\t\2\2\2\u0196\u0195\3\2"+
		"\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u018a\3\2\2\2\u019b\u0191\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019f\5,\27\2\u019e\u019b\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a3\3\2\2\2\u01a0\u01a2\t\2\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7,\2\2\u01a7%\3\2\2\2\u01a8"+
		"\u01a9\7\13\2\2\u01a9\u01aa\5(\25\2\u01aa\u01ab\7\f\2\2\u01ab\'\3\2\2"+
		"\2\u01ac\u01ae\n\5\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0)\3\2\2\2\u01b1\u01b5\7\60\2\2\u01b2"+
		"\u01b4\13\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b6\3"+
		"\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8"+
		"\u01bf\7\b\2\2\u01b9\u01bb\n\6\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be"+
		"\u01b1\3\2\2\2\u01be\u01ba\3\2\2\2\u01bf+\3\2\2\2\u01c0\u01c4\5.\30\2"+
		"\u01c1\u01c4\5\60\31\2\u01c2\u01c4\5\62\32\2\u01c3\u01c0\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4-\3\2\2\2\u01c5\u01c9\7\16\2\2"+
		"\u01c6\u01c8\n\7\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01cd\7\16\2\2\u01cd/\3\2\2\2\u01ce\u01d2\7\r\2\2\u01cf\u01d1\n\b\2\2"+
		"\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7\r\2\2\u01d6"+
		"\61\3\2\2\2\u01d7\u01db\7\t\2\2\u01d8\u01da\n\t\2\2\u01d9\u01d8\3\2\2"+
		"\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de"+
		"\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7\n\2\2\u01df\63\3\2\2\2\u01e0"+
		"\u01e1\6\33\t\3\u01e1\u01e3\58\35\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\3"+
		"\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\65\3\2\2\2\u01e6"+
		"\u01e7\6\34\n\3\u01e7\u01e9\5:\36\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\3"+
		"\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\67\3\2\2\2\u01ec"+
		"\u01ee\7+\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f5\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2"+
		"\u01f4\t\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01fa\7/\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\7\25\2\2\u01fe"+
		"\u0200\t\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0222\5<\37\2\u0204"+
		"\u0207\6\35\13\3\u0205\u0208\5\64\33\2\u0206\u0208\5\66\34\2\u0207\u0205"+
		"\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u0223\3\2\2\2\u0209\u020a\6\35\f\3"+
		"\u020a\u021c\5> \2\u020b\u020c\6\35\r\3\u020c\u021d\5\34\17\2\u020d\u0210"+
		"\6\35\16\3\u020e\u0211\5\64\33\2\u020f\u0211\5\66\34\2\u0210\u020e\3\2"+
		"\2\2\u0210\u020f\3\2\2\2\u0211\u021d\3\2\2\2\u0212\u0213\6\35\17\3\u0213"+
		"\u021d\5\30\r\2\u0214\u0218\6\35\20\3\u0215\u0217\t\2\2\2\u0216\u0215"+
		"\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021b\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021d\5<\37\2\u021c\u020b\3\2"+
		"\2\2\u021c\u020d\3\2\2\2\u021c\u0212\3\2\2\2\u021c\u0214\3\2\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0209\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0204\3\2\2\2\u0222"+
		"\u021e\3\2\2\2\u0222\u0223\3\2\2\2\u02239\3\2\2\2\u0224\u0226\7+\2\2\u0225"+
		"\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2"+
		"\2\2\u0228\u022d\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022c\t\2\2\2\u022b"+
		"\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2"+
		"\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0232\t\n\2\2\u0231"+
		"\u0233\t\2\2\2\u0232\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0255\5<\37\2\u0237"+
		"\u023a\6\36\21\3\u0238\u023b\5\64\33\2\u0239\u023b\5\66\34\2\u023a\u0238"+
		"\3\2\2\2\u023a\u0239\3\2\2\2\u023b\u0256\3\2\2\2\u023c\u023d\6\36\22\3"+
		"\u023d\u024f\5> \2\u023e\u023f\6\36\23\3\u023f\u0250\5\34\17\2\u0240\u0243"+
		"\6\36\24\3\u0241\u0244\5\64\33\2\u0242\u0244\5\66\34\2\u0243\u0241\3\2"+
		"\2\2\u0243\u0242\3\2\2\2\u0244\u0250\3\2\2\2\u0245\u0246\6\36\25\3\u0246"+
		"\u0250\5\30\r\2\u0247\u024b\6\36\26\3\u0248\u024a\t\2\2\2\u0249\u0248"+
		"\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0250\5<\37\2\u024f\u023e\3\2"+
		"\2\2\u024f\u0240\3\2\2\2\u024f\u0245\3\2\2\2\u024f\u0247\3\2\2\2\u0250"+
		"\u0252\3\2\2\2\u0251\u023c\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0251\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0237\3\2\2\2\u0255"+
		"\u0251\3\2\2\2\u0255\u0256\3\2\2\2\u0256;\3\2\2\2\u0257\u0258\6\37\27"+
		"\3\u0258\u025a\5B\"\2\u0259\u0257\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0259"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c=\3\2\2\2\u025d\u025f\7+\2\2\u025e\u025d"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"?\3\2\2\2\u0262\u0264\5\26\f\2\u0263\u0265\5B\"\2\u0264\u0263\3\2\2\2"+
		"\u0265\u0266\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268"+
		"\3\2\2\2\u0268\u0269\7,\2\2\u0269A\3\2\2\2\u026a\u0295\5D#\2\u026b\u0295"+
		"\7-\2\2\u026c\u0295\7.\2\2\u026d\u0295\7/\2\2\u026e\u0295\7,\2\2\u026f"+
		"\u0295\7*\2\2\u0270\u0295\7\3\2\2\u0271\u0295\7\4\2\2\u0272\u0295\7\61"+
		"\2\2\u0273\u0295\7\5\2\2\u0274\u0295\7\7\2\2\u0275\u0295\7\17\2\2\u0276"+
		"\u0295\7\20\2\2\u0277\u0295\7\24\2\2\u0278\u0295\7\25\2\2\u0279\u0295"+
		"\7\60\2\2\u027a\u0295\7\b\2\2\u027b\u0295\7\t\2\2\u027c\u0295\7\n\2\2"+
		"\u027d\u0295\7\22\2\2\u027e\u0295\7)\2\2\u027f\u0295\7\13\2\2\u0280\u0295"+
		"\7\f\2\2\u0281\u0295\7\27\2\2\u0282\u0295\7\30\2\2\u0283\u0295\7\16\2"+
		"\2\u0284\u0295\7\r\2\2\u0285\u0295\7\31\2\2\u0286\u0295\7\32\2\2\u0287"+
		"\u0295\7\6\2\2\u0288\u0295\7\33\2\2\u0289\u0295\7\34\2\2\u028a\u0295\7"+
		"\35\2\2\u028b\u0295\7\36\2\2\u028c\u0295\7\37\2\2\u028d\u0295\7 \2\2\u028e"+
		"\u0295\7!\2\2\u028f\u0295\7\"\2\2\u0290\u0295\7#\2\2\u0291\u0295\7$\2"+
		"\2\u0292\u0295\7%\2\2\u0293\u0295\7\21\2\2\u0294\u026a\3\2\2\2\u0294\u026b"+
		"\3\2\2\2\u0294\u026c\3\2\2\2\u0294\u026d\3\2\2\2\u0294\u026e\3\2\2\2\u0294"+
		"\u026f\3\2\2\2\u0294\u0270\3\2\2\2\u0294\u0271\3\2\2\2\u0294\u0272\3\2"+
		"\2\2\u0294\u0273\3\2\2\2\u0294\u0274\3\2\2\2\u0294\u0275\3\2\2\2\u0294"+
		"\u0276\3\2\2\2\u0294\u0277\3\2\2\2\u0294\u0278\3\2\2\2\u0294\u0279\3\2"+
		"\2\2\u0294\u027a\3\2\2\2\u0294\u027b\3\2\2\2\u0294\u027c\3\2\2\2\u0294"+
		"\u027d\3\2\2\2\u0294\u027e\3\2\2\2\u0294\u027f\3\2\2\2\u0294\u0280\3\2"+
		"\2\2\u0294\u0281\3\2\2\2\u0294\u0282\3\2\2\2\u0294\u0283\3\2\2\2\u0294"+
		"\u0284\3\2\2\2\u0294\u0285\3\2\2\2\u0294\u0286\3\2\2\2\u0294\u0287\3\2"+
		"\2\2\u0294\u0288\3\2\2\2\u0294\u0289\3\2\2\2\u0294\u028a\3\2\2\2\u0294"+
		"\u028b\3\2\2\2\u0294\u028c\3\2\2\2\u0294\u028d\3\2\2\2\u0294\u028e\3\2"+
		"\2\2\u0294\u028f\3\2\2\2\u0294\u0290\3\2\2\2\u0294\u0291\3\2\2\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295C\3\2\2\2\u0296\u02a1\5L\'\2\u0297"+
		"\u02a1\5F$\2\u0298\u02a1\5R*\2\u0299\u02a1\5\\/\2\u029a\u02a1\5v<\2\u029b"+
		"\u02a1\5\u0092J\2\u029c\u02a1\5\u0094K\2\u029d\u02a1\5\u0098M\2\u029e"+
		"\u02a1\5l\67\2\u029f\u02a1\5t;\2\u02a0\u0296\3\2\2\2\u02a0\u0297\3\2\2"+
		"\2\u02a0\u0298\3\2\2\2\u02a0\u0299\3\2\2\2\u02a0\u029a\3\2\2\2\u02a0\u029b"+
		"\3\2\2\2\u02a0\u029c\3\2\2\2\u02a0\u029d\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u029f\3\2\2\2\u02a1E\3\2\2\2\u02a2\u02a5\5H%\2\u02a3\u02a5\5J&\2\u02a4"+
		"\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5G\3\2\2\2\u02a6\u02a7\6%\30\2"+
		"\u02a7\u02a9\7\5\2\2\u02a8\u02aa\5B\"\2\u02a9\u02a8\3\2\2\2\u02aa\u02ab"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"\u02ae\7\5\2\2\u02aeI\3\2\2\2\u02af\u02b0\6&\31\2\u02b0\u02b2\7\7\2\2"+
		"\u02b1\u02b3\5B\"\2\u02b2\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\7\7\2\2\u02b7"+
		"K\3\2\2\2\u02b8\u02bb\5N(\2\u02b9\u02bb\5P)\2\u02ba\u02b8\3\2\2\2\u02ba"+
		"\u02b9\3\2\2\2\u02bbM\3\2\2\2\u02bc\u02bd\6(\32\2\u02bd\u02be\7\5\2\2"+
		"\u02be\u02c0\7\5\2\2\u02bf\u02c1\5B\"\2\u02c0\u02bf\3\2\2\2\u02c1\u02c2"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c5\7\5\2\2\u02c5\u02c6\7\5\2\2\u02c6O\3\2\2\2\u02c7\u02c8\6)\33\2"+
		"\u02c8\u02c9\7\7\2\2\u02c9\u02cb\7\7\2\2\u02ca\u02cc\5B\"\2\u02cb\u02ca"+
		"\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d0\7\7\2\2\u02d0\u02d1\7\7\2\2\u02d1Q\3\2\2\2"+
		"\u02d2\u02d3\7\22\2\2\u02d3\u02d4\5T+\2\u02d4S\3\2\2\2\u02d5\u02d8\5X"+
		"-\2\u02d6\u02d9\5V,\2\u02d7\u02d9\5Z.\2\u02d8\u02d6\3\2\2\2\u02d8\u02d7"+
		"\3\2\2\2\u02d9U\3\2\2\2\u02da\u02db\7\t\2\2\u02db\u02e2\5b\62\2\u02dc"+
		"\u02de\t\2\2\2\u02dd\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02dd\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\5d\63\2\u02e2"+
		"\u02dd\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\7\n"+
		"\2\2\u02e5W\3\2\2\2\u02e6\u02ea\7\13\2\2\u02e7\u02e9\n\5\2\2\u02e8\u02e7"+
		"\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ed\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ee\7\f\2\2\u02eeY\3\2\2\2"+
		"\u02ef\u02f0\7\13\2\2\u02f0\u02f1\5(\25\2\u02f1\u02f2\7\f\2\2\u02f2[\3"+
		"\2\2\2\u02f3\u02f6\5^\60\2\u02f4\u02f7\5`\61\2\u02f5\u02f7\5j\66\2\u02f6"+
		"\u02f4\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7]\3\2\2\2"+
		"\u02f8\u02fa\7\13\2\2\u02f9\u02fb\5B\"\2\u02fa\u02f9\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u02ff\7\f\2\2\u02ff_\3\2\2\2\u0300\u0302\7\t\2\2\u0301\u0303\5b\62\2"+
		"\u0302\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u030a\3\2\2\2\u0304\u0306"+
		"\t\2\2\2\u0305\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0305\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\5d\63\2\u030a\u0305\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u030f\3\2\2\2\u030c\u030e\t\2\2\2\u030d"+
		"\u030c\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2"+
		"\2\2\u0310\u0312\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0313\7\n\2\2\u0313"+
		"a\3\2\2\2\u0314\u0316\n\13\2\2\u0315\u0314\3\2\2\2\u0316\u0317\3\2\2\2"+
		"\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318c\3\2\2\2\u0319\u031c\5"+
		"f\64\2\u031a\u031c\5h\65\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031c"+
		"e\3\2\2\2\u031d\u0321\7\16\2\2\u031e\u0320\n\7\2\2\u031f\u031e\3\2\2\2"+
		"\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324"+
		"\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0325\7\16\2\2\u0325g\3\2\2\2\u0326"+
		"\u032a\7\r\2\2\u0327\u0329\n\b\2\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2"+
		"\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032d\u032e\7\r\2\2\u032ei\3\2\2\2\u032f\u0331\t\f\2\2"+
		"\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0334"+
		"\7\13\2\2\u0333\u0335\5(\25\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2"+
		"\u0335\u0336\3\2\2\2\u0336\u0337\7\f\2\2\u0337k\3\2\2\2\u0338\u033e\7"+
		"\27\2\2\u0339\u033a\7)\2\2\u033a\u033f\5n8\2\u033b\u033c\7)\2\2\u033c"+
		"\u033f\5p9\2\u033d\u033f\5r:\2\u033e\u0339\3\2\2\2\u033e\u033b\3\2\2\2"+
		"\u033e\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\7\20\2\2\u0341m\3"+
		"\2\2\2\u0342\u0344\t\r\2\2\u0343\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346o\3\2\2\2\u0347\u0349\7/\2\2\u0348"+
		"\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034bq\3\2\2\2\u034c\u034e\t\16\2\2\u034d\u034c\3\2\2\2\u034e\u034f"+
		"\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350s\3\2\2\2\u0351"+
		"\u0352\7\30\2\2\u0352\u0353\t\17\2\2\u0353u\3\2\2\2\u0354\u0358\5|?\2"+
		"\u0355\u0358\5z>\2\u0356\u0358\5x=\2\u0357\u0354\3\2\2\2\u0357\u0355\3"+
		"\2\2\2\u0357\u0356\3\2\2\2\u0358w\3\2\2\2\u0359\u035a\6=\34\2\u035a\u035d"+
		"\7\31\2\2\u035b\u035c\6=\35\2\u035c\u035e\13\2\2\2\u035d\u035b\3\2\2\2"+
		"\u035e\u035f\3\2\2\2\u035f\u0360\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0361"+
		"\3\2\2\2\u0361\u0362\7\31\2\2\u0362y\3\2\2\2\u0363\u0364\6>\36\2\u0364"+
		"\u0365\7\31\2\2\u0365\u0368\7\31\2\2\u0366\u0367\6>\37\2\u0367\u0369\13"+
		"\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\7\31\2\2\u036d\u036e\7"+
		"\31\2\2\u036e{\3\2\2\2\u036f\u0370\7\31\2\2\u0370\u0371\7\31\2\2\u0371"+
		"\u0374\7\3\2\2\u0372\u0373\6? \2\u0373\u0375\13\2\2\2\u0374\u0372\3\2"+
		"\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u0379\7\3\2\2\u0379\u037a\7\31\2\2\u037a\u037b\7"+
		"\31\2\2\u037b}\3\2\2\2\u037c\u037e\t\20\2\2\u037d\u037c\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\177\3\2\2"+
		"\2\u0381\u0382\5~@\2\u0382\u0383\7\26\2\2\u0383\u0387\7\16\2\2\u0384\u0386"+
		"\13\2\2\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0388\3\2\2\2"+
		"\u0387\u0385\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038b"+
		"\7\16\2\2\u038b\u0081\3\2\2\2\u038c\u038d\5~@\2\u038d\u038e\7\26\2\2\u038e"+
		"\u0392\7\r\2\2\u038f\u0391\13\2\2\2\u0390\u038f\3\2\2\2\u0391\u0394\3"+
		"\2\2\2\u0392\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0395\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0395\u0396\7\r\2\2\u0396\u0083\3\2\2\2\u0397\u0398\7\60"+
		"\2\2\u0398\u0399\7\35\2\2\u0399\u039a\7\36\2\2\u039a\u03a6\7\37\2\2\u039b"+
		"\u039d\t\2\2\2\u039c\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039c\3\2"+
		"\2\2\u039e\u039f\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u03a3\5\u0080A\2\u03a1"+
		"\u03a3\5\u0082B\2\u03a2\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\u03a5"+
		"\3\2\2\2\u03a4\u039c\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03ac\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03ab\t\2"+
		"\2\2\u03aa\u03a9\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b0\7\b"+
		"\2\2\u03b0\u0085\3\2\2\2\u03b1\u03b2\7\60\2\2\u03b2\u03b3\7\24\2\2\u03b3"+
		"\u03b4\7\35\2\2\u03b4\u03b5\7\36\2\2\u03b5\u03b9\7\37\2\2\u03b6\u03b8"+
		"\t\2\2\2\u03b7\u03b6\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03bd\7\b"+
		"\2\2\u03bd\u0087\3\2\2\2\u03be\u03c3\5\u0084C\2\u03bf\u03c2\5\u0088E\2"+
		"\u03c0\u03c2\13\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5"+
		"\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5"+
		"\u03c3\3\2\2\2\u03c6\u03c7\5\u0086D\2\u03c7\u0089\3\2\2\2\u03c8\u03c9"+
		"\7\60\2\2\u03c9\u03ca\7 \2\2\u03ca\u03cb\7!\2\2\u03cb\u03cc\7\"\2\2\u03cc"+
		"\u03d8\7#\2\2\u03cd\u03cf\t\2\2\2\u03ce\u03cd\3\2\2\2\u03cf\u03d0\3\2"+
		"\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2"+
		"\u03d5\5\u0080A\2\u03d3\u03d5\5\u0082B\2\u03d4\u03d2\3\2\2\2\u03d4\u03d3"+
		"\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03ce\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8"+
		"\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03de\3\2\2\2\u03da\u03d8\3\2"+
		"\2\2\u03db\u03dd\t\2\2\2\u03dc\u03db\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de"+
		"\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2"+
		"\2\2\u03e1\u03e2\7\b\2\2\u03e2\u008b\3\2\2\2\u03e3\u03e4\7\60\2\2\u03e4"+
		"\u03e5\7\24\2\2\u03e5\u03e6\7 \2\2\u03e6\u03e7\7!\2\2\u03e7\u03e8\7\""+
		"\2\2\u03e8\u03ec\7#\2\2\u03e9\u03eb\t\2\2\2\u03ea\u03e9\3\2\2\2\u03eb"+
		"\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2"+
		"\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0\7\b\2\2\u03f0\u008d\3\2\2\2\u03f1"+
		"\u03f6\5\u008aF\2\u03f2\u03f5\5\u008eH\2\u03f3\u03f5\13\2\2\2\u03f4\u03f2"+
		"\3\2\2\2\u03f4\u03f3\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f6"+
		"\u03f4\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fa\5\u008c"+
		"G\2\u03fa\u008f\3\2\2\2\u03fb\u03fc\7\60\2\2\u03fc\u03fd\7$\2\2\u03fd"+
		"\u0409\7%\2\2\u03fe\u0400\t\2\2\2\u03ff\u03fe\3\2\2\2\u0400\u0401\3\2"+
		"\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0405\3\2\2\2\u0403"+
		"\u0406\5\u0080A\2\u0404\u0406\5\u0082B\2\u0405\u0403\3\2\2\2\u0405\u0404"+
		"\3\2\2\2\u0406\u0408\3\2\2\2\u0407\u03ff\3\2\2\2\u0408\u040b\3\2\2\2\u0409"+
		"\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040f\3\2\2\2\u040b\u0409\3\2"+
		"\2\2\u040c\u040e\t\2\2\2\u040d\u040c\3\2\2\2\u040e\u0411\3\2\2\2\u040f"+
		"\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f\3\2"+
		"\2\2\u0412\u0414\7\24\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414"+
		"\u0418\3\2\2\2\u0415\u0417\t\2\2\2\u0416\u0415\3\2\2\2\u0417\u041a\3\2"+
		"\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041b\3\2\2\2\u041a"+
		"\u0418\3\2\2\2\u041b\u041c\7\b\2\2\u041c\u0091\3\2\2\2\u041d\u0421\5\u0088"+
		"E\2\u041e\u0421\5\u008eH\2\u041f\u0421\5\u0090I\2\u0420\u041d\3\2\2\2"+
		"\u0420\u041e\3\2\2\2\u0420\u041f\3\2\2\2\u0421\u0093\3\2\2\2\u0422\u0423"+
		"\7\60\2\2\u0423\u042f\5~@\2\u0424\u0426\t\2\2\2\u0425\u0424\3\2\2\2\u0426"+
		"\u0427\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u042b\3\2"+
		"\2\2\u0429\u042c\5\u0080A\2\u042a\u042c\5\u0082B\2\u042b\u0429\3\2\2\2"+
		"\u042b\u042a\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u0425\3\2\2\2\u042e\u0431"+
		"\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0435\3\2\2\2\u0431"+
		"\u042f\3\2\2\2\u0432\u0434\t\2\2\2\u0433\u0432\3\2\2\2\u0434\u0437\3\2"+
		"\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437"+
		"\u0435\3\2\2\2\u0438\u0439\7\24\2\2\u0439\u043a\7\b\2\2\u043a\u0095\3"+
		"\2\2\2\u043b\u043f\7\23\2\2\u043c\u043e\13\2\2\2\u043d\u043c\3\2\2\2\u043e"+
		"\u0441\3\2\2\2\u043f\u0440\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0442\3\2"+
		"\2\2\u0441\u043f\3\2\2\2\u0442\u0443\7\6\2\2\u0443\u0444\7\6\2\2\u0444"+
		"\u0448\7\b\2\2\u0445\u0447\t\2\2\2\u0446\u0445\3\2\2\2\u0447\u044a\3\2"+
		"\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a"+
		"\u0448\3\2\2\2\u044b\u044c\t\3\2\2\u044c\u0097\3\2\2\2\u044d\u044f\7\60"+
		"\2\2\u044e\u0450\n\21\2\2\u044f\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451"+
		"\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\7\b"+
		"\2\2\u0454\u0099\3\2\2\2\u0093\u009d\u00a2\u00a6\u00ab\u00bc\u00c2\u00cb"+
		"\u00d2\u00d6\u00dc\u00e5\u00ef\u00f4\u00f7\u00fc\u00ff\u0102\u0109\u010f"+
		"\u0112\u0115\u0119\u011e\u0123\u0128\u012d\u0133\u0139\u0140\u0144\u0148"+
		"\u014d\u0152\u0156\u015a\u015f\u0164\u0168\u016c\u0171\u0174\u0179\u017e"+
		"\u0186\u018c\u0191\u0198\u019b\u019e\u01a3\u01af\u01b5\u01bc\u01be\u01c3"+
		"\u01c9\u01d2\u01db\u01e4\u01ea\u01ef\u01f5\u01fb\u0201\u0207\u0210\u0218"+
		"\u021c\u0220\u0222\u0227\u022d\u0234\u023a\u0243\u024b\u024f\u0253\u0255"+
		"\u025b\u0260\u0266\u0294\u02a0\u02a4\u02ab\u02b4\u02ba\u02c2\u02cd\u02d8"+
		"\u02df\u02e2\u02ea\u02f6\u02fc\u0302\u0307\u030a\u030f\u0317\u031b\u0321"+
		"\u032a\u0330\u0334\u033e\u0345\u034a\u034f\u0357\u035f\u036a\u0376\u037f"+
		"\u0387\u0392\u039e\u03a2\u03a6\u03ac\u03b9\u03c1\u03c3\u03d0\u03d4\u03d8"+
		"\u03de\u03ec\u03f4\u03f6\u0401\u0405\u0409\u040f\u0413\u0418\u0420\u0427"+
		"\u042b\u042f\u0435\u043f\u0448\u0451";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}