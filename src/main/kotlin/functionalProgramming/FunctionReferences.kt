package functionalProgramming

fun main() {
    functionReferences1()
    functionReferences2()
}

fun isEvenNumber(number : Int) = number % 2 == 0

fun Int.isOddNumber() = this % 2 == 1

fun functionReferences1() {
    val numbers = 1.rangeTo(10)
    // Gunakan :: untuk merujuk pada fungsi lain dalam suatu file
    val evenNumbers = numbers.filter(::isEvenNumber)

    println(evenNumbers)
}

fun functionReferences2() {
        val numbers = 1.rangeTo(10)
        val OddNumbers = numbers.filter(Int::isOddNumber)

        println(OddNumbers)
}