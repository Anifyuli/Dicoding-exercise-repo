package objectOrientedProgramming

class Animal(var animalName: String,
             var weight: Double,
             var age: Int,
             var isMammal: Boolean
){
    fun eat(){
        println("$animalName eat something")
    }
    fun sleep(){
        println("$animalName feel asleep")
    }
}

fun main(){
    val myHamster = Animal("Eleanore", 0.8, 1, true)
    val myCat = Animal("Rocky", 1.2, 2, true)
    println("Name: ${myHamster.animalName}, Weight: ${myHamster.weight}, Age: ${myHamster.age}, Mammal: ${myHamster.isMammal}")
    println("Name: ${myCat.animalName}, Weight: ${myCat.weight}, Age: ${myCat.age}, Mammal: ${myCat.isMammal}")
    myHamster.eat()
    myHamster.sleep()
    myCat.eat()
    myCat.sleep()
}