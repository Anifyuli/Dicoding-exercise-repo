fun main() {
    // Bentuk objek Set
    val integerSet = setOf(1, 2, 3, 4)
    println(integerSet)

    // Set tidak memandang duplikasi dan perbedaan urutan dikarenakan pengulangan anggota objek
    val setA = setOf(1, 2, 2, 4, 4, 3, 1, 5)
    val setB = setOf(1, 2, 3, 4, 5)

    // Hasilnya true
    println(setA == setB)

    // Cara melakukan pengecekan keberadaan suatu data dalam Set dengan kata kunci in
    println(3 in setA)
    // Nilainya true

    // Fungsi union(gabungan) dan intersect(irisan) dapat digunakan untuk mencari anggota objek yang termasuk irisan atau gabungan dari fungsi lainnya
    val setC = setOf(1, 5, 6, 7,)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    // Set sebenarnya tidak dapat dirubah nilainya, namun bisa ditambah maupun dikurangi anggotanya dengan mengganti setOf() dengan mutableSetOf()
    val mutableSet = mutableSetOf(1, 2, 4, 3, 5, 3)
    // mutableSet[2] = 6 // Tidak dapat mengubah set immutable
    mutableSet.add(6) // Menambah item di akhir Set
    mutableSet.remove(1) // Menghapus item yang memiliki nilai 1

    println(mutableSet)

}