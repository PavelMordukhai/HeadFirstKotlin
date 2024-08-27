package org.example.chapter_12_built_in_higher_order_functions.tests

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

// map
// Берет элементы коллекции и преобразует каждый из них по заданной вами формуле.
// Результат преобразования возвращается в виде нового списка List

// mapTo - присоединяет результаты преобразования к существующей коллекции.
// mapNotNull - убирает все значения mapNotNull.
// mapValues - работает с Map и возвращает Map

data class Grocery3(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {

    val ints = listOf(1, 2, 3, 4)
    val doubleInts = ints.map { it * 2 }
    println(doubleInts) // [2, 4, 6, 8]
    println()

    val groceries = listOf(
        Grocery3("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery3("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery3("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery3("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery3("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val groceryNames = groceries.map { it.name }
    println(groceryNames.joinToString()) // Tomatoes, Mushrooms, Bagels, Olive oil, Ice cream

    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println(halfUnitPrice.joinToString()) // 1.5, 2.0, 0.75, 3.0, 1.5

    // filter + map
    val newPrices = groceries.filter { it.unitPrice > 3.0 }.map { it.unitPrice * 2 }
    println(newPrices.joinToString()) // 8.0, 12.0
}

