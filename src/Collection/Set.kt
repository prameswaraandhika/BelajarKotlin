package Collection
/*
    Selanjutnya kita akan membahas objek turunan yang kedua, yaitu Set.
    Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
    Ini akan berguna ketika Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection.
    Kita bisa mendeklarasikan sebuah Set dengan fungsi setOf.
 */

val uniqData = setOf(1,1,2,2,2,3)
val uniqDataA = setOf(1, 2, 2,3)
fun main() {
    println(uniqData)
    println("is uniqData same with uniqDataB, result: ${uniqData == uniqDataA})")
    print("is five already in var uniqData, result: ")
    println(5 in uniqData)
}