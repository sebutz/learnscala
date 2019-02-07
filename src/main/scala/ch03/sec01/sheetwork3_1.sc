object sheetwork3_1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  //FIXED-LENGTH ARRAYS: ARRAY
  
  
  // an array of int with fixed length 12
  val nums = new Array[Int](12)                   //> nums  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  
  // problem: this array is initilized with
  // null strings
  val strings = new Array[String](10)             //> strings  : Array[String] = Array(null, null, null, null, null, null, null, n
                                                  //| ull, null, null)
  //false by default
  val bools = new Array[Boolean](5)               //> bools  : Array[Boolean] = Array(false, false, false, false, false)
  
  // accessing an element from the array
  bools(0)                                        //> res0: Boolean = false
  
  // giving value to the people
   bools(1) = true
   // weird printing
   println(bools)                                 //> [Z@3c87521
   bools                                          //> res1: Array[Boolean] = Array(false, true, false, false, false)
  
  // inside JVM a Scala array is implemented as as Java array
  
  // you can directly initialize without having the number of array elements
  // let the compiler calculate
  
  var more_strings = Array("as", "asdasd", "dasdsad") // don't use the constructor in this case, more like a static method
                                                  //> more_strings  : Array[String] = Array(as, asdasd, dasdsad)
  
  println("Endlich")                              //> Endlich
  
}