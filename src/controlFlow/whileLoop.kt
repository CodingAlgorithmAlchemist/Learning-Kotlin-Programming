package controlFlow

fun main (){
    /*
    Loops
Loops can execute a block of code as long as a specified condition is reached.

Loops are handy because they save time, reduce errors, and they make code more readable.

Kotlin While Loop
The while loop loops through a block of code as long as a specified condition is true:
 Do not forget to increase the variable used in the condition, otherwise the loop will never end
     */

    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
}
