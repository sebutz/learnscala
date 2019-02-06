object sheetwks4_5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(536); 
  
  //Sorted Maps
  // there are 2 possible ways: in place or yield new maps
  
  
  // 2 implementation strategies for maps: hash tables and balanced trees
  
  //hash tables : impredictable order
  
  // by default Scala gives you a map based on hash map implementation strategy
  // the hash code of the keys
  
  // what if you need to visit keys in a SORTED ORDER, predictable order
  // use scala.collection.mutable.SortedMap
 val scores = scala.collection.mutable.SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8);System.out.println("""scores  : scala.collection.mutable.SortedMap[String,Int] = """ + $show(scores ));$skip(193); 
 

  // visit keys in the INSERTION ORDER
  //use LinkedHashMap
  
  val months = scala.collection.mutable.LinkedHashMap("January" -> 1,"February" -> 2, "March" -> 3, "April" -> 4, "May" -> 5);System.out.println("""months  : scala.collection.mutable.LinkedHashMap[String,Int] = """ + $show(months ))}


  
  
}
