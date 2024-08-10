package org.example.chapter_08_nulls_and_exceptions.tests

class Cat1(var name: String? = "") {
    fun meow() {
        println("Meow!")
    }
}

class Cat2(var name: String? = null) {
    fun meow() {
        println("Meow!")
    }
}

class Cat3(var name: String? = null) {
    fun meow() {
        println("Meow!")
    }
}

class Cat4(var name: String = "") {
    fun meow() {
        println("Meow!")
    }
}


fun main() {

    val myCats1 = arrayOf(
        Cat1("Misty"),
        null,
        Cat1("Socks")
    )
    for (cat in myCats1) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.meow()
        }
    }
    println()
//    Misty: Meow!
//    Socks: Meow!

    val myCats2 = arrayOf(
        Cat2("Misty"),
        Cat2(null),
        Cat2("Socks")
    )
    for (cat in myCats2) {
        print("${cat.name}: ")
        cat.meow()
    }
    println()
//    Misty: Meow!
//    null: Meow!
//    Socks: Meow!

    val myCats3 = arrayOf(
        Cat3("Misty"),
        null,
        Cat3("Socks")
    )
    for (cat in myCats3) {
        print("${cat?.name}: ")
        cat?.meow()
    }
    println()
//    Misty: Meow!
//    null: Socks: Meow!

    // Не компилируется
//    val myCats4 = arrayOf(
//        Cat4("Misty"),
//        Cat4(null),
//        Cat4("Socks")
//    )
//    for (cat in myCats4) {
//        if (cat != null) {
//            print("${cat?.name}: ")
//            cat?.meow()
//        }
//    }
}