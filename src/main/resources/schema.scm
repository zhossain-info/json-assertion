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
