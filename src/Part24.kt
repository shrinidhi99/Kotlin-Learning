fun main() {
    val user1 = UserInit("Kotlin", 3)
    val user2 = UserInit("Java", 30)
    val user3 = UserInit(age = 5)

    println("user name: ${user1.name}")
    println("user age: ${user1.age}")

    println("user name: ${user2.name}")
    println("user age: ${user2.age}")

    println("user name: ${user3.name}")
    println("user age: ${user3.age}")

    val user4 = UserInit("   ", 5)
}

class UserInit(name: String = "No Name", var age: Int) {
    val name: String

    init {
        if (name.isBlank()) {
            this.name = "No Name"
        } else {
            this.name = name.trim()
        }

        print("\nNew user created. Name: ${this.name}, Age: $age\n")
    }
}