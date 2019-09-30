// function overloading
fun main() {
    println(getMin(11.5, 5.3))
    println(getMin(11, 12))
    println(getMin(11, 12, 13))
}

fun getMin(a: Int, b: Int) = if (a > b) a else b
fun getMin(a: Double, b: Double) = if (a > b) a else b
fun getMin(a: Int, b: Int, c: Int) = when {
    a >= b && a >= c -> a
    b >= a && b >= c -> b
    else -> c
}