package org.example.chapter_10_generics.generics


abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)

class Vet<T: Pet> {
    fun treat(t: T) {
        println("Treat Pet ${t.name}")
    }
}

// Vet<T> добавляется в конструктор Contest,
// чтобы объект Contest нельзя было создать без назначения объекта Vet.
class Contest<T: Pet>(var vet: Vet<in T>) {

    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val winners: MutableSet<T> = mutableSetOf()
        val highScore = scores.values.max()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}


interface Retailer<out T> {
    fun sell(): T
}

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}

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


fun main(args: Array<String>) {

    // Создание двух объектов Cat и объекта Fish.
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    // Создаем несколько объектов Vet
    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    // Объекты Vet работают со своими разновидностями Pet
    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)

    // Создание объекта Contest, предназначенного только для Cat.
    // Vet<Cat> связывается с Contest<Cat>.
    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    // Создание объекта Contest для Pet; такой объект будет принимать любые подклассы Pet.
    // Vet<Pet> связывается с Contest<Pet>.
    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    // Vet<Pet> связывается с Contest<Fish>.
    val fishContest = Contest<Fish>(petVet)

    // Создание объектов Retailer.
    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()
}


