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
  b.last;System.out.println("""res5: Int = """ + $show(res$5));$skip(114); 
  
  
  // this arrray is done for optimal ops
  
  // insert at the position, sequence
  b.insert(2, 4, 4, 4, 4);$skip(4); val res$6 = 
  b;System.out.println("""res6: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$6));$skip(39); val res$7 = 
  //remove from position
  b.remove(0);System.out.println("""res7: Int = """ + $show(res$7));$skip(4); val res$8 = 
  b;System.out.println("""res8: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$8));$skip(54); 
  
  //remove from how many elements
  b.remove(2, 4);$skip(4); val res$9 = 
  b;System.out.println("""res9: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$9));$skip(24); 
  
  println("endlich");$skip(67); 
  


 // Array to ArrayBuffer
 val aa = Array("aaa", "bbb", "ccc");System.out.println("""aa  : Array[String] = """ + $show(aa ));$skip(24); 
 
 val bb = aa.toBuffer;System.out.println("""bb  : scala.collection.mutable.Buffer[String] = """ + $show(bb ));$skip(4); val res$10 = 
 bb;System.out.println("""res10: scala.collection.mutable.Buffer[String] = """ + $show(res$10));$skip(47); 
 
 //ArrayBuffer to Array
 val cc = bb.toArray;System.out.println("""cc  : Array[String] = """ + $show(cc ));$skip(4); val res$11 = 
 cc;System.out.println("""res11: Array[String] = """ + $show(res$11))}
  
  
  
}
