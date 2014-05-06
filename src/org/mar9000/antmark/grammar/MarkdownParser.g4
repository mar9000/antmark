/**
 * This file is part of the ANTMark project.
 * 
 * ANTMark is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ANTMark is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with the ANTMark project.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2014 Marco LOMBARDO, mar9000 near google.com .
 */

parser grammar MarkdownParser;
options {
    tokenVocab=MarkdownLexer;
}
@members {
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
}

/* *****************************************************************************
Da chidere:
  - è possibile mettere un check in fondo che annulla tutta la regola come in PEG?
  - altri consigli/migliorie?
TODO:
  - cancellare dal lexer TODO: "da implementare".
*/

/**
 * Grammar for markdown syntax.
 * Each block eventually consume some BLANK_LINE before to start to match real content.
 * Blank lines not matched by blocks at the end of the document are matched here.
 * EOF is optional because could be matched by para.
 */
document: block+ BLANK_LINE* EOF?;

/**
 * A document is one or more block elements.
 * http://daringfireball.net/projects/markdown/syntax#block
 */
block: BLANK_LINE*   // Blank lines at the begin of the document or extra blank lines between blocks are matched here.
       (htmlBlockTags   // Match HTML at level block to do not add extra <p> if paragraph contains only HTML.
       | htmlBlockSelfClosing
       | htmlComment
       | heading
       | horizontalRule
       | blockQuote[0]
       | references
       | {followListItem(1, 0)}? orderedList[0]
       | {followListItem(1, 0)}? bulletList[0]
       | {followVerbatim(0)}? verbatim[0]   // After lists because deep lists can start with lot of spaces.
       | para
       )
     ;

/* ******* Block level HTML.   ******* */
// Same as inline HTML but with trailing space and new line.
htmlBlockTags: htmlBlockInTags (SPACE | TAB)* (NEWLINE | LINE_BREAK);
htmlBlockSelfClosing: htmlBlockInSelfClosing  (SPACE | TAB)* (NEWLINE | LINE_BREAK);

/* ******* Heading.   ******* */
heading: setextHeading | atxHeading;
setextHeading: setextHeading1 | setextHeading2;
/* Should verify ~NEWLINE after each inline.   */
setextHeading1: ({!tokenIs(1, NEWLINE)}? inline)+ NEWLINE SETEXT_BOTTOM_1;
setextHeading2: ({!tokenIs(1, NEWLINE)}? inline)+ NEWLINE SETEXT_BOTTOM_2;
/* DOC: at first I used (SPACECHAR SHARP* SPACECHAR)? but this way the inline+?
 * consume all input until NEWLINE. With the current code it works.
 * The compilation of the parser shows a warning.
 */
atxHeading: ATX_START (SPACE | TAB) inline+? ((SPACE | TAB)*)? (SHARP*)? (SPACE | TAB)? (NEWLINE | LINE_BREAK);

rawLine: (~NEWLINE)* NEWLINE;
nonIndentSpace: SPACE? SPACE? SPACE?;

/* The dingus webapp consider also " > " and varying number of spaces. TODO.
 * This could be also resolved with a specific mode into the lexer.
 * I did not understand the BlockQuoteRaw rule of the PEG grammar.
 */
blockQuote[int _level]: {followBlockquote($_level)}?    //{_input.LT(1).getCharPositionInLine() == 0}?
                        (blockQuoteBlankLine? (SPACE | TAB)* CLOSE_ANGLE_BRACKET (SPACE | TAB)? rawLine)+;
blockQuoteBlankLine: BLANK_LINE+;

// DOC: this was "verbatimBlankLine* (SPACE | TAB)+ rawLine" but I cannot consume spaces and tabs
// otherwise I lost lines indentation, and as far as I know I cannot consume a token n times with ANTLR.
verbatim[int _level]: ({followVerbatim($_level, true)}? verbatimBlankLine* rawLine)+;
// DOC: I don't think this can be unified with listItem because here I should
// output all blank lines whereas with listItem more blank lines appears as one blank line into the HTML output.
verbatimBlankLine: BLANK_LINE;

horizontalRule: nonIndentSpace
                (EMPH (SPACE | TAB)? EMPH (SPACE | TAB)? EMPH ((SPACE | TAB)? EMPH)*
              | MINUS (SPACE | TAB)? MINUS (SPACE | TAB)? MINUS ((SPACE | TAB)? MINUS)*
              | UNDERSCORE (SPACE | TAB)? UNDERSCORE (SPACE | TAB)? UNDERSCORE ((SPACE | TAB)? UNDERSCORE)*
              ) NEWLINE | SETEXT_BOTTOM_2;

