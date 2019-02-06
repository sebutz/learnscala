object sheetwks4_8 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(141); 
  
  //ZIPPING
  // How can you produce tuples?
  // once you got tuples it's easy to process together
  
val symbols = Array("<", "-", ">");System.out.println("""symbols  : Array[String] = """ + $show(symbols ));$skip(29); 
val counts = Array(2, 10, 2);System.out.println("""counts  : Array[Int] = """ + $show(counts ));$skip(32); 
val pairs = symbols.zip(counts);System.out.println("""pairs  : Array[(String, Int)] = """ + $show(pairs ));$skip(67); 

//processing pairs together
for((s, n )<- pairs)
 println(s * n );$skip(145); val res$0 = 


//scala.collection.immutable.Map[String,Int] = Map(< -> 2, - -> 10, > ->...
// scenario: turning a collection of pairs into a map
 pairs.toMap;System.out.println("""res0: scala.collection.immutable.Map[String,Int] = """ + $show(res$0))}
  
  
  
}
