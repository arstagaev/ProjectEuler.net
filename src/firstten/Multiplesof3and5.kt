package firstten

import kotlin.collections.ArrayList

fun main (){
    mainwork()
}
var array : ArrayList<Int> = ArrayList()
fun mainwork() {
    print("Input num \n")
    var input = readLine()!!.toInt() -1// not include the end num

    for(i in 1..input){
        if (i%3 ==0 ||  i%5 == 0){
            array.add(i)
        }
    }
    print(array.toString()+" The Sun is "+ array.sum())
}