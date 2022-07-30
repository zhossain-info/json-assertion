# json-assertion

A JSON parser and JSON schema parser defined with ANTLR 4 which create AST for both input JSON and schema grammar. Using the ASTs, this project validates input JSON against schema grammar.

### Json Input:

```
{
    "testInteger" : 20,
    "testString" : "test string",
    "testFloat" : 100.56,
    "testDecimal" : 1.3489e500,
    "testObject" : {
        "testInnerBoolean" : true
    },
    "testFunction" : 5,
    "wrongTest" : "using wrong data type in schema",
    "testArray" : [1, 2, 3]
}
```

### Schema Input:

```
import org.json.assertion.lib.CoreFunction

{
    "testInteger" : #integer,
    "testString" : #string,
    "testFloat" : #float,
    "testDecimal" : #decimal,
    "testObject" : {
            "testInnerBoolean" : #boolean
    },
    "testFunction" : @minMax(1, 10)#integer,
    "testOptional" : ?#integer,
    "wrongTest" : #integer,
    "testArray" : [1, @minMax(1, 50), 3, @containsAt(0, 3, 2, 1)]
}
```
