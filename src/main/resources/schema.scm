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
