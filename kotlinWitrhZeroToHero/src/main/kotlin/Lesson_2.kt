fun main() {
    val x = 5
    val y = 9
    val sum = x + y

    println(sum)

    val floatNum1: Float = 10.0f
    val floatNum2 = 3.0f
    val doubleNum: Double = 8.0


    println(floatNum1 / floatNum2)
    println(floatNum1 % floatNum2)
    val c = x + floatNum1
    println(c::class.simpleName)
    val c1 = x + doubleNum
    println(c1::class.simpleName)
    var a = 5
    a++
    println(a)
}