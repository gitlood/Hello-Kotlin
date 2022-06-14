import java.util.*

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    println(spices.filter { s -> s.contains("curry") }.sortedBy { s -> s.length })
    println(spices.filter { s -> s.startsWith('c') && s.endsWith('e') })
    println(spices.subList(0, 3).filter { s -> s.startsWith('c') })

    val rollDice = { Random().nextInt(12) + 1 }
    val rollDice1 = { sides: Int -> if (sides == 0) 0 else Random().nextInt(sides) + 1 }

    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    gamePlay(rollDice2(5))
}

fun gamePlay(roll: Int) {
    print(roll)
}

