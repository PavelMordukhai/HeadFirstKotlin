package org.example.chapter_12_built_in_higher_order_functions.tests

// Встроенные функций высшего порядка, получающих лямбда-параметры.
// Многие из этих функций предназначены для работы с коллекциями.

// reduce
// Эта функция работает аналогично fold, не считая того, что ей не нужно передавать исходное значение.
// В качестве исходного значения автоматически используется первый элемент коллекции.

// reduceRight - перебор справа налево

fun main() {

    val ints = listOf(5, 2, 3)

    val sumOfInts = ints.reduce { runningSum, item -> runningSum + item + 5 }
    // 5 + (2 + 5) + (3 + 5)
    println(sumOfInts) // 20

    val productOfInts = ints.reduce { runningSum, item -> runningSum * item * 3 }
    // 5 * (2 * 3) * (3 * 3)
    println(productOfInts) // 270

    val productOfInts2 = ints.reduce { runningSum, item -> runningSum * (item + 3) }
    // 5 * (2 + 3) * (3 + 3)
    println(productOfInts2) // 150

    val productOfInts3 = ints.reduce { runningSum, item -> runningSum * item + 3 }
    // ((5 * 2 + 3) * 3) + 3
    println(productOfInts3) // 42

    val productOfInts4 = ints.reduceRight { runningSum, item -> runningSum * (item + 3) }
    // НЕ ПОНЯЛ
    println(productOfInts4) // 75

    val productOfInts5 = ints.reduceRight { runningSum, item -> runningSum * item + 3 }
    // НЕ ПОНЯЛ
    println(productOfInts5) // 48
}
