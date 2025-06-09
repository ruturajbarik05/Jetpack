package assignment_june_7

fun main(){
    val originalPrice = 10
    for(discount in 10..50 step 10) {
        val discountedPrice = originalPrice * (1 - discount / 100.0)
        println("$discount% 0ff: $$discountedPrice ")

    }
}