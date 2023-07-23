fun main() {
    val nullLabelStr : String? = "12345"
    val lengthOfVar = nullLabelStr?.length



    println(lengthOfVar)
    funLength(nullLabelStr)

    val name : String? = null;
    println(name?.length ?: "data null")

    val res: String? = null
    val resultOfRes = res?:"tidak ada datanya";
    println(resultOfRes)
}

fun funLength(nullLabelStr: String?) {
    println(nullLabelStr?.length)
}

