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

lexer grammar MarkdownLexer;
@members {
    int htmlElementCount;
}

/* Single chars used by the parser.   */
SPACE: ' ';
TAB: '\t';
// Lists and horizontal rules.
EMPH: '*';
MINUS: '-';
UNDERSCORE: '_';
// Blockquotes.
CLOSE_ANGLE_BRACKET: '>';
// Links.
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_SB: '[';
CLOSE_SB: ']';
DOUBLE_QUOTE: '"';
SINGLE_QUOTE: '\'';
// References.
COLON: ':';
// Entities.
SEMI_COLON: ';';
// Autolinks.
AT: '@';
// For html comment.
EXCLAMATION_MARK: '!';
HTML_COMMENT_OPEN: OPEN_ANGLE_BRACKET EXCLAMATION_MARK MINUS MINUS {_tokenStartCharPositionInLine == 0}?;
// Others.
SLASH: '/';
PERIOD: '.';
EQUAL: '=';
AMPERSAND: '&';
// Used by escapedChar.
BACKSLASH: '\\';
BACKTICK: '`';
PLUS: '+';
OPEN_CURLY: '{';
CLOSE_CURLY: '}';
D: [dD];
I: [iI];
V: [vV];
S: [sS];
P: [pP];
A: [aA];
N: [nN];
H: [hH];
R: [rR];

/* DOC: here I tried (NEWLINE | EOF) but the lexer fires an exception:
 *   Exception in thread "main" java.lang.IllegalStateException: cannot consume EOF
 *   at org.antlr.v4.runtime.ANTLRInputStream.consume(ANTLRInputStream.java:151)
 * so I put only NEWLINE and add a \n at the end of the file before passing it
 * to the parser.
 */
SETEXT_BOTTOM_1: EQUAL+ (NEWLINE | LINE_BREAK) {_tokenStartCharPositionInLine == 0}?;
SETEXT_BOTTOM_2: MINUS+ (NEWLINE | LINE_BREAK) {_tokenStartCharPositionInLine == 0}?;
ATX_START: ( '######' | '#####' | '####' | '###' | '##' | '#' ) {_tokenStartCharPositionInLine == 0}?;
SHARP: '#';

/** I verified that on Markdown Dingus a tab is counted as line break.   */
LINE_BREAK: SPACE SPACE (SPACE | TAB)* NEWLINE {_tokenStartCharPositionInLine > 0}?;   // Should not match a the begin.
BLANK_LINE: (SPACE | TAB)* NEWLINE {_tokenStartCharPositionInLine == 0}?;      // Should match a the begin.
// LexerATNSimulator.consume() do not reset position in case of only \r.
NEWLINE: '\r'? '\n' | '\r' {setCharPositionInLine(0);};

HEX_CHAR: [Xxa-fA-F];
NORMAL_CHAR: [a-zA-Z];   // This never match a, b, ecc .
DIGIT: [0-9];

/* ******* HTML mode and rules.   ******* */
/* This HTML solution will not work in case of <pre> that contains the '<' or the '>' chars. TODO.   */
//HTML_START: '<' {_tokenStartCharPositionInLine == 0}? {htmlElementCount = 1;}   -> more, pushMode(HTML_MODE);
OPEN_ANGLE_BRACKET: '<';
SPECIAL_CHAR: '~' | '`' | '\\' | '\'' | '"' | ',' | '?';

//mode HTML_MODE;
//OPEN_TAG: '<'  {htmlElementCount++;}   -> more;
//SLASH_CLOSE_TAG: '/>' {htmlElementCount--;}   -> more;
//OPEN_CLOSE_TAG: '</'  {htmlElementCount--;}   -> more;
//HTML: '\r'? '\n' '\r'? '\n' {htmlElementCount == 0}?   -> popMode;
//CONTINUE: .   -> more;


