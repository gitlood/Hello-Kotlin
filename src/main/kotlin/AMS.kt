fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie(birthday: Int?): String {
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
    return when (birthday) {
        in 0..7 -> (fortunes[0])
        in 11..15 -> (fortunes[1])
        28 -> (fortunes[5])
        in 28..31 -> fortunes[6]
        else -> fortunes[birthday?.rem(fortunes.size) ?:16]
    }
}

fun getBirthday(): Int {
    print("/nPlease enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}
