package org.example.chapter_11_lambda.lambdas


typealias DoubleConversion = (Double) -> Double


fun convert3(
    x: Double,
    converter: DoubleConversion
): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}


fun getConversionLambda3(str: String): DoubleConversion {
    when (str) {
        "CentigradeToFahrenheit" -> return { it * 1.8 + 32 }
        "KgsToPounds" -> return { it * 2.204623 }
        "PoundsToUSTons" -> return { it / 2000.0 }
        else -> return { it }
    }
}


fun combine3(
    lambda1: DoubleConversion,
    lambda2: DoubleConversion
): DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}


fun main(args: Array<String>) {

    //Преобразовать 2.5 кг в фунты
    println("Convert 2.5kg to Pounds: ${getConversionLambda3("KgsToPounds")(2.5)}")

    //Определить два лямбда-выражения для преобразований
    val kgsToPoundsLambda = getConversionLambda3("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda3("PoundsToUSTons")

    //Два лямбда-выражения преобразуются в одно новое
    val kgsToUSTonsLambda = combine3(kgsToPoundsLambda, poundsToUSTonsLambda)

    // Использовать новое лямбда-выражение для преобразования 17,4 кг в американские тонны
    val value = 17.4
    println("$value kgs is ${convert3(value, kgsToUSTonsLambda)} US tons")
}

