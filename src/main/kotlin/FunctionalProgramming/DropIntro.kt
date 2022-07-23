package FunctionalProgramming

fun main() {
    dropExample()
    dropLastExample()
}

fun dropExample() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val drop = numbers.drop(3)

    println(drop)
}

fun dropLastExample() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val dropLast = numbers.dropLast(3)

    println(dropLast)
}