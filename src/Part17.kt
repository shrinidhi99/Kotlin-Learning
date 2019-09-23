fun main(): Unit {
    println(double(12))
    println(getMaxNum(12, 13))
}

fun double(num: Int) = num * 2
fun getMaxNum(num1: Int, num2: Int) = if (num1 > num2) num1 else num2