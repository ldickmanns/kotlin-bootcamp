import kotlin.random.Random

enum class Direction {
    LEFT, RIGHT, UP, DOWN
}

fun getRandomDirection(): Direction {
    val randomNumber = Random.nextInt(from = 0, until = 4)
    return Direction.entries[randomNumber]
}

fun main() {
    println(horizontalOrVertical(Direction.LEFT)) // horizontal
    println(horizontalOrVertical(Direction.DOWN)) // vertical

    printDirection(getRandomDirection())
}

// TODO use an if-else expression, write a function that returns "horizontal" for left and right and vertical otherwise
fun horizontalOrVertical(direction: Direction): String = TODO()

// TODO refactor this function to use when and an expression body
fun printDirection(direction: Direction) {
    if (direction == Direction.LEFT) {
        println("Go left!")
    } else if (direction == Direction.RIGHT) {
        println("Go right!")
    } else if (direction == Direction.UP) {
        println("Go up!")
    } else {
        println("Go down!")
    }
}
