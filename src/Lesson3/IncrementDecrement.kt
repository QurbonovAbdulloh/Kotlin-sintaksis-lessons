package Lesson

fun main() {

    //Increment operatori -> "++", ushbu amal bajarilganda o'zgaruvchining qiymati birdaniga bittaga oshadi

    var x = 5
    ++x
    println(x)

    //Decrement operatori -> "--", ushbu amal bajarilganda o'zgaruvchining qiymati birdaniga bittaga kamayadi

    var y = 7
    --y
    println(y)

    //Bu ikki amal post va pre ga bo’linadi. Avval va keyin berilgan increment yoki decrement.

    //Avval berilgani ++a shu joyni o’zida a ga 1 ni qo’shib beradi
    var a = 5
    val b = ++a
    println("a = $a, b = $b")

    //Keyin berilgani a++ shu joydan keyin a ga 1 ni qo’shib beradi
    var g = 5
    val h = g++
    println("g = $g, h = $h")

}