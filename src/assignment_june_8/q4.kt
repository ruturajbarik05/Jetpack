package assignment_june_8

fun main()
{
    var words = listOf("Ripe","Tango","Deck","fur","Tale","Gift","Site","Filter","Hastle")
    var count = 0
    for(item in words)
    {
        if(item.length == 4)
            count++
    }
    println("The Number of Words Having four Letters Are $count")
}