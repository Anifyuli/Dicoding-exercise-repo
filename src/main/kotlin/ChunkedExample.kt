import java.util.*

fun main() {
    fun chunkedExample1() {
        val word = "QWERTY"
        val chunked = word.chunked(2)

        println(chunked)
    }

    fun chunkedExample2() {
        val word = "QWERTY"
        val chunkedTransform = word.chunked(2) {
            it.toString().lowercase(Locale.getDefault())
        }

        println(chunkedTransform)
    }

    chunkedExample1()
    chunkedExample2()
}