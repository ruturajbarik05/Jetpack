package assignment_june_8

fun main()
{
    var mutList = mutableListOf("Danish","Yash","Asish","ashu","Ruturaj","Abhi","atish","Sam")
    var i=0
    for(item in mutList)
    {
        if( mutList[i][0] =='A' || mutList[i][0] =='a') {
            i++
            continue
        }
        i++
        println(item)
    }
}