package assignment_june_10

class MathUtils {
    companion object {
        fun square(n: Int): Int {
            return n*n
        }
    }
}
fun main() {
    var sq = MathUtils.square(5)
    println("The square of The Number is $sq")
}