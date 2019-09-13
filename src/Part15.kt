fun main() {
    val time = 4
    val isSunday = false
    val greeting = when {
        isSunday -> "I'm gonna stay in bed all day!"
        time < 5 -> "Why up so early?"
        time in 0..11 -> "Good morning!"
        time == 12 -> "Time for lunch!"
        time == 13 || time == 14 -> {
            println("Yawn...")
            "Time for a nap!"
        }
        else -> "Good day!"
    }
    println(greeting)

    greet("Shrinidhi", 3)
}

fun greet(name: String, reps: Int) {
    var repsLeft = reps
    for (i in 0 until reps)
        println("Hello, $name! Nice to meet you!")
    while (repsLeft > 0) {
        println(name)
        repsLeft--
    }
}