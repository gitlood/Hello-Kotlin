// Interface
/*Create an interface, SpiceColor, that has a color property. You can use a String for the color.
Create a singleton subclass, YellowSpiceColor, using the object keyword, because all instances of Curry and other spices can use the same YellowSpiceColor instance.
Add a color property to Curry of type SpiceColor, and set the default value to YellowSpiceColor.
Add SpiceColor as an interface, and let it be by color.
Create an instance of Curry, and print its color. However, color is actually a property common to all spices, so you can move it to the parent class.
Change your code so that the SpiceColor interface is added to the Spice class and inherited by Curry.*/

// Solution Code
abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}