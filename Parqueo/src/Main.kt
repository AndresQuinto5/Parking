
import java.io.File
import java.io.FileNotFoundException
import java.util.*

val opcionMenu2 = 0
val opcionMenu3 = 0
val opcionMenu = 0

fun readMap (link:String): ArrayList<Array<String>> {
    val Map = ArrayList<Array<String>>()
    try {
        val scan = Scanner(File(link))
        while (scan.hasNextLine()) {
            val line = scan.nextLine()
            Map.add(line.trim({ it <= ' ' }).split("".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray())
        }
    }catch (ex: FileNotFoundException) {
    }
    return Map
}

fun main(args: Array<String>) {
    println("Welcome to ParkingDepot")
    println("Enter your name")
    val stringInput = readLine()!!
    println("Welcome: $stringInput")
    println("What do you want to do? $stringInput")
    println("Select any options n/")

    fun menu(args: Array<String>)


