fun main() {
    val text = "Hello Andhika"
    val lastIndexOfText = text[text.length -1]

    println("Last character of \"$text\" is '$lastIndexOfText'  ")

    println("do Loop of character \"$text\" ")
    for (c in text) {
        print("$c ")
    }
    println()

    val baris = """
        baris 1
        baris 2
        baris 3
        baris 4
        """.trimIndent()
    println(baris)
    if (setUser(null, 22)){
        println("data ada")
    } else{
        println("data tidak ada")
    }

}

fun setUser(name: String?, age: Byte) : Boolean{
if (!name.isNullOrEmpty() && age != null){
    return true
} else {
    return false
}
}