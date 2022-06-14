import java.util.*

fun main(args: Array<String>) {
    repeat(10) { feedTheFish() }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if (shouldChangeWater(day)) {
        println("Should change water today")
    }
    swim()
    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1, 1, 3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {
    var availableTankSize = tankSize
    // Without decorations, Total length of fish <= 100% of the tank size
    if (!hasDecorations) {
        availableTankSize -= currentFish.sum()
    }
    // With decorations, Total length of fish <= 80% of the tank size
    else {
        availableTankSize = availableTankSize.times(4).div(5)
        availableTankSize -= currentFish.sum()
    }
    println("tankSize: $tankSize, sum: ${currentFish.sum()}, availableTankSize: $availableTankSize")
    return fishSize <= availableTankSize
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20
): Boolean {
    return true
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun randomDay(): String {
    val days = listOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )
    return days[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granules"
        "Thursday" -> "mosquitoes"
        "Friday" -> "plankton"
        "Saturday" -> "lettuce"
        else -> "fasting"
    }
}