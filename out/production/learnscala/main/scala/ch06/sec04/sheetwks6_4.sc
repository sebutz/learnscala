// apply method returns an object of the companion class

// ex: Array("aaa", "bbb", "cc")

object sheetwks6_4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

//  private primary constructor
class Account private (val id: Int, initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
}

object Account { // The companion object
  def apply(initialBalance: Double) =
    new Account(newUniqueNumber(), initialBalance) // object of the companion class
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber }
}


// now you can construct an account object like
val account = Account(1200.23)                    //> account  : sheetwks6_4.Account = sheetwks6_4$Account$2@2752f6e2
account.description                               //> res0: String = Account 1 with balance 1200.23

}