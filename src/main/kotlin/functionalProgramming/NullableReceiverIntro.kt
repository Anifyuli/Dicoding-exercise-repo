package functionalProgramming

fun main() {
    val result : Int? = null
    val result1 : Int? = null
    val result2 : Int? = null

    println(result.multi)
    // Gunakan elvis operator
    println(result1?.multi)
    println(result2?.multi)
}

val Int?.multi : Int
    get() = this?.div(2) ?: 4