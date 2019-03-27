grammar Taskuino ;

prog                : stmts* EOF ;

stmts               : task
                    | function
                    | stmt
                    ;

task                : TASK IDENT PAREN_LEFT param* PAREN_RIGHT BLOCK_START stmt* BLOCK_END ;

function            : FUNC IDENT PAREN_LEFT param* PAREN_RIGHT BLOCK_START stmt* BLOCK_END ;


stmt                : assign_stmt
                    | assign_comp_stmt
                    | calc_stmt
                    | bool_stmt
                    | if_stmt
                    | for_stmt
                    | dcl_stmt
                    | method_stmt
                    ;

if_stmt             : IF PAREN_LEFT if_cond PAREN_RIGHT BLOCK_START stmt* BLOCK_END (if_stmt)*
                    | ELSE IF PAREN_LEFT if_cond PAREN_RIGHT BLOCK_START stmt* BLOCK_END
                    | ELSE BLOCK_START stmt* BLOCK_END
                    ;

if_cond             : bool_stmt
                    | method_stmt
                    ;

for_stmt            : FOR PAREN_LEFT (var | assign_stmt) SEMICOLON bool_stmt SEMICOLON calc_stmt PAREN_RIGHT BLOCK_START stmt* BLOCK_END ;

calc_stmt           : calc_stmt_one
                    | calc_stmt_two
                    | var mod_op
                    | IDENT op_pres_two ASSIGN var
                    ;

calc_stmt_one       : val (op_pres_one val)* ;

calc_stmt_two       : val (op_pres_two calc_stmt_one)*
                    | val
                    ;

assign_stmt         : type_assign
                    | typeless_assign
                    ;

assign_comp_stmt    : COMP_DCL IDENT ASSIGN BLOCK_START comp_param* BLOCK_END ;

type_assign         : type IDENT ASSIGN var
                    | type IDENT ASSIGN stmt
                    ;

typeless_assign     : IDENT ASSIGN var
                    | IDENT ASSIGN calc_stmt
                    ;

comp_param          : typeless_assign PARAM_DELIM comp_param
                    | typeless_assign
                    ;

dcl_stmt            : type IDENT
                    | COMP_DCL IDENT
                    | type ARRAY_START ival? ARRAY_END IDENT (ASSIGN BLOCK_START param* BLOCK_END)?
                    ;
   
bool_stmt           : bool_stmt bool_op bool_stmt
                    | PAREN_LEFT? var bool_op var PAREN_RIGHT?
                    | (NOT)? bool
                    | var
                    | method_stmt
                    ;

method_stmt         : IDENT DOT_OP IDENT PAREN_LEFT param* PAREN_RIGHT ;


param               : var PARAM_DELIM param
                    | var
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
                    | COMP_DCL
                    ;

var                 : val
                    | STRING
                    | bool
                    | lconst
                    ;

bool                : TRUE
                    | FALSE
                    | IDENT
                    ;

val                 : ival
                    | fval
                    | IDENT ARRAY_START var ARRAY_END
                    | IDENT
                    ;

ival                : DIG ;
fval                : DIG.DECDIG
                    | .DECDIG
                    ;

lconst              : OUTPUT
                    | INPUT
                    | HIGH
                    | LOW
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
THEN                : 'then' ;
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

COMP_DCL            : [A-Z]([a-zA-Z]*) ;
IDENT               : [a-zA-Z]([a-zA-Z0-9]*)? ;
DIG                 : [1-9][0-9]* | [0] ;
DECDIG              : [0-9]+ ;
fragment CHARS      : ~[.]* ;
STRING              : QUOTE CHARS QUOTE ;
