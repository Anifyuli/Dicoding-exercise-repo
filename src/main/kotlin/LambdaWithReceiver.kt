fun main() {
    val greet = buildString {
        append("Good Morning ")
        append("from ")
        append("lambda ")
    }

    println(greet)
}

fun greeting(action: StringBuilder.() -> Unit): String {
    val greeting = StringBuilder()
    greeting.action()
    return greeting.toString()
}