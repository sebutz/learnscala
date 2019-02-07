object sheetwks4_3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  
  // updating map values only on mutable maps
   val scores = Map("Alice" -> 10, "Bob" -> 20, "Mary" -> -30)
                                                  //> scores  : scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob 
                                                  //| -> 20, Mary -> -30)
   val scores_mutable = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 23, "Jim" -> 100)
                                                  //> scores_mutable  : scala.collection.mutable.Map[String,Int] = Map(Jim -> 100,
                                                  //|  Bob -> 23, Alice -> 10)
  
   
   //updating Bob score on immutable map is impossible
   //scores("Bob") = 25  // value update is not a member....
   // the only thing you can do is to produce another immutable map
   //  that contains the updates
   
   val new_scores_immutable = scores + ("Lynda" -> 77)
                                                  //> new_scores_immutable  : scala.collection.immutable.Map[String,Int] = Map(Ali
                                                  //| ce -> 10, Bob -> 20, Mary -> -30, Lynda -> 77)
  //scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob -> 2
   new_scores_immutable                           //> res0: scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob -> 2
                                                  //| 0, Mary -> -30, Lynda -> 77)
   
   // this is working also for updates
   val new_scores_immutable2 = scores + ("Bob" -> 666)
                                                  //> new_scores_immutable2  : scala.collection.immutable.Map[String,Int] = Map(Al
                                                  //| ice -> 10, Bob -> 666, Mary -> -30)
   // removing into new immutable map
   // you need only the key
   val new_scores_immutable3 = scores - ("Mary")  //> new_scores_immutable3  : scala.collection.immutable.Map[String,Int] = Map(Al
                                                  //| ice -> 10, Bob -> 20)
   
   // PRODUCING NEW IMMUTABLE MAPS IS NOT INNEFICIENT
   // AS THEY ARE SHARING THE SAME STRUCTURE!!!
   
   
   
   
   scores_mutable("Bob") = 25
   println(scores_mutable)                        //> Map(Jim -> 100, Bob -> 25, Alice -> 10)
   
   
   // if we want multiple updates on a mutable map
   // we have to use +=
   scores_mutable += ("Bob" -> 34, "Bibi" -> 22)  //> res1: sheetwks4_3.scores_mutable.type = Map(Jim -> 100, Bob -> 34, Alice ->
                                                  //|  10, Bibi -> 22)
   
   // if the key -> value pair is new then is added altogether
   
    
    // remove an item from a map (a key -> value pair)
    // you need only the key
    scores_mutable -= ("Bibi")                    //> res2: sheetwks4_3.scores_mutable.type = Map(Jim -> 100, Bob -> 34, Alice ->
                                                  //|  10)
    
    // what if the key is not there?
    // nothing happens as this op is fool proof
    scores_mutable -=("Andrew")                   //> res3: sheetwks4_3.scores_mutable.type = Map(Jim -> 100, Bob -> 34, Alice ->
                                                  //|  10)
    
    
    
   println("endlich")                             //> endlich
}