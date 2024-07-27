package org.example.chapter_02

fun main() {

    var x: Double = 65.2
    var isPunk = true
    var message = "Hello"
    var y = 7
    var z: Int = y

    y += 50

    var bigNum: Long = y.toLong()
    var b: Byte = 2
    val smallNum = b.toShort()

    b = smallNum.toByte()

    isPunk = false

    val k = y.toDouble()

    b = k.toInt().toByte()

    val s: Short = 0b10001
}