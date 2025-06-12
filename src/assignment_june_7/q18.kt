package assignment_june_7

fun main(){
    val tip = (1..4).random()
    when(tip){
        1 -> println("Tip : Never trust decaf.")
        2 -> println("Tip : Life happens, coffee hepls.")
        3 -> println("Tip : Espresso yourself")
        4 -> println("Tip : Better latte then never")
    }
}