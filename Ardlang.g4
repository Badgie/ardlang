grammar Ardlang ;

prog                : expr+ EOF ;

expr                : assign_expr
                    | calc_expr
                    | bool_expr
                    ;

calc_expr           : val op val ;

assign_expr         : type IDENT ASSIGN val
                    | type IDENT ASSIGN expr
                    | IDENT ASSIGN val
                    | IDENT ASSIGN expr
                    ;
   
bool_expr           : val bool_op val
                    | TRUE
                    | FALSE
                    ;

op                  : op_pres_one
                    | op_pres_two
                    ;
op_pres_one         : MULT | DIV | MOD ;
op_pres_two         : PLUS | MINUS ;
   
bool_op             : EQ
                    | GRT
                    | LESS
                    | GRT_EQ
                    | LESS_EQ
                    | OR
                    | AND
                    ;
        
mod_op              : INCR
                    | DECR
                    ;

type                : INT
                    | STRING
                    | DOUBLE
                    | BOOL
                    ;

val                 : ival
                    | fval
                    | IDENT
                    ;

ival                : DIG ;
fval                : DIG.DECDIG
                    | .DECDIG
                    ;

// lexer
PLUS                : '+' ;
MINUS               : '-' ;
MULT                : '*' ;
DIV                 : '/' ;
MOD                 : '%' ;
ASSIGN              : '=' ;
INCR                : '++' ;
DECR                : '--' ;
EQ                  : '==' ;
GRT                 : '>' ;
LESS                : '<' ;
GRT_EQ              : '>=' ;
LESS_EQ             : '<=' ;
OR                  : 'or' ;
AND                 : 'and' ;
ARRAY_START         : '[' ;
ARRAY_END           : ']' ;
BLOCK_START         : '{' ;
BLOCK_END           : '}' ;

// keywords
RETURN              : 'return' ;
FOR                 : 'for' ;
IF                  : 'if' ;
ELSE                : 'else' ;
THEN                : 'then' ;
FUNC                : 'function' ;

// literals
TRUE                : 'true' ;
FALSE               : 'false' ;
VOID                : 'void' ;
NULL                : 'null' ;

// types
INT                 : 'int' ;
STRING              : 'str' ;
DOUBLE              : 'dbl' ;
BOOL                : 'boolean'
                    | 'bool'
                    ;

WHITESPACE          : ' ' -> skip ;

IDENT               : [a-zA-Z]([a-zA-Z0-9]*)? ;
DIG                 : [1-9][0-9]* | [0] ;
DECDIG              : [0-9]+ ;
