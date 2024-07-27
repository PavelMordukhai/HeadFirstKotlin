package org.example.chapter_02

fun main() {

    // массив var

    var myArray: Array<Byte> = arrayOf(1, 2, 3)

    for (i in myArray) print("$i ")
    println()

    // получение размера массива
    println("Размер массива - ${myArray.size}")

    // получение значения элемента массива по индексу
    println("Элемент под индексом 1: ${myArray[1]}")
    println()

    // изменение значения элемента массива
    myArray[1] = 15
    for (i in myArray) print("$i ")
    println()
    println()

    myArray = arrayOf(4, 5) // другой массив того же типа
    for (i in myArray) print("$i ")
    println()
    println()

    // массив val

    val myArray2 = arrayOf(2, 4, 6)
    myArray2[2] = 15
    for (i in myArray2) print("$i ")
    println()
    println()
}