package org.example.chapter_12_built_in_higher_order_functions.tests

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

// fold: можно задать исходное значение и выполнить некоторую операцию для каждого элемента коллекции.
// Получает два параметра: исходное значение и выполняемую операцию, заданную лямбда-выражением.
// Функция fold может вызываться для свойств keys, values и entries массива Map,
// но не для самого объекта Map напрямую.

// foldRight - перебор справа налево

data class Grocery6(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {

    val ints = listOf(1, 2, 3)

    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    // 0 + 1 + 2 + 3
    println(sumOfInts) // 6

    val productOfInts = ints.fold(1) { runningSum, item -> runningSum * item }
    // 1 * 1 * 2 * 3
    println(productOfInts) // 6
    println()

    val groceries = listOf(
        Grocery6("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery6("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery6("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery6("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery6("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val groceriesNames = groceries.fold("") { string, item -> string + "${item.name} / " }
    println(groceriesNames) // Tomatoes / Mushrooms / Bagels / Olive oil / Ice cream /
    println()

    val changeFromTransaction = groceries
        .fold(50.0) { change, item -> change - item.unitPrice * item.quantity }
    println(changeFromTransaction) // 22.0
}
