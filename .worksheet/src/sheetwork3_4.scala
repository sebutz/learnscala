object sheetwork3_4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(208); 
  // Transforming Arrays
  // in Scala you can go further from traversing
  // you can transform: you can yield
  
  //iMPORTANT: the original collection is not affected
  
  
  var aa = Array(3, 4, 5, 7, 8);System.out.println("""aa  : Array[Int] = """ + $show(aa ));$skip(37); val res$0 = 
  
  for (elem <- aa) yield elem * 2;System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(174); 
  // creates a collection
  // the type is the same as the original collection ?
  // not really: take a look at the following exanple
  
  val bb = Array("aa", "bbb", "\\");System.out.println("""bb  : Array[String] = """ + $show(bb ));$skip(39); val res$1 = 
  for (elem <- bb) yield elem.length();System.out.println("""res1: Array[Int] = """ + $show(res$1));$skip(247); val res$2 = 
  // OH, it's about data structure type aka an array
  //the same collection type
  //ArrayBuffer yield ArrayBuffer
  //Array yield Array
  
  // how can you skip some elements
  
  // evens not odds
  for (elem <- aa if elem % 2 == 0) yield elem;System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(72); val res$3 = 
  
  // basically we are filtering
  
  aa.filter(_ % 2 == 0).map(2* _);System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(26); val res$4 = 
  aa.filter { _ % 2 == 0};System.out.println("""res4: Array[Int] = """ + $show(res$4));$skip(122); 
  
  
  //remove all the negative elements from an arraybuffer
  
  val cc = Array(- 3, -12, 4, -5, -10, 12, 34).toBuffer;System.out.println("""cc  : scala.collection.mutable.Buffer[Int] = """ + $show(cc ));$skip(82); val res$5 = 
  
  // that will yield a new collection
  for(elem <- cc if elem >=0) yield elem;System.out.println("""res5: scala.collection.mutable.Buffer[Int] = """ + $show(res$5));$skip(90); val res$6 = 
  
  
  //suppose we want to remove the original array buffer
  // cc is val
  cc.indices;System.out.println("""res6: scala.collection.immutable.Range = """ + $show(res$6));$skip(69); 
  val positionsToRemove = for (i <- cc.indices if cc(i) < 0) yield i;System.out.println("""positionsToRemove  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(positionsToRemove ));$skip(32); 
  
  println(positionsToRemove);$skip(37); 
  println(positionsToRemove.reverse);$skip(51); 
  for(i <- positionsToRemove.reverse) cc.remove(i);$skip(36); 
  
  

    
  
  println("endlich")}
  
}
