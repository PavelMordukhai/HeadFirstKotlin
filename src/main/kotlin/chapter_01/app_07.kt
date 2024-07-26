package org.example.chapter_01

fun main() {

    var x = 0
    var y = 0

    while (x < 5) {
        y += x
        println("$x$y")
        x++
    }
}