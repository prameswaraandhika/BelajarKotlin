package OOP.encaps


class Foodies {
    var nama: String = ""
        get() =  field.toUpperCase()
        set(value) {
            println("Fungsi set terpanggil")
            field = value
        }

    var price: Int = 0
        get() = field
        set(value) {
            println("Fungsi set terpanggil")
            field = value
        }
}

fun main() {
    val f = Foodies()
    f.nama = "Ketoprak"
    f.price = 12000
    println("Makanan: ${f.nama}")
    println("Harga: ${f.price}")


}