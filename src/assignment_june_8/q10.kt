package assignment_june_8

fun main()
{
    LongestStr()
}
fun LongestStr() {
    var max = 0
    var wordList = listOf("Ruturaj", "Barik", "Hungry", "Honesty","Develpoment","Telephone")
    for (item in wordList)
    {
        if(item.length >max)
            max=item.length
    }
    for (item in wordList)
    {
        if(item.length == max)
            println(item)
    }
}