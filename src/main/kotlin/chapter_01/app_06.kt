package org.example.chapter_01

fun main() {

    var x1 = 1
    while (x1 < 10) {
        x1++
        if (x1 > 3) {
            println("big x")
        }
    }

    println()

    //

    var x2 = 10
    while (x2 > 1) {
        x2--
        if (x2 < 3) println("small x")
    }

    println()

    //

    var x3 = 10
    while (x3 > 1) {
        x3--
        println(if (x3 < 3) "small x" else "big x")
    }
}