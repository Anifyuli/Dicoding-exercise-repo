fun main() {
    runExample()
    withExample1()
    withExample2()
    applyExample1()
    applyExample2()
}

fun runExample() {
    val greeting = "Good Morning"
    val value = greeting.run {
        val from = this
        val to = this.replace("Good Morning", "Hello, Lambda")
        "replace greeting $from to $to"
    }
    println("result : $value")
}

fun withExample1() {
    val message = "I like you, Kotlin"
    val output = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
}

fun withExample2() {
    val message = "Hello, Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)
}

fun applyExample1() {
    val builder = StringBuilder()
    builder.append("Miss you, ")
    builder.append(("Kotlin"))

    println(builder.toString())
}

fun applyExample2() {
    val message = StringBuilder().apply {
        append("Don't leave me, ")
        append("Kotlin!")
    }

    println(message.toString())
}