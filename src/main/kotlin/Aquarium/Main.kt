package Aquarium

import SimpleSpice

fun main(args: Array<String>) {
    buildAquarium()
}

private fun buildAquarium() {
    val myAquarium = Aquarium()
    println(
        "Height: ${myAquarium.height} " +
                "Length: ${myAquarium.length} " +
                "Width: ${myAquarium.width}"
    )
    val simpleSpice = SimpleSpice()
    println("Name: ${simpleSpice.spice} Heat: ${simpleSpice.heat}")
}