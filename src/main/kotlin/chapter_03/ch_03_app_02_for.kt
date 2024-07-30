package org.example.chapter_03

fun main() {

    val opt = arrayOf("Rock", "Paper", "Scissors")

    for (x in 1..5) print(x) // 12345
    println()
    for (x in 1 until 5) print(x) // 1234
    println()
    for (x in 1 ..< 5) print(x) // 1234
    println()
    for (x in 5 downTo  1) print(x) // 54321
    println()
    for (x in 1..9 step 3) print(x) // 147
    println()
    println()

    for (item in opt)
        println("\"$item\" is an item in the array")
    println()

    for (index in opt.indices)
        println("Index $index has item \"${opt[index]}\"")
    println()

    // Перебирает все элементы массива.
    // Индекс элемента присваивается переменной index,
    // а сам элемент — переменной item.
    for ((index, item) in opt.withIndex())
        println("Index $index has item \"$item\"")
}


