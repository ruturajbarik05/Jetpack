package assignment_june_7

fun main(){
    val day = 3
    val recommendation = when (day) {
        1 -> "Try a classic Americano to kickstart your week!"
        2 -> "Treat yourself to a Vanilla Latte!"
        3 -> "Midweek Mocha is the way to go!"
        4 -> "How about a Caramel Macchiato?"
        5 -> "Friday Flat White to celebrate!"
        6 -> "Weekend special: Iced Coffee!"
        7 -> "Sunday brew: Cappuccino and chill!"
        else -> "No coffee recommendation today."
    }
    println(recommendation)
}