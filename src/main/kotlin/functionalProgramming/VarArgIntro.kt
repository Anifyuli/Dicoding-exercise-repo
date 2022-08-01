package functionalProgramming

// vararg dipakai untuk menyederhanakan parameter pada sebuah fungsi yang bertipedata sama menjadi parameter tunggal
fun main() {
    val numSum = sumNum(5, 10, 15, 20)
    println(numSum)
}

fun sumNum(vararg number : Int) : Int {
    return number.sum()
}