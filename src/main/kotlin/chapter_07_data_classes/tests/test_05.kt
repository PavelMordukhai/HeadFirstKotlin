package org.example.chapter_07_data_classes.tests

// класс со вторичным конструктором
class Mushroom(val size: Int, val isMagic: Boolean) {

    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
        //Код, выполняемый при вызове вторичного конструктора
    }
}


fun main() {

    // Создание объекта Mushroom вызовом первичного конструктора
    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")

    // Создание объекта Mushroom вызовом вторичного конструктора
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")
}