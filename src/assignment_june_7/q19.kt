package assignment_june_7

fun main(){
    for (i in 1..10){
        if(i==5){
            println("Rush hour!")
            break
        }
        println("Processing order #$i")
    }
}