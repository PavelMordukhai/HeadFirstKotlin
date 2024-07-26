package org.example.chapter_01

fun main(args: Array<String>) {

    println("Pow!")
    println()

    //

    var x = 3
    val name = "Cormoran"
    x = x * 10
    println("x is $x.")
    println(name)
    println()

    //

    while (x > 20) {
        x--
        println(" x is now $x.")
    }
    println()
    for (i in 1..10) {
        x++
        println(" x is now $x.")
    }
    println()

    //

    if (x == 20) {
        println(" x must be 20.")
    } else {
        println(" x isn't 20.")
    }
    if (name == "Cormoran") {
        println("$name Strike")
    }
}