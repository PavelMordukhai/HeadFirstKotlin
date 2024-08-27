package org.example.chapter_12_built_in_higher_order_functions.tests

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

// maxBy, minBy
// sumOf

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

    // maxBy, minBy

    // элемент groceries с наибольшим значением unitPrice
    val highestUnitPrice = groceries.maxBy { it.unitPrice }
    println(highestUnitPrice.name) // Olive oil
    // элемент groceries с наименьшим значением quantity
    val lowestQuantity = groceries.minBy { it.quantity }
    println(lowestQuantity.name) // Mushrooms
    // Если вызвать minBy или maxBy для коллекции,
    // не содержащей ни одного элемента, функция вернет значение null
    println()

    // sumOf (sumBy, sumByDouble устарели)

    // сумма всех значений quantity в groceries
    val sumQuantity = groceries.sumOf { it.quantity }
    println(sumQuantity) // 9
    // сумма всех значений unitPrice, умноженных на quantity
    val totalPrice = groceries.sumOf { it.quantity * it.unitPrice }
    println(totalPrice) // 28.0
}
