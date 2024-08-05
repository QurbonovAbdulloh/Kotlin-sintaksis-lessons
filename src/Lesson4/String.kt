package Lesson

fun main() {

    val letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println(letters.length)    // string.length -> satrdagi belgilar sonini qaytaradi

    val text2 = "Hello World"

    println(text2.toUpperCase())    //Satrdagi hamma harflarni katta harf qilib chiqaradi
    println(text2.toLowerCase())    //Satrdagi hamma harflarni kichik harf qilib chiqaradi

    val text1 = "Hello World"

    println(text2.compareTo(text1))  //Ikkita satrning uzunligi taqqoslayd. Teng bo'lsa -> 1, teng bo'lmasa -> -1

    println(text2[0])
    println(text2[2])
    println(text2.get(0))
    println(text2.get(2))

    val name = "Jim"
    val surname = "Carry"

    println(name + " " + surname)

    println(name+surname)

    println("$name $surname")  //optimal variant

    println("""Assalomu alaykum
        |Hello
    """.trimMargin())

    println("Assalomu alaykum" +
            "Hello")

    println("Android".length + 3)

    val text3 = "Equal"
    val text4 = "EQUAL"

    println(text3.equals(text4))
    println(text3 == text4)

    val text5 = "Word"
    println(text5.subSequence(1, 3))
    println(text5.substring(1,3))

    println(text5.contains("or"))

    val lastname = "qurbonov"

    println(lastname.capitalize())

    val txt1 = ""
    val txt2 = " "

    println(txt1.isEmpty())
    println(txt2.isEmpty())
    println(txt1.isBlank())
    println(txt2.isBlank())

    val txt3 = "            -"
    println(txt3)

    val txt4 = "            -           "
    println(txt4)

    println(txt4.trimStart())
    println(txt4.trimEnd())
    println(txt4.trim())

    val hello = "Salom, qalaysan?"

    println(hello)
    println(hello.replace("qalaysan", "yaxshimisan"))

}