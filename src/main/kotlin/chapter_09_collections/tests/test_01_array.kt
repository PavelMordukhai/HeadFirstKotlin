package org.example.chapter_09_collections.tests

fun main() {

    // массивы

    val nullArray: Array<String?> = arrayOfNulls(2)
    println(nullArray.joinToString()) // null null

    val a1: Array<Int?> = Array(5) { 0 }
    println(a1.joinToString()) // 0, 0, 0, 0, 0

    val a2: Array<String> = Array(4) { "@" }
    println(a2.joinToString()) // @, @, @, @

    println()

    val array1 = arrayOf(1, 3, 2)
    println(array1.joinToString()) // 1, 3, 2

    val size = array1.size
    println(size) // 3

    array1.reverse()
    println(array1.joinToString()) // 2, 3, 1

    val isIn = array1.contains(1)
    println(isIn) // true

    val sum = array1.sum()
    println(sum) // 6

    val average = array1.average()
    println(average) // 2.0

    println(array1.min()) // 1
    println(array1.max()) // 3

    array1.sort()
    println(array1.joinToString()) // 1, 2, 3

    println()

    val array2 = array1.copyOf()
    array2[1] = 5
    println(array1.joinToString()) // 1, 2, 3
    println(array2.joinToString()) //1, 5, 3

    println()

    val array3 = array2.plus(6)
    val array4 = array2.plus(arrayOf(6, 8, 9))
    println(array2.joinToString()) // 1, 5, 3
    println(array3.joinToString()) // 1, 5, 3, 6
    println(array4.joinToString()) // 1, 5, 3, 6, 8, 9
}




