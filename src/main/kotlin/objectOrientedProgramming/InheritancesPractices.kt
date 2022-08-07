package objectOrientedProgramming

open class Pets(val name: String, var weight: Double, var age: Int, var type: String, isMammal: Boolean) {
    open fun eat(food: String) {
        println("$name eat $food")
    }

    // Overloading function example
    open fun eat(food: String, quality: Double) {
        println("$name eat $food with quality $quality %")
    }

    open fun sleep(place: String) {
        println("$name sleep in $place")
    }
}

class Cat(name: String, weight: Double, age: Int, type: String, isMammal: Boolean, color: String) :
    Pets(name, weight, age, type, isMammal) {
        fun play() {
            println("$name play with master")
        }

        override fun eat(food: String) {
            println("$name eat $food")
        }

        override fun sleep(place: String) {
            sleep(place)
        }
}

fun main() {
    val myCat = Cat("Banu", 0.8, 2, "Cat", true, "Monochrome")

    myCat.eat("Fish")
    myCat.sleep("pillow")
    myCat.play()
}