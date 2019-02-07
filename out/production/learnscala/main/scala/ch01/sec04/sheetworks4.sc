object sheetworks4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // you can omit . for binary method
  "Hello".intersect("elle")                       //> res0: String = ell
  "Hello" intersect "elle"                        //> res1: String = ell
   
   // you can omit () for no arguments
   "Hello".toUpperCase()                          //> res2: String = HELLO
   "Hello".toUpperCase                            //> res3: String = HELLO
  
  
  // operators are methods
  val x = 3 + 4                                   //> x  : Int = 7
  println(x)                                      //> 7
  3.+(4)                                          //> res4: Int(7) = 7
  
  // in general
  //a.method(b)  is the same as
  // a method b
  
  1.to(10)                                        //> res5: scala.collection.immutable.Range.Inclusive = Range 1 to 10
  1 to 10                                         //> res6: scala.collection.immutable.Range.Inclusive = Range 1 to 10
  
  
  //Scala don't have ++, --
  //instead as in Python, use +=, -+ etc
  
  var counter = 1                                 //> counter  : Int = 1
  counter += 1
  println(s"counter = ${counter}")                //> counter = 2
  
  
  
  
  //use operators with BigInt, BigDecimal
  // instead of methods (bi.multiply(bi).multiply(bi))
  val bi: BigInt = 23123123                       //> bi  : BigInt = 23123123
  println(bi.getClass.getCanonicalName)           //> scala.math.BigInt
  
  // scala.math.BigInt
  var y =  bi * bi * bi                           //> y  : scala.math.BigInt = 12363444057301086461867
    
}