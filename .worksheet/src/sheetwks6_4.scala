// apply method returns an object of the companion class

// ex: Array("aaa", "bbb", "cc")

object sheetwks6_4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(156); 
  println("Welcome to the Scala worksheet")

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
};$skip(595); 


// now you can construct an account object like
val account = Account(1200.23);System.out.println("""account  : sheetwks6_4.Account = """ + $show(account ));$skip(20); val res$0 = 
account.description;System.out.println("""res0: String = """ + $show(res$0))}

}
