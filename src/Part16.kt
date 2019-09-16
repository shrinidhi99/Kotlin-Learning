fun main() {
    val max = getMax(12, 2)
    println(max)
    val num = doubleNum(2)
    println(num)
}

fun getMax(num1: Int, num2: Int): Int {
    return if (num1 > num2) num1 else num2
}

fun doubleNum(num: Int): Double {
    return (2 * num).toDouble()
}