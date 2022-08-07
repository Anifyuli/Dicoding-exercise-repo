package objectOrientedProgramming.importAndPackagesIntro
// Import way
import objectOrientedProgramming.Bird

class Macaw : Bird(){
    override fun fly() {
        super.fly()
    }

    fun fly(height: Double, distance: Int) {
        println("Macaw can fly up to $distance and height $height m")
    }

    override fun takeOff() {
        super.takeOff()
    }
}

fun main() {
    val macaw = Macaw()

    macaw.fly()
    macaw.fly(3.5, 30)
    macaw.takeOff()

    println()

}
