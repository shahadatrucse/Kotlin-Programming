package `Kotlin-Programming`


fun main() {
    val triple:(Int)->Int = {a:Int -> a*3}
    println(triple(99))
    println("NewWay")
    val triplen :(Int)->Int = { it * 5 }
    println(triplen(100))
    println("////")
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())

    println(peopleNames.sortedWith(){str1:String , str2:String -> str1.length - str2.length})

    val words = listOf("about", "acute", "Boka","awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)
    val filteredWords2 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
    println(filteredWords2)
    val filteredWords3 = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords3)
}
