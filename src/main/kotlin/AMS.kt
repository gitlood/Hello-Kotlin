import java.util.*
import kotlin.random.Random.Default.nextInt


//fun main(args: Array<String>) {
//    Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
//    println(if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin")
//}

fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        print("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}