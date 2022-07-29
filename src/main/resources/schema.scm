import org.json.assertion.lib.CoreFunction

{
    "test" : #integer,
    "test2" : #string,
    "test3" : #float,
    "test4" : #decimal,
    "test5" : {
            "test6" : #boolean
    },
    "test7" : @minMax(1, 10)#integer,
    "wrongTest" : #integer
}
