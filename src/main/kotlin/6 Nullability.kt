import kotlin.random.Random

fun getRandomPositiveNumber(): Int? {
    val number = Random.nextInt()
    return if (number >= 0) number else null
}

fun main() {
    val name: String = "Alice"
    // TODO make the two below lines compile
    // name = null
    // println(name.length) // null


    val randomPositiveNumber = getRandomPositiveNumber()
    val randomNumber: Int // TODO -1 if null, otherwise the number itself (Elvis)
    // println(randomNumber)
}
