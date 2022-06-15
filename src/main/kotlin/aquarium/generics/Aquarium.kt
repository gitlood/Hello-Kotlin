package generics

open class WaterSupply(var needProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needProcessed = false
    }
}

class Aquarium<out T : WaterSupply>(val waterSupply: T) {
fun addWater(cleaner : Cleaner<T>){
        if(waterSupply.needProcessed) { cleaner.clean(waterSupply) }

        println("adding water from $waterSupply")
    }
}

interface Cleaner<in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater>{
    override fun clean(waterSupply: TapWater){
        waterSupply.addChemicalCleaners()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun genericExample() {
    val cleaner =TapWaterCleaner()
    val aquarium: Aquarium<TapWater> = Aquarium(TapWater())
    aquarium.addWater(cleaner)
}
