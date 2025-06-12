package assignment_june_8

fun main()
{
    var listOfint = listOf(1,2,3,4,5,6,7)
    for(item in listOfint)
    {
        if(item %2 !=0)
        {
            println(item)
        }
    }
    println("These Are The Odd items of The List")
}