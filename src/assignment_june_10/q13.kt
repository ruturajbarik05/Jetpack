package assignment_june_10

data class User(val name: String, val email: String)

fun main() {
    val user1 = User("Ruturaj Barik","ruturajbarik05@gmail.com")
    val user2 = User("Danish Khan","danishkhan77@gmail.com")
    println(user1==user2)
}