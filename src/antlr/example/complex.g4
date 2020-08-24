grammar complex;

@lexer::header{package antlr.example;}
@lexer::members{}
@parser::header{package antlr.example;}
@parser::members{}
//GRAMATICA LIBRE DE CONTEXTO
start   : define;
define  : (numdef|operdef|printvar|grafvar)+;
printvar: PR STRING PC;
grafvar : GR STRING PC;
numdef  : VAR STRING EQ (number) PC;
number  : (binomica|polar);
operdef : VAR STRING EQ oper;
oper    : (suma|resta|mul|div) PC;
suma    : STRING PLUS STRING;   
resta   : STRING LESS STRING;
mul     : STRING MUL STRING;
div     : STRING DIV STRING;
binomica: real PLUS imaginaria;
polar   : real E LPAR IMAGI real RPAR;
real    : (LESS)? INT;
imaginaria: real IMAGI;

//Expresiones regulares
PR      : 'show';
GR      : 'plot';
BI      : 'binom';
PC      : ';';
POL     : 'polar';
TR      : 'trig';
VAR     : 'var';
OPER    : 'operation';
COMA    : ',';
PLUS    : '+';
LESS    : '-';
MUL     : '*';
DIV     : '/';
LPAR    : '(';
RPAR    : ')';
EQ      : '=';
INT     : [0-9]+;
IMAGI   : 'i';
E       : 'e';
STRING  : [a-zA-Z]+;
WS      :   (' '|'\n'|'\r'|'\t')+ ->skip;
