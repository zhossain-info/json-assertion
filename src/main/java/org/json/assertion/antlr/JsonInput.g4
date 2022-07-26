grammar JsonInput;

// Json definition
json
    : object
    | array;

// Object definition
object
    : '{' (keyValue (',' keyValue)* )? '}';

keyValue
    : STRING ':' value;

// Array definition
array
    : '[' (value (',' value)* )? ']';

// Value definition
value
    : primitive
    | array
    | object
    ;

primitive
    : BOOLEAN
    | STRING
    | INTEGER
    | FLOAT
    | DOUBLE
    | NULL
    ;

// Boolean definition
BOOLEAN : 'true' | 'false';

// String definition
STRING : '"' (~["\\] | ESCAPE)* '"';
fragment ESCAPE : '\\' ( ["\\/bfnrt]| UNICODE) ;
fragment UNICODE : 'u' HEXADECIMAL HEXADECIMAL HEXADECIMAL HEXADECIMAL;
fragment HEXADECIMAL : [0-9a-fA-F];

// Number definition
DOUBLE : INTEGER ('.' DIGIT+ )? EXPONENT;
FLOAT : INTEGER ('.' DIGIT+ );
INTEGER : '-' ? INTDIGIT;

fragment EXPONENT : [eE] [+\-]? INTDIGIT+;
fragment INTDIGIT : '0' | '1'..'9' DIGIT*;
fragment DIGIT : '0'..'9';

// Null definition
NULL : 'null';

// Skip white spaces
WHITE_SPACE : [\r\n\t ]+ -> skip;

// Skip multiline comments
MULTILINE_COMMENTS : '/*' .*? '*/' -> skip;

// Skip single line comments
LINE_COMMENTS : '//' ~('\r' | '\n')* -> skip;
