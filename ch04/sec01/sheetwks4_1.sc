object sheetwks4_1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //MAPS AND TUPLES : construction
  val scores = Map("Alice" -> 10, "Bob" -> 20, "Mary" -> -30)
                                                  //> scores  : scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob 
                                                  //| -> 20, Mary -> -30)
  // another way to define a map
  val scoress = Map(("Alice", 10), ("Bob", 23))   //> scoress  : scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob
                                                  //|  -> 23)
  
  
  // immutable map
  // whose contents cannot be changed
  
  
  
  // mutable map
  val scores_mutable = scala.collection.mutable.Map("Alice" -> 10, "Nob" -> 23)
                                                  //> scores_mutable  : scala.collection.mutable.Map[String,Int] = Map(Nob -> 23, 
                                                  //| Alice -> 10)
        
        
  // start with a blank map
             // you need to suply the types
             
  val  blank = scala.collection.mutable.Map[String, Int]()
                                                  //> blank  : scala.collection.mutable.Map[String,Int] = Map()
            
            println("Endlich")                    //> Endlich
}