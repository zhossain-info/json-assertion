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
            @objContainsKeys("testInnerBoolean", "testExactValueMatch")
    },
    "testMinmaxFunction" : @intMinmax(1, 10)#integer,
    "testOptionalWithDataType" : ?#integer,
    "testOptionalWithFunction" : ?@intMinmax(1, 10),
    "testOptionalWhenInputAvailable" : ?#string,
    "testArray" : [10, @intMinmax(10, 20), 30, @arrContainsAt(0, 30, 20, 10),
                      @arrElementOf(30, 0, 1, 2), @arrlenMinmax(2, 5),
                      @arrContainsElement(10, 20)],
    "testRegex" : @regex("[a-z0-9]+@[a-z]+.com")#string,
    "testStringLength" : @strlenMinmax(5, 15)
}
