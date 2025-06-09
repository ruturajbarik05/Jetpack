package assignment_june_7

fun main(){
    var size1 = "Small"
    var size2 = "Large"
    println("Before swap : size1 = $size1 & size2 = $size2 ")
    val temp = size1
    size1 = size2
    size2 = temp
    println("After Swap : size1 = $size1 & size2 = $size2")
}