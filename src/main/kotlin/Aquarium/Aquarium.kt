package Aquarium

class Aquarium {
    var length: Int = 20
    var width: Int = 40
    var height: Int = 100

    var volume : Int
    get()  = length * width * height / 1000

    set(value){height = (value * 1000) / (width*length)}
}