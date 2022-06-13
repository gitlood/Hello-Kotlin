import java.util.*

fun main(args: Array<String>) {
    println("Hello, World!")
    dayOfTheWeek()
}

fun dayOfTheWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println(day)
    println(when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Time has stopped"
    })
}
