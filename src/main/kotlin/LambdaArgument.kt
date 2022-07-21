fun main() {
    // Lambda argument it dirubah nilainya
    val greeting = "Good Morning"
    greeting.let {result ->
        val goodMorning = "$result, Kotlin"

        println(goodMorning)
    }
}