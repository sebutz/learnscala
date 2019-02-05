object sheetwork3_2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //VARIABLE SIZE ARRAYS : ARRAYBUFFER
  
  // in Java you have ArrayList
  import scala.collection.mutable.ArrayBuffer
  
  val b = ArrayBuffer[Int]()                      //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  val b2 = new ArrayBuffer[Int] // if you use new the () is optional
                                                  //> b2  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  
  // adding an element
  b +=  100                                       //> res0: sheetwork3_2.b.type = ArrayBuffer(100)
  b(0) // 100                                     //> res1: Int = 100
  
  // adding many elements
  b += (12,3, 43)                                 //> res2: sheetwork3_2.b.type = ArrayBuffer(100, 12, 3, 43)
  b                                               //> res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100, 12, 3, 43
                                                  //| )
  // adding an array to an array buffer
  b ++=Array(8, 123, 4)                           //> res4: sheetwork3_2.b.type = ArrayBuffer(100, 12, 3, 43, 8, 123, 4)
  b.last                                          //> res5: Int = 4
  
  
  // this arrray is done for optimal ops
  
  // insert at the position, sequence
  b.insert(2, 4, 4, 4, 4)
  b                                               //> res6: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(100, 12, 4, 4,
                                                  //|  4, 4, 3, 43, 8, 123, 4)
  //remove from position
  b.remove(0)                                     //> res7: Int = 100
  b                                               //> res8: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(12, 4, 4, 4, 4
                                                  //| , 3, 43, 8, 123, 4)
  
  //remove from how many elements
  b.remove(2, 4)
  b                                               //> res9: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(12, 4, 43, 8, 
                                                  //| 123, 4)
  
  println("endlich")                              //> endlich
  


 // Array to ArrayBuffer
 val aa = Array("aaa", "bbb", "ccc")              //> aa  : Array[String] = Array(aaa, bbb, ccc)
 
 val bb = aa.toBuffer                             //> bb  : scala.collection.mutable.Buffer[String] = ArrayBuffer(aaa, bbb, ccc)
 bb                                               //> res10: scala.collection.mutable.Buffer[String] = ArrayBuffer(aaa, bbb, ccc)
 
 //ArrayBuffer to Array
 val cc = bb.toArray                              //> cc  : Array[String] = Array(aaa, bbb, ccc)
 cc                                               //> res11: Array[String] = Array(aaa, bbb, ccc)
  
  
  
}