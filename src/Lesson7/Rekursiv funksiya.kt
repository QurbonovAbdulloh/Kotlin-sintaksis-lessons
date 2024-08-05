import java.util.Random

fun main() {

    getRandomNumbers()

}

var a = 0
var b = 0
var c = 0

fun getRandomNumbers() {
    a = Random().nextInt()
    b = Random().nextInt()
    c = Random().nextInt()

    if (a == b || b == c || a == c) {
        getRandomNumbers()
        return
    }

    println(a)
    println(b)
    println(c)
}