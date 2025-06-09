package assignment_june_7

fun main(){
    val caffeineLevel = 85
    val strength = when (caffeineLevel) {
        in 0..30 -> "Mild"
        in 31..70 -> "Medium"
        in 71..100 -> "Strong"
        else -> "Unknown strength"
    }
    println("Your coffee strength is: $strength")
}
