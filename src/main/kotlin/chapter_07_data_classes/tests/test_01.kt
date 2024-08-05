package org.example.chapter_07_data_classes.tests


class Recipe1(
    val title: String,
    val isVegetarian: Boolean,
) {
}

// переопределяет функции hashCode(), toString(), equals() ( == )
data class RecipeData(
    val title: String,
    val isVegetarian: Boolean,
) {
}


fun main() {

    val r1 = Recipe1("Chicken Bhuna", false)
    var r2 = Recipe1("Chicken Bhuna", false)

    println(r1 == r2) // false
    println(r1.hashCode()) // 885284298
    println(r2.hashCode()) // 1389133897 разное значение

    println(r1.toString()) // Recipe1@34c45dca
    println(r2.toString()) // Recipe1@52cc8049 разное значение

    r2 = r1

    println(r1 == r2) // true
    println(r1.hashCode()) // 885284298
    println(r2.hashCode()) // одинаковое значение

    println(r1.toString()) // Recipe1@34c45dca
    println(r2.toString()) // одинаковое значение
    println()

    //

    val r3 = RecipeData("Chicken Bhuna", false)
    val r4 = RecipeData("Chicken Bhuna", false)

    println(r3 == r4) // true
    println(r3.hashCode()) // 241132350
    println(r4.hashCode()) // одинаковое значение

    println(r3.toString()) // Recipe2(title=Chicken Bhuna, isVegetarian=false)
    println(r4.toString()) // одинаковое значение
    println()
}