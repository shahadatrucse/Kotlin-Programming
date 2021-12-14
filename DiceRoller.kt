package `Kotlin-Programming`

import kotlin.random.Random



fun main()
{
    val diceRange : IntRange = 1 .. 6
    val randomNumber = diceRange.random()
    //println("Your random variable is : ${randomNumber}")
    //println("Print output from Dice class.")
    val myFirstDice = Dice(5)
    println("My ${myFirstDice.numSides} sided dice rolled  ${myFirstDice.roll()}")
    println("Update.....")
    val mySecondDice = Dice(100)
    println("My ${mySecondDice.numSides} sided dice rolled  ${mySecondDice.roll()}")




}
