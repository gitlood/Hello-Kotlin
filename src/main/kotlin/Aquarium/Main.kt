package Aquarium

import Spice

fun main(args: Array<String>) {
    buildAquarium()
    loadSpices()
}

private fun loadSpices() {
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "moderate"),
        Spice("cayenne", "hot"),
        Spice("ginger", "mild"),
        Spice("red curry", "moderate"),
        Spice("green curry", "hot"),
        Spice("red pepper", "hot")
    )

    println(spices.filter { s -> s.heat < 6 }.toString())
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