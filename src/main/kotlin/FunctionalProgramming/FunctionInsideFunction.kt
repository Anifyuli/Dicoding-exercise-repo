package FunctionalProgramming

fun main() {
    fun numberList(number : Int) {
        val rate = number / 2
        val range = rate.rangeTo(number * 10)
        for (i in range) println(i)
    }

    numberList(12)
}