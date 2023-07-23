package POJO
data class Person(val name: String, val age: Int)

val person = Person("John", 25)

fun throwPerson(): Person{
    return person
}

fun main() {
    val a = throwPerson()
    println("Name: ${a.name}")
    println("Age: ${a.age}")
    val (name, age)= throwPerson()
    println("Name: ${name}")
    println("Age: ${age}")
}