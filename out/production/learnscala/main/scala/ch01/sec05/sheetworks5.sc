object sheetworks5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 
 // that's wildcard
import scala.math._


// in Java, these are static methods
// in Scala, such methods are singleton objects
// a package can have package object
sqrt(2)                                           //> res0: Double = 1.4142135623730951
pow(2, 4)                                         //> res1: Double = 16.0
//without importing we have to be explicit
scala.math.min(4, Pi)                             //> res2: Double = 3.141592653589793
println(Pi)                                       //> 3.141592653589793

"Hello".distinct                                  //> res3: String = Helo

//yield another string
//RULE_OF_THUMB: parameterless method
//that doesn't modify the object
//has no parantheses
val s1 = "Bonjour".sorted                         //> s1  : String = Bjnooru


// one class has a companion object whose methods
// act just like static methods do  in Java
//BigInt companion object tp the scala.math.BigInt
BigInt.probablePrime(100, scala.util.Random)      //> res4: scala.math.BigInt = 900819122611918506579642191177

}