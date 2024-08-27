package org.example.chapter_12_built_in_higher_order_functions.tests

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

// groupBy - используется для разбиения коллекции на группы.
// Функцию groupBy нельзя применять к массиву Map напрямую,
// но ее можно вызывать для свойств keys, values или entries.

data class Grocery5(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {

    val groceries = listOf(
        Grocery5("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery5("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery5("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery5("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery5("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    // Группировка элементов groceries по значению category
    val groupByCategory: Map<String, List<Grocery5>> = groceries.groupBy { it.category }
    println(groupByCategory.keys) // [Vegetable, Bakery, Pantry, Frozen]
    println()

    groceries.groupBy { it.category }.forEach { it: Map.Entry<String, List<Grocery5>> ->
        println(it.key)
        it.value.forEach { println("- ${it.name}") }
    }
}
