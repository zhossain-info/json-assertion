grammar JsonInput;

json
    : object
    | array;

object
    : '{' (keyValue (',' keyValue)* )? '}';

keyValue
    : STRING ':' value;

array
    : '[' (value (',' value)* )? ']';

value
    : primitive
    | array
    | object
    ;

primitive
    : BOOLEAN       # Boolean
    | STRING        # String
    | INTEGER       # Integer
    | FLOAT         # Float
    | DECIMAL       # Decimal
    | NULL          # Null
    ;

BOOLEAN : 'true' | 'false';

STRING : '"' (~["\\] | ESCAPE)* '"';
fragment ESCAPE : '\\' ( ["\\/bfnrt]| UNICODE) ;
fragment UNICODE : 'u' HEXADECIMAL HEXADECIMAL HEXADECIMAL HEXADECIMAL;
fragment HEXADECIMAL : [0-9a-fA-F];

DECIMAL : INTEGER ('.' DIGIT+ )? EXPONENT;
FLOAT : INTEGER ('.' DIGIT+ );
INTEGER : '-' ? INTDIGIT;

fragment EXPONENT : [eE] [+\-]? INTDIGIT+;
fragment INTDIGIT : '0' | '1'..'9' DIGIT*;
fragment DIGIT : '0'..'9';

NULL : 'null';

WHITE_SPACE : [\r\n\t ]+ -> skip;

MULTILINE_COMMENTS : '/*' .*? '*/' -> skip;
LINE_COMMENTS : '//' ~('\r' | '\n')* -> skip;
