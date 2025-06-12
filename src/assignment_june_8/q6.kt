package assignment_june_8

fun main()
{
    var s=oddSum()
    println("The Sum OF The Odd Elements Is $s")
}
fun oddSum(): Int{
    var elements = listOf(1,2,3,4,5,6,7,8,9,10)
    var sum = 0
    for( item in elements)
    {
        if(item % 2 !=0)
            sum+=item
    }
    return sum
}