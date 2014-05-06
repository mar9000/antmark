// Generated from src/org/mar9000/antmark/grammar/MarkdownParser.g4 by ANTLR 4.2
package org.mar9000.antmark.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownParser}.
 */
public interface MarkdownParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkdownParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(@NotNull MarkdownParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(@NotNull MarkdownParser.EntityContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#linkTitle}.
	 * @param ctx the parse tree
	 */
	void enterLinkTitle(@NotNull MarkdownParser.LinkTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#linkTitle}.
	 * @param ctx the parse tree
	 */
	void exitLinkTitle(@NotNull MarkdownParser.LinkTitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#referenceTitleDouble}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTitleDouble(@NotNull MarkdownParser.ReferenceTitleDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#referenceTitleDouble}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTitleDouble(@NotNull MarkdownParser.ReferenceTitleDoubleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#referenceImageLink}.
	 * @param ctx the parse tree
	 */
	void enterReferenceImageLink(@NotNull MarkdownParser.ReferenceImageLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#referenceImageLink}.
	 * @param ctx the parse tree
	 */
	void exitReferenceImageLink(@NotNull MarkdownParser.ReferenceImageLinkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#rawLine}.
	 * @param ctx the parse tree
	 */
	void enterRawLine(@NotNull MarkdownParser.RawLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#rawLine}.
	 * @param ctx the parse tree
	 */
	void exitRawLine(@NotNull MarkdownParser.RawLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#emphUl}.
	 * @param ctx the parse tree
	 */
	void enterEmphUl(@NotNull MarkdownParser.EmphUlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#emphUl}.
	 * @param ctx the parse tree
	 */
	void exitEmphUl(@NotNull MarkdownParser.EmphUlContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#doubleBacktickCode}.
	 * @param ctx the parse tree
	 */
	void enterDoubleBacktickCode(@NotNull MarkdownParser.DoubleBacktickCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#doubleBacktickCode}.
	 * @param ctx the parse tree
	 */
	void exitDoubleBacktickCode(@NotNull MarkdownParser.DoubleBacktickCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#blockQuote}.
	 * @param ctx the parse tree
	 */
	void enterBlockQuote(@NotNull MarkdownParser.BlockQuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#blockQuote}.
	 * @param ctx the parse tree
	 */
	void exitBlockQuote(@NotNull MarkdownParser.BlockQuoteContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#decEntityName}.
	 * @param ctx the parse tree
	 */
	void enterDecEntityName(@NotNull MarkdownParser.DecEntityNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#decEntityName}.
	 * @param ctx the parse tree
	 */
	void exitDecEntityName(@NotNull MarkdownParser.DecEntityNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#hexEntityName}.
	 * @param ctx the parse tree
	 */
	void enterHexEntityName(@NotNull MarkdownParser.HexEntityNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#hexEntityName}.
	 * @param ctx the parse tree
	 */
	void exitHexEntityName(@NotNull MarkdownParser.HexEntityNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#linkTitleDouble}.
	 * @param ctx the parse tree
	 */
	void enterLinkTitleDouble(@NotNull MarkdownParser.LinkTitleDoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#linkTitleDouble}.
	 * @param ctx the parse tree
	 */
	void exitLinkTitleDouble(@NotNull MarkdownParser.LinkTitleDoubleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#linkTitleSingle}.
	 * @param ctx the parse tree
	 */
	void enterLinkTitleSingle(@NotNull MarkdownParser.LinkTitleSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#linkTitleSingle}.
	 * @param ctx the parse tree
	 */
	void exitLinkTitleSingle(@NotNull MarkdownParser.LinkTitleSingleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#atxHeading}.
	 * @param ctx the parse tree
	 */
	void enterAtxHeading(@NotNull MarkdownParser.AtxHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#atxHeading}.
	 * @param ctx the parse tree
	 */
	void exitAtxHeading(@NotNull MarkdownParser.AtxHeadingContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#backtickCode}.
	 * @param ctx the parse tree
	 */
	void enterBacktickCode(@NotNull MarkdownParser.BacktickCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#backtickCode}.
	 * @param ctx the parse tree
	 */
	void exitBacktickCode(@NotNull MarkdownParser.BacktickCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#verbatimBlankLine}.
	 * @param ctx the parse tree
	 */
	void enterVerbatimBlankLine(@NotNull MarkdownParser.VerbatimBlankLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#verbatimBlankLine}.
	 * @param ctx the parse tree
	 */
	void exitVerbatimBlankLine(@NotNull MarkdownParser.VerbatimBlankLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#references}.
	 * @param ctx the parse tree
	 */
	void enterReferences(@NotNull MarkdownParser.ReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#references}.
	 * @param ctx the parse tree
	 */
	void exitReferences(@NotNull MarkdownParser.ReferencesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#referenceTitleSingle}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTitleSingle(@NotNull MarkdownParser.ReferenceTitleSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#referenceTitleSingle}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTitleSingle(@NotNull MarkdownParser.ReferenceTitleSingleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockCloseDiv}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockCloseDiv(@NotNull MarkdownParser.HtmlBlockCloseDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockCloseDiv}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockCloseDiv(@NotNull MarkdownParser.HtmlBlockCloseDivContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#orderedList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedList(@NotNull MarkdownParser.OrderedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#orderedList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedList(@NotNull MarkdownParser.OrderedListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#listItemBlankLine}.
	 * @param ctx the parse tree
	 */
	void enterListItemBlankLine(@NotNull MarkdownParser.ListItemBlankLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#listItemBlankLine}.
	 * @param ctx the parse tree
	 */
	void exitListItemBlankLine(@NotNull MarkdownParser.ListItemBlankLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#referenceLink}.
	 * @param ctx the parse tree
	 */
	void enterReferenceLink(@NotNull MarkdownParser.ReferenceLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#referenceLink}.
	 * @param ctx the parse tree
	 */
	void exitReferenceLink(@NotNull MarkdownParser.ReferenceLinkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(@NotNull MarkdownParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(@NotNull MarkdownParser.ImageContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(@NotNull MarkdownParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(@NotNull MarkdownParser.CodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#emphStar}.
	 * @param ctx the parse tree
	 */
	void enterEmphStar(@NotNull MarkdownParser.EmphStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#emphStar}.
	 * @param ctx the parse tree
	 */
	void exitEmphStar(@NotNull MarkdownParser.EmphStarContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#escapedChar}.
	 * @param ctx the parse tree
	 */
	void enterEscapedChar(@NotNull MarkdownParser.EscapedCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#escapedChar}.
	 * @param ctx the parse tree
	 */
	void exitEscapedChar(@NotNull MarkdownParser.EscapedCharContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#bulletList}.
	 * @param ctx the parse tree
	 */
	void enterBulletList(@NotNull MarkdownParser.BulletListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#bulletList}.
	 * @param ctx the parse tree
	 */
	void exitBulletList(@NotNull MarkdownParser.BulletListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#blockQuoteBlankLine}.
	 * @param ctx the parse tree
	 */
	void enterBlockQuoteBlankLine(@NotNull MarkdownParser.BlockQuoteBlankLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#blockQuoteBlankLine}.
	 * @param ctx the parse tree
	 */
	void exitBlockQuoteBlankLine(@NotNull MarkdownParser.BlockQuoteBlankLineContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(@NotNull MarkdownParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(@NotNull MarkdownParser.HtmlCommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#inlineListItem}.
	 * @param ctx the parse tree
	 */
	void enterInlineListItem(@NotNull MarkdownParser.InlineListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#inlineListItem}.
	 * @param ctx the parse tree
	 */
	void exitInlineListItem(@NotNull MarkdownParser.InlineListItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#strong}.
	 * @param ctx the parse tree
	 */
	void enterStrong(@NotNull MarkdownParser.StrongContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#strong}.
	 * @param ctx the parse tree
	 */
	void exitStrong(@NotNull MarkdownParser.StrongContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#imageLink}.
	 * @param ctx the parse tree
	 */
	void enterImageLink(@NotNull MarkdownParser.ImageLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#imageLink}.
	 * @param ctx the parse tree
	 */
	void exitImageLink(@NotNull MarkdownParser.ImageLinkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockCloseSpan}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockCloseSpan(@NotNull MarkdownParser.HtmlBlockCloseSpanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockCloseSpan}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockCloseSpan(@NotNull MarkdownParser.HtmlBlockCloseSpanContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockTags}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockTags(@NotNull MarkdownParser.HtmlBlockTagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockTags}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockTags(@NotNull MarkdownParser.HtmlBlockTagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockSpan}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockSpan(@NotNull MarkdownParser.HtmlBlockSpanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockSpan}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockSpan(@NotNull MarkdownParser.HtmlBlockSpanContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlAttributeD}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeD(@NotNull MarkdownParser.HtmlAttributeDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlAttributeD}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeD(@NotNull MarkdownParser.HtmlAttributeDContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#strongStar}.
	 * @param ctx the parse tree
	 */
	void enterStrongStar(@NotNull MarkdownParser.StrongStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#strongStar}.
	 * @param ctx the parse tree
	 */
	void exitStrongStar(@NotNull MarkdownParser.StrongStarContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#heading}.
	 * @param ctx the parse tree
	 */
	void enterHeading(@NotNull MarkdownParser.HeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#heading}.
	 * @param ctx the parse tree
	 */
	void exitHeading(@NotNull MarkdownParser.HeadingContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#setextHeading}.
	 * @param ctx the parse tree
	 */
	void enterSetextHeading(@NotNull MarkdownParser.SetextHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#setextHeading}.
	 * @param ctx the parse tree
	 */
	void exitSetextHeading(@NotNull MarkdownParser.SetextHeadingContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#span}.
	 * @param ctx the parse tree
	 */
	void enterSpan(@NotNull MarkdownParser.SpanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#span}.
	 * @param ctx the parse tree
	 */
	void exitSpan(@NotNull MarkdownParser.SpanContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#autolink}.
	 * @param ctx the parse tree
	 */
	void enterAutolink(@NotNull MarkdownParser.AutolinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#autolink}.
	 * @param ctx the parse tree
	 */
	void exitAutolink(@NotNull MarkdownParser.AutolinkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockOpenDiv}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockOpenDiv(@NotNull MarkdownParser.HtmlBlockOpenDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockOpenDiv}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockOpenDiv(@NotNull MarkdownParser.HtmlBlockOpenDivContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#linkUrl}.
	 * @param ctx the parse tree
	 */
	void enterLinkUrl(@NotNull MarkdownParser.LinkUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#linkUrl}.
	 * @param ctx the parse tree
	 */
	void exitLinkUrl(@NotNull MarkdownParser.LinkUrlContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(@NotNull MarkdownParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(@NotNull MarkdownParser.LinkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MarkdownParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MarkdownParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlAttributeS}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeS(@NotNull MarkdownParser.HtmlAttributeSContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlAttributeS}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeS(@NotNull MarkdownParser.HtmlAttributeSContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockInSelfClosing}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockInSelfClosing(@NotNull MarkdownParser.HtmlBlockInSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockInSelfClosing}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockInSelfClosing(@NotNull MarkdownParser.HtmlBlockInSelfClosingContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#referenceTitleParens}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTitleParens(@NotNull MarkdownParser.ReferenceTitleParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#referenceTitleParens}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTitleParens(@NotNull MarkdownParser.ReferenceTitleParensContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockDiv}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockDiv(@NotNull MarkdownParser.HtmlBlockDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockDiv}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockDiv(@NotNull MarkdownParser.HtmlBlockDivContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#strongUl}.
	 * @param ctx the parse tree
	 */
	void enterStrongUl(@NotNull MarkdownParser.StrongUlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#strongUl}.
	 * @param ctx the parse tree
	 */
	void exitStrongUl(@NotNull MarkdownParser.StrongUlContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull MarkdownParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull MarkdownParser.DocumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#bulletListItem}.
	 * @param ctx the parse tree
	 */
	void enterBulletListItem(@NotNull MarkdownParser.BulletListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#bulletListItem}.
	 * @param ctx the parse tree
	 */
	void exitBulletListItem(@NotNull MarkdownParser.BulletListItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#referenceTitle}.
	 * @param ctx the parse tree
	 */
	void enterReferenceTitle(@NotNull MarkdownParser.ReferenceTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#referenceTitle}.
	 * @param ctx the parse tree
	 */
	void exitReferenceTitle(@NotNull MarkdownParser.ReferenceTitleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#horizontalRule}.
	 * @param ctx the parse tree
	 */
	void enterHorizontalRule(@NotNull MarkdownParser.HorizontalRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#horizontalRule}.
	 * @param ctx the parse tree
	 */
	void exitHorizontalRule(@NotNull MarkdownParser.HorizontalRuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#inline}.
	 * @param ctx the parse tree
	 */
	void enterInline(@NotNull MarkdownParser.InlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#inline}.
	 * @param ctx the parse tree
	 */
	void exitInline(@NotNull MarkdownParser.InlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#orderedListItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderedListItem(@NotNull MarkdownParser.OrderedListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#orderedListItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderedListItem(@NotNull MarkdownParser.OrderedListItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#emph}.
	 * @param ctx the parse tree
	 */
	void enterEmph(@NotNull MarkdownParser.EmphContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#emph}.
	 * @param ctx the parse tree
	 */
	void exitEmph(@NotNull MarkdownParser.EmphContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockInTags}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockInTags(@NotNull MarkdownParser.HtmlBlockInTagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockInTags}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockInTags(@NotNull MarkdownParser.HtmlBlockInTagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#linkContent}.
	 * @param ctx the parse tree
	 */
	void enterLinkContent(@NotNull MarkdownParser.LinkContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#linkContent}.
	 * @param ctx the parse tree
	 */
	void exitLinkContent(@NotNull MarkdownParser.LinkContentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#charEntityName}.
	 * @param ctx the parse tree
	 */
	void enterCharEntityName(@NotNull MarkdownParser.CharEntityNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#charEntityName}.
	 * @param ctx the parse tree
	 */
	void exitCharEntityName(@NotNull MarkdownParser.CharEntityNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#referenceLabel}.
	 * @param ctx the parse tree
	 */
	void enterReferenceLabel(@NotNull MarkdownParser.ReferenceLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#referenceLabel}.
	 * @param ctx the parse tree
	 */
	void exitReferenceLabel(@NotNull MarkdownParser.ReferenceLabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#nonIndentSpace}.
	 * @param ctx the parse tree
	 */
	void enterNonIndentSpace(@NotNull MarkdownParser.NonIndentSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#nonIndentSpace}.
	 * @param ctx the parse tree
	 */
	void exitNonIndentSpace(@NotNull MarkdownParser.NonIndentSpaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#setextHeading2}.
	 * @param ctx the parse tree
	 */
	void enterSetextHeading2(@NotNull MarkdownParser.SetextHeading2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#setextHeading2}.
	 * @param ctx the parse tree
	 */
	void exitSetextHeading2(@NotNull MarkdownParser.SetextHeading2Context ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#setextHeading1}.
	 * @param ctx the parse tree
	 */
	void enterSetextHeading1(@NotNull MarkdownParser.SetextHeading1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#setextHeading1}.
	 * @param ctx the parse tree
	 */
	void exitSetextHeading1(@NotNull MarkdownParser.SetextHeading1Context ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#referenceUrl}.
	 * @param ctx the parse tree
	 */
	void enterReferenceUrl(@NotNull MarkdownParser.ReferenceUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#referenceUrl}.
	 * @param ctx the parse tree
	 */
	void exitReferenceUrl(@NotNull MarkdownParser.ReferenceUrlContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#verbatim}.
	 * @param ctx the parse tree
	 */
	void enterVerbatim(@NotNull MarkdownParser.VerbatimContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#verbatim}.
	 * @param ctx the parse tree
	 */
	void exitVerbatim(@NotNull MarkdownParser.VerbatimContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockSelfClosing}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockSelfClosing(@NotNull MarkdownParser.HtmlBlockSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockSelfClosing}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockSelfClosing(@NotNull MarkdownParser.HtmlBlockSelfClosingContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#referenceId}.
	 * @param ctx the parse tree
	 */
	void enterReferenceId(@NotNull MarkdownParser.ReferenceIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#referenceId}.
	 * @param ctx the parse tree
	 */
	void exitReferenceId(@NotNull MarkdownParser.ReferenceIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#spaceBacktickCode}.
	 * @param ctx the parse tree
	 */
	void enterSpaceBacktickCode(@NotNull MarkdownParser.SpaceBacktickCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#spaceBacktickCode}.
	 * @param ctx the parse tree
	 */
	void exitSpaceBacktickCode(@NotNull MarkdownParser.SpaceBacktickCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull MarkdownParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull MarkdownParser.ReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(@NotNull MarkdownParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(@NotNull MarkdownParser.ParaContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(@NotNull MarkdownParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(@NotNull MarkdownParser.AttributeNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#explicitImageLink}.
	 * @param ctx the parse tree
	 */
	void enterExplicitImageLink(@NotNull MarkdownParser.ExplicitImageLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#explicitImageLink}.
	 * @param ctx the parse tree
	 */
	void exitExplicitImageLink(@NotNull MarkdownParser.ExplicitImageLinkContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#imageAlt}.
	 * @param ctx the parse tree
	 */
	void enterImageAlt(@NotNull MarkdownParser.ImageAltContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#imageAlt}.
	 * @param ctx the parse tree
	 */
	void exitImageAlt(@NotNull MarkdownParser.ImageAltContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockOpenSpan}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockOpenSpan(@NotNull MarkdownParser.HtmlBlockOpenSpanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockOpenSpan}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockOpenSpan(@NotNull MarkdownParser.HtmlBlockOpenSpanContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#htmlBlockHr}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBlockHr(@NotNull MarkdownParser.HtmlBlockHrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#htmlBlockHr}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBlockHr(@NotNull MarkdownParser.HtmlBlockHrContext ctx);

	/**
	 * Enter a parse tree produced by {@link MarkdownParser#explicitLink}.
	 * @param ctx the parse tree
	 */
	void enterExplicitLink(@NotNull MarkdownParser.ExplicitLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownParser#explicitLink}.
	 * @param ctx the parse tree
	 */
	void exitExplicitLink(@NotNull MarkdownParser.ExplicitLinkContext ctx);
}