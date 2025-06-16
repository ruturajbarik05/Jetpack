package Quistens

//Find missing numbers:

//input: [1, 2, 3, 5, 7]
//output: [4, 6]
//fun main(){
//    val list = listOf(1,2,3,5,7)
//    val result = findMissing(list)
//    println(result)
//}
//
//fun findMissing(a: List<Int>): List<Int> {
//    val n = a.maxOrNull() ?: 0
//    val inputset = a.toSet()
//    val missing = mutableListOf<Int>()
//    for (i in 1..n) {
//        if (i !in inputset) {
//            missing.add(i)
//        }
//
//    }
//    return missing
//}


//Functions:Create a function that will test to see whether a string value contains a valid IPv4 address.
// An IPv4 address is the address assigned to a computer that uses the internet Protocol (IP) to communicate.
// An IP address consists of four numeric values that range from 0-255, separated by a dot(period) Example: 10.0.1.250.

fun isValidIPv4(ip: String): Boolean {
    val parts = ip.split(".")

    // IPv4 must have exactly 4 parts
    if (parts.size != 4) return false

    for (part in parts) {
        // Check if each part is a number
        val number = part.toIntOrNull() ?: return false

        // Check range: 0–255
        if (number !in 0..255) return false

        // Prevent leading zeros (e.g., "01" is invalid)
        if (part != number.toString()) return false
    }

    return true
}

fun main() {
    val testIPs = listOf(
        "10.0.1.250",
        "255.255.255.255",
        "192.168.1.1",
        "256.100.50.25",   // invalid
        "123.045.067.089", // invalid due to leading zeros
        "1.2.3",           // invalid: not 4 parts
        "abc.def.gha.bcd"  // invalid: non-numeric
    )

    for (ip in testIPs) {
        println("$ip is valid: ${isValidIPv4(ip)}")
    }
}
