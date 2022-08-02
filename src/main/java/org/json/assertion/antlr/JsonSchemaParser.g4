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




