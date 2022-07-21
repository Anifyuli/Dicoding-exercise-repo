fun main() {
    // Better than letExample1() to reduce using safe call operator
    letExample1()
    // Bad expression of let
    letExample2()
    runAsArgumentExample()
    alsoExample()
}

fun letExample1(){
    val request = "I love you, Kotlin"
    request.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
}

fun letExample2() {
    val message= "I miss you, Kotlin"
    val length = message.length
    val text = "text length $length"
    println(text)
}

fun runAsArgumentExample() {
    val message = "I need you, Kotlin"
    message.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }.run {
        val alert = "message is not null"
        println(alert)
    }
}

fun alsoExample() {
    val text = "I always loving you, Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}

