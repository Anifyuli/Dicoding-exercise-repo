package objectOrientedProgramming

class CuteAnimal(pName: String, pWeight: Double,pAge: Int = 3, pIsMammal: Boolean = false) {
    // Primary Constructor with init block
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    // init block
    init {
        this.name = pName
        this.weight = if (pWeight <= 0){
            0.1
        } else {
            pWeight
        }
        this.age = if(pAge < 0) 0 else pAge
        this.isMammal = pIsMammal
    }
}


fun main() {
    val flappyBird = CuteAnimal("Reo", 0.45, 1, false)
    val dragon = CuteAnimal("Lee", 23.5)

    println("""
        Name: ${flappyBird.name}
        Weight: ${flappyBird.weight}
        Age: ${flappyBird.age}
        Mammal: ${flappyBird.isMammal}
        
        Name: ${dragon.name}
        Weight: ${dragon.weight}
        Age: ${dragon.age}
        Mammal: ${dragon.isMammal}
    """.trimIndent())
}