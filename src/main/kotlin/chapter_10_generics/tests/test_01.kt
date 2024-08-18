package org.example.chapter_10_generics.tests


// Классы домашних животных
abstract class Pet(var name: String)
class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)


// Класс Contest - хранение информации о выставках для разных видов животных.

// В качестве имени обобщенного типа может использоваться любой допустимый идентификатор,
// но по общепринятому соглашению (которое нужно соблюдать) стоит использовать «T».
// Впрочем, у этого правила есть исключение:
// если вы пишете класс коллекции или интерфейс, используйте обозначение «E» (сокращение от «Element»),
// а для ключей и значений массивов — «K» или «V» (сокращения от «Key» и «Value»)

// Класс использует обобщенный тип.
// T можно заменить любым реальным типом при создании экземпляра класса
class Contest1<T> {
    //...
}

// Ограничения для T (Pet или один из его подклассов).
// Можно создавать объекты Contest для хранения Cat, Dog, Fish или Pet
class Contest2<T: Pet> {
    //...
}

// Свойство scores используется для хранения информации о том, какую оценку получил тот или иной участник.
// Ключи - участники, значения — полученные оценки (MutableMap<T, Int>).
class Contest3<T: Pet> {
    val scores: MutableMap<T, Int> = mutableMapOf()
    //...
}

// Функция addScore должна добавлять оценку участника в массив MutableMap с именем scores.
// Участник и оценка передаются функции в параметрах;
// если оценка равна 0 или выше, функция добавляет данные в MutableMap как пару «ключ-значение».
class Contest4<T: Pet> {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
//        if (score >= 0) scores.put(t, score)
        if (score >= 0) scores[t] = score
    }
    //...
}

// Функция getWinners должна возвращать участников с наивысшей оценкой.
// Она получает значение максимальной оценки из свойства scores,
// а затем возвращает всех участников с этой оценкой в форме MutableSet.
// Так как каждый участник имеет обобщенный тип T,
// функция должна вернуть возвращаемый тип MutableSet<T>.
class Contest<T: Pet> {

    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores[t] = score
    }

    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.max() // Получить максимальное значение из scores.
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores) {
            if (score == highScore)
                winners.add(t) // Включить участников с максимальной оценкой в MutableSet.
        }
        return winners
    }
}


fun main() {

    val catContest = Contest<Cat>() // объект Contest для работы с объектами Cat

    catContest.addScore(Cat("qwerty"), 50)
    catContest.addScore(Cat("Fuzz Lightyear"), 50)
    catContest.addScore(Cat("Katsu"), 45)
    val topCat = catContest.getWinners().first()
    // getWinners() возвращает множество MutableSet<Cat>,
    // так как мы указали, что catContest работает с Cat.
//    println(topCat.name)
}




