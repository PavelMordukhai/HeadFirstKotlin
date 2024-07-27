package org.example.chapter_02

fun main() {

    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0;
    while (x < hobbits.size) {
        println("${hobbits[x]} is a good Hobbit name")
        x++
    }

    println()

    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0;
    while (firemanNo < firemen.size) {
        println("Fireman number ${firemanNo + 1} is ${firemen[firemanNo]}")
        firemanNo++
    }

    println()

    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)
    var x1 = 0
    var y1: Int

    while (x1 < index.size) {
        y1 = index[x1]
        println("Fruit = ${fruit[y1]}")
        x1++
    }
}