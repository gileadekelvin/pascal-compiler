/*
 * generated by Xtext 2.15.0
 */
lexer grammar InternalPascalLexer;

@header {
package org.xtext.compiler.pascal.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Procedure : ('P'|'p')('R'|'r')('O'|'o')('C'|'c')('E'|'e')('D'|'d')('U'|'u')('R'|'r')('E'|'e');

Function : ('F'|'f')('U'|'u')('N'|'n')('C'|'c')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Boolean : ('B'|'b')('O'|'o')('O'|'o')('L'|'l')('E'|'e')('A'|'a')('N'|'n');

Integer : ('I'|'i')('N'|'n')('T'|'t')('E'|'e')('G'|'g')('E'|'e')('R'|'r');

Program : ('P'|'p')('R'|'r')('O'|'o')('G'|'g')('R'|'r')('A'|'a')('M'|'m');

String : ('S'|'s')('T'|'t')('R'|'r')('I'|'i')('N'|'n')('G'|'g');

Array : ('A'|'a')('R'|'r')('R'|'r')('A'|'a')('Y'|'y');

Begin : ('B'|'b')('E'|'e')('G'|'g')('I'|'i')('N'|'n');

Const : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t');

False : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

Case : ('C'|'c')('A'|'a')('S'|'s')('E'|'e');

Else : ('E'|'e')('L'|'l')('S'|'s')('E'|'e');

True : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

Type : ('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

End : ('E'|'e')('N'|'n')('D'|'d');

Var : ('V'|'v')('A'|'a')('R'|'r');

LeftParenthesisFullStop : '(''.';

FullStopRightParenthesis : '.'')';

Of : ('O'|'o')('F'|'f');

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';

FullStop : '.';

Colon : ':';

Semicolon : ';';

CommercialAt : '@';

LeftSquareBracket : '[';

RightSquareBracket : ']';

CircumflexAccent : '^';

RULE_NIL : 'nil';

RULE_DOTDOT : '..';

RULE_NOT : ('N'|'n') ('O'|'o') ('T'|'t');

RULE_STAR : '*';

RULE_SLASH : '/';

RULE_DIV : ('D'|'d') ('I'|'i') ('V'|'v');

RULE_MOD : ('M'|'m') ('O'|'o') ('D'|'d');

RULE_PLUS : '+';

RULE_MINUS : '-';

RULE_AND : ('A'|'a') ('N'|'n') ('D'|'d');

RULE_OR : ('O'|'o') ('R'|'r');

RULE_ASSIGN : ':=';

RULE_NUM_INT : ('0'..'9')+;

RULE_EQUAL : '=';

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : '\'' ('\\' .|~(('\\'|'\'')))* '\'';

RULE_ML_COMMENT : ('(*' ( options {greedy=false;} : . )*'*)'|'{' ( options {greedy=false;} : . )*'}');

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
