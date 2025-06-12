package assignment_june_7

fun main(){
    val temp = 60
    val tempcategory = when{
        temp <  50 -> "Too Cold"
        temp in 50..70 -> "Perfect"
        else -> "Too Hot"

    }
    println("The temperature of the coffee is $tempcategory")
}