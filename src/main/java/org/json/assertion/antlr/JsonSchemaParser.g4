parser grammar JsonSchemaParser;

options { tokenVocab=JsonSchemaLexer; }

json
    : classImport* object
    | classImport* array;

classImport
    : IMPORT CLASS_NAME;

object
    : LBRACE (keyValueFunction (COMMA keyValueFunction)* )? RBRACE;

keyValueFunction
    : function
    | keyValue
    ;

keyValue
    : STRING COLON value;

array
    : LBRACKET (value (COMMA value)* )? RBRACKET;

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
    : FUNCTION_IDENTIFIER LPAREN ( value (COMMA value)* )? RPAREN;

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


