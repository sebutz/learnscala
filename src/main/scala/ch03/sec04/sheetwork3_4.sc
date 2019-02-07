object sheetwork3_4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  // Transforming Arrays
  // in Scala you can go further from traversing
  // you can transform: you can yield
  
  //iMPORTANT: the original collection is not affected
  
  
  var aa = Array(3, 4, 5, 7, 8)                   //> aa  : Array[Int] = Array(3, 4, 5, 7, 8)
  
  for (elem <- aa) yield elem * 2                 //> res0: Array[Int] = Array(6, 8, 10, 14, 16)
  // creates a collection
  // the type is the same as the original collection ?
  // not really: take a look at the following exanple
  
  val bb = Array("aa", "bbb", "\\")               //> bb  : Array[String] = Array(aa, bbb, \)
  for (elem <- bb) yield elem.length()            //> res1: Array[Int] = Array(2, 3, 1)
  // OH, it's about data structure type aka an array
  //the same collection type
  //ArrayBuffer yield ArrayBuffer
  //Array yield Array
  
  // how can you skip some elements
  
  // evens not odds
  for (elem <- aa if elem % 2 == 0) yield elem    //> res2: Array[Int] = Array(4, 8)
  
  // basically we are filtering
  
  aa.filter(_ % 2 == 0).map(2* _)                 //> res3: Array[Int] = Array(8, 16)
  aa.filter { _ % 2 == 0}                         //> res4: Array[Int] = Array(4, 8)
  
  
  //remove all the negative elements from an arraybuffer
  
  val cc = Array(- 3, -12, 4, -5, -10, 12, 34).toBuffer
                                                  //> cc  : scala.collection.mutable.Buffer[Int] = ArrayBuffer(-3, -12, 4, -5, -10
                                                  //| , 12, 34)
  
  // that will yield a new collection
  for(elem <- cc if elem >=0) yield elem          //> res5: scala.collection.mutable.Buffer[Int] = ArrayBuffer(4, 12, 34)
  
  
  //suppose we want to remove the original array buffer
  // cc is val
  cc.indices                                      //> res6: scala.collection.immutable.Range = Range 0 until 7
  val positionsToRemove = for (i <- cc.indices if cc(i) < 0) yield i
                                                  //> positionsToRemove  : scala.collection.immutable.IndexedSeq[Int] = Vector(0,
                                                  //|  1, 3, 4)
  
  println(positionsToRemove)                      //> Vector(0, 1, 3, 4)
  println(positionsToRemove.reverse)              //> Vector(4, 3, 1, 0)
  for(i <- positionsToRemove.reverse) cc.remove(i)
  
  

    
  
  println("endlich")                              //> endlich
  
}