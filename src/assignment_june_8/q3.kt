package assignment_june_8

fun main()
{
    var stdInfo = mapOf("Ruturaj" to 85,"Anu" to 90, "Yash" to 80,"Asish" to 76, "Danish" to 95,"Sachit" to 65)
    stdInfo.forEach {
            (name,mark)
        -> if(mark > 75)
        println(name)
    }
    println("These Are The Students Who Have Scored Above 75")
}