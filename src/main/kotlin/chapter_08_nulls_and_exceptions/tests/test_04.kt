package org.example.chapter_08_nulls_and_exceptions.tests

// Обработка исключений. Блок try/catch

fun main(args: Array<String>) {

    val test: String = "Yes"

    try {
        println("Start try")
        riskyCode1(test)
        println("End try")
    } catch (e: BadException1) {
        println("Bad Exception")
    } finally {
        println("Finally")
    }

    println("End of main")
}


class BadException1 : Exception()


fun riskyCode1(test: String) {

    println("Start risky code")

    if (test == "Yes") {
        throw BadException1()
    }

    println("End risky code")
}


/*
val test: String = "No"

Start try
Start risky code
End risky code
End try
Finally
End of main

val test: String = "Yes"

Start try
Start risky code
Bad Exception
Finally
End of main
 */
