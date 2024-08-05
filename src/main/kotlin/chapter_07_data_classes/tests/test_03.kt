package org.example.chapter_07_data_classes.tests

fun main() {

    // Оператор == игнорирует свойство mainIngredient,
    //потому что оно не было определено в конструкторе
    val r1 = RecipeData("Thai curry", false)
    r1.mainIngredient = "Chicken"
    val r2 = RecipeData("Thai curry", false)
    r2.mainIngredient = "Duck"
    println(r1 == r2) // true
}