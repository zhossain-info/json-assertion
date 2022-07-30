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
minMax(minimum number inclusive, maximum number inclusive)
check the element on the position is in range thus its position need to be inside array bound.

containsAt(index of array element, alternative values that match against the array elements ...)
It applies on the parent array to fetch the index thus its position in array need not to be inside array bound
