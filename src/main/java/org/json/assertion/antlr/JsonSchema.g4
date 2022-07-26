grammar JsonSchema;

// Json definition
json
    : object
    | array;

// Object definition
object
    : '{' (keyValue (',' keyValue)* )? '}';

keyValue
    : KEY ':' value;

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
    : DATATYPE
    ;


// Data type definition
DATATYPE:
    '#' [a-z]+;

// Key definition
KEY : '"' (~["\\] | ESCAPE)* '"';
fragment ESCAPE : '\\' ( ["\\/bfnrt]| UNICODE) ;
fragment UNICODE : 'u' HEXADECIMAL HEXADECIMAL HEXADECIMAL HEXADECIMAL;
fragment HEXADECIMAL : [0-9a-fA-F];

// Skip white spaces
WHITE_SPACE : [\r\n\t ]+ -> skip;

// Skip multiline comments
MULTILINE_COMMENTS : '/*' .*? '*/' -> skip;

// Skip single line comments
LINE_COMMENTS : '//' ~('\r' | '\n')* -> skip;
