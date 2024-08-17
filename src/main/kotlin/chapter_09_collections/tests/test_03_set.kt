package org.example.chapter_09_collections.tests

// множество

fun main() {

    val friendSet = setOf("Jim", "Sue", "Sue", "Nick", "Nick")
    println(friendSet.size) // 3
    println(friendSet) // [Jim, Sue, Nick]
    println()

    val isFredGoing = friendSet.contains("Fred")
    println(isFredGoing) // false
    println()

    for (item in friendSet)
        println(item)
    println()

    /*
    В Set будет добавлено одно значение, если Recipe является классом данных

    val a = Recipe("Thai Curry")
    val b = Recipe("Thai Curry")
    val set = setOf(a, b)
     */

    val mFriendSet = mutableSetOf("Jim", "Sue")

    mFriendSet.add("Nick")
    println(mFriendSet) // [Jim, Sue, Nick]
    mFriendSet.remove("Nick")
    println(mFriendSet) // [Jim, Sue]
    println()

    // Функции addAll, removeAll и retainAll также могут использоваться
    // для внесения массовых изменений в MutableSet (по аналогии с MutableList)

    val toAdd = setOf("Joe", "Mia")
    mFriendSet.addAll(toAdd)
    println(mFriendSet) // [Jim, Sue, Joe, Mia]
    println()

    mFriendSet.clear()
    println(mFriendSet) // []
    println()


}


