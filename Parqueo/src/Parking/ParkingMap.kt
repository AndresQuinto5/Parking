package Parking

abstract class ParkingMap {
    abstract val Levels: ArrayList<Levels>

    fun find_Levels(levelName: String): Levels? {
        val Levelsfiltered = Levels.filter { it.name == levelName }
        if(Levelsfiltered.count() > 0){
            return Levelsfiltered[0]
        }
        return null
    }
}