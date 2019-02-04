object sheetworks5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet")
 
 // that's wildcard
import scala.math._;$skip(174); val res$0 = 


// in Java, these are static methods
// in Scala, such methods are singleton objects
// a package can have package object
sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
pow(2, 4);System.out.println("""res1: Double = """ + $show(res$1));$skip(65); val res$2 = 
//without importing we have to be explicit
scala.math.min(4, Pi);System.out.println("""res2: Double = """ + $show(res$2));$skip(12); 
println(Pi);$skip(18); val res$3 = 

"Hello".distinct;System.out.println("""res3: String = """ + $show(res$3));$skip(142); 

//yield another string
//RULE_OF_THUMB: parameterless method
//that doesn't modify the object
//has no parantheses
val s1 = "Bonjour".sorted;System.out.println("""s1  : String = """ + $show(s1 ));$skip(192); val res$4 = 


// one class has a companion object whose methods
// act just like static methods do  in Java
//BigInt companion object tp the scala.math.BigInt
BigInt.probablePrime(100, scala.util.Random);System.out.println("""res4: scala.math.BigInt = """ + $show(res$4))}

}
