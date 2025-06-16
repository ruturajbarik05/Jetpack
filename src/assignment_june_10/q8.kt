package assignment_june_10

fun main() {
    val ob = person("Ruturaj Barik", 22)
    ob.runtime()
}
class person(val name:String , val age: Int) {
    fun runtime() {
        println("Hey $name Your age is $age")
    }
}