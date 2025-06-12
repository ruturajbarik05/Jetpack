package assignment_june_8

fun main()
{
    var itemsList:List<Int>? = listOf(1,2,3,4,5,)

    if( itemsList == null)
        println("The List Is Empty")
    else
    {
        var max=0
        for(item in itemsList)
        {
            if(item > max)
                max =item
        }
        println("The Maximum Element is $max")
    }
}