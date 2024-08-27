package org.example.chapter_12_built_in_higher_order_functions.a

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

data class Grocery3(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {
    val groceries = listOf(
        Grocery3("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery3("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery3("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery3("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery3("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    groceries.groupBy { it.category }.forEach { it: Map.Entry<String, List<Grocery3>> ->
        println(it.key)
        it.value.forEach { println(" ${it.name}") }
    }
    println()

    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("sumOfInts: $sumOfInts")

    val productOfInts = ints.fold(1) { runningProduct, item -> runningProduct * item }
    println("productOfInts: $productOfInts")
    println()

    val names = groceries.fold("") { string, item -> string + "${item.name} / " }
    println("names: $names")
    println()

    val changeFrom50 = groceries
        .fold(50.0) { change, item -> change - item.unitPrice * item.quantity }
    println("changeFrom50: $changeFrom50")
}
