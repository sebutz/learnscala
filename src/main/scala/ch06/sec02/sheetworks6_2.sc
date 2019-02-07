// COMPANION OBJECT

// in Java a class can contain both static and instance methods
// in Scala you can think as static methods to belong to the companion object
// can access each other features

// LIMITATION: they have to be located in the same source file
object sheetworks6_2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet


 class Account {
  val id = Account.newUniqueNumber() // the companion object features are not in the scope
  // you have to use Account.  and not just newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
}

object Account { // The companion object
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber }
}

val acct1 = new Account                           //> acct1  : sheetworks6_2.Account = sheetworks6_2$Account$2@e580929
val acct2 = new Account                           //> acct2  : sheetworks6_2.Account = sheetworks6_2$Account$2@1cd072a9
acct1.deposit(1000)
val d1 = acct1.description                        //> d1  : String = Account 1 with balance 1000.0
val d2 = acct2.description                        //> d2  : String = Account 2 with balance 0.0
  println("Endlich")                              //> Endlich
}