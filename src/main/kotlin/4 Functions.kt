fun main() {
    val greeting = birthdayGreeting(name = "Alice", age = 42)
    println(greeting)

    // TODO make the two lines below compile with the instructions below
    // val greetingWithName = birthdayGreeting(name = "Alice", author = "Bob")
    // println(greetingWithName)
    // Output:
    // Happy Birthday, Alice!
    // You're now 42 years old!
    // Greets Bob!
}

// TODO adjust this function to have 42 as the default parameter for age
// TODO add a parameter "author" with an empty string as a parameter
// TODO use "author" to add a greet: "Greets <author>!"
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!\n"
    val ageGreeting = "You're now $age years old!"
    return nameGreeting + ageGreeting
}
