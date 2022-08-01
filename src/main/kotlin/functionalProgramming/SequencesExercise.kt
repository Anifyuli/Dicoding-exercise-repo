package functionalProgramming

// Sequences adalah jenis Collection lazy evaluation yang hanya akan mengevaluasi  item jika benar-benar diperlukan
// Cara menggunakannya cukup dengan panggil fungsi asSequence pada Collection yang dipakai
fun main() {
    val list = (1..1000000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

// Pada kode dibawah ini, Sequence dapat dibuat dengan menggunakan fungsi generateSequence().
// Tambahkan fungsi take(batas_sequence) untuk mencegah infinite looping
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}