/* ******* References.   ******* */
references: (reference)+;
reference: nonIndentSpace referenceLabel
           COLON (SPACE | TAB)+ referenceUrl
           (((SPACE | TAB)+ | (SPACE | TAB)* NEWLINE (SPACE | TAB)*)   // Same or next line.
           referenceTitle)?
           (SPACE | TAB)* NEWLINE;
referenceLabel: OPEN_SB referenceId CLOSE_SB;
referenceId: (~(NEWLINE | CLOSE_SB))+;
referenceUrl: OPEN_ANGLE_BRACKET .*? CLOSE_ANGLE_BRACKET
            | (~(SPACE | TAB | NEWLINE | OPEN_ANGLE_BRACKET | CLOSE_ANGLE_BRACKET))+
            ;
referenceTitle: referenceTitleSingle | referenceTitleDouble | referenceTitleParens; 
referenceTitleSingle: SINGLE_QUOTE (~(NEWLINE | SINGLE_QUOTE))*
                      SINGLE_QUOTE;
referenceTitleDouble: DOUBLE_QUOTE (~(NEWLINE | DOUBLE_QUOTE))*
                      DOUBLE_QUOTE;
referenceTitleParens: OPEN_PAREN (~(NEWLINE | CLOSE_PAREN))*
                      CLOSE_PAREN;

/* ******* Lists.   ******* */

/* Ordered or bullet lists are very similar, they differ only with respect to the first item that
 * when is an ordered one render the whole list ordered. Same happens when the first item is bullet.
 * Due to the tree hierarchy we use rules with a level parameter, levels start from 0.
 */

// The main rules for lists.
// nextItemWithPar is used by MarkdownTranslator to track which items have BLANK_LINE* .
orderedList[int _level]
locals[boolean nextItemWithPar]
       : ({followListItem(1, $_level, true)}? orderedListItem[_level]
         )+;

bulletList[int _level]
locals[boolean nextItemWithPar]
       : ({followListItem(1, $_level, true)}? bulletListItem[_level]
         )+;

// These rules check if we have a bullet or enumerator at a specific level.
// 0 to 3 spaces is 0 level, ecc.
// In front of bullet we could remove this check because we not working with out the check in the ()+ of list.
//bullet[int _level]: {followListItem(1, $_level)}? (SPACE | TAB)+ (PLUS | MINUS | EMPH) (SPACE | TAB)+;
//enumerator[int _level]: {followListItem(1, $_level)}? (SPACE | TAB)+ DIGIT+ PERIOD (SPACE | TAB)+;

// Generic item that we can find after bullet or enumerator.
// The local variable trace when inline should open or close e paragraph.
// TODO: could be better implement the whole translator with a Visitor?
orderedListItem[int _level]
locals[boolean isWithPar]
       : BLANK_LINE* (SPACE | TAB)* DIGIT+ PERIOD (SPACE | TAB)+
         inlineListItem[_level]
         // After the begin we can have a sublist without blank lines or a blank line with list, para or verbatim.
         (
             {followListItem(1, $_level+1)}? (orderedList[_level+1] | bulletList[_level+1])
             | ({followVerbatim($_level+1, true) || followListItem(1, $_level+1, true) || followContinuation($_level, true)}?
                listItemBlankLine
                   (
                       {followVerbatim($_level+1, true)}? verbatim[_level+1]
                       | {followListItem(1, $_level+1, true)}? (orderedList[_level+1] | bulletList[_level+1])
                       | {followBlockquote($_level+1)}? blockQuote[_level+1]
                       | {followContinuation($_level, true)}? (SPACE | TAB)* inlineListItem[_level]
                   )
               )+
         )?
         ;   // BLANK_LINE*
//
bulletListItem[int _level]
locals[boolean isWithPar]
       : BLANK_LINE* (SPACE | TAB)* (PLUS | MINUS | EMPH) (SPACE | TAB)+
         inlineListItem[_level]
         // After the begin we can have a sublist without blank lines or a blank line with list, para or verbatim.
         (
             {followListItem(1, $_level+1)}? (orderedList[_level+1] | bulletList[_level+1])
             | ({followVerbatim($_level+1, true) || followListItem(1, $_level+1, true) || followContinuation($_level, true)}?
                listItemBlankLine
                   (
                       {followVerbatim($_level+1, true)}? verbatim[_level+1]
                       | {followListItem(1, $_level+1, true)}? (orderedList[_level+1] | bulletList[_level+1])
                       | {followBlockquote($_level+1)}? blockQuote[_level+1]
                       | {followContinuation($_level, true)}? (SPACE | TAB)* inlineListItem[_level]
                   )
               )+
         )?
         ;   // BLANK_LINE*

inlineListItem[int _level]
       : ({!followListItem(1, $_level) && !followListItem(1, $_level-1) && !followListItem(1, $_level+1)}?
              inline
         )+;

listItemBlankLine: BLANK_LINE+;

/*
 * A paragraph is one or more span elements (strings, links, strong, ecc) separated by one or more blank lines.
 * http://daringfireball.net/projects/markdown/syntax#p
 *
 * Due to the implemented strategy a paragraph is a set of spans floating into areas of single chars.
 * That means that strings are not present because they don't have ending token.
 * The last NEWLINE is to do not match last new line as the paragraph content.
 * The EOF is to match last paragraph not terminating with NEWLINE 
 */
para: nonIndentSpace inline+ NEWLINE;

/* ******* In line content.   ******* */
// In line can be span or one of the special char used for span that should be left has alternative
// in case matching a span fails.
inline: span   // Max priority, single char matching should be choosed only when span fails.
      | HEX_CHAR | NORMAL_CHAR | DIGIT
      | NEWLINE | LINE_BREAK | SPACE | TAB | SPECIAL_CHAR
      | EMPH | UNDERSCORE
      | COLON | SEMI_COLON
      | SLASH | PERIOD
      | OPEN_ANGLE_BRACKET | CLOSE_ANGLE_BRACKET
      | OPEN_PAREN | CLOSE_PAREN
      | EXCLAMATION_MARK
      | SHARP
      | OPEN_SB | CLOSE_SB
      | AMPERSAND
      | BACKSLASH
      | SINGLE_QUOTE | DOUBLE_QUOTE
      | BACKTICK | PLUS | MINUS | OPEN_CURLY | CLOSE_CURLY
      | D | I | V | S | P | A | N
      | H | R
      | AT
      ;

/**
 * Span elements.
 * http://daringfireball.net/projects/markdown/syntax#span
 */
span: strong
    | emph
    | image
    | link
    | code
    | htmlBlockInTags
    | htmlBlockInSelfClosing
    | autolink
    | entity
    | escapedChar
    ;


/* Here I use an (inline)+? non greedy otherwise when emph is used together with bullet list and emph match
 * also a subsequent bullet item.
 */
emph: emphStar | emphUl;
emphStar: {!tokenStartsWith(2, " ") && !tokenIs(2, EMPH)}?
          EMPH inline+? EMPH;
emphUl: {!tokenStartsWith(2, " ") && !tokenIs(2, UNDERSCORE)}?
        UNDERSCORE (inline)+ UNDERSCORE;

strong: strongStar | strongUl;
strongStar: {!tokenStartsWith(3, " ")}?
            EMPH EMPH inline+? EMPH EMPH;
strongUl: {!tokenStartsWith(3, " ")}?
          UNDERSCORE UNDERSCORE (inline)+ UNDERSCORE UNDERSCORE;

/* ******* Image and link.   ******* */
image: EXCLAMATION_MARK imageLink;
imageLink: imageAlt (explicitImageLink | referenceImageLink);
explicitImageLink: OPEN_PAREN linkUrl ((SPACE | TAB)+ linkTitle)? CLOSE_PAREN;
imageAlt: OPEN_SB (~(NEWLINE | CLOSE_SB))* CLOSE_SB;
referenceImageLink: OPEN_SB referenceId CLOSE_SB;

link: linkContent (explicitLink | referenceLink)?;
linkContent: OPEN_SB inline+? CLOSE_SB;
explicitLink: OPEN_PAREN linkUrl? ((SPACE | TAB)+ linkTitle)? (SPACE | TAB)* CLOSE_PAREN;
linkUrl: (~(SPACE | TAB | NEWLINE | CLOSE_PAREN))+;
linkTitle: linkTitleSingle | linkTitleDouble;
linkTitleSingle: SINGLE_QUOTE (~(NEWLINE | SINGLE_QUOTE))*
                      SINGLE_QUOTE;
linkTitleDouble: DOUBLE_QUOTE (~(NEWLINE | DOUBLE_QUOTE))*
                      DOUBLE_QUOTE;
referenceLink: (SPACE | TAB | NEWLINE)? OPEN_SB referenceId? CLOSE_SB;

