package org.example.chapter_04_classes.rectangle

class Rectangle(var wight: Int, var height: Int) {

    // является ли прямоугольник квадратом
    val isSquare: Boolean
        get() = (wight == height)

    // вычисление площади
    val area: Int
        get() = (wight * height)
}


fun main() {

    val r = arrayOf(
        Rectangle(1, 1),
        Rectangle(1, 1),
        Rectangle(1, 1),
        Rectangle(1, 1)
    )

    for (x in 0..< r.size) {
        // назначение ширины и высоты прямоугольника
        r[x].wight = (x + 1) * 3
        r[x].height = x + 5

        // вывод площади
        print("Rectangle $x has area ${r[x].area}. ")

        // квадрат или нет
        println("It is ${if (r[x].isSquare) "" else "not"} a square.")
    }
}