fun main() {
    println("Welcome to the bank!")
    while (true) {
        val account = Account()
        print("Do you have an account? (y/n) ")
        val response = readln()
        if (response == "n") {
            print("Enter a filename for your new account: ")
            val filename = readln()
            account.createAccount(filename)
            println("Account created! Your balance is ${account.getBalance(filename)}, Name: $filename")
        }
        print("Enter the filename of your account: ")
        val filename = readln()
        if (!account.accountExists(filename)) {
            println("Account does not exist!")
            continue
        }
        print("Enter your action: (deposit, withdraw, transfer, balance, delete, check) ")
        val action = readln()
        when (action) {
            "deposit" -> {
                print("Enter the amount to deposit: ")
                val amount = readln().toDouble()
                account.deposit(amount, filename)
                println("Action completed! Your balance is ${account.getBalance(filename)}")
            }
            "withdraw" -> {
                print("Enter the amount to withdraw: ")
                val amount = readln().toDouble()
                account.withdraw(amount, filename)
                println("Action completed! Your balance is ${account.getBalance(filename)}")
            }
            "transfer" -> {
                print("Enter the amount to transfer: ")
                val amount = readln().toDouble()
                print("Enter the filename of the account to transfer to:")
                val to = readln()
                account.transfer(amount, filename, to)
                println("Action completed! Your balance is ${account.getBalance(filename)}")
            }
            "balance" -> {
                println("Your balance is ${account.getBalance(filename)}")
            }
            "delete" -> {
                account.deleteAccount(filename)
                println("Action completed!")
            }
            "check" -> {
                print("Enter the filename of the account to check: ")
                val check = readln()
                val accExists = account.accountExists(check)
                if (accExists) {
                    println("Account exists!")
                } else {
                    println("Account does not exist!")
                }
            }
            else -> {
                println("Invalid action")
            }
        }
        print("Do you want to perform another action? (y/n) ")
        val another = readln()
        if (another == "n") {
            break
        }
    }
}