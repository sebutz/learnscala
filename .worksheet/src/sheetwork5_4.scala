//Object-private fields
// for a class private field, Scala generates getter and setter methods
// for an object-private field, no getters and setters are generated at all

// as in Java a method can access all the private fields
class Counter5_4{
 // finer grain in Scala
  private[this] var noAccessField = 0
  // accessing someObject.value is not possible anymore!!!
  
  private val readOnlyField ="abc"
  private var value = 0
  def increment(){value += 1}
  def isLess(other: Counter5_4) = {
    value < other.value
  // access of other.value is legal because
  // other is also a Counter5_4 object as in Java !!! //check TestApp.java
  // other.noAccessField NOT POSSIBLE
  // other.readOnlyField = "bbb" //reassignment to val
   
   def isMore(other: Counter5_4) = readOnlyField > other.readOnlyField
 }
}

object sheetwork5_4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(880); 
  println("Welcome to the Scala worksheet")}
}
