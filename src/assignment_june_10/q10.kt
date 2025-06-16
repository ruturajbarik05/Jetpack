package assignment_june_10

open class  Animal {
    open fun makeSound() {
        println("The Animal makes a sound")
    }
}
class Dog: Animal() {
    override fun makeSound() {
        println("The Dog Barks")
    }
}
fun main() {
    val animal = Animal()
    animal.makeSound()

    val dog = Dog()
    dog.makeSound()
}