object sheetwork3_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(117); 
  
  
  //FIXED-LENGTH ARRAYS: ARRAY
  
  
  // an array of int with fixed length 12
  val nums = new Array[Int](12);System.out.println("""nums  : Array[Int] = """ + $show(nums ));$skip(103); 
  
  // problem: this array is initilized with
  // null strings
  val strings = new Array[String](10);System.out.println("""strings  : Array[String] = """ + $show(strings ));$skip(57); 
  //false by default
  val bools = new Array[Boolean](5);System.out.println("""bools  : Array[Boolean] = """ + $show(bools ));$skip(55); val res$0 = 
  
  // accessing an element from the array
  bools(0);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(54); 
  
  // giving value to the people
   bools(1) = true;$skip(39); 
   // weird printing
   println(bools);$skip(9); val res$1 = 
   bools;System.out.println("""res1: Array[Boolean] = """ + $show(res$1));$skip(303); 
  
  // inside JVM a Scala array is implemented as as Java array
  
  // you can directly initialize without having the number of array elements
  // let the compiler calculate
  
  var more_strings = Array("as", "asdasd", "dasdsad");System.out.println("""more_strings  : Array[String] = """ + $show(more_strings ));$skip(24);  // don't use the constructor in this case, more like a static method
  
  println("Endlich")}
  
}
