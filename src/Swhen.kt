fun main() {
    val num: Any= 7;

    val result = when(num){
        1-> {
            "Nilai kamu 1"
        }
        2-> {
            "Nilai kamu 2"
        }
        3-> {
            "Nilai kamu 3"
        }
        4-> {
            "Nilai kamu 4"
        }
        5-> {
            "Nilai kamu 5"
        }
        else -> {
            "Nilai kamu tidak diketahui"
        }
    }

    when(num){
        is String -> println("the value has a String type")
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        else -> println("the value has a undefined type")

    }
    println(result)

    val ranges = 1..20 step 2
//    for (c in ranges) {
//        print("$c, ")
//    }
    ranges.forEach {
        print("$it, ")
    }


    println()
    when(num){
        in ranges -> println("value $num in the range")
        !in ranges -> println("cant find value $num in the range")
        else -> println("undefined value")
    }


}