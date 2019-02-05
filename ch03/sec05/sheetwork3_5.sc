object sheetwork3_5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import scala.collection.mutable.ArrayBuffer
  // Common Algorithms
  
  // works only on numeric types
  Array(2 ,3, 4, -2).sum                          //> res0: Int = 7
  
  val cc = ArrayBuffer("Mary", "had", "a", "little", "lamb")
                                                  //> cc  : scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, had, 
                                                  //| a, little, lamb)
  cc.min    // ???                                //> res1: String = Mary
  cc.max                                          //> res2: String = little
  
  
  //sorted : returns a sorted new array
  val dd = cc.sorted                              //> dd  : scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Mary, a, ha
                                                  //| d, lamb, little)
                                                  
                                                
  // supply a comparison function
  val ee = Array(2, 4, 22, -23)                   //> ee  : Array[Int] = Array(2, 4, 22, -23)
  val ee_descending = ee.sortWith(_ > _)          //> ee_descending  : Array[Int] = Array(22, 4, 2, -23)
  val ee_ascending = ee.sortWith(_ < _)           //> ee_ascending  : Array[Int] = Array(-23, 2, 4, 22)
  
  // YOU CAN SORT IN PLACE AN ARRAY BUT NOT AN ARRAYBUFFER
  val ff = Array(2, 3, -3, 4, -8)                 //> ff  : Array[Int] = Array(2, 3, -3, 4, -8)
  scala.util.Sorting.quickSort(ff)
  ff                                              //> res3: Array[Int] = Array(-8, -3, 2, 3, 4)
  
  //DISPLAY THE CONTENTS OF AN ARRAY
  ff.mkString(" and " )                           //> res4: String = -8 and -3 and 2 and 3 and 4
  ff.toBuffer.mkString(" buff ")                  //> res5: String = -8 buff -3 buff 2 buff 3 buff 4
  
  // useless toString
  ff.toString                                     //> res6: String = [I@6615435c
  ff.mkString                                     //> res7: String = -8-3234
  
  println("Endlich")                              //> Endlich
  
  
  
}