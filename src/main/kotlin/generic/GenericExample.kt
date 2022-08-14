package generic

import generic.List

public fun <T> List<T>.slice(indices: Iterable<T>) {
    return
}

fun main() {
    val numbers = (1..100).toList()
    println(numbers.slice<Int>(1..100))
}