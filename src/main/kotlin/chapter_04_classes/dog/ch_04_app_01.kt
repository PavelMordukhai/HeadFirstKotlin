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
    println()
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
    println()

    //

    println(myDog.breed)
    println()

    println(myDog.activities[0])

    var activitie = myDog.activities[0]
    activitie = "sleep"
    println(activitie)
    println(myDog.activities[0])

    myDog.activities[0] = "eat"
    println(myDog.activities[0])
    println()
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")

    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }
    println()

    //

    println(myDog.weightInKgs)
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
}