package assignment_june_10

fun main() {
    val token: String? = "abc123" // This could also be null

    token?.run {
        println("The token is not null: $this")

    }
}
