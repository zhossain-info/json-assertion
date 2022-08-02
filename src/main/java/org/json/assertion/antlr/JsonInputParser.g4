parser grammar JsonInputParser;

options { tokenVocab=JsonInputLexer; }

json
    : object
    | array;

object
    : LBRACE (keyValue (COMMA keyValue)* )? RBRACE;

keyValue
    : STRING COLON value;

array
    : LBRACKET (value (COMMA value)* )? RBRACKET;

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