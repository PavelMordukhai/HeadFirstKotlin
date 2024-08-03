package org.example.chapter_05_inheritance.animals

open class Animal {

    var image1 = ""

    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun makeNoise() {
        println("The animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}


class Hippo : Animal() {

    // Чтобы переопределить свойство, унаследованное от суперкласса,
    // добавьте свойство в подкласс и поставьте перед ним ключевое слово override.
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    // Если свойство суперкласса определяется с ключевым словом var,
    // то переопределять его для присваивания нового значения не обязательно,
    // так как переменные var могут повторно использоваться для других значений.
    // Можно присвоить ему новое значение в блоке инициализации подкласса
    init {
        image1 = "hippo1.jpg"
    }

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}


open class Canine : Animal() {

    override fun roam() {
        println("The Canine is roaming")
    }
}


class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooow!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}


class Vet {
    fun giveShot(animal: Animal) {
        // Код медицинской процедуры
        animal.makeNoise()
    }
}


fun main() {

    val w = Wolf()
    w.makeNoise() // Hooooow!
    w.eat()       // The Wolf is eating meat
    w.roam()      // The Canine is roaming
    w.sleep()     // The Animal is sleeping
    println()

    val animal1: Wolf = Wolf()
    animal1.makeNoise() // Hooooow!

    val animal2: Animal = Wolf()
    animal2.makeNoise() // Hooooow!

    println()

    val animals: Array<Animal> = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
        println()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)
}










