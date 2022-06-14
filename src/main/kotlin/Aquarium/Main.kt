package Aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
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