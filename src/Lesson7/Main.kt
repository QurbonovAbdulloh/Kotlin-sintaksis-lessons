fun main() {

    println("Hello world") //Bu ham funksiya hisoblanadi. Bu standart kutubxona funksiyalariga kiradi

    myFunction()

    val result = add(5, 6)
    println(result)

    brothersName("Abdulloh")
    brothersName("Saydullo")
    brothersName("Zuhriddin")

}

fun myFunction() {
    println("Mening birinchi funksiaym")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun brothersName(name: String) {
    println("$name aka")
}