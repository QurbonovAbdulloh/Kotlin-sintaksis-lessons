package Lesson

import java.sql.DriverManager.println

fun main() {

    //Operatorlar -> Arifmetik operatorlar, Belgilash operatorlari, Taqqoslash operatorlari, Manitqiy operatorlar


    //Arifmetik operatorlar -> "+", "-", "*", "/", "%"
    //Arifmetik operatorlar arifmetik amallarni bajarish uchun ishlatiladi

    val number1 = 8
    val number2 = 4
    val result1 = number1 + number2
    val result2 = number1 - number2
    val result3 = number1 * number2
    val result4 = number1 / number2
    val result5 = number1 % number2

    println("Result1 = $result1, result2 = $result2, result3 = $result3, result4 = $result4, result5 = $result5")

    //Belgilash operatorlari -> "=", "+=", "-=", "*=", "/="

    //Belgilash operatorlari o'zgaruvchilarga qiymat berish uchun qo'llaniladi

    // "=" --> Example ->  x=5 ; Result -> x=5
    // "+=" --> Example ->  x+=3 ; Result -> x=x+3
    // "-=" --> Example ->  x-=3 ; Result -> x=x-3
    // "*=" --> Example ->  x*=3 ; Result -> x=x*3
    // "/=" --> Example ->  x*=3 ; Result -> x=x/3

    //Taqqoslash operotorlari -> "==", "!=", ">", "<", ">=", "<="
    //Taqqoslash operatorlari 2ta qiymatni taqqoslash uchun qo'llaniladi

    val x = 5
    val y = 3
    println((x > y).toString())

    //Mantiqiy opertorlar -> "&&", "||", "!"

    val a = true
    val b = false
    println("""${a&&b}
        |${a||b}
        |a = ${!a}, b = ${!b}
    """)
}