package org.example.chapter_12_built_in_higher_order_functions.tests

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

// filter
// filterNot - возвращает те элементы коллекции, которые не соответствуют переданному критерию.
// filterTo - присоединяет элементы, соответствующие заданному критерию, к другой коллекции.
// filterNotTo
// filterIsInstance - возвращает список List всех элементов, являющихся экземплярами заданного класса.

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

    // filter

    // Возвращает List с элементами groceries,
    // у которых свойство category содержит «Vegetable
    val vegetables = groceries.filter { it.category == "Vegetable" }
    for (i in vegetables)
        print("${i.name} / ") // Tomatoes / Mushrooms /
    println()

    val unitPriceOver3 = groceries.filter { it.unitPrice > 3.0 }
    for (i in unitPriceOver3)
        print("${i.name} / ") // Mushrooms / Olive oil /
    println()

    // filterNot
    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    for (i in notFrozen)
        print("${i.name} / ") // Tomatoes / Mushrooms / Bagels / Olive oil /
    println()

    // filterTo
    val frozen: MutableList<Grocery2> = mutableListOf()
    groceries.filterTo(frozen) { it.category == "Frozen" }
    println(frozen) // [Grocery2(name=Ice cream, category=Frozen, unit=Pack, unitPrice=3.0, quantity=2)]

    // filterNotTo
    val nFrozen: MutableList<Grocery2> = mutableListOf()
    groceries.filterNotTo(nFrozen) { it.category == "Frozen" }
    for (i in nFrozen)
        print("${i.name} / ") // Tomatoes / Mushrooms / Bagels / Olive oil /
    println()
}

// filterIsInstance
/*
open class Animal(val name: String) {
    override fun toString(): String {
        return name
    }
}
class Dog(name: String): Animal(name)
class Cat(name: String): Animal(name)

val animals: List<Animal> = listOf(Cat("Scratchy"), Dog("Poochie"))
val cats = animals.filterIsInstance<Cat>()

println(cats) // [Scratchy]
*/
