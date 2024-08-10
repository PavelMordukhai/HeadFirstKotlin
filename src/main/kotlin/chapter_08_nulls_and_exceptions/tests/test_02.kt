package org.example.chapter_08_nulls_and_exceptions.tests

// Обработка исключений. Блок try/catch

fun main() {
    myFunction1(readln())
}


fun myFunction1(str: String) {

    try {
        val x = str.toInt()
        println(x)
    } catch (e: NumberFormatException) { // Необязательный блок, если есть finally. Может быть несколько
        println("Bummer")
    } finally { // необязательный блок, если есть catch
        println("""
            
            Если в блоке try происходит исключение:
            - Управление немедленно передается в блок catch. 
            Когда блок catch завершается, выполняется блок finally. 
            Когда завершится блок finally, продолжается выполнение кода.
            
            Если блок try завершится успешно (без исключения):
            - Блок catch пропускается, и управление передается блоку finally. 
            Когда завершится блок finally, продолжается выполнение кода.
            
            Если блок try или catch содержит команду return, 
            блок finally все равно выполняется:
            - Управление передается в блок finally, 
            а затем возвращается к команде return.
            
        """.trimIndent())
    }

    println("myFunction has ended")
}


/*
Намеренная выдача исключений. throw

fun setWorkRatePercentage(x: Int) {
    if (x !in 0..100) {
        throw IllegalArgumentException("Percentage not in range 0..100: $x")
    }
    //Код, выполняемый для допустимого аргумента
}

После этого исключение перехватывается следующим кодом:

try {
    setWorkRatePercentage(110)
} catch(e: IllegalArgumentException) {
    //Код обработки исключения
}
 */
