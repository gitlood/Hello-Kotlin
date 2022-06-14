class SimpleSpice{
    var spice: String = "curry"
    var spiciness: String = "mild"
    var heat = {
        when (spiciness) {
            "mild" -> 5
            else -> 0
        }
    }
}