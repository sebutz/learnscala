object sheetworks3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //The types of Scala
  // Byte, Char, Short, Int, Long, Float, Double
  // Boolean
  
  // unlike Java these are classes (class types)
  // no distinction between primitive types and class types
  
  // invoke methods on numbers
  println(1.toString())                           //> 1
  
  // or a range
  
  1.to(10)                                        //> res0: scala.collection.immutable.Range.Inclusive = Range 1 to 10
  
  // underlying is String java
  // in Scala we are in fact using StringOps
  // augmented String with 100 ops
  "Hello".intersect("elle")                       //> res1: String = ell
      
  "Hello".getClass.getCanonicalName               //> res2: String = java.lang.String
  
  
  
  
}