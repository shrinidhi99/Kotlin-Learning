fun main() {
    val user1 = User("Kotlin", 3)
    val user2 = User("Java", 30)

    println("user name: ${user1.name}")
    println("user age: ${user1.age}")

    println("user name: ${user2.name}")
    println("user age: ${user2.age}")
}

class User(val name: String, var age: Int)