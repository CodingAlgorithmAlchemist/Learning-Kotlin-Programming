package controlFlow

import jdk.internal.org.jline.utils.Colors.h

fun main(){
    /*
        Kotlin Conditions and If..Else
        Kotlin supports the usual logical conditions from mathematics:

        Less than: a < b
        Less than or equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to a == b
        Not Equal to: a != b
        You can use these conditions to perform different actions for different decisions.

        Kotlin has the following conditionals:

        Use if to specify a block of code to be executed, if a specified condition is true
        Use else to specify a block of code to be executed, if the same condition is false
        Use else if to specify a new condition to test, if the first condition is false
        Use when to specify many alternative blocks of code to be executed
     */

    if (20 > 18) {
        println("20 is greater than 18")
    }

    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
// Outputs "Good evening."

    //In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):
    val gmt = 20
    val greeting = if (gmt < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

}