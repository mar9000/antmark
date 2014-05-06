ANTMark
=======

ANTMark is an (ugly) ANTLR4 grammar for Markdown.

**I want to state here that I know at the moment ANTMark is not usable and probably the grammar itself is ugly.
Consider it's my first real ANTLR grammar and I wrote it to study ANTLR rather that to write a real usable ANTLR parser for Markdown.**

I hope it could be improved in the future with the help of some ANTLR guru (pull requests are welcome) or I could have
time and knowledge to improve it.

State of the art
----------------

Under `tests` you can find 143 tests that can be executed with MarkdownTest.
There are some homemade tests, almost all the Markdown default tests, and all tests of the *markdown-testsuite*.
Due to the problem highlighted below the project is at the moment only an exercise of style.

Main problems
-------------

I don't know with other parsing engines but with ANTLR I spent lot of time parsing lists. The main problem
with ANTLR is probably that you should have a closing token for ``.*?`` that Markdown does not have.

So I used a semantic predicate but the parser **is very very slow**, it's not able to parse a file that contains
more than 2 lists. Adding more lists causes that the parsing never ends. I hope this will have some interest
for the ANTLR gurus.

Use cases
---------

After you have cloned the project import it into eclipse, that you can:

  * compile the MarkdownLexer.g4 grammar with *compile-lexer* run/debug configuration.
  * compile the MarkdownParser.g4 grammar with *compile-parser* run/debug configuration.
  * open the class ``MarkdownTest`` and Run As -> JUnit Test from the right click menu.

Support/discussions
-------------------

Because the project is just started I think a generic group for discussions and comments is enough: <https://groups.google.com/forum/#!forum/antmark-discussion>.

