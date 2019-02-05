object sheetwork3_5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet")
  import scala.collection.mutable.ArrayBuffer;$skip(130); val res$0 = 
  // Common Algorithms
  
  // works only on numeric types
  Array(2 ,3, 4, -2).sum;System.out.println("""res0: Int = """ + $show(res$0));$skip(64); 
  
  val cc = ArrayBuffer("Mary", "had", "a", "little", "lamb");System.out.println("""cc  : scala.collection.mutable.ArrayBuffer[String] = """ + $show(cc ));$skip(19); val res$1 = 
  cc.min;System.out.println("""res1: String = """ + $show(res$1));$skip(9); val res$2 =     // ???
  cc.max;System.out.println("""res2: String = """ + $show(res$2));$skip(67); 
  
  
  //sorted : returns a sorted new array
  val dd = cc.sorted;System.out.println("""dd  : scala.collection.mutable.ArrayBuffer[String] = """ + $show(dd ));$skip(166); 
                                                  
                                                
  // supply a comparison function
  val ee = Array(2, 4, 22, -23);System.out.println("""ee  : Array[Int] = """ + $show(ee ));$skip(41); 
  val ee_descending = ee.sortWith(_ > _);System.out.println("""ee_descending  : Array[Int] = """ + $show(ee_descending ));$skip(40); 
  val ee_ascending = ee.sortWith(_ < _);System.out.println("""ee_ascending  : Array[Int] = """ + $show(ee_ascending ));$skip(96); 
  
  // YOU CAN SORT IN PLACE AN ARRAY BUT NOT AN ARRAYBUFFER
  val ff = Array(2, 3, -3, 4, -8);System.out.println("""ff  : Array[Int] = """ + $show(ff ));$skip(35); 
  scala.util.Sorting.quickSort(ff);$skip(5); val res$3 = 
  ff;System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(64); val res$4 = 
  
  //DISPLAY THE CONTENTS OF AN ARRAY
  ff.mkString(" and " );System.out.println("""res4: String = """ + $show(res$4));$skip(33); val res$5 = 
  ff.toBuffer.mkString(" buff ");System.out.println("""res5: String = """ + $show(res$5));$skip(39); val res$6 = 
  
  // useless toString
  ff.toString;System.out.println("""res6: String = """ + $show(res$6));$skip(14); val res$7 = 
  ff.mkString;System.out.println("""res7: String = """ + $show(res$7));$skip(24); 
  
  println("Endlich")}
  
  
  
}
