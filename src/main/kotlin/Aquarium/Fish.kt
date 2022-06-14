package aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int

    init {
        println("first init block")
    }

    constructor() : this(true, 9) {
        println("running secondary constructor")
    }

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("constructed fish size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }

    fun makeDefaultFish() = Fish(true, 50)

    fun fishNeeded() {
        val fish = Fish(friendly = true, 20)
        println("Is the fish friendly ${fish.friendly}. It needs volume ${fish.size}")
    }
}