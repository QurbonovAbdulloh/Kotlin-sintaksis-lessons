fun main() {

    val n = 5
    val result = factorial(5)
//    println(result)

    val a = 10
    for (i in 0 until a) {
        println(fibonacci(i))
    }
}

fun factorial(n: Int): Int {
    return if (n == 0) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun fibonacci(a: Int): Int {
    return if (a <= 1) {
        a
    } else {
        fibonacci(a - 1) + fibonacci(a - 2)
    }
}