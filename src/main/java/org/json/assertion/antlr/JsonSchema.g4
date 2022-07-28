grammar JsonSchema;

json
    : cImport* object
    | cImport* array;

cImport
    : 'import' CLASS_NAME;

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
    : validator
    | primitive
    | array
    | object
    ;

validator
    : function? dataType
    | function dataType?
    ;

function
    : APPLY_LEVEL IDENTIFIER '(' ( value (',' value)* )? ')';

dataType
    : DATATYPE;

primitive
    : BOOLEAN       # Boolean
    | STRING        # String
    | INTEGER       # Integer
    | FLOAT         # Float
    | DECIMAL       # Decimal
    | NULL          # Null
    ;

CLASS_NAME: IDENTIFIER ('.' IDENTIFIER)*;

APPLY_LEVEL: '@'+;
IDENTIFIER : NONDIGIT ( NONDIGIT | DIGIT )*;
DATATYPE: '#' [a-z]+;

BOOLEAN : 'true' | 'false';

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

NULL : 'null';

WHITE_SPACE : [\r\n\t ]+ -> skip;

MULTILINE_COMMENTS : '/*' .*? '*/' -> skip;
LINE_COMMENTS : '//' ~('\r' | '\n')* -> skip;