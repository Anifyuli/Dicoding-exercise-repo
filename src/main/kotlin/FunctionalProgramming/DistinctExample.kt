package FunctionalProgramming

fun main() {
    // Distinct tidak digunakan dalam Map Collection
    fun distinctExample1() {
        val list = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5, 6, 7, 8, 6)
        val distinct = list.distinct()

        println(distinct)
    }

    fun distinctExample2() {
        // Distinct dapat dipakai pada data class
        data class Item(val key: String, val value: Any)

        val items = listOf(
            Item("1", "Kotlin"),
            Item("2", "is"),
            Item("3", "Superb"),
            Item("3", "as"),
            Item("3", "Programming"),
            Item("3", "Language")
        )

        val distinctItems = items.distinctBy { it.key }
        distinctItems.forEach {
            println("${it.key} with value ${it.value}")
        }
    }

    fun distinctExample3() {
        val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
        val distinct = text.distinctBy {
            it.length
        }

        println(distinct)
    }

    distinctExample1()
    distinctExample2()
    distinctExample3()
}