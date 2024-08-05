package Lesson

var name: String? = null

fun main() {

    val a = 9
    val b = if (a > 4) a else 10
    println(b)

    if (name == null) {
        println("Name is null!")
    } else {
        println("Name: $name")
    }
}