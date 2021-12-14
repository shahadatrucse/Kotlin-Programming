import Dice.Dice
import java.util.Scanner;

fun main()
{
    println("Enter text: ")
    val num = readLine() //Using only for text input
    println("My input is ${num}")
    println("sum is ${num + 100}")

    val scanner = Scanner(System.`in`)
    var number1:Int=scanner.nextInt()
    var number2:Int=scanner.nextInt()
    var number3:Float=scanner.nextFloat()
    println("Sum of number1 and number2 is ${number1 + number2}")
    println("Sum of number2 and number3 is ${number2 + number3}")



    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
    }


}