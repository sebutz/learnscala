object sheetwork2_3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
val x0 = 1.0                                      //> x0  : Double = 1.0
val y0 = 1.0                                      //> y0  : Double = 1.0
var x = 4.0                                       //> x  : Double = 4.0
var y = 5.0                                       //> y  : Double = 5.0
 
//the value of a block of code is
// the value of the last expression
// pay attention not to use an assignment
// as the last line ()
val distance = {
       val dx = x - x0;
       val dy = y - y0;
       scala.math.sqrt(dx * dx + dy * dy)
       }                                          //> distance  : Double = 5.0
       
println(f"distance:${distance}")                  //> distance:5.0
          
         
var t, u = 0                                      //> t  : Int = 0
                                                  //| u  : Int = 0
println(f"t=${t}")                                //> t=0
println(f"u=${u}")                                //> u=0

// ()
println(u = 1)                                    //> ()

// once you got the type, you cannot change the type

var m: Int = 0                                    //> m  : Int = 0
// m = "abc" will give "type mismatch"

var ss = 0                                        //> ss  : Int = 0
var tt = ss = 1                                   //> tt  : Unit = ()
// tt is (), because it's the same as tt = (ss = 1)

}