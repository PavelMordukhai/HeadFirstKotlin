package org.example.chapter_09_collections.tests

// mutableMap


data class RecipeTwo(val name: String)


fun main() {

    val r1 = RecipeTwo("Chicken Soup")
    val r2 = RecipeTwo("Quinoa Salad")
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)

    // Включение элементов в MutableMap.
    // Если MutableMap уже содержит заданный ключ,
    // функция put заменяет значение для этого ключа и возвращает исходное значение.
    val r3 = RecipeTwo("Thai Curry")
//    mRecipeMap.put("Recipe3", r3)
    mRecipeMap["Recipe3"] = r3

    val r4 = RecipeTwo("Jambalaya")
    val r5 = RecipeTwo("Sausage Rolls")
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)

    // Удаление элементов из MutableMap

    // Удаление элемента с ключом «Recipe2»
    mRecipeMap.remove("Recipe2")

    // Функции remove передается ключ и значение.
    // В данном случае не удалится (нет совпадений значения)
    val recipeToRemove = RecipeTwo("Quinoa Salad")
    mRecipeMap.remove("Recipe2", recipeToRemove)

//    mRecipeMap.clear()

    // Копирование Map и MutableMap

    val recipeMapCopy = mRecipeMap.toMap()

    val recipeList = mRecipeMap.toList()
    println(recipeList) // [(Recipe1, RecipeTwo(name=Chicken Soup)), ... ]
    println()

    // Свойство entries возвращает Set при использовании с Map
    // или MutableSet при использовании с MutableMap
    val recipeEntries = mRecipeMap.entries
    println(recipeEntries) // [Recipe1=RecipeTwo(name=Chicken Soup), ... ]
    println()

    // встречаются ли в Map повторяющиеся значения
    if (mRecipeMap.size > mRecipeMap.values.toSet().size) {
        println("mRecipeMap contains duplicates values")
        println()
    }


}



