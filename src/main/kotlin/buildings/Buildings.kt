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

/*
Create a generic function for type BaseBuildingMaterial and call it isSmallBuilding, which takes a Building with a building material T as an argument. If the materials needed are less than 500, print "small building", otherwise, print "large building".
Note: For this function, IntelliJ recommends not to inline the function. Generally, when you create a generic function, follow the IDE's recommendation about inlining.
*/

fun <T : BaseBuildingMaterials> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}
isSmallBuilding(Building(Brick()))