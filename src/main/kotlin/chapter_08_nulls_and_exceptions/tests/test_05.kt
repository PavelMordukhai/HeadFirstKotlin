package org.example.chapter_08_nulls_and_exceptions.tests

// Обработка исключений. Блок try/catch

class BadException : Exception()

fun myFunction(test: String) {

    try {
        print("t")
        riskyCode(test)
        print("o")
    } catch (e: BadException) {
        print("a")
    } finally {
        print("w")
    }
    print("s")
}

fun riskyCode(test:String) {

    print("h")
    if (test == "Yes") {
        throw BadException()
    }
    print("r")
}
