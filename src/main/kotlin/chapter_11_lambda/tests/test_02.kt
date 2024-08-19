package org.example.chapter_11_lambda.tests

// Типы лямбда-выражений (функциональный тип)
// (parameters) -> return_type

fun main() {

    // (Int) -> String
    val msg: (Int) -> String = { x: Int -> "The value is $x" }

    val add: (Int, Int) -> Int
    add = { x: Int, y: Int -> x + y }

    val greeting: () -> String = { "Hello!" }

    // (Int) -> Int
    val addFive1: (Int) -> Int = { x: Int -> x + 5 }
    val addFive2: (Int) -> Int = { x -> x + 5 }
    val addFive3 = { x: Int -> x + 5 }
    // Единственный параметр может заменяться на it
    val addFive4: (Int) -> Int = { it + 5 }
    val addFive5 = { it: Int -> it + 5 }

    // Unit и лямбда-выражения без возвращаемого значения.
    // Лямбда-выражение не имеет возвращаемого значения
    val myLambda: () -> Unit = { println("Hi!") }

    // Код компилируется, но невозможно получить доступ к результату x + y
    val calculation: (Int, Int) -> Unit = { x, y -> x + y }
}




