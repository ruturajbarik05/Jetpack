package assignment_june_10

fun main() {
    var nullableEmail: String? = "ruturajbarik05@gmail.com"
    nullableEmail = null
    var msg = nullableEmail?: "No email provided !"
    println(msg)
}