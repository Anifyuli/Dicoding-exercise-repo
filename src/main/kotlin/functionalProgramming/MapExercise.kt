package functionalProgramming

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India",
        "Ankara" to "Turkey"
    )

    // Ambil nilai Turkey dari kata kunci Ankara
    println(capital["Ankara"])
    // Nilai dari suatu Map dapat menggunakan fungsi getValue()
    println(capital.getValue("London"))

    // Jika menggunakan indexing maka akan memuculkan null apabila nilai tidak terdia dalam Map
    // println(capital["Amsterdam"])
    // Output: null

    // Fungsi getValue() memunculkan exception jika mengambil suatu nilai yang tidak tersedia dalam Map
    // println(capital.getValue("Amsterdam"))
    // Output: Exception in thread "main" java.util.NoSuchElementException: Key Amsterdam is missing in the map.

    // Fungsi keys() dipakai untuk menampilkan kata kunci yang tersedia dari Map
    val mapKeys = capital.keys
    println(mapKeys)

    // Fungsi values() dipakai untuk menampilkan nilai yang tersedia dalam Map
    val mapValues = capital.values
    println(mapValues)

    // Untuk menambahkan kata kunci - nilai (key-value), tambahkan fungsi toMutableMap() pada nilai dari variabel yang memuat Map
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam","Netherlands")
    mutableCapital.put("Moscow","Russia")

    println(mutableCapital)
    
}