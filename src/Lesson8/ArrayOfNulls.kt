package Lesson

fun main() {

    val toplam = arrayOfNulls<String>(3)
    toplam[0] = "Abdulloh"
    toplam[1] = "Saydullo"
    toplam[2] = "Hoshim"

    val a = arrayOf(1, 2, 3, 4)
    for (i in a) {
        println(i)
    }

    val b = arrayOf(1, 2, 3, 4, 5, 6)
    b.forEach { i ->
        println(i)
    }

}