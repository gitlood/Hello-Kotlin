import java.util.*
import kotlin.random.Random.Default.nextInt


//fun main(args: Array<String>) {
//    Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
//    println(if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin")
//}

fun main(args: Array<String>){
feedTheFish()
}

fun feedTheFish(){
val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
val week = listOf(
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday"
)
    return week[Random().nextInt(7)]
}
