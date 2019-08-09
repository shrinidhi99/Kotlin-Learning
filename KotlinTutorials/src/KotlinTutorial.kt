fun main() {
    val userName = "Shrinidhi"
    val age = 20
    val a = 4
    /**
    To explicitly declare and define data types you can do this
    val <variable_name>: <data_type> = <value>
     */
    val b = 2
    val numbers: Array<Array<Int>> = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(5, 6, 7)
    )
    println(numbers[1][1])
    val names: Array<String> = arrayOf("Shrinidhi", "Shrinidhi A V", "Na")
    println("Array size = ${names.size}.\nFirst element: ${names[0]}.\nLast element = ${names[names.lastIndex]}.")
    /**
     * Last element can be got in three ways: .size -1, .lastIndex, .last()
     */
    /**    println can be written the same way as Java
     */
    for (index: Int in names.indices)
        println("Index: $index Element: ${names[index]}")

    for (name: String in names) {
        println(name)
    }
    for (i: Int in 1.rangeTo(10).step(2))
        println(i)
    for (i: Int in 1..10)
        println(i)
    for (i: Int in 1 until 10 step 2)
        println(i)
    for (i: Int in 10 downTo 1)
        println(i)
    println("a = $a b = $b")
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    val exampleLong: Long = age.toLong()
    var i = 0
    while (i < 5) {
        println(i)
        ++i
    }
    i = 0
    outer@ do {
        ++i
        println("$i")
        for (k: Int in 1..10) {
            println("---$k")
            if (k > 5) {
                break@outer
            }
        }
    } while (i < 5)
    print("Hello world! My first program in Kotlin!")
    println(" Hello $userName. You are $age years old! I will be ${exampleLong + 2} in 2021 hopefully!.")
    sayHelloKotlin()
}

fun sayHelloKotlin() {
    println("Hello Kotlin!")
}