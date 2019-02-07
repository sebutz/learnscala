object sheetwks4_8 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //ZIPPING
  // How can you produce tuples?
  // once you got tuples it's easy to process together
  
val symbols = Array("<", "-", ">")                //> symbols  : Array[String] = Array(<, -, >)
val counts = Array(2, 10, 2)                      //> counts  : Array[Int] = Array(2, 10, 2)
val pairs = symbols.zip(counts)                   //> pairs  : Array[(String, Int)] = Array((<,2), (-,10), (>,2))

//processing pairs together
for((s, n )<- pairs)
 println(s * n )                                  //> <<
                                                  //| ----------
                                                  //| >>


//scala.collection.immutable.Map[String,Int] = Map(< -> 2, - -> 10, > ->...
// scenario: turning a collection of pairs into a map
 pairs.toMap                                      //> res0: scala.collection.immutable.Map[String,Int] = Map(< -> 2, - -> 10, > ->
                                                  //|  2)
  
  
  
}