package org.example.chapter_06_polymorphism.animals


// интерфейс
interface Roamable {
    fun roam()
}


// класс реализует интерфейс
abstract class Animal : Roamable {

    var image1 = ""

    // Эти свойства содержат обобщенные значения, которые все равно должны переопределяться,
    // поэтому можно пометить их как абстрактные
    abstract val image: String
    abstract val food: String
    abstract val habitat: String

    val hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    // переопределение из интерфейса Roamable
    override fun roam() {
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


abstract class Canine : Animal() {

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


// класс реализует интерфейс
class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
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

    val animals: Array<Animal> = arrayOf(
        Hippo(),
        Wolf()
    )
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
    println()

    // Массив объектов Roamable
    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
    }
    println()

    // Оператор is
    // Проверка типа объекта для обращения к специфическому поведению
    val animal3: Animal = Wolf()
    if (animal3 is Wolf)
        animal3.eat()
    val str = if (animal3 is Wolf) "Wolf" else "Not Wolf"
    println(str)
    println()

    // Та же проверка в массиве
    val roamables1 = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables1) {
        item.roam()

        if (item is Animal)
            item.eat()

        if ((item is Animal) && item.hunger < 5)
            println("Код обработки голодного животного")

        if ((item !is Animal) || item.hunger >= 5)
            println("Код для обработки “не животного” или сытого животного")
    }
    println()

    var i = 0
    while (animal3 is Wolf) {
        println("Код выполняется, если объект относится к классу Wolf")
        i++
        if (i == 3) break
    }

    /*
    when (roamable) {
        is Wolf -> {
            //Код для Wolf
        }
        is Hippo -> {
            //Код для Hippo
        }
        is Animal -> {
            //Код для других видов Animal
        }
    }
     */

    // В большинстве случаев оператор is выполняет умное приведение типа
    /*
    if (item is Wolf) {
        item.eat()
        item.makeNoise()
        //Other Wolf-specific code
    }
     */

    // as
    // явное приведение типа

    // var wolf = r as Wolf
    // wolf.eat()

    // if (r is Wolf) {
    //     val wolf = r as Wolf
    //     wolf.eat()
    // }
}






















