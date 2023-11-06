// TODO extract an interface "Shape" with a "computeArea" function
// TODO do the according adjustments below
class Rectangle(val width: Int, val height: Int) {
    val name = "Rectangle"
    fun computeArea() = width * height
    fun printInfo() = println("This $name has an area of ${computeArea()}")
}

// TODO make the below code compile and override the "name" property to return "Square"
// TODO if necessary, adjust the "Rectangle" class
// class Square(val size: Int) : Rectangle(size, size) {

// }

fun main() {
    val rectangle = Rectangle(width = 2, height = 3)
    println(rectangle.computeArea()) // 6
    rectangle.printInfo() // This Rectangle has an area of 6

    // TODO make the below lines compile
    // val square = Square(size = 2)
    // println(square.computeArea()) // 4
    // rectangle.printInfo() // This Square has an area of 4
}
