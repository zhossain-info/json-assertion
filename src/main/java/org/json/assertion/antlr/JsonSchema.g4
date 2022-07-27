grammar JsonSchema;

json
    : object
    | array;

object
    : '{' (keyValue (',' keyValue)* )? '}';

keyValue
    : key ':' value;

array
    : '[' (value (',' value)* )? ']';

key
    : STRING
    ;

value
    : primitive
    | array
    | object
    ;

primitive
    : DATATYPE      # DataType
    ;


// Data type definition
DATATYPE:
    '#' [a-z]+;

// Key definition
STRING : '"' (~["\\] | ESCAPE)* '"';
fragment ESCAPE : '\\' ( ["\\/bfnrt]| UNICODE) ;
fragment UNICODE : 'u' HEXADECIMAL HEXADECIMAL HEXADECIMAL HEXADECIMAL;
fragment HEXADECIMAL : [0-9a-fA-F];

// Skip white spaces
WHITE_SPACE : [\r\n\t ]+ -> skip;

MULTILINE_COMMENTS : '/*' .*? '*/' -> skip;
LINE_COMMENTS : '//' ~('\r' | '\n')* -> skip;
