fun greeting(name: String) {
    println("Hello $name!")
}

fun main() {
    greeting("Alice") // Hello Alice!

    // TODO rewrite the above function as a lambda
    val greeting: (String) -> Unit = TODO()
    // greeting("Bob") // Hello Bob!
}
