fun main(args: Array<String>) {
println("How do you feel?")
    println(whatShouldIDoToday(readLine()!!, "rainy"))

}

fun isVeryHot(temperature: Int) = temperature > 35
fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"


fun whatShouldIDoToday(mood:String, weather: String = "sunny", temperature : Int = 24){
    when{
        isHappySunny(mood, weather)-> println("go for walk")
        isSadRainyCold(mood, weather, 0) -> println("stay in bed")
        isVeryHot(36) -> println("go swimming")
        else -> println("Stay home and read")
    }
}

