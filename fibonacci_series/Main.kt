import kotlin.system.exitProcess

fun main() {
    println("-- Fibonacci Series generator --")
    println("Select mode -->")
    println("1. Print Fibonacci Series upto n terms")
    println("2. Print Fibonacci Series upto n value")
    println("3. Print Fibonacci Series upto n value and sum of series")
    println("4. Print Fibonacci Series within given range")
    println("5. Print Fibonacci Series within given range and sum of series")
    println("6. Exit")
    print("Enter your choice: ")
    val choice: String = readln()
    when (choice) {
        "1" -> {
            print("Enter number of terms: ")
            val n: Int = readln().toInt()
            printFibonacciSeries(n)
        }
        "2" -> {
            print("Enter value of n: ")
            val n: Int = readln().toInt()
            printFibonacciSeriesUptoN(n)
        }
        "3" -> {
            print("Enter value of n: ")
            val n: Int = readln().toInt()
            printFibonacciSeriesUptoNWithSum(n)
        }
        "4" -> {
            print("Enter lower bound: ")
            val lowerBound: Int = readln().toInt()
            print("Enter upper bound: ")
            val upperBound: Int = readln().toInt()
            printFibonacciSeriesWithinRange(lowerBound, upperBound)
        }
        "5" -> {
            print("Enter lower bound: ")
            val lowerBound: Int = readln().toInt()
            print("Enter upper bound: ")
            val upperBound: Int = readln().toInt()
            printFibonacciSeriesWithinRangeWithSum(lowerBound, upperBound)
        }
        "6" -> {
            println("Exiting...")
            exitProcess(0)
        }
        else -> {
            println("Invalid choice")
        }
    }
}

fun printFibonacciSeries(n: Int) {
    var initNum = 0
    var finalNum = 1
    println("Printing Fibonacci Series upto $n number of terms")
    for (num in 1..n) {
        print("$initNum ")
        val sum: Int = initNum + finalNum
        initNum = finalNum
        finalNum = sum
    }
    println()
    println("Completed process")
}

fun printFibonacciSeriesUptoN(n: Int) {
    var initNum = 0
    var finalNum = 1
    println("Printing Fibonacci Series upto $n value")
    while (initNum < n) {
        print("$initNum ")
        val sum: Int = initNum + finalNum
        initNum = finalNum
        finalNum = sum
    }
    println()
    println("Completed process")
}

fun printFibonacciSeriesUptoNWithSum(n: Int) {
    var initNum = 0
    var finalNum = 1
    var sum = 0
    println("Printing Fibonacci Series upto $n value and sum of series")
    while (initNum < n) {
        print("$initNum ")
        sum += initNum
        val temp: Int = initNum
        initNum = finalNum
        finalNum += temp
    }
    println()
    println("Sum of series: $sum")
    println("Completed process")
}

fun printFibonacciSeriesWithinRange(lowerBound: Int, upperBound: Int) {
    var initNum = 0
    var finalNum = 1
    println("Printing Fibonacci Series within range $lowerBound to $upperBound")
    while (initNum <= upperBound) {
        if (initNum >= lowerBound) {
            print("$initNum ")
        }
        val sum: Int = initNum + finalNum
        initNum = finalNum
        finalNum = sum
    }
    println()
    println("Completed process")
}

fun printFibonacciSeriesWithinRangeWithSum(lowerBound: Int, upperBound: Int) {
    var initNum = 0
    var finalNum = 1
    var sum = 0
    println("Printing Fibonacci Series within range $lowerBound to $upperBound and sum of series")
    while (initNum <= upperBound) {
        if (initNum >= lowerBound) {
            print("$initNum ")
            sum += initNum
        }
        val temp: Int = initNum
        initNum = finalNum
        finalNum += temp
    }
    println()
    println("Sum of series: $sum")
    println("Completed process")
}