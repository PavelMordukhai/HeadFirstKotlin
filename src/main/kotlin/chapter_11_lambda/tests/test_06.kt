package org.example.chapter_11_lambda.tests

// Написание функции, которая получает и возвращает лямбда-выражения

// Кг в фунты
// Фунты в американские тонны
// combine()
// Кг в американские тонны


// Псевдоним типа typealias

typealias DoubleConversion = (Double) -> Double

fun combine1(
    lambda1: DoubleConversion,
    lambda2: DoubleConversion
): DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main() {

    //Определить два лямбда-выражения для преобразований
    val kgsToPounds = { x: Double -> x * 2.204623 }
    val poundsToUSTons = { x: Double -> x / 2000.0 }

    //Объединить два выражения
    val kgsToUSTons = combine1(kgsToPounds, poundsToUSTons)

    //Выполнить лямбда-выражение kgsToUSTons
    val usTons = kgsToUSTons(1000.0)
    println(usTons)
}






