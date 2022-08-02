lexer grammar JsonSchemaLexer;

DATATYPE: '#' [a-z]+;
FUNCTION_IDENTIFIER : '@' IDENTIFIER;
fragment IDENTIFIER : NONDIGIT ( NONDIGIT | DIGIT )*;

STRING : '"' (~["\\] | ESCAPE)* '"';
fragment ESCAPE : '\\' ( ["\\/bfnrt]| UNICODE) ;
fragment UNICODE : 'u' HEXADECIMAL HEXADECIMAL HEXADECIMAL HEXADECIMAL;
fragment HEXADECIMAL : [0-9a-fA-F];

DECIMAL : INTEGER ('.' DIGIT+ )? EXPONENT;
FLOAT : INTEGER ('.' DIGIT+ );
INTEGER : '-' ? INTDIGIT;

fragment EXPONENT : [eE] [+\-]? INTDIGIT+;
fragment INTDIGIT : '0' | [1-9] DIGIT*;
fragment DIGIT : [0-9];
fragment NONDIGIT: [A-Za-z_];

IMPORT : 'import' -> pushMode(IMPORT_CLASS);
OPTIONAL : '?';
LPAREN : '(';
RPAREN : ')';
LBRACKET : '[';
RBRACKET : ']';
LBRACE : '{';
RBRACE : '}';
COMMA : ',';
COLON : ':';

BOOLEAN : 'true' | 'false';
NULL : 'null';

WHITE_SPACE : [\r\n\t ]+ -> skip;

MULTILINE_COMMENTS : '/*' .*? '*/' -> skip;
LINE_COMMENTS : '//' ~('\r' | '\n')* -> skip;

//------------------HANDLE IMPORT CLASS------------------
mode IMPORT_CLASS;

CLASS_NAME : IDENTIFIER ('.' IDENTIFIER)* -> popMode;
WHITE_SPACE_IC : [\r\n\t ]+ -> skip;
MULTILINE_COMMENTS_IC : '/*' .*? '*/' -> skip;