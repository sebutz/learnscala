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
  
  println("endlich")                              //> endlich
  
  
}