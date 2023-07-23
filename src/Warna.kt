enum class Warna(val value: String) {
    RED("COLOR RED"){
        fun printValue(){
            println("Value of RED")
        } },
    BLUE("COLOR BLUE"){
        fun printValue(): Unit {
            println("Value of BLUE")
        } },
    GREEN("COLOR GREEN"){
        fun printValue(): Unit {
            println("Value of GREEN")
        } }
}

fun main() {
    val redColor : String = Warna.RED.value
    val blueColor = Warna.BLUE
    val greenColor = Warna.GREEN

    println(redColor)
    println(blueColor)
    println(greenColor)
}