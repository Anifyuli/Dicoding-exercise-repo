package functionalProgramming

fun main() {
    "Kotlin".printString()
    println(3.multipleFour())
}

fun String.printString() {
    println(this)
}

fun Int.multipleFour() : Int {
    return this * 4
}