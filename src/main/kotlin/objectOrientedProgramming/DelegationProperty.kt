package objectOrientedProgramming

import kotlin.reflect.KProperty

class DelegationPropertyExample {
    private var value: String = "Default"

    operator fun getValue(classRef:Any?, property: KProperty<*>): String {
        println("This function same as getter for property name ${property.name} on $classRef class")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("This function same as setter for property name ${property.name} from $classRef class")
        println("${property.name} value from: $value change to $newValue")
        value = newValue
    }

    class Animal {
        var name: String by DelegationPropertyExample()
        var nameAnimal: Any by DelegatingGenericClass()
        var weight: Any by DelegatingGenericClass()
        var age: Any by DelegatingGenericClass()
    }

    class Person {
        var name: String by DelegationPropertyExample()
    }

    class Hero {
        var name: String by DelegationPropertyExample()
    }
}

class DelegatingGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("This function same as getter for property name ${property.name} on $classRef class")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
        println("${property.name} value from: $value change to $newValue")
        value = newValue
    }
}

fun main(){
    val animal = DelegationPropertyExample.Animal()
    animal.name = "Max"
    println("Animal name: ${animal.name}")

    val person = DelegationPropertyExample.Person()
    person.name = "Jack Anderson"
    println("Person Name: ${person.name}")

    val hero = DelegationPropertyExample.Hero()
    hero.name = "Hulk"
    println("Hero name: ${hero.name}")

    val wildAnimal = DelegationPropertyExample.Animal()
    wildAnimal.name = "Leo"
    wildAnimal.age = 2
    wildAnimal.weight = 2.2

    val lion = """
        Name: ${wildAnimal.name}
        Weight: ${wildAnimal.weight}
        Age: ${wildAnimal.age}
    """.trimIndent()

    println(lion)

}