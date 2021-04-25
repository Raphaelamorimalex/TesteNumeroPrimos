fun primos(numero:Int):Boolean{
    var j = 2
    var calculo:Int = (Math.sqrt(numero.toDouble())).toInt()
    for(j in 2..calculo + 1){
        if(numero % j == 0){
            return false
        }
    }
    return true
}
////
fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()
    var x:Int
    var check:Boolean
    for (i in 1..n) {
        x = readLine()!!.toInt()
        check = primos(x)
        if((x>=2) && (check == true)){
            println("Prime")
        }else{
            println("Not Prime")
        }
    }
}