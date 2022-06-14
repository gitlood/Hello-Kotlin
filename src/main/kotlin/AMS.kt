import java.util.*

fun main(args: Array<String>) {
    repeat(10) { feedTheFish() }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
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