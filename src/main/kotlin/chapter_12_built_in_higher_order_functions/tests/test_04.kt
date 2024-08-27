package org.example.chapter_12_built_in_higher_order_functions.tests

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

// forEach - работает примерно так же, как цикл for.
// Можно использовать forEach со списками, множествами, элементами Map, а также свойствами keys и values.

data class Grocery4(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {

    val groceries = listOf(
        Grocery4("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery4("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery4("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery4("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery4("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

//    for (item in groceries)
//        print("${item.name} / ")
//    println()
    groceries.forEach { print("${it.name} / ") } // Tomatoes / Mushrooms / Bagels / Olive oil / Ice cream /
    println()

//    for (item in groceries)
//        if (item.unitPrice > 3.0)
//            print("${item.name} / ")
//    println()
    groceries.filter { it.unitPrice > 3.0 }.forEach { print("${it.name} / ") } // Mushrooms / Olive oil /
    println()

    var itemNames = ""
//    for (item in groceries) {
//        itemNames += "${item.name} "
//    }
//    println("itemNames: $itemNames")
    groceries.forEach { itemNames += "${it.name} " }
    println("itemNames: $itemNames") // itemNames: Tomatoes Mushrooms Bagels Olive oil Ice cream
}
