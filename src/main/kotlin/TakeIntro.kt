fun main() {
    takeExample()
    takeLast()
}

fun takeExample() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)
}

fun takeLast() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val takeLast = total.takeLast(3)

    println(takeLast)
}