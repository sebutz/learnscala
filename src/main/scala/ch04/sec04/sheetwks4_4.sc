object sheetwks4_4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //Iterating over Maps
  
  val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
                                                  //> scores  : scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob 
                                                  //| -> 3, Cindy -> 8)
  // the concept of (key, value) pair turn into action
  for((k,v ) <- scores)
    println((k, v))                               //> (Alice,10)
                                                  //| (Bob,3)
                                                  //| (Cindy,8)
  
  
  // you can have the usual crap:
  
  scores.keySet                                   //> res0: scala.collection.immutable.Set[String] = Set(Alice, Bob, Cindy)
  scores.values                                   //> res1: Iterable[Int] = MapLike.DefaultValuesIterable(10, 3, 8)
  
  for(k <- scores.keySet)
    println(scores(k))                            //> 10
                                                  //| 3
                                                  //| 8
 // interesting get: Some(10) Some(3) Some(8)
 for(k <- scores.keySet)
    println(scores.get(k))                        //> Some(10)
                                                  //| Some(3)
                                                  //| Some(8)
  
  for (v <- scores.values)
     println(v)                                   //> 10
                                                  //| 3
                                                  //| 8
   
  
}