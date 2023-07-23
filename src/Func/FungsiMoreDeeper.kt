package Func

val Int.property: Int get() = 100

fun main() {
    println(defaultFunArgs("Default args not be executed"))
    println(namedFun(umur = 23, nama = "Andhika"))
    println(varargsFun(1,4,5,))
//    calling extension function
    val res = 1.printInteger()
    println(res)
//    calling extension property
    println(res.property)

    testTodo()
}

fun testTodo(){
    TODO("NOT YET IMPLEMENTED")
}

fun namedFun(nama: String, umur: Int) : String{
    return "$nama, umur $umur"
}

fun defaultFunArgs(text: String = "Default Arg in Kotlin the best") :String{
    return text
}

fun varargsFun(vararg number: Int): Int {
    println(number.size)
    return number.sum()
}

fun Int.printInteger(): Int {
    println("value $this")
    return this
}