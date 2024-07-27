package org.example.chapter_02

fun main(){

    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    // случайное число (0 < x < 1) Double
    val rand = Math.random()
    println(rand)
    println((rand * arraySize1).toInt())
    println()

    // случайное число (from <= x < until) Int
    val rand0 = kotlin.random.Random.nextInt(0, arraySize1)
    println(rand0)
    println()

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val rand11 = kotlin.random.Random.nextInt(0, arraySize1)
    val rand22 = kotlin.random.Random.nextInt(0, arraySize2)
    val rand33 = kotlin.random.Random.nextInt(0, arraySize3)

    val phrase1 = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    val phrase2 = "${wordArray1[rand11]} ${wordArray2[rand22]} ${wordArray3[rand33]}"

    println(phrase1)
    println(phrase2)
}