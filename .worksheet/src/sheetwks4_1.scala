object sheetwks4_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(100); 
  
  //MAPS AND TUPLES : construction
  val scores = Map("Alice" -> 10, "Bob" -> 20, "Mary" -> -30);System.out.println("""scores  : scala.collection.immutable.Map[String,Int] = """ + $show(scores ));$skip(81); 
  // another way to define a map
  val scoress = Map(("Alice", 10), ("Bob", 23));System.out.println("""scoress  : scala.collection.immutable.Map[String,Int] = """ + $show(scoress ));$skip(169); 
  
  
  // immutable map
  // whose contents cannot be changed
  
  
  
  // MUTABLE MAP
  val scores_mutable = scala.collection.mutable.Map("Alice" -> 10, "Nob" -> 23);System.out.println("""scores_mutable  : scala.collection.mutable.Map[String,Int] = """ + $show(scores_mutable ));$skip(163); 
        
        
  // start with a blank map
             // you need to suply the types
             
  val  blank = scala.collection.mutable.Map[String, Int]();System.out.println("""blank  : scala.collection.mutable.Map[String,Int] = """ + $show(blank ));$skip(44); 
            
            println("Endlich")}
}
