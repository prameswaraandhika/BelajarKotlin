fun main() {
    println("Please enter your birth year")
    val yourYear = readLine()?.toInt()
    val age = 2023 - yourYear!!
    println("Your age is a $age")
}