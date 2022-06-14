package Spices

fun main(args: Array<String>){
makeSpiceContainers()
}

fun makeSpiceContainers(){
    val sc1 = SpiceContainer("Curry")
    println(sc1)
}

data class SpiceContainer(val label: String)
