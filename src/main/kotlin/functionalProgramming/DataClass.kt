package functionalProgramming

class User(val name : String, val age : Int){
    override fun toString(): String {
        return "FunctionalProgramming.User(name=$name, age=$age)"
    }
}

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)

}