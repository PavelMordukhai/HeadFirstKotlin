package org.example.chapter_12_built_in_higher_order_functions.a

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

data class Grocery2(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {
    val groceries = listOf(
        Grocery2("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery2("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery2("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery2("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery2("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val vegetables = groceries.filter { it.category == "Vegetable" }
    print("vegetables: ")
    for (i in vegetables)
        print("${i.name} / ")
    println()

    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    print("notFrozen: ")
    for (i in notFrozen)
        print("${i.name} / ")
    println()

    val groceryNames = groceries.map { it.name }
    println("groceryNames: ${groceryNames.joinToString()}")

    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println("halfUnitPrice: ${halfUnitPrice.joinToString()}")

    val newPrices = groceries.filter { it.unitPrice > 3.0 }.map { it.unitPrice * 2 }
    println("newPrices: ${newPrices.joinToString()}")

    print("Grocery names: ")
    groceries.forEach { print("${it.name} / ") }
    println()

    print("Groceries with unitPrice > 3.0: ")
    groceries.filter { it.unitPrice > 3.0 }.forEach { print("${it.name} / ") }
    println()

    var itemNames = ""
    groceries.forEach { itemNames += "${it.name} " }
    println("itemNames: $itemNames")
}