/* ******* Entity.   ******* */
entity: AMPERSAND (SHARP hexEntityName | SHARP decEntityName | charEntityName) SEMI_COLON;
hexEntityName: (HEX_CHAR | D | A | DIGIT)+;
decEntityName: DIGIT+;
charEntityName: (HEX_CHAR | NORMAL_CHAR | D | I | V | S | P | A | N | H | R | DIGIT)+;

/* ******* Escaped char.   ******* */
escapedChar: BACKSLASH
           (MINUS | BACKSLASH | PERIOD | BACKTICK | EMPH | UNDERSCORE
           | EXCLAMATION_MARK | PLUS | OPEN_PAREN | CLOSE_PAREN
           | SHARP | OPEN_PAREN | CLOSE_PAREN | OPEN_CURLY | CLOSE_CURLY
           | OPEN_SB | CLOSE_SB
           | OPEN_ANGLE_BRACKET | CLOSE_ANGLE_BRACKET
           );

/* ******* Code.   ******* */
// Order matter.
code: spaceBacktickCode | doubleBacktickCode | backtickCode;

backtickCode: {!tokenIs(2, BACKTICK)}? BACKTICK ({!tokenIs(1, BLANK_LINE)}? .)+? BACKTICK;

doubleBacktickCode: {!tokenIs(3, SPACE) && !tokenIs(3, TAB)}? BACKTICK BACKTICK ({!tokenIs(1, BLANK_LINE)}? .)+? BACKTICK BACKTICK;

spaceBacktickCode: BACKTICK BACKTICK SPACE ({!tokenIs(1, BLANK_LINE)}? .)+? SPACE BACKTICK BACKTICK;

/* ******* HTML.   ******* */
attributeName: (NORMAL_CHAR | HEX_CHAR | D | I | V | S | P | A | N | H | R)+;
htmlAttributeS: attributeName EQUAL SINGLE_QUOTE .*? SINGLE_QUOTE;
htmlAttributeD: attributeName EQUAL DOUBLE_QUOTE .*? DOUBLE_QUOTE;

htmlBlockOpenDiv: OPEN_ANGLE_BRACKET D I V ((SPACE | TAB)+ (htmlAttributeS | htmlAttributeD))* (SPACE | TAB)* CLOSE_ANGLE_BRACKET;
htmlBlockCloseDiv: OPEN_ANGLE_BRACKET SLASH D I V (SPACE | TAB)* CLOSE_ANGLE_BRACKET;
htmlBlockDiv: htmlBlockOpenDiv (htmlBlockDiv | .)*? htmlBlockCloseDiv;

htmlBlockOpenSpan: OPEN_ANGLE_BRACKET S P A N ((SPACE | TAB)+ (htmlAttributeS | htmlAttributeD))* (SPACE | TAB)* CLOSE_ANGLE_BRACKET;
htmlBlockCloseSpan: OPEN_ANGLE_BRACKET SLASH S P A N (SPACE | TAB)* CLOSE_ANGLE_BRACKET;
htmlBlockSpan: htmlBlockOpenSpan (htmlBlockSpan | .)*? htmlBlockCloseSpan;

htmlBlockHr: OPEN_ANGLE_BRACKET H R ((SPACE | TAB)+ (htmlAttributeS | htmlAttributeD))* (SPACE | TAB)* SLASH? (SPACE | TAB)*
             CLOSE_ANGLE_BRACKET;

htmlBlockInTags: htmlBlockDiv
               | htmlBlockSpan
               | htmlBlockHr
               ;

// TODO: substitute attributeName with div, span, h1, ecc.
htmlBlockInSelfClosing: OPEN_ANGLE_BRACKET attributeName
                      ((SPACE | TAB)+ (htmlAttributeS | htmlAttributeD))* (SPACE | TAB)* SLASH CLOSE_ANGLE_BRACKET;

/* ******* HTML comment.   ******* */
htmlComment: HTML_COMMENT_OPEN .*? MINUS MINUS CLOSE_ANGLE_BRACKET (SPACE | TAB)* (NEWLINE | LINE_BREAK);

/* ******* Autolinks.   ******* */
// DOC: here "OPEN_ANGLE_BRACKET .*? CLOSE_ANGLE_BRACKET" does not work because will consume BLANK_LINE.
autolink: OPEN_ANGLE_BRACKET (~(BLANK_LINE | CLOSE_ANGLE_BRACKET))+ CLOSE_ANGLE_BRACKET;




               