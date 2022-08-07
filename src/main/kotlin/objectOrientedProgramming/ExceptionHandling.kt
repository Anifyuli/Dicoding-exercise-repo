package objectOrientedProgramming

fun main() {
    val nullValue: String? = null
    lateinit var notNullValue: String

    try {
        notNullValue = nullValue!!
        println(nullValue)
    } catch (e: Exception) {
        notNullValue = "String value is null"
        println(notNullValue)
    } finally {
        println(notNullValue)
    }
}