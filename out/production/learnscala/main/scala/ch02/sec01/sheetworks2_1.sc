object sheetworks2_1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //Java: 3 + 4 expression(has a value), if is a  statement (do an action/ no value )
  // Scala: almost all constructs have values
  
  var x  = 12                                     //> x  : Int = 12
  if (x > 0) 2 else -1                            //> res0: Int = 2
  
  
  x = -4
  var res = if (x > 0) 2 else -1                  //> res  : Int = -1

  // in Scala:
  // if is an expression, has value
  
  //here there is a twist
  
  x = 0
  val res_final = if (x > 0) 2 else -1            //> res_final  : Int = -1
  print(res_final)                                //> -1
  
  //is equivalent with
  var s = 0                                       //> s  : Int = 0
  if (x> 0) s = 2 else s = -1
  
  //kind of old school, and the s needs to be var
  val y = if (x> 0) s = 2 else s = -1             //> y  : Unit = ()
  
  // it's simplierto use val
  
// Scala combines ?: from Java and if/else
  
  // there is no ternary operator in Scala
  // var z = x > 0 ? 1 : 0
  
  
  //let's talk about the types of the if
  
  
  var z = if (x>0) "Aloha" else 2.0               //> z  : Any = 2.0
  
  
  // there is another shorter variant without else
  
  // it is possible that an if yields no value
  // in fact there is sign denoting (), a placeholder for "no useful value"
  // the type scala.runtime.BoxedUnit
  z = if(x> 0) 1
  println(z)                                      //> ()
  println(z.getClass.getCanonicalName)            //> scala.runtime.BoxedUnit
  //equivalent with
   z = if (x > 0) 1 else ()
   println(z)                                     //> ()
  
  x  = 23
  z = if(x> 0) 1
  println(z)                                      //> 1
  println(z.getClass.getCanonicalName)            //> java.lang.Integer
  
  x = -3
  z = if (x > 0) 1 else ()
  println(z)                                      //> ()
  println(z.getClass.getCanonicalName)            //> scala.runtime.BoxedUnit
  
}