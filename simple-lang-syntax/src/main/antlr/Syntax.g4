grammar Syntax;

tokens { INDENT, DEDENT }

start : definition* EOF;

definition : termDef '=' term;

termDef : 'def' var typedVar*;

typedVar: '(' var ':' term ')';

bind : cons var*;

cons : ConsID;
var : TermID;

term : cons
     | var
     | term '@'+ term
     | '\\'+ typedVar+ '->' term
     | '(' term ')';

test : 'a' NEWLINE INDENT 'b' DEDENT;


//NEWLINE : ('\r'? '\n' | '\r') -> skip;
//NEWLINE : ('\r'? '\n' | '\r');
NEWLINE : ('\r'? '\n' ' '*);
TermID : SMALL (LARGE | SMALL)*;
ConsID : LARGE (LARGE | SMALL)*;

LARGE : [A-Z];
SMALL : [a-z];
DIGIT : [0-9];
SPACE : [ \t]+ -> skip;
//SPACE : [ \t]+;
