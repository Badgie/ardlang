grammar Ardlang

expr                : ASSIGN_EXPR
                    | CALC_EXPR
                    | BOOL_EXPR
                    | IVAL
                    | FVAL
                    | IDENT
                    ;

calc_expr           : EXPR OP EXPR ;

assign_expr         : TYPE IDENT ASSIGN EXPR ;
   
bool_expr           : EXPR BOOL_OP EXPR
                    | TRUE
                    | FALSE
                    ;

op                  : OP_PRES_ONE
                    | OP_PRES_TWO
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

WHITESPACE          : ' ' -> skip ;

IDENT               : [a-zA-Z]([a-zA-Z0-9]*)? ;
DIG                 : [1-9][0-9]* | [0] ;
DECDIG              : [0-9]* ;
