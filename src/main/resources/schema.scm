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
