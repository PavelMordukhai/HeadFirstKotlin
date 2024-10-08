package org.example.chapter_11_lambda.tests

// Лямбда-выражение, или лямбда, представляет собой тип объекта, который содержит блок кода.
// Лямбда-выражение можно присвоить переменной точно так же, как любой другой объект,
// или передать его функции, которая затем выполнит содержащийся в нем код.
// А это означает, что лямбды могут использоваться для передачи
// специализированного поведения более общей функции.

// { x: Int, y: Int -> x + y }
// { x: Int -> x + 5 }
//___1_______2___3

// 1. Параметры лямбда-выражения. В данном случае лямбда-выражение должно получать значение Int с именем x.
// 2. Отделяет параметры от тела.
// 3. Тело лямбда-выражения. Здесь тело получает x, увеличивает его на 5 и возвращает результат.

// { "Pow!" }
// Эта лямбда не имеет параметров, поэтому -> можно опустить. Возвращает строку "Pow!"

fun main() {

    // Присваивание лямбд переменной

    val addFive1: (Int) -> Int = { x: Int -> x + 5 }

    var addFive2: (Int) -> Int = { x: Int -> x + 5 }
    addFive2 = { y: Int -> 5 + y }

    // Выполнение кода лямбда-выражения

    val addInts = { x: Int, y: Int -> x + y }
//    val result = addInts.invoke(6, 7)
    val result = addInts(6, 7)
    println(result) // 13
}


