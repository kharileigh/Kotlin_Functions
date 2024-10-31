package org.example

fun main() {

    /*
    * [FUNCTIONS]
    * Write a method called `superify`
    - arg : a String
    - adds word “super” to the start of String
    - return : String
    * */
    fun superify(input: String): String {
        return "super$input"
    }
    println(superify(superify(superify(superify("cat")))))


    /*
    * [FUNCTIONS]
    * Define a function `revealSecret`
    - arg : passcode
    - returns a secret String : only if passcode is “HUNGRY”
    - returns null if not given passcode
    * */
    fun revealSecret(passcode: String): String? {
        return if (passcode == "HUNGRY") {
            "The cookies are in the desk drawer"
        } else {
            null
        }
    }
    // correct passcode
    val secret = revealSecret("HUNGRY")
    println(secret)

    // incorrect passcode
    val incorrectSecret = revealSecret("FULL")
    println(incorrectSecret)


    /*
    * [CONDITIONAL]
    * Define a function `getNumberSign`
    - arg : a number
    - returns : String → “zero” / “positive” / “negative”
    - returns null if not a number
    * */
    fun getNumberSign(number: Any): String? {
        return when (number) {
           is Number -> when {
               number.toDouble() == 0.0 -> "zero"
               number.toDouble() > 0.0 -> "positive"
               else -> "negative"
           }
            else -> null
        }
    }
    println(getNumberSign(3))
    println(getNumberSign(0))
    println(getNumberSign(-5))
    println(getNumberSign("is not a number"))

    /*
    * [DATA STRUCTURES]
    * Define a function `printHelloMessages`
    - arg : list of names
    - prints a hello message
    - use `map` function
    * */
    fun printHelloMessages(names: List<String>) {
        // map : transforms each name to a message
        names.map { name -> "Hello $name!" }
            // forEach : used to print each message
            .forEach { message -> println(message) }
    }
    println(printHelloMessages(listOf("Jake", "Olga", "Pat")))

    /*
    * [DATA STRUCTURES]
    * Use function `getNumberSign` (conditionals), create a new function `getAllNumberSigns`
    - arg : array of numbers (Int)
    - returns array of corresponding number signs
    - use `map` function
    * */
    fun getAllNumberSigns(numbers: Array<Int>): Array<String?> {
        // map produces a List of strings, then it is converted to an Array
        return numbers.map { getNumberSign(it) }.toTypedArray()
    }
    val numbers = arrayOf(2, -3, 5, 0)
    val signs = getAllNumberSigns(numbers)
    println(signs.joinToString())


    /*
    * [HIGHER-ORDER FUNCTIONS]
    * Implement a function `convertToCaps`
    - arg : String
    - returns : String converted to capital letters
    * */
    fun convertToCaps(word: String): String {
        return word.uppercase()
    }
    val capital = convertToCaps("It is a new day")
    println(capital)

    /*
    * [HIGHER-ORDER FUNCTIONS]
    * Implement a function `exclaim`
    - arg : String
    - returns : given String with an exclamation mark at the end
    * */
    fun exclaim(word: String): String {
        return "$word!"
    }
    val exclamation = exclaim("Welcome home")
    println(exclamation)

    /*
    * [HIGHER-ORDER FUNCTIONS]
    * Implement a function greetWith
    * */
    // 2 args : String + Function that transforms string given
    fun greetWith(name: String, transformation: (String) -> String): String {
        return transformation(name)
    }

    // semicolon used when referencing a function
    println(greetWith("Marco", ::convertToCaps))
    println(greetWith("Marco", ::exclaim))

    /*
    * - call previous function greetWith using a lambda instead of a named function
    * */
    println(greetWith("Marco") { it.uppercase() })
    println(greetWith("Marco") { "$it!" })
}