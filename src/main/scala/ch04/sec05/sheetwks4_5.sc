object sheetwks4_5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //Sorted Maps
  // there are 2 possible ways: in place or yield new maps
  
  
  // 2 implementation strategies for maps: hash tables and balanced trees
  
  //hash tables : impredictable order
  
  // by default Scala gives you a map based on hash map implementation strategy
  // the hash code of the keys
  
  // what if you need to visit keys in a SORTED ORDER, predictable order
  // use scala.collection.mutable.SortedMap
 val scores = scala.collection.mutable.SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)
                                                  //> scores  : scala.collection.mutable.SortedMap[String,Int] = TreeMap(Alice -> 
                                                  //| 10, Bob -> 3, Cindy -> 8, Fred -> 7)
 

  // visit keys in the INSERTION ORDER
  //use LinkedHashMap
  
  val months = scala.collection.mutable.LinkedHashMap("January" -> 1,"February" -> 2, "March" -> 3, "April" -> 4, "May" -> 5)
                                                  //> months  : scala.collection.mutable.LinkedHashMap[String,Int] = Map(January -
                                                  //| > 1, February -> 2, March -> 3, April -> 4, May -> 5)


  
  
}