package assignment_june_10

fun main() {
    var age: Any? = "22"
    var num = age as? Int
    println(num)
    var number = age as? Int?: 23
    println(number)
}