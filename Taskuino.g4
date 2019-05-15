grammar Taskuino ;

prog                : stmts* EOF ;

stmts               : task
                    | function
                    | block_stmts
                    ;

block_stmts         : stmt
                    | expr
                    | dcl
                    ;

task                : TASK IDENT PAREN_LEFT ival PAREN_RIGHT BLOCK_START (block_stmts)* BLOCK_END ;

function            : FUNC IDENT PAREN_LEFT param PAREN_RIGHT BLOCK_START (block_stmts)* BLOCK_END ;


stmt                : if_stmt
                    | for_stmt
                    | func_call
                    ;

expr                : assign
                    | bool_expr
                    | calc_expr
                    ;

dcl                 : type IDENT
                    | type IDENT ASSIGN val
                    | type IDENT ASSIGN calc_expr
                    | type IDENT ASSIGN func_call
                    | type ARRAY_START ival? ARRAY_END IDENT (ASSIGN BLOCK_START param BLOCK_END)?
                    ;

assign              : IDENT ASSIGN val
                    | IDENT ASSIGN calc_expr
                    | IDENT ASSIGN func_call
                    ;

calc_expr           : calc_expr_one
                    | calc_expr_two
                    | number mod_op
                    | IDENT op_pres_two ASSIGN number
                    ;

bool_expr           : bool bool_op bool_expr
                    | PAREN_LEFT? val bool_op val PAREN_RIGHT?
                    | (NOT)? bool
                    ;

if_stmt             : IF PAREN_LEFT bool_condition PAREN_RIGHT BLOCK_START (block_stmts)* BLOCK_END eif_stmt*
                    ;

eif_stmt            : ELSE IF PAREN_LEFT bool_condition PAREN_RIGHT BLOCK_START (block_stmts)* BLOCK_END eif_stmt?
                    | ELSE BLOCK_START (block_stmts)* BLOCK_END
                    ;

for_stmt            : FOR PAREN_LEFT (number | dcl) SEMICOLON bool_condition SEMICOLON calc_expr PAREN_RIGHT BLOCK_START (block_stmts)* BLOCK_END ;

func_call           : IDENT PAREN_LEFT param PAREN_RIGHT ;

calc_expr_one       : number (op_pres_one calc_expr_three)? ;

calc_expr_two       : number (op_pres_two calc_expr_one)? ;

calc_expr_three     : number
                    | calc_expr_two
                    ;

bool_condition      : bool_expr
                    | func_call
                    ;

param               : val (PARAM_DELIM val)* ;

op_pres_one         : MULT | DIV | MOD ;
op_pres_two         : PLUS | MINUS ;

bool_op             : EQ
                    | GRT
                    | LESS
                    | GRT_EQ
                    | LESS_EQ
                    | OR
                    | XOR
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

val                 : number
                    | STRING
                    | bool
                    | literals
                    ;

bool                : TRUE
                    | FALSE
                    | IDENT
                    ;

number              : ival
                    | fval
                    | IDENT
                    | IDENT ARRAY_START number ARRAY_END
                    ;

ival                : DIG ;
fval                : DIG.DECDIG
                    | .DECDIG
                    ;

literals            : OUTPUT
                    | INPUT
                    | HIGH
                    | LOW
                    | NULL
                    | VOID
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

EQ                  : 'is' ;
GRT                 : '>' ;
LESS                : '<' ;
GRT_EQ              : '>=' ;
LESS_EQ             : '<=' ;
OR                  : 'or' ;
XOR                 : 'xor' ;
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
SEMICOLON           : ';' ;
DOT_OP              : '.' ;

// keywords
RETURN              : 'return' ;
FOR                 : 'for' ;
IF                  : 'if' ;
ELSE                : 'else' ;
FUNC                : 'func' ;
TASK                : 'task' ;

// literals
TRUE                : 'true' ;
FALSE               : 'false' ;
VOID                : 'void' ;
NULL                : 'null' ;
OUTPUT              : 'OUTPUT' ;
INPUT               : 'INPUT' ;
HIGH                : 'HIGH' ;
LOW                 : 'LOW' ;

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