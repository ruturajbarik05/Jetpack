package assignment_june_10

fun main() {
    var l = getLength("Ruturaj")
    println("Length = $l")
}
fun getLength(input: String): Int {
    var len = input?.length?:0
    return len
}