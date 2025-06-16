package assignment_june_10

interface Drivable {
    fun drive()
}
class Car: Drivable {
    override fun drive() {
        println("Car is Drivable")
    }
}
fun main() {
    val ob = Car()
    ob.drive()
}