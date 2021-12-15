package `Kotlin-Programming`

fun main() {
    val peopleAges=mutableMapOf<String, Int>(
        "Shahadat" to 24,
        "Kawser" to 30)
    peopleAges.put("Abir", 40)
    peopleAges["Alamin"]=50
    peopleAges["Shahadat"]=20
    println(peopleAges)
    peopleAges.forEach{print("${it.key} is ${it.value},")}
    println("")
    println(peopleAges.map{"${it.key} is ${it.value}"}.joinToString(", "))
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
}