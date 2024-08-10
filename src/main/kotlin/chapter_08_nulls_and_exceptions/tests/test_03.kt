package org.example.chapter_08_nulls_and_exceptions.tests

// Обработка исключений. Блок try/catch

fun main() {
    println(myFunction2(readln()))
}


fun myFunction2(str: String): Int? {

    val result = try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }

    println("myFunction has ended")
    return result
}



