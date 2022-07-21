fun main() {
    message()
    printMessage("Hello from Lambda")
    // Memanggil Lambda messageLength dan ditampilkan ke konsol yang sebelumnya diberikan fungsi length() pada ekspresi Lambda
    val length = messageLength("Hello from Lambda expression in Kotlin")
    println("Message length is $length characters")

}

// Lambda ditandai dengan sepasang kurung kurawal
val message = {println("Hello Kotlin")}
// message disini sebagai parameter
val printMessage = { message: String -> println(message) }
// Tanda -> dipakai untuk memisahkan parameter dengan body dari ekspresi Lambda
val messageLength = { message: String -> message.length }