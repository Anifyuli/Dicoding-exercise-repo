package objectOrientedProgramming

class BigAnimal(name: String, weight: Double, age: Int) {
    // Value from this variable is default constructor
    var name: String = "Yuki"
    var weight: Double = 0.9
    var age: Int = 5
    var isMammal: Boolean = true

    // init block from primary constructor
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    // form of secondary constructor
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

fun main() {
    val owl = BigAnimal("Rico", 0.4, 2, false)
    val dragonfly = BigAnimal("Ze", 23.5, 1, false)

    println("""
        Name: ${owl.name}
        Weight: ${owl.weight}
        Age: ${owl.age}
        Mammal: ${owl.isMammal}
        
        Name: ${dragonfly.name}
        Weight: ${dragonfly.weight}
        Age: ${dragonfly.age}
        Mammal: ${dragonfly.isMammal}
    """.trimIndent())
}