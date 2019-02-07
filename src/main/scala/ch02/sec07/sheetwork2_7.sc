object sheetwork2_7 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // a method operates on object, function not
  // in Java you imitate with static functions
  def abs(x: Double) = if(x >= 0) x else -x       //> abs: (x: Double)Double
  
  // Mandatory: you must specify the types of all parameters
  // you have to specify the return type only when the function is recursive
  
  // the body has more than 1 expression use a block
  
  // the last expression from the block determines the return value
  
  def fac(n: Int): Int = {
   var result = 1
   for(i <- 1 to n) result = result * i
   result
  }                                               //> fac: (n: Int)Int
  
  fac(10)                                         //> res0: Int = 3628800
  
  //playing recursive
  // convention 0! = 1
  def facrec(n: Int): Int = {
    if (n <= 0) 1 else n * facrec(n -1)
  }                                               //> facrec: (n: Int)Int
  fac(10)                                         //> res1: Int = 3628800
  
}