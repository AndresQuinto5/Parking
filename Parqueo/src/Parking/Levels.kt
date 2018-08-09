package Parking

import java.util.*

class Levels(
        var name: String = " ",
        var width: Int = 0,
        var height: Int = 0,
        var Id: Int = 0,
        var Walls: ArrayList<Walls>,
        var Parking: ArrayList<ParkingMap>,
        var Plates: ArrayList<String>

){
    //Realizamos el toString
    override fun toString(): String {
        return """
            Nivel:
                Name: $name
                ID:$Id
        """.trimIndent()
    }
}
