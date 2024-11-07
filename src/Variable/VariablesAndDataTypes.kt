fun main(){
    /*
    Kotlin Variables Variables are containers for storing data values.
    To create a variable, use var or val, and assign a value to it with the equal sign (=):
    var variableName = value
    val variableName = value
    The difference between var and val is that variables declared with the var keyword can be changed/modified, while val variables cannot.
    When you create a variable with the val keyword, the value cannot be changed/reassigned
    You can also use the + character to add a variable to another variable
    For numeric values, the + character works as a mathematical operator

    Variable Names
    A variable can have a short name (like x and y) or more descriptive names (age, sum, totalVolume).

    The general rule for Kotlin variables are:

    Names can contain letters, digits, underscores, and dollar signs
    Names should start with a letter
    Names can also begin with $ and _
    Names are case sensitive ("myVar" and "myvar" are different variables)
    Names should start with a lowercase letter and it cannot contain whitespace
    Reserved words (like Kotlin keywords, such as var or String) cannot be used as names
    */

    /*
    Data types are divided into different groups:
    Numbers
    Characters
    Booleans
    Strings
    Arrays
    */


    val myNum = 5             // Int     or val myNum:Int = 5
    val myDoubleNum = 5.99    // Double  or val myDoubleNum:Double = 5.99
    val myLetter = 'D'        // Char     or val myLetter:Char = 'D'
    val myBoolean = true      // Boolean  or  val myBoolean:Boolean = true
    val myText = "Hello"      // String   or val myText:String = "Hello"

    println(myText)
    println(myBoolean)
    println(myLetter)
    println(myDoubleNum)
    println(myNum)
}