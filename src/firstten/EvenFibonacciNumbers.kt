package firstten

//pizdec
var fibonaccisize : Int = 10-1
fun main (){
    counter()

}

var arrayFibonacci : ArrayList<Int> = ArrayList()

fun counter() {
    arrayFibonacci.add(1)
    arrayFibonacci.add(2)
    arrayFibonacci.add(3)
    for (i in 2..fibonaccisize){
        var willadd : Int = arrayFibonacci.get(i-1)+ arrayFibonacci.get(i-2)

        if (willadd %2 == 0){
            arrayFibonacci.add(willadd)
        }

    }

    print(arrayFibonacci.toString())
}
