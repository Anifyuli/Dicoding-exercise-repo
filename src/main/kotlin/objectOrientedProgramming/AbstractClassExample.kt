package objectOrientedProgramming

abstract class AnimalOnZoo(private var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name eating stuff")
    }

    fun sleep(){
        println("$name sleep")
    }
}

fun main() {
    // val animalOnZoo = AnimalOnZoo("Cheetah", 2.6, 1, true)

    // animalOnZoo.eat()
    // animalOnZoo.sleep()
}

// Output : Cannot create an instance of an abstract class