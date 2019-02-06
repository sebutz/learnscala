object sheetwks4_3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(118); 
  
  
  
  // updating map values only on mutable maps
   val scores = Map("Alice" -> 10, "Bob" -> 20, "Mary" -> -30);System.out.println("""scores  : scala.collection.immutable.Map[String,Int] = """ + $show(scores ));$skip(95); 
   val scores_mutable = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 23, "Jim" -> 100);System.out.println("""scores_mutable  : scala.collection.mutable.Map[String,Int] = """ + $show(scores_mutable ));$skip(283); 
  
   
   //updating Bob score on immutable map is impossible
   //scores("Bob") = 25  // value update is not a member....
   // the only thing you can do is to produce another immutable map
   //  that contains the updates
   
   val new_scores_immutable = scores + ("Lynda" -> 77);System.out.println("""new_scores_immutable  : scala.collection.immutable.Map[String,Int] = """ + $show(new_scores_immutable ));$skip(99); val res$0 = 
  //scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob -> 2
   new_scores_immutable;System.out.println("""res0: scala.collection.immutable.Map[String,Int] = """ + $show(res$0));$skip(98); 
   
   // this is working also for updates
   val new_scores_immutable2 = scores + ("Bob" -> 666);System.out.println("""new_scores_immutable2  : scala.collection.immutable.Map[String,Int] = """ + $show(new_scores_immutable2 ));$skip(115); 
   // removing into new immutable map
   // you need only the key
   val new_scores_immutable3 = scores - ("Mary");System.out.println("""new_scores_immutable3  : scala.collection.immutable.Map[String,Int] = """ + $show(new_scores_immutable3 ));$skip(152); 
   
   // PRODUCING NEW IMMUTABLE MAPS IS NOT INNEFICIENT
   // AS THEY ARE SHARING THE SAME STRUCTURE!!!
   
   
   
   
   scores_mutable("Bob") = 25;$skip(27); 
   println(scores_mutable);$skip(132); val res$1 = 
   
   
   // if we want multiple updates on a mutable map
   // we have to use +=
   scores_mutable += ("Bob" -> 34, "Bibi" -> 22);System.out.println("""res1: sheetwks4_3.scores_mutable.type = """ + $show(res$1));$skip(191); val res$2 = 
   
   // if the key -> value pair is new then is added altogether
   
    
    // remove an item from a map (a key -> value pair)
    // you need only the key
    scores_mutable -= ("Bibi");System.out.println("""res2: sheetwks4_3.scores_mutable.type = """ + $show(res$2));$skip(122); val res$3 = 
    
    // what if the key is not there?
    // nothing happens as this op is fool proof
    scores_mutable -=("Andrew");System.out.println("""res3: sheetwks4_3.scores_mutable.type = """ + $show(res$3));$skip(37); 
    
    
    
   println("endlich")}
}
