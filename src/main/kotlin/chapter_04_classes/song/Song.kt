package org.example.chapter_04_classes.song

class Song(val title: String, val artist: String) {

    fun printPlay() {
        println("Playing the song $title by $artist")
    }

    fun printStop() {
        println("Stopped playing $title")
    }
}


fun main() {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.printPlay()
    songTwo.printStop()
    songThree.printPlay()
}