package Lesson

fun main() {

    for (i in 1..4) {
        println(i)
    }

    for (a in 4 downTo 1) {
        println(a)
    }

    val number = 10
    for (b in 0..number step 2) {   //range step
        println(b)
    }
}