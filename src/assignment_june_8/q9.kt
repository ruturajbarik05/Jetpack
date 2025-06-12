package assignment_june_8

fun main()
{
    var f=factorial(5)
    println(f)
}
fun factorial(num:Int):Int{
    if(num ==0 || num ==1)
        return 1
    else
        return (num * factorial(num-1))
}