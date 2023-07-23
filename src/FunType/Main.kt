package FunType


//Lamba using parameter and returning void
val msg = { text:String -> println("Hello from Lambda with $text")}

//Lambda using parameter and returning values
val lamRetu = {params1: String ->
    println("Lambda \" $params1 \"return is work!")
    params1.length}
fun main() {
    msg("Kotlin");
    msg("Java");
    val res  = lamRetu("Kotlin Awesome")
    println(res.javaClass.simpleName)
    println(res)
}
