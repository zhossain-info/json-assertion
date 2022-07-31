grammar JsonSchema;

json
    : classImport* object
    | classImport* array;

classImport
    : 'import' CLASS_NAME;

object
    : '{' (keyValueFunction (',' keyValueFunction)* )? '}';

keyValueFunction
    : function
    | keyValue
    ;

keyValue
    : STRING ':' value;

array
    : '[' (value (',' value)* )? ']';

value
    : validator
    | primitive
    | array
    | object
    ;

validator
    : OPTIONAL? function? dataType
    | OPTIONAL? function dataType?
    ;

function
    : FUNCTION_IDENTIFIER '(' ( value (',' value)* )? ')';

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


BOOLEAN : 'true' | 'false';
NULL : 'null';

DATATYPE: '#' [a-z]+;
FUNCTION_IDENTIFIER : '@' IDENTIFIER;
CLASS_NAME : IDENTIFIER ('.' IDENTIFIER)*;
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

OPTIONAL : '?';

WHITE_SPACE : [\r\n\t ]+ -> skip;

MULTILINE_COMMENTS : '/*' .*? '*/' -> skip;
LINE_COMMENTS : '//' ~('\r' | '\n')* -> skip;