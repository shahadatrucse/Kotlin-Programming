package `Kotlin-Programming`

import javax.swing.border.Border

fun main()
{
    val border = "%"
    val timesRepeat = 20
    printBorder(border,timesRepeat)
    println("Working in Kotlin")
    printBorder(border,timesRepeat)

}

fun printBorder(border: String,timesRepeat:Int)
{
    repeat(timesRepeat){
        print(border)
    }
    println("")
}