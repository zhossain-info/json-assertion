# JSON Assertion Schema

*A JSON validator based on a compact, user-friendly and extensible schema*   
A JSON parser and JSON schema parser build with ANTLR 4 which create AST 
for both JSON and JSON schema grammar. Using these ASTs, this library 
validates input JSON against JSON schema input. Unlike other frameworks 
and libraries, this library can easily be extended by adding new Java 
classes like `CoreFunction` and importing it in schema. This allows 
complex validation logic written in Java language and thus schema 
syntaxes are simple and concise. Moreover, ANTLR 4 schema grammar makes 
it easy to customize existing schema syntax and introduce new syntax.

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
    "testIntegerMinmax" : @intMinmax(100, 500)#integer,
    "testAnyNumberMinmax" : @numMinmax(1.5, 2.5)#float,
    "testObject" : {
            "testInnerBoolean" : #boolean,
            "testExactValueMatch" : 5,
            @containsKeys("testInnerBoolean", "testExactValueMatch")
    },
    "testMinmaxFunction" : @intMinmax(1, 10)#integer,
    "testOptionalWithDataType" : ?#integer,
    "testOptionalWithFunction" : ?@intMinmax(1, 10),
    "testOptionalWhenInputAvailable" : ?#string,
    "testArray" : [1, @intMinmax(1, 50), 3, @containsAt(0, 3, 2, 1),
                      @arrlenMinmax(2, 5)],
    "testRegex" : @regex("[a-z0-9]+@[a-z]+.com")#string,
    "testStringLength" : @strlenMinmax(5, 15)
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
    "testIntegerMinmax" : 200,
    "testAnyNumberMinmax" : 1.9,
    "testObject" : {
        "testInnerBoolean" : true,
        "testExactValueMatch" : 5
    },
    "testMinmaxFunction" : 5,
    "testOptionalWhenInputAvailable" : "Test String",
    "testArray" : [1, 2, 3],
    "testRegex" : "example1971@email.com",
    "testStringLength" : "StringLength"
}
```

### Functions
All functions are applies either on current element (Scope: Current) or on 
parent element (Scope: Parent). If the function is not defined optional, the 
input element it applies on must be existed (eg. inside input array bounds or 
available input key of object)

`@intMinmax(min, max) Scope: Current`<br> 
Validates the integer element is in integer range (inclusive)

`@numMinmax(min, max) Scope: Current`<br>
Validates the number element is in float or decimal precision range (inclusive)

`@containsAt(index, alternatives...) Scope: Parent`  
Validates that one alternative is matched with the array element on index

`@containsKeys(keys...) Scope: Parent`  
Validates all the keys are available in input object

`@arrlenMinmax(min, max) Scope: Parent`  
Validates the json array size is in range (inclusive)

`@strlenMinmax(min, max) Scope: Current`  
Validates the string size is in range (inclusive)

### See Also
https://github.com/karatelabs/karate  
https://json-schema.org/  
https://www.baeldung.com/introduction-to-json-schema-in-java  
https://dzone.com/articles/structural-validation-of-json-response-using-rest  
https://www.baeldung.com/rest-assured-json-schema  
https://www.baeldung.com/jackson-compare-two-json-objects  
