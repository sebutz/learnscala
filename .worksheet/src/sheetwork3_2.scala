object sheetwork3_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet")
  
  //VARIABLE SIZE ARRAYS : ARRAYBUFFER
  
  // in Java you have ArrayList
  import scala.collection.mutable.ArrayBuffer;$skip(155); 
  
  val b = ArrayBuffer[Int]();System.out.println("""b  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(b ));$skip(69); 
  val b2 = new ArrayBuffer[Int];System.out.println("""b2  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(b2 ));$skip(38); val res$0 =  // if you use new the () is optional
  
  // adding an element
  b +=  100;System.out.println("""res0: sheetwork3_2.b.type = """ + $show(res$0));$skip(14); val res$1 = 
  b(0);System.out.println("""res1: Int = """ + $show(res$1));$skip(47); val res$2 =  // 100
  
  // adding many elements
  b += (12,3, 43);System.out.println("""res2: sheetwork3_2.b.type = """ + $show(res$2));$skip(4); val res$3 = 
  b;System.out.println("""res3: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$3));$skip(64); val res$4 = 
  // adding an array to an array buffer
  b ++=Array(8, 123, 4);System.out.println("""res4: sheetwork3_2.b.type = """ + $show(res$4));$skip(9); val res$5 = 
  b.last;System.out.println("""res5: Int = """ + $show(res$5));$skip(24); 
  
  println("endlich")}
  
  
}
