package org.example.chapter_03

fun main() {
    val options = arrayOf("rock", "paper", "scissors")

    // случайный выбор компьютером
    val gameChoice = getGameChoice(options)

    // выбор игроком
    val userChoice = getUserChoice(options)

    printResult(userChoice, gameChoice)
}


// случайный выбор компьютером
fun getGameChoice(optionalParam: Array<String>): String =
    optionalParam[(Math.random() * optionalParam.size).toInt()]


// выбор игроком
fun getUserChoice(optionalParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        print("Please enter one of the following:")
        for (item in optionalParam) print(" $item")
        println(".")

        val userInput = readln().lowercase()

        if (userInput in optionalParam) {
            isValidChoice = true
            userChoice = userInput
        }

        if (!isValidChoice) println("You must enter a valid choice.")
    }

    return userChoice
}


// вывод результата
fun printResult(userChoice: String, gameChoice: String) {
    var result = ""

    // определение результата
    result = if (userChoice == gameChoice) "Tie!"
    else if ((userChoice == "rock") && (gameChoice == "scissors") ||
        (userChoice == "paper") && (gameChoice == "rock") ||
        (userChoice == "scissors") && (gameChoice == "paper")) "You win!"
    else "You lose!"

    // вывести результаты
    println("You chose $userChoice. I chose $gameChoice. $result")
}











