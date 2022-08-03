# JSON Assertion Schema

**A JSON validator based on a compact, user-friendly and extensible schema**

A JSON parser and JSON-Schema parser build with ANTLR 4 which create AST for both input JSON and schema grammar. Using the ASTs, this library validates input JSON against schema grammar. This tools can easily be extended by adding Java classes like **CoreFunction** and import in schema.

### Schema Input:

```
import org.json.assertion.lib.CoreFunction

/*
There will be some details about this schema file
including version and modification date etc.
*/

{
    "testInteger" : #integer,
    "testString" : #string,
    "testFloat" : #float,           //this is a line comments
    "testDecimal" : #decimal,
    "testAnyTypeOfNumber" : #number,
    "testObject" : {
            "testInnerBoolean" : #boolean,
            "testExactValueMatch" : 5,
            @containsKeys("testInnerBoolean", "testExactValueMatch")
    },
    "testFunction" : @minMax(1, 10)#integer,
    "testOptionalWithDataType" : ?#integer,
    "testOptionalWithFunction" : ?@minMax(1, 10),
    "testOptionalWhenInputAvailable" : ?#string,
    "testArray" : [1, @minMax(1, 50), 3, @containsAt(0, 3, 2, 1)]
}
```

### Json Input:

```
{
    "testInteger" : 20,
    "testString" : "test string",
    "testFloat" : 100.56,
    "testDecimal" : 1.3489e500,
    "testAnyTypeOfNumber" : 34.8923409,
    "testObject" : {
        "testInnerBoolean" : true,
        "testExactValueMatch" : 5
    },
    "testFunction" : 5,
    "testOptionalWhenInputAvailable" : "Test String",
    "testArray" : [1, 2, 3]
}
```


minMax(minimum number inclusive, maximum number inclusive)
check the element on the position is in range thus its position need to be inside array bound.

containsAt(index of array element, alternative values that match against the array elements ...)
It applies on the parent array to fetch the index thus its position in array need not to be inside array bound

containsKeys(mandatory keys...)
It applies on the parent object to search mandatory keys. Thrown error if missing any of the keys

### See Also
https://www.baeldung.com/introduction-to-json-schema-in-java<br>
https://dzone.com/articles/structural-validation-of-json-response-using-rest<br>
https://www.baeldung.com/rest-assured-json-schema<br>
https://www.baeldung.com/jackson-compare-two-json-objects<br>
