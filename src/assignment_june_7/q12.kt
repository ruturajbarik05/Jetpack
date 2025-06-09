package assignment_june_7

fun main(){
    val price = 60
    val category = when{
        price < 30 -> "Low"
        price in 30..50 -> "Medium"
        else -> "High"
    }
    println("The coffee is in the $category price range.")
}