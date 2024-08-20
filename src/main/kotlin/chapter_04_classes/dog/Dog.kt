package org.example.chapter_04_classes.dog

class Dog(
    val name: String,
    weightParam: Int,
    breedParam: String
) {

    // init - блок инициализации - выполняется при инициализации объекта Dog
    init {
        println("Dog $name has been created.")
        println()
    }
    //

    var activities = arrayOf("Walks")
    val breed = breedParam.uppercase()

    init {
        println("The breed is $breed.")
        println()
    }

    // Проверка на положительное значение.
    // Благодаря наличию set-метода свойство weight будет обновляться только значениями,
    // которые больше нуля.
    // setter
    var weight = weightParam
        set(value) {
            if (value > 0) field = value
        }

    // пересчёт фунтов в килограммы
    // getter
    val weightInKgs: Double
        get() = weight / 2.2

    lateinit var temperament: String

    fun printBark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }

    fun bark(): String {
        val song = if (weight < 20) "Yip!" else "Woof!"
        return song
    }
}
