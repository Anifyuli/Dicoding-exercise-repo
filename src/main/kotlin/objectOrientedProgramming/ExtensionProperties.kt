package objectOrientedProgramming

val Animal.getAnimalInfo : String
    get() = """
        Name: ${this.animalName}
        Age: ${this.age}
        Weight: ${this.weight}
        Mammal: ${this.isMammal}
    """.trimIndent()

fun main() {
    val cat = Animal("Banu", 1.1, 2, true)
    println(cat.getAnimalInfo)
}