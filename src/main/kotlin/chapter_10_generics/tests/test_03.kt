package org.example.chapter_10_generics.tests

// Этот код не компилируется, так как ковариантный тип T
// не может использоваться в качестве параметра функции.

//interface A1<out T> {
//    fun myFunction(t: T)
//}

interface A2<T> {
    fun myFunction(t: T)
}


//Этот код не компилируется, так как ковариантный тип T
// не может использоваться в типе var-свойства.

//interface C1<out T> {
//    var y: T
//    fun myFunction(): T
//}


// Этот код успешно компилируется
interface B<out T> {
    val x: T
    fun myFunction(): T
}

// Этот код успешно компилируется
interface D<out T> {
    fun myFunction(str: String): T
}

// Этот код успешно компилируется
abstract class E<out T>(t: T) {
    val x = t
}