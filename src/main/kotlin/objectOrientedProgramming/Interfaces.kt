package objectOrientedProgramming

interface FlyingCreatures {
    fun fly()
    fun takeOff()
}

open class Bird : FlyingCreatures {
    override fun fly() {
        println("This creature have potential to fly")
    }

    fun fly(wings: Boolean) {
        if (wings) {
            println("Flying with pair of wings")
        } else {
            println("Can't fly")
        }
    }

    override fun takeOff() {
        println("Take off with feet")
    }
}

open class Meteor : Bird() {
    override fun fly() {
        super.fly()
    }

    override fun takeOff() {
        super.takeOff()
    }
}

fun main() {
    val bird = Bird()

    bird.fly()
    bird.fly(true)
    bird.takeOff()

    val meteor = Meteor()
    meteor.fly()
    meteor.takeOff()
}


