object sheetwks4_4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(87); 
  //Iterating over Maps
  
  val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8);System.out.println("""scores  : scala.collection.immutable.Map[String,Int] = """ + $show(scores ));$skip(99); 
  // the concept of (key, value) pair turn into action
  for((k,v ) <- scores)
    println((k, v));$skip(59); val res$0 = 
  
  
  // you can have the usual crap:
  
  scores.keySet;System.out.println("""res0: scala.collection.immutable.Set[String] = """ + $show(res$0));$skip(16); val res$1 = 
  scores.values;System.out.println("""res1: Iterable[Int] = """ + $show(res$1));$skip(52); 
  
  for(k <- scores.keySet)
    println(scores(k));$skip(98); 
 // interesting get: Some(10) Some(3) Some(8)
 for(k <- scores.keySet)
    println(scores.get(k));$skip(46); 
  
  for (v <- scores.values)
     println(v)}
   
  
}
