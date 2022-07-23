package FunctionalProgramming

fun main() {
    foldExample()
    println()
    foldRightExample()
}

fun foldExample() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val fold = numbers.fold(10) { recent, point ->
        println("recent is $recent")
        println("point is $point")
        println()
        recent + point
    }

    println("Fold result: $fold ")
}

fun foldRightExample() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val fold = numbers.foldRight(10) { recent, point ->
        println("recent is $recent")
        println("point is $point")
        println()
        recent + point
    }

    println("Fold Right result: $fold ")
}