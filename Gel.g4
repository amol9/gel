grammar Gel;

compilationUnit : (variable | print)* EOF ;

variable : VARIABLE ID EQUALS value ;

print : PRINT ID ;

value : NUMBER | STRING ;

VARIABLE : 'var' ;
PRINT : 'print' ;
EQUALS : '=' ;
NUMBER : [0-9]+ ;
STRING : '"'.*'"' ;
ID : [a-zA-Z][a-zA-Z0-9]* ;
WS : [ \t\n\r]+ -> skip ;

