grammar Ardlang ;

prog                : stmt+ EOF ;

stmt                : task
                    | function
                    | expr
                    ;

task                : TASK IDENT PAREN_LEFT param* PAREN_RIGHT ASSIGN BLOCK_START expr* BLOCK_END ;

function            : FUNC IDENT PAREN_LEFT param* PAREN_RIGHT BLOCK_START expr* BLOCK_END ;

param               : val PARAM_DELIM param
                    | val
                    ;

expr                : assign_expr
                    | calc_expr
                    | bool_expr
                    ;

calc_expr           : calc_expr_one
                    | calc_expr_two
                    | IDENT INCR
                    | IDENT DECR
                    ;

calc_expr_one       : val (op_pres_one val)* ;

calc_expr_two       : val (op_pres_two calc_expr_one)*
                    | val
                    ;

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
PAREN_LEFT          : '(' ;
PAREN_RIGHT         : ')' ;
FUNC_DELIM          : ':' ;
PARAM_DELIM         : ',' ;

// keywords
RETURN              : 'return' ;
FOR                 : 'for' ;
IF                  : 'if' ;
ELSE                : 'else' ;
THEN                : 'then' ;
FUNC                : 'function' ;
TASK                : 'task ' ;

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
NEWLINE             : '\n' -> skip ;

IDENT               : [a-zA-Z]([a-zA-Z0-9]*)? ;
DIG                 : [1-9][0-9]* | [0] ;
DECDIG              : [0-9]+ ;
