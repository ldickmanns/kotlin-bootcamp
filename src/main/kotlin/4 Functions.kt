fun main() {
    val greeting = birthdayGreeting(name = "Alice", age = 27)
    println(greeting)

    // TODO make the below line compile with the instructions below
    // val greetingWithName = birthdayGreeting(name = "Alice", age = 27, author = "Bob")
    // println(greetingWithName)
}

// TODO Tutorial
// TODO adjust this function to have 42 as the default parameter for age
// TODO add a parameter "author" with an empty string as a parameter
// TODO use "author" to add a greet: "Greets <author>!"
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!\n"
    val ageGreeting = "You're now $age years old!"
    return nameGreeting + ageGreeting
}
