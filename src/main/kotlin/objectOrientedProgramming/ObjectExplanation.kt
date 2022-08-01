package objectOrientedProgramming

fun main() {
    fun toyota() {
        val someString = "Toyota"
        println(someString.reversed())
        println(someString.uppercase())
        println(someString.lowercase())
    }

    fun number() {
        val stringNumbers = "12345"
        val intNumbers = stringNumbers.toInt()

        val otherStringNumbers = "54.321"
        val doubleNumbers = otherStringNumbers.toDouble()

        println(intNumbers)
        println(doubleNumbers)
    }

    toyota()
    number()
}