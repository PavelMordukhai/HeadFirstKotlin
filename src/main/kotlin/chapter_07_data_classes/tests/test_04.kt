package org.example.chapter_07_data_classes.tests

fun main() {
    // передача значений в порядке объявления
    val r1 = RecipeData2("Spaghetti Bolognese", "Beef")
    val r2 = RecipeData2("Spaghetti Bolognese", "Tofu", true)

    // именованные аргументы
    // порядок перечисления не важен
    val r3 = RecipeData2(
        mainIngredient = "Beef",
        title = "Spaghetti Bolognese",
        difficulty = "Moderate"
    )

    val recipes1 = findRecipes("Thai curry")
    val recipes2 = findRecipes(title = "Thai curry")

    val (title, mainIngredient, vegetarian, difficulty) = r3
}

fun findRecipes(
    title: String = "",
    ingredient: String = "",
    isVegetarian: Boolean = false,
    difficulty: String = ""
): Array<RecipeData2> {
    //Код поиска рецептов
    return arrayOf()
}

// Перегруженная функция — это просто другая функция,
// которая имеет такое же имя, но другие аргументы

fun addNumbers(a: Int, b: Int) : Int {
    return a + b
}

fun addNumbers(a: Double, b: Double) : Double {
    return a + b
}