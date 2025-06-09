package assignment_june_7

fun main(){
    println("Even coffee prices from \$1 to \$10:")
    for (price in 1..10) {
        if (price % 2 == 0) {
            println("\$$price coffee — a solid choice!")
        }
    }
}