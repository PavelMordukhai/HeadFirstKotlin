package org.example.chapter_04_classes.Dog

class Dog (val name: String, var weight: Int, val breed: String) {

    fun printBark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }

    fun bark(): String {
        val song = if (weight < 20) "Yip!" else "Woof!"
        return song
    }
}
