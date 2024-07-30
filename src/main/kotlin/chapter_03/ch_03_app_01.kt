package org.example.chapter_03

fun main() {
    doSomething("sdfg", 5)
    println()

    println(timesThree(5))
    println()

    println(maxValue(arrayOf(5, 4, 6, 3)))
}


fun doSomething(msg: String, i: Int) {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x += 1
        }
    }
}


fun timesThree(x: Int): Int {
    var y = x
    y *= 3
    return y
}


fun maxValue(args: Array<Int>): Int {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        val item = args[x]
        max = if (max >= item) max else item
        x += 1
    }
    return max
}


