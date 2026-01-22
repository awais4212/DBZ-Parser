grammar DBZ;

// Parser Rules
program
    : statement+ EOF
    ;

statement
    : variableDeclaration
    | assignment
    | printStatement
    | ifStatement
    | whileStatement
    | block
    ;

variableDeclaration
    : 'power' ID '=' expression ';'
    ;

assignment
    : ID '=' expression ';'
    ;

printStatement
    : 'print' '(' expression ')' ';'
    ;

ifStatement
    : 'if' '(' condition ')' block ('else' block)?
    ;

whileStatement
    : 'while' '(' condition ')' block
    ;

block
    : '{' statement* '}'
    ;

condition
    : expression relationalOp expression
    ;

relationalOp
    : '>'
    | '<'
    | '>='
    | '<='
    | '=='
    | '!='
    ;

expression
    : expression ('*' | '/') expression     # MulDiv
    | expression ('+' | '-') expression     # AddSub
    | '(' expression ')'                    # Parens
    | ID                                    # Identifier
    | NUMBER                                # Number
    ;

// Lexer Rules
ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NUMBER
    : [0-9]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;