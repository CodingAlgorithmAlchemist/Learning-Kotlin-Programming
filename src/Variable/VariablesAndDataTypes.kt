fun main(){
    /*
    Kotlin Variables Variables are containers for storing data values.
    Variables can be declared outside the main() function at the beginning of your program. Variables declared in this way are said to be declared at top level.
    its recommend that you declare all variables as read-only (val) by default. Declare mutable variables (var) only if necessary.
    To create a variable, use var or val, and assign a value to it with the equal sign (=):
    var variableName = value
    val variableName = value
    The difference between var and val is that variables declared with the var keyword can be changed/modified, while val variables cannot.
    When you create a variable with the val keyword, the value cannot be changed/reassigned
    You can also use the + character to add a variable to another variable
    For numeric values, the + character works as a mathematical operator

    String template
    It's useful to know how to print the contents of variables to standard output. You can do this with string templates. You can use template expressions to access data stored in variables and other objects, and convert them into strings. A string value is a sequence of characters in double quotes ". Template expressions always start with a dollar sign $.
    To evaluate a piece of code in a template expression, place the code within curly braces {} after the dollar sign $.

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


    // Variable declared without initialization
    val d: Int
// Variable initialized
    d = 3

// Variable explicitly typed and initialized
    val e: String = "hello"

// Variables can be read because they have been initialized
    println(d) // 3
    println(e) // hello
}