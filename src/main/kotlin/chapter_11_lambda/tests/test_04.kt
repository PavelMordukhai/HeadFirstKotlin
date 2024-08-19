package org.example.chapter_11_lambda.tests

// Функция может возвращать лямбда-выражение

fun getConversionLambda(str: String): (Double) -> Double {

    when (str) {
        "CentigradeToFahrenheit" -> return { it * 1.8 + 32 }
        "KgsToPounds" -> return { it * 2.204623 }
        "PoundsToUSTons" -> return { it / 2000.0 }
        else -> return { it }
    }
}


fun convert1(
    x: Double,
    converter: (Double) -> Double
): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}


fun main() {

    val pounds = getConversionLambda("KgsToPounds")(2.5)
    println(pounds)

    convert1(20.0, getConversionLambda("CentigradeToFahrenheit"))
}



