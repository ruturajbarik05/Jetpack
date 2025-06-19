package assignment_june_13

fun main() {
    validateInput("Ruturaj")
    validateInput(" ")
}

fun validateInput(input: String) {
    if (input.isBlank()) {
        throw IllegalArgumentException("Input cannot be blank")
    } else {
        println("Valid input: $input")
    }
}