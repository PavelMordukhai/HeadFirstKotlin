package org.example.chapter_04_classes.dog

fun main() {
    val myDog = Dog("Fido", 70, "Mixed")

    // вывод свойств в консоль

    println(myDog.name)
    println()

    println(myDog.weight)
    myDog.weight = 75
    println(myDog.weight)
    println()

    // вызов функции

    myDog.printBark()

    println(myDog.bark())

    val song = myDog.bark()
    println(song)
    println()

    //

    val dogs = arrayOf(
        Dog("Rex", 60, "Mixed"),
        Dog("Ripper", 10, "Poodle")
    )

    dogs[1].weight = 15
    dogs[1].printBark()
    dogs[1].weight = 25
    dogs[1].printBark()
}