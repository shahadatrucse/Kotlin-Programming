package `Kotlin-Programming`.I
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


}