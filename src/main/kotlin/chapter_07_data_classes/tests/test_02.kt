package org.example.chapter_07_data_classes.tests

fun main() {

    // Создание копии объекта данных, изменяя некоторые из его свойств,
    // но оставить другие свойства в исходном состоянии - copy()

    val r1 = RecipeData("Thai Curry", false,)
    // Создание копии объекта Recipe, заменяя значение свойства isVegetarian
    val r2 = r1.copy(isVegetarian = true)

    //
    // Деструктуризация. Функция componentN()

    val r = RecipeData("Chicken Bhuna", false)
//    val title = r.title
    // component1() возвращает ссылку, которая содержится в первом свойстве,
    // определенном в конструкторе класса данных
    val title1 = r.component1()
    println(title1)
    println()

//    val title = r.title
//    val vegetarian = r.isVegetarian

//    val title = r.component1()
//    val vegetarian = r.component2()

    val (title, vegetarian) = r
    println(title)
    println(vegetarian)
    println()

    val arr1 = arrayOf(10, 15, 30)
    val (n1, n2, n3) = arr1
    println(arr1.joinToString())
    println(n1)
    println(n2)
    println(n3)
}