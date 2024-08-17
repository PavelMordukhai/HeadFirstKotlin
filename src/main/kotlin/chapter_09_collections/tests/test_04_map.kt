package org.example.chapter_09_collections.tests

// map


data class RecipeOne(val name: String)


fun main() {

    /*
    Чтобы создать Map, вызовите функцию с именем mapOf
    и передайте ей пары «ключ-значение» для инициализации Map.
    Например, следующий код создает Map с тремя элементами.
    Ключами являются строки («Recipe1», «Recipe2» и «Recipe3»),
    а значениями — объекты Recipe
     */

    val r1 = RecipeOne("Chicken Soup")
    val r2 = RecipeOne("Quinoa Salad")
    val r3 = RecipeOne("Thai Curry")
    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)

    println(recipeMap.keys) // [Recipe1, Recipe2, Recipe3]
    println(recipeMap.values) // [Recipe(name=Chicken Soup), Recipe(name=Quinoa Salad), Recipe(name=Thai Curry)]

    // содержится ли ключ
    println(recipeMap.containsKey("Recipe1")) // true

    // содержится ли значение
    // class Recipe - не выполнится
    // data class Recipe - выполнится
    val recipeToCheck = RecipeOne("Chicken Soup")
    if (recipeMap.containsValue(recipeToCheck)) {
        println("Код, выполняемый при наличии значения в Map")
    }
    println()

    // Для получения значения, связанного с конкретным ключом, используются функции get и getValue.
    // Если заданный ключ не существует, get возвращает null, а getValue вызывает исключение.
    // В следующем примере функция getValue получает объект Recipe, связанный с ключом «Recipe1»
    if (recipeMap.containsKey("Recipe1")) {
        val recipe = recipeMap.getValue("Recipe1")
        println("Код использования объекта Recipe")
        println(recipe)
    }
    println()

    for ((key, value) in recipeMap)
        println("Key is $key, value is $value")
    println()

    for ((key, value) in recipeMap)
        println("Key is $key, value.name is ${value.name}")
}


