package assignment_june_8

fun main()
{
    var str:String? = "ABCD"
    str=null
    str.let {
        if(str==null)
            println("The String is Missing")
        else
            println("The String is $str")
    }
}