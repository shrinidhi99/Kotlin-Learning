fun main() {
    Greet(name = "Hans")
    Greet(reps = 5)
    Greet(message = "Hi")
    println(getSum(1, 2))
    println(getSum(num3 = 4, num1 = 2))
    println(getSum(1, 2, 3, 4))
}

fun Greet(message: String = "Nothing", name: String = "User", reps: Int = 1) {
    for (i in 0 until reps)
        println("Hello, $name! $message")
}

fun getSum(num1: Int = 0, num2: Int = 0, num3: Int = 0, num4: Int = 0): Int {
    return num1 + num2 + num3 + num4
}