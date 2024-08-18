package org.example.chapter_10_generics.tests

// Каждый тип продавца должен продавать животных конкретного типа.

// Интерфейс Retailer указывает, что он использует обобщенный тип T,
// который используется как возвращаемый тип функции sell.
interface Retailer<T> {
    fun sell(): T
}

// Класс CatRetailer реализует интерфейс Retailer для работы с Cat.
// Это означает, что функция sell() должна возвращать Cat.
class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}

// Аналогично
class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell Dog")
        return Dog("")
    }
}

class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}


fun main() {

    val catRetailer1 = CatRetailer()
    val catRetailer2: CatRetailer = CatRetailer()

    // Эти строки допустимы, потому что DogRetailer реализует Retailer<Dog>,
    // а CatRetailer реализует Retailer<Cat>.
    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()

//    val petRetailer: Retailer<Pet> = CatRetailer() // не компилируется
    // Если interface Retailer<out T>, то компилируется.
    // Если обобщенный тип помечается префиксом out, этот обобщенный тип называется ковариантным.
    // Иначе говоря, это означает, что подтип может использоваться вместо супертипа.
}


