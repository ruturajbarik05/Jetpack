package assignment_june_7

fun main() {
    for (i in 1..10) {
        if (i % 3 == 0) {
            println("Skipping decaf order #$i")
        }
        continue
    println("Preparing coffee order #$i")
    }
}