fun main() {
    val time = 10
    if (time in 0..11) {
        println("Good Morning!")
    } else if (time == 12) {
        println("Time for lunch!")
    } else {
        println("Good day!")
    }
    println("Good ${if (time < 12) "morning" else "day"}!")

    when (time) {
        in 0..11 -> println("Good morning!")
        12 -> println("Time for lunch!")
        else -> println("Good day!")
    }

    val greeting = when (time) {
        in 0..11 -> "Good morning!"
        12 -> "Time for lunch!"
        13, 14 -> {
            println("Yawn...")
            "Time for a nap!"
        }
        else -> "Good day!"
    }
    println(greeting)
}