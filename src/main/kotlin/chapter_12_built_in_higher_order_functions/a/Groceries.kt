package org.example.chapter_12_built_in_higher_order_functions.a

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

data class Grocery1(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {
    val groceries = listOf(
        Grocery1("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery1("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery1("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery1("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery1("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val highestUnitPrice = groceries.maxBy { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")
    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")
    println()

    val sumQuantity = groceries.sumOf { it.quantity }
    println("sumQuantity: $sumQuantity")
    val totalPrice = groceries.sumOf { it.quantity * it.unitPrice }
    println("totalPrice: $totalPrice")
    println()
}
