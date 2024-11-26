class Account {
    private fun writeToFile(balance: Double, filename: String) {
        try {
            val file = java.io.File(filename)
            file.writeText(balance.toString())
        } catch (e: Exception) {
            println("Error writing to file: $e")
        }
    }

    private fun readFromFile(filename: String): Double {
        try {
            val file = java.io.File(filename)
            return file.readText().toDouble()
        } catch (e: Exception) {
            when (e) {
                is java.io.FileNotFoundException -> println("Account does not exist!")
                is NumberFormatException -> print("")
                is java.io.IOException -> println("Error reading from file: $e")
            }
        }
        return 0.0
    }

    fun deposit(amount: Double, filename: String) {
        try {
            val balance = readFromFile(filename)
            writeToFile(balance + amount, filename)
        } catch (e: Exception) {
            println("Error depositing: $e")
        }
    }

    fun withdraw(amount: Double, filename: String) {
        try {
            val balance = readFromFile(filename)
            writeToFile(balance - amount, filename)
        } catch (e: Exception) {
            println("Error withdrawing: $e")
        }
    }

    fun getBalance(filename: String): Double {
        try {
            return readFromFile(filename)
        } catch (e: Exception) {
            println("Error getting balance: $e")
        }
        return 0.0
    }

    fun transfer(amount: Double, from: String, to: String) {
        try {
            val fromBalance = readFromFile(from)
            val toBalance = readFromFile(to)
            if (fromBalance < amount) {
                println("Insufficient funds")
                return
            } else {
                writeToFile(fromBalance - amount, from)
                writeToFile(toBalance + amount, to)
            }
        } catch (e: Exception) {
            println("Error transferring: $e")
        }
    }

    fun createAccount(filename: String) {
        try {
            val file = java.io.File(filename)
            file.createNewFile()
        } catch (e: Exception) {
            println("Error creating account: $e")
        }
    }

    fun deleteAccount(filename: String) {
        try {
            val file = java.io.File(filename)
            file.delete()
        } catch (e: Exception) {
            println("Error deleting account: $e")
        }
    }

    fun accountExists(filename: String): Boolean {
        try {
            val file = java.io.File(filename)
            return file.exists()
        } catch (e: Exception) {
            println("Error checking if account exists: $e")
        }
        return false
    }

}