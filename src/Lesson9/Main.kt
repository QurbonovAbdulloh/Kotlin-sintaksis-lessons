package Lesson

import java.util.Scanner

fun main() {

    //Biror Exception ni ushlah uchun try - catch dan foydalaniladi

    /*try {
        val result = 10 / 0 //Bu qatorda xato yuzaga kelsa
        println(result)
    } catch (e: ArithmeticException) {
        println("ArithmeticException yuzaga keldi: ${e.message  }")
    }*/

//    throw Exception("Hi there!")    //Throw bilan xatolik yuzaga keltiriladi

    /*try {
        val result = 10 / 0// some code
        println(result)
    } catch (e: ArithmeticException) {
        // handler
    } finally {
        println("Sonni 0ga bo'lib bo'lmaydi!")       // optional finally block
    }*/

    /*val input = Scanner(System.`in`)


    val a: Int? = try { input.nextInt() } catch (e: NumberFormatException) { null }*/

    fun divide(a: Int, b: Int): Int {
        if (b == 0) {
            throw java.lang.IllegalArgumentException("Nolga bo'lish mumkin emas!")
        }
        return a / b
    }

    try {
        val result = divide(10, 0)
        println("Natija: $result")
    } catch (e: java.lang.IllegalArgumentException) {
        println("Xatolik yuzaga keldi: ${e.message}")
    }
}