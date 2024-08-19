package org.example.chapter_11_lambda.tests

// Функции высшего порядка
// используют лямбда-выражение для параметра или возвращаемого значения

fun main() {

//    convert(20.0, { c: Double -> c * 1.8 + 32 })
    convert(20.0) { c: Double -> c * 1.8 + 32 }
    println()

    convertFive { it * 1.8 + 32 }
}

// Добавление лямбда-параметра к функции
fun convert(
    x: Double,
    converter: (Double) -> Double
): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}


fun convertFive(converter: (Int) -> Double) : Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}



