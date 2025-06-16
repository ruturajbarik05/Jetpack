package assignment_june_10

abstract class Shape() {
    abstract fun CalArea(side: Double)
}
class Circle: Shape() {
    override fun CalArea(side: Double) {
        var a = 0.5 * side * side
        println(a)
    }
}
fun main() {
    val ob = Circle()
    ob.CalArea(5.0)
}