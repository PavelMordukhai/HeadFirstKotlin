package org.example.chapter_05_inheritance.carTest

open class VehicleTest {
    open fun lowerTemperature() {
        println("Turn down temperature")
    }
}


open class CarTest(
    val make: String, val model: String
) : VehicleTest() {
    override fun lowerTemperature() {
        println("Turn on air conditioning")
    }

    // final нельзя переопределить ниже по иерархии.
    // final - свойство по умолчанию, его можно не писать
    fun fuel() {
        println("fuel")
    }
}


class ConvertibleCarTest(
    make_param: String, model_param: String
) : CarTest(make_param, model_param) {
    override fun lowerTemperature() {
        println("Open roof")
    }
}


fun main() {
    val car1 = CarTest("qwert", "ertyu")
    val car2 = ConvertibleCarTest("kjf", "iuy")

    println(car1.make)
    println(car1.model)
    println(car2.make)
    println(car2.model)
}