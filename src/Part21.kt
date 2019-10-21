var topLevelVariable = "I am a top-level variable"
const val STRING_CONSTANT = "I am a constant"

fun main() {
    println(topLevelVariable)
    println(STRING_CONSTANT)
    topLevelVariable = "I have changed"
    println(getLarge(900, 4000, 50, 10, 2))
}

private fun getLarge(a: Int, vararg numbers: Int): Int {
    println(topLevelVariable)
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