package org.example.chapter_09_collections.tests

// списки

fun main() {

    // list неизменяемый

//    val shopping1: List<String>
//    shopping = listOf("Tea", "Eggs", "Milk")

    val shopping = listOf("Tea", "Eggs", "Milk")

    if (shopping.size > 0) {
//        println(shopping.get(0))
        println(shopping[0]) // Tea
    }
    println()

    for (item in shopping) println(item)
    println()

    if (shopping.contains("Milk"))
        println(shopping.indexOf("Milk")) // 2
    println()

    // mutableListOf изменяемый

    var mShopping = mutableListOf("Tea", "Eggs")
    mShopping.add("Milk")
    mShopping.add(1, "Salt")
    println(mShopping) // [Tea, Salt, Eggs, Milk]

    if (mShopping.contains("Milk"))
        mShopping.remove("Milk")
    println(mShopping) // [Tea, Salt, Eggs]

    if (mShopping.size > 1)
        mShopping.removeAt(1)
    println(mShopping) // [Tea, Eggs]

    if (mShopping.size > 0) {
//        mShopping.set(0, "Coffee")
        mShopping[0] = "Coffee"
    }
    println(mShopping) // [Coffee, Eggs]

    mShopping = mutableListOf("Milk", "Coffee", "Tea", "Eggs", "Salt")
    mShopping.sort()
    mShopping.reverse()
    println(mShopping) // [Tea, Salt, Milk, Eggs, Coffee]

    mShopping.shuffle() // случайная перестановка
    println(mShopping)
    println()

    val toAdd = listOf("Cookies", "Sugar")
    mShopping.addAll(toAdd)
    println(mShopping) // [Salt, Coffee, Milk, Tea, Eggs, Cookies, Sugar]
    println()

    val toRemove = listOf("Milk", "Sugar")
    mShopping.removeAll(toRemove)
    println(mShopping) // [Salt, Coffee, Tea, Eggs, Cookies]
    println()

    val toRetain = listOf("Tea", "Salt")
    mShopping.retainAll(toRetain)
    println(mShopping) // [Salt, Tea]
    println()

//    mShopping.clear()
//    println(mShopping) // []

    val shoppingCopy = mShopping.toList() // копия списка, возвращает List. Также toMutableList()
    println(shoppingCopy) // [Salt, Tea]

    // sorted, reversed, shuffled возвращают изменённые списки List
}








