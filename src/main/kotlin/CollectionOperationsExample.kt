fun main() {
    // Dalam contoh ini, List digunakan sebagai contoh Collection yang dipakai sebagai objek dari Collection Operations
    val numberList = listOf(1, 2, 5, 4, 3, 6, 7)
    // Contoh collection berupa list lainnya yang berisi char
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')

    // Fungsi filter untuk memilah data dalam Collection
    val evenList = numberList.filter { it % 2 == 0 }
    // Fungsi filterNot berlaku kebalikan dari filter
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    println(numberList)
    println(evenList)
    println(notEvenList)

    // Fungsi map() dipakai untuk membuat collection baru dari collection sebelumnya
    val multipleBy5 = numberList.map { it * 5 }
    println(multipleBy5)

    // Fungsi count() untuk menghitung jumlah item dalam collection
    println(numberList.count())
    // count() juga dapat dimasuki lambda seperti berikut
    println(numberList.count{ it % 2 == 0 })

    /* Fungsi find() dipakai untuk mencari item dalam collection sesuai dengan kondisi yang sudah ditentukan
    Fungsi firstOrNull dipakai untuk mencari item pertama di collection dan cara kerja mirip dengan find()
    Untuk mencari item terakhir, bisa memakai lastOrNull */
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    println(firstOddNumber)
    println(firstOrNullNumber)

    // Fungsi first() dan last() memiliki kegunaan yang sama dengan firstOrNull() atau lastOrNull() akan tetapi mumunculkan exception jika tidak terpenuhi kondisi yang disyaratkan
    /* val moreThan10 = numberList.first { it > 10 }
    println(moreThan10)
    Muncul exception setelah dijalankan
    */

    // Fungsi sum() dipakai untuk menjumlahkan nilai yang terdapat dalam collection
    val total = numberList.sum()
    println(total)

    // Fungsi sorted() digunakan untuk mengurutkan secara ascending, untuk mengurutkan secara descending gunakan fungsi sortedDescending()
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}