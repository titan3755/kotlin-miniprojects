fun main() {
    try {
        println("Welcome to calculator app!")
        print("Enter first number: ")
        val firstNum = readln().toDouble()
        print("\nEnter second number: ")
        val secondNum = readln().toDouble()
        print("\nEnter operator: ")
        val operation = readln()
        val result: Double = calculate(firstNum, secondNum, operation)
        if (result == 0.0) {
            println("Invalid operation! Try again...")
        } else {
            println("$firstNum $operation $secondNum = $result")
        }
    } catch (e: Exception) {
        println("There was an error! Try again...")
    }
}

fun calculate(numOne: Double, numTwo: Double, operator: String): Double {
    return when (operator) {
        "+" -> {
            numOne + numTwo
        }
        "-" -> {
            numOne - numTwo
        }
        "*" -> {
            numOne * numTwo
        }
        "/" -> {
            numOne / numTwo
        }
        else -> {
            0.0
        }
    }
}