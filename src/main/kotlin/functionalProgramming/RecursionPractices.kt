package functionalProgramming

fun main(){
    factorialWithFraming(9)
    factorialWithRecursiveMechanism(9)
    tailCallWithFraming(9)
    tailCallFactorial(9)
}

fun factorialWithFraming(n : Int): Int {
    val output = if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
    return output
}

fun factorialWithRecursiveMechanism(n : Int) : Int {
    return if (n == 1) {
        n
    } else {
        n * factorialWithRecursiveMechanism(n -1)
    }
}

fun tailCallWithFraming(n : Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        tailCallWithFraming(n - 1, newResult)
    }
}

tailrec fun tailCallFactorial(n : Int, result: Int = 1) : Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        tailCallFactorial(n - 1, newResult)
    }
}