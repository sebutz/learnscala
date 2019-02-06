// COMPANION OBJECT

// in Java a class can contain both static and instance methods
// in Scala you can think as static methods to belong to the companion object
// can access each other features

// LIMITATION: they have to be located in the same source file
object sheetworks6_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(327); 
  println("Welcome to the Scala worksheet")


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
};$skip(483); 

val acct1 = new Account;System.out.println("""acct1  : sheetworks6_2.Account = """ + $show(acct1 ));$skip(24); 
val acct2 = new Account;System.out.println("""acct2  : sheetworks6_2.Account = """ + $show(acct2 ));$skip(20); 
acct1.deposit(1000);$skip(27); 
val d1 = acct1.description;System.out.println("""d1  : String = """ + $show(d1 ));$skip(27); 
val d2 = acct2.description;System.out.println("""d2  : String = """ + $show(d2 ));$skip(21); 
  println("Endlich")}
}
