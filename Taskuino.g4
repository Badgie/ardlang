grammar Taskuino ;

prog                : stmts+ EOF ;

stmts               : task
                    | function
                    | stmt
                    ;

task                : TASK IDENT PAREN_LEFT param PAREN_RIGHT BLOCK_START stmt* BLOCK_END ;

function            : FUNC IDENT PAREN_LEFT param PAREN_RIGHT BLOCK_START stmt* BLOCK_END ;


stmt                : assign_stmt
                    | calc_stmt
                    | bool_stmt
                    | if_stmt
                    | for_stmt
                    ;

if_stmt             : IF PAREN_LEFT bool_stmt PAREN_RIGHT BLOCK_START stmt* BLOCK_END (if_stmt)*
                    | ELSE IF PAREN_LEFT bool_stmt PAREN_RIGHT BLOCK_START stmt* BLOCK_END
                    | ELSE BLOCK_START stmt* BLOCK_END
                    ;

for_stmt            : FOR PAREN_LEFT var ';' bool_stmt ';' calc_stmt PAREN_RIGHT BLOCK_START stmt* BLOCK_END ;

calc_stmt           : calc_stmt_one
                    | calc_stmt_two
                    | IDENT INCR
                    | IDENT DECR
                    ;

calc_stmt_one       : val (op_pres_one val)* ;

calc_stmt_two       : val (op_pres_two calc_stmt_one)*
                    | val
                    ;

assign_stmt         : type IDENT ASSIGN var
                    | type IDENT ASSIGN stmt
                    | IDENT ASSIGN var
                    | IDENT ASSIGN stmt
                    ;
   
bool_stmt           : var bool_op var
                    | (NOT)? bool
                    ;


param               : var PARAM_DELIM param
                    | var
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

type                : TYPE_INT
                    | TYPE_STRING
                    | TYPE_DOUBLE
                    | TYPE_BOOL
                    ;

var                 : val
                    | STRING
                    | bool
                    ;

bool                : TRUE
                    | FALSE
                    | IDENT
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
NOT                 : '!' ;

ARRAY_START         : '[' ;
ARRAY_END           : ']' ;
BLOCK_START         : '{' ;
BLOCK_END           : '}' ;
PAREN_LEFT          : '(' ;
PAREN_RIGHT         : ')' ;
QUOTE               : '"' ;
PARAM_DELIM         : ',' ;

// keywords
RETURN              : 'return' ;
FOR                 : 'for' ;
IF                  : 'if' ;
ELSE                : 'else' ;
THEN                : 'then' ;
FUNC                : 'function' ;
TASK                : 'task' ;

// literals
TRUE                : 'true' ;
FALSE               : 'false' ;
VOID                : 'void' ;
NULL                : 'null' ;

// types
TYPE_INT            : 'int' ;
TYPE_STRING         : 'str' ;
TYPE_DOUBLE         : 'dbl' ;
TYPE_BOOL           : 'bool' ;

WHITESPACE          : ' ' -> skip ;
NEWLINE             : '\n' -> skip ;
CAR_RETURN          : '\r' -> skip ;

IDENT               : [a-zA-Z]([a-zA-Z0-9]*)? ;
DIG                 : [1-9][0-9]* | [0] ;
DECDIG              : [0-9]+ ;
fragment CHARS      : ~[.]* ;
STRING              : QUOTE CHARS QUOTE ;
