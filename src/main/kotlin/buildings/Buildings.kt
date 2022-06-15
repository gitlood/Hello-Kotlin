package buildings

open class BaseBuildingMaterials() {
    open val numberNeeded = 1
}

class Wood() : BaseBuildingMaterials(){
    override val numberNeeded = 4
}

class Brick() : BaseBuildingMaterials(){
    override val numberNeeded = 8
}

class Building<T: BaseBuildingMaterials>(val buildingMaterials: T){
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterials.numberNeeded * baseMaterialsNeeded
    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterials::class.simpleName} required")
    }
}

fun main(args: Array<String>) {
    Building(Wood()).build()
}