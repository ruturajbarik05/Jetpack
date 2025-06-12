package assignment_june_8

fun main()
{
    var s = Sum()
    println("The sum is $s")
}
fun Sum(): Int
{
    println("Enter The Value of X And Y")
    var x = readln().toInt()
    var y = readln().toInt()
    var z = x + y
    return z
}