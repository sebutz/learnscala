object sheetworks3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(258); 
  
  //The types of Scala
  // Byte, Char, Short, Int, Long, Float, Double
  // Boolean
  
  // unlike Java these are classes (class types)
  // no distinction between primitive types and class types
  
  // invoke methods on numbers
  println(1.toString());$skip(33); val res$0 = 
  
  // or a range
  
  1.to(10);System.out.println("""res0: scala.collection.immutable.Range.Inclusive = """ + $show(res$0));$skip(142); val res$1 = 
  
  // underlying is String java
  // in Scala we are in fact using StringOps
  // augmented String with 100 ops
  "Hello".intersect("elle");System.out.println("""res1: String = """ + $show(res$1));$skip(43); val res$2 = 
      
  "Hello".getClass.getCanonicalName;System.out.println("""res2: String = """ + $show(res$2))}
  
  
  
  
}
