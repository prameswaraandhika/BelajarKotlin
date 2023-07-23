package Data
// if we represent an class as a data class by default the class have a equals(), toString(), hashCode(), copu()
data class User(val name: String, val age: Int){
    fun testUser(){
        println("user test method")
    }
}


fun main() {
//    Objek is independent
//    Reasigning value with an Object user
    var user = User("Andhika", 23)
    println("im an User $user")
//    Reasigning value with an Object user again. its not modify the property
//    It just like we initialized user with the Object user with the diferent value its means "Prameswara" and 23
//    Its not modify the propery. its reasigning with a new object
//    We can modify the propery because the field is final 'val'
    var admin = User("Prameswara", 23)
    println("im an admin $admin")

    var userClone = user.copy()
    println("im an userClone $userClone")
    if (user.equals(admin)){
        println("$user is equals with $admin")
    } else {
        println("$user is not equals with $admin")
    }

    val nama = user.component1()
    val umur = user.component2()
    println("Component 1: nama: $nama")
    println("Component 2: umur: $umur tahun")
    user.testUser()

}