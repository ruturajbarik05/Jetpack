package assignment_june_10

fun main() {
    val ob1 = personDet("Ruturaj", 22)
    ob1.runtime()
    val ob2 = personAge("Ruturaj")
    ob2.defaultAge()

}
class personDet(val name:String , val age: Int) {
    fun runtime() {
        println("Hey $name your age is $age ")
    }
}
class personAge(val name: String, val age: Int = 20) {
    fun defaultAge() {
        println("Hey $name your age is $age")
    }
}
