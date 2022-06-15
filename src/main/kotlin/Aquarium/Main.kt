package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    //val library = mapOf("Shakespeare" to allBooks)
  //  println(library.any { it.value.contains("Hamlet") })

    //val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    //moreBooks.getOrPut("Jungle Book") { "Kipling" }
    //moreBooks.getOrPut("Hamlet") { "Shakespeare" }
   // println(moreBooks)

// My Code
    val allBooksOfOneAuthor = setOf("A", "B", "C")
// { set of books, author }
    val library = mapOf(
        "by William Shakespeare" to allBooksOfOneAuthor,
        "Genesis" to setOf("M", "H", "N")
    )

    val hamletFound = library.any() { it.value.contains("Hamlet") }
    println("Hamlet is " + (if (hamletFound) " " else "not ") + "in the Library")

    val moreBooks = mutableMapOf<String, Set<String>>()
    moreBooks["Melo"] = setOf("istanbul", "ankara", "izmir")
    moreBooks.getOrPut("Seno") { setOf("Senosis") }
}

private fun buildAquarium() {
    val myAquarium = Aquarium()
    println(
        "Height: ${myAquarium.height} " +
                "Length: ${myAquarium.length} " +
                "Width: ${myAquarium.width}"
    )

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} litres")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} litres")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println(
        "Aquarium 2: ${myAquarium2.volume} litres with " +
                "Height: ${myAquarium2.height} " +
                "Length: ${myAquarium2.length} " +
                "Width: ${myAquarium2.width}"
    )
}

fun feedFish(fish: FishAction) {
    //make some food then
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark: ${shark.color} \nPlecostomus: ${plecostomus.color}")
    shark.eat()
    plecostomus.eat()
}