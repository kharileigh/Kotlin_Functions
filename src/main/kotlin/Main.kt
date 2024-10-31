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


    /*
    * [DATA STRUCTURES]
    * Use function `getNumberSign` (conditionals), create a new function `getAllNumberSigns`
    - arg : array of numbers (Int)
    - returns array of corresponding number signs
    - use `map` function
    * */
}