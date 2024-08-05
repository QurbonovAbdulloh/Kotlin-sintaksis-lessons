package Lesson

fun main() {

    /*Agar siz yozayotgan kodlarda shartlar ko'p bo'lsa, siz if...else
      operatoridan ko'ra when operatoridan foydalanganingiz yaxshiroq*/

    val day = 5

    val result = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "This day doesn't exist"
    }

    println(result)
}