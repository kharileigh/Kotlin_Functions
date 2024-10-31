package org.example

fun main() {

    /*
    * 1. Write a method called `superify`
    - arg : a String
    - adds word “super” to the start of String
    - return : String
    * */
    fun superify(input: String): String {
        return "super$input"
    }
    println(superify(superify(superify(superify("cat")))))


    /*
    * 2. Define a function `revealSecret`
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
}