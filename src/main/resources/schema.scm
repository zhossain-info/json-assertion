import org.json.assertion.lib.CoreFunction

{
    "testInteger" : #integer,
    "testString" : #string,
    "testFloat" : #float,           //allow comments
    "testDecimal" : #decimal,
    "testAnyTypeOfNumber" : #number,
    "testObject" : {
            "testInnerBoolean" : #boolean,
            "testExactValueMatch" : 5,
            @containsKeys("testInnerBoolean", "testExactValueMatch")
    },
    "testFunction" : @minMax(1, 10)#integer,
    "testOptionalDataType" : ?#integer,
    "testOptionalFunction" : ?@minMax(1, 10),
    "testOptionalAvailable" : ?#string,
    "testArray" : [1, @minMax(1, 50), 3, @containsAt(0, 3, 2, 1)]
}
