package Lesson

fun main() {

    /*val word: String? = "Assalomu alaykum"

    println(word)*/

    /*var word: String = "Word"
    word = null  //compile error*/

    /*var str: String? = null
    var str2: String? = "null emas"
    println(str2)*/

    val b = null as Int? ?: 5
    println(b)
}