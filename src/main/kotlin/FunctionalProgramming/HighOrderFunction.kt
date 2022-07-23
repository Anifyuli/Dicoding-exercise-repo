package FunctionalProgramming

fun main() {
    doubleExponent(10, multiple)
}

fun doubleExponent(value: Int, multiple: (Int) -> Int) {
    val result = multiple(value)
    println(result)
}

var multiple: (Int) -> Int = {value -> value * value}