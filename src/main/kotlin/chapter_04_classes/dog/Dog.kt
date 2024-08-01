package org.example.chapter_04_classes.dog

class Dog (val name: String, var weight: Int, breedParam: String) {

    // init - блок инициализации - выполняется при инициализации объекта Dog
    init {
        println("Dog $name has been created.")
        println()
    }
    //

    var activities = arrayOf("Walks")
    val breed = breedParam.uppercase()
    lateinit var temperament: String

    init {
        println("The breed is $breed.")
        println()
    }

    fun printBark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }

    fun bark(): String {
        val song = if (weight < 20) "Yip!" else "Woof!"
        return song
    }
}
