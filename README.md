# JSON Assertion Schema

**A JSON validator based on a compact, user-friendly and extensible schema**

A JSON parser and JSON Schema parser build with ANTLR 4 which create AST for both input JSON and schema grammar. Using these ASTs, this library validates input JSON against schema grammar. Unlike other frameworks and libraries, this library can easily be extended by adding new Java classes like **CoreFunction** and import it in schema. This allow complex validation logic written in Java language and thus schema syntaxes are very simple and concise. Moreover, ANTLR 4 schema grammar makes it easy to customize existing syntax and introduce new syntax.

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
    "testMinimum" : @min(10.50)#float,
    "testMaximum" : @max(1000)#integer,
    "testObject" : {
            "testInnerBoolean" : #boolean,
            "testExactValueMatch" : 5,
            @containsKeys("testInnerBoolean", "testExactValueMatch")
    },
    "testMinMaxFunction" : @minMax(1, 10)#integer,
    "testOptionalWithDataType" : ?#integer,
    "testOptionalWithFunction" : ?@minMax(1, 10),
    "testOptionalWhenInputAvailable" : ?#string,
    "testArray" : [1, @minMax(1, 50), 3, @containsAt(0, 3, 2, 1),
                      @arrLenMinMax(2, 5)],
    "testRegex" : @regex("[a-z0-9]+@[a-z]+.com")#string,
    "testStringLength" : @strLenMinMax(5, 15)
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
    "testMinimum" : 10.88,
    "testMaximum" : 100,
    "testObject" : {
        "testInnerBoolean" : true,
        "testExactValueMatch" : 5
    },
    "testMinMaxFunction" : 5,
    "testOptionalWhenInputAvailable" : "Test String",
    "testArray" : [1, 2, 3],
    "testRegex" : "example1971@email.com",
    "testStringLength" : "StringLength"
}
```


@minMax(minimum number inclusive, maximum number inclusive)
check the element on the position is in range thus its position need to be valid (eg. inside array bound or existing key)

@containsAt(index of array element, alternative values that match against the array elements ...)
It applies on the parent array node to fetch the index thus its position in array need not to be inside array bound

@containsKeys(mandatory keys...)
It applies on the parent object to search mandatory keys. Thrown error if missing any of the keys

@arrLenMinMax(minimum number inclusive, maximum number inclusive)
It applies on the parent array node and check the array size in between minimum and maximum

@strLenMinMax(minimum number inclusive, maximum number inclusive)
check the string on the position has length in range thus its position need to be valid (eg. inside array bound or existing key)

### See Also
https://github.com/karatelabs/karate<br>
https://json-schema.org/<br>
https://www.baeldung.com/introduction-to-json-schema-in-java<br>
https://dzone.com/articles/structural-validation-of-json-response-using-rest<br>
https://www.baeldung.com/rest-assured-json-schema<br>
https://www.baeldung.com/jackson-compare-two-json-objects<br>
