fun main() {
    sliceExample1()
    sliceExample2()
    sliceExample3()
}

fun sliceExample1() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = list.slice(2..8)

    println(slice)
}

fun sliceExample2() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sliceWithStep = list.slice(2..8 step 2)

    println(sliceWithStep)
}

fun sliceExample3() {
    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sliceWithArgument = total.slice(index)

    println(sliceWithArgument)
}