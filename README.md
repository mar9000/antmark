ANTMark
=======

ANTMark is an (probably ugly) ANTLR4 grammar for Markdown.

**I want to state here that I know at the moment ANTMark is not usable and probably the grammar itself is ugly.
Consider it's my first real ANTLR grammar and I wrote it to study ANTLR rather that to write a real usable ANTLR parser for Markdown.**

I hope it could be improved in the future with the help of some ANTLR guru (pull requests are welcome) or I could have
time and knowledge to improve it.

State of the art
----------------

Under `tests` you can find 143 tests that can be executed with the `MarkdownTest` class.  
There are some homemade tests, almost all the Markdown default tests (version 1.0.2), and all tests of the [markdown-testsuite](https://github.com/karlcow/markdown-testsuite/).  
Due to the problem highlighted below the project is at the moment only an exercise of style.

Main problems
-------------

I don't know with other parsing engines, but with ANTLR4 I spent lot of time parsing lists. The main problem
with ANTLR4 is probably that one would have a stopping rule for rules such as ``(...)*?`` that forces the parser
to stop to consume tokens.  
ANTLR4 stops to consume token depending on what follow the example rule above, but this in my grammar was not enough.

So I used semantic predicates, but the parser **is very very slow**, it's not able to parse a file that contains
more than 2 lists, I also tried to inspect the generated DSA but it was for me out of reach.  
Adding more lists causes that the parsing never ends. I hope this will have some interest for the ANTLR gurus.

Use cases
---------

After you have cloned the project, import it into eclipse, than you can:

  * compile the `MarkdownLexer.g4` grammar with *compile-lexer* run/debug configuration.
  * compile the `MarkdownParser.g4` grammar with *compile-parser* run/debug configuration.
  * open the class `MarkdownTest` and *Run As -> JUnit Test* from the right click menu.

Future directions
-----------------

**Use a *scanner less* gramar**: unfortunately almost at the end of my work I realized that the lexer was not doing that much so a *scanner less* grammar could be probably adopted easily. In addition the semantic predicates I wrote all of them act inspecting the token stream. In a *scanner less* scenario should be easier to inspect a `CharStream`.

**Parser modularization**: in case no global solution exists to build a real parser for the whole language, one could try to
first build a parser for the block structure of Markdown, for example identifying first lists, verbatim, heading..., than parse each block content to parser emph, strong, links and all the other span elements.  
I already used this approach for blockquotes: here on each line the starting tokens `> ` are removed and the result is passed to
an new instance of the parser. Probably some fixes are required in case of presence of *reference links* into the blockquote.

Support/discussions
-------------------

Because the project is just started I think a generic group for discussions and comments is enough: <https://groups.google.com/forum/#!forum/antmark-discussion>.

