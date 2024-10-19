fun greeting(name: String) {
    println("Hello $name!")
}

fun main() {
    greeting("Alice") // Hello Alice!

    // TODO rewrite the above function as a lambda
    val greetingLambda: (String) -> Unit = TODO()
    // greetingLambda("Bob") // Hello Bob!
}
