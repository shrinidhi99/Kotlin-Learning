fun main() {
    val array = intArrayOf(1, 2, 3, 4, 50, 6, 7, 8, 9)
    println(getSum(10, 20, *array))
    println(getLarge(1, *array))
}

private fun getSum(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers)
        sum += number
    return sum
}

private fun getLarge(a: Int, vararg numbers: Int): Int {
    val array = intArrayOf(*numbers)
    var l = a
    var L = array.size
    --L
    for (i: Int in 0..L) {
        if (array[i] > l)
            l = array[i]
    }
    return l
}