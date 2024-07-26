package org.example.chapter_01

fun main() {

    var x = 4 //Присвоить x значение 4
    while (x > 3) {
        //Код цикла будет выполняться, пока x остается больше 4
        println(x)
        x--
    }

    var z = 27
    while (z == 10) {
        //Код цикла не выполняется, так как переменная z равна 27
        println(z)
        z += 6
    }
}