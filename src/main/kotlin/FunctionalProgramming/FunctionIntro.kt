package FunctionalProgramming

fun main() {
    val actName = myName(first = "Budi", last = "Sasongko", mid = "Putra")
    val beloved = myFriend()
    println(actName)
    println(beloved)
}

// Contoh named argument
fun myName(
    first : String,
    mid : String,
    last : String): String {
    return "$first $mid $last"
}

// Contoh default argument
fun myFriend(
    first : String = "Rio",
    mid : String = "Abdi",
    last : String = "Dewata") : String {
    return "$first $mid $last"
}