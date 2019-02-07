//ASSIGNMENTS HAVE NO VALUE ()

object sheetworks2_2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // multiple instructions on the same line
  // need to use ;
  var n = 10                                      //> n  : Int = 10
  var r = 1                                       //> r  : Int = 1
  // the result is ()
  val z = if (n > 0) { r = r * n; n -= 1 }        //> z  : Unit = ()
  
 // when we have an else:
  val tt = if (n > 0){
   r = r * n
   n -= 1
  } else 3                                        //> tt  : AnyVal = ()
  
  println(tt)                                     //> ()
  
  //THE VALUE OF A BLOCK IS THE VALUE OF THE LAST EXPRESSION
  // you can see here that the result of
  // the block of code is 4
  val x  = { r= 3; 4}                             //> x  : Int = 4
  println(x)                                      //> 4

  val w = if (n > 0) {r = 3; 4}                   //> w  : AnyVal = 4
  
  // the value of y is ()
  var y = n -=1                                   //> y  : Unit = ()
  
  // the result of the assignment is ()
  y = n = 2
  println(y)                                      //> ()
  println(n)                                      //> 2
  
  // initialize many vals at once
  val s, s0, v, v0, t0 = 1.0                      //> s  : Double = 1.0
                                                  //| s0  : Double = 1.0
                                                  //| v  : Double = 1.0
                                                  //| v0  : Double = 1.0
                                                  //| t0  : Double = 1.0
  //(1.0,1.0,1.0,1.0,1.0)
  println(s, s0, v, v0, t0)                       //> (1.0,1.0,1.0,1.0,1.0)
  
  var s1,s2, v1, v2, t = 1.0                      //> s1  : Double = 1.0
                                                  //| s2  : Double = 1.0
                                                  //| v1  : Double = 1.0
                                                  //| v2  : Double = 1.0
                                                  //| t  : Double = 1.0
   // we have to initialize them, otherwise will be compilation error
   s1 = s2 + (v1-v2) * t +
    0.5 * (v1 + v2) * t * t
   println(s1)                                    //> 2.0
   
   var s3,s4, v3, v4, t1 = ()                     //> s3  : Unit = ()
                                                  //| s4  : Unit = ()
                                                  //| v3  : Unit = ()
                                                  //| v4  : Unit = ()
                                                  //| t1  : Unit = ()
   println(s3)                                    //> ()
   
   
}