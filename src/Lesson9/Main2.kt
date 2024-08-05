package Lesson

fun main() {
    val result = divide(10, 0)
    println("Natija: $result")
}

fun divide(a: Int, b: Int): Int {
    try {
        if (b == 0) {
            throw IllegalArgumentException("Nolga bo'lish mumkin emas")
        }
        return a / b
    } catch (e: IllegalArgumentException) {
        println("Xato yuzaga keldi: ${e.message}")
        return -1
    } finally {
        println("finally bloki ishga tushdi")
    }
}