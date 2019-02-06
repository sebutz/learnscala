object sheetwks4_7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(335); 
  // TUPLES
  
  // maps are collections of (key, value) pairs
  // with the obs. that they respect the types
  
  //scenario: what if we want different types for different pairs
  //scenario: what if we want to return multiple values from a function
  
  // tuples comes to rescue
  
  //scala.Tuple3
  val t = (1.2, "Freddie", true);System.out.println("""t  : (Double, String, Boolean) = """ + $show(t ));$skip(51); 
  //scala.Tuple4
  val x = (2, "2323", false, 2.3);System.out.println("""x  : (Int, String, Boolean, Double) = """ + $show(x ));$skip(39); 
  println(x.getClass.getCanonicalName);$skip(109); 
   
  // how can we access the components of a tuple
  //special syntax
  
  println(x._1, x._2, x._3, x._4);$skip(78); val res$0 = 
  
  //COMPONENTS OF THE TUPLES START WITH 1 !!!!!
 
  // same as x._2
  x _2;System.out.println("""res0: String = """ + $show(res$0));$skip(110); 
  
  // tuple assignments: tuples should have the same number of components
  val (first, second, third ) = t;System.out.println("""first  : Double = """ + $show(first ));System.out.println("""second  : String = """ + $show(second ));System.out.println("""third  : Boolean = """ + $show(third ));$skip(81); 
  
  
  // when you need the first 2 components of a tuple
  val (aa, bb, _) = t;System.out.println("""aa  : Double = """ + $show(aa ));System.out.println("""bb  : String = """ + $show(bb ));$skip(100); val res$1 = 
  
  
  
  // returning tuples
  //(String, String) = (NY,ew ork)
  "New York".partition(_.isUpper);System.out.println("""res1: (String, String) = """ + $show(res$1))}
  
  
  
}
