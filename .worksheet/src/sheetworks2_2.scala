//ASSIGNMENTS HAVE NO VALUE ()

object sheetworks2_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(98); 
  println("Welcome to the Scala worksheet");$skip(79); 
  
  // multiple instructions on the same line
  // need to use ;
  var n = 10;System.out.println("""n  : Int = """ + $show(n ));$skip(12); 
  var r = 1;System.out.println("""r  : Int = """ + $show(r ));$skip(65); 
  // the result is ()
  val z = if (n > 0) { r = r * n; n -= 1 };System.out.println("""z  : Unit = """ + $show(z ));$skip(86); 
  
 // when we have an else:
  val tt = if (n > 0){
   r = r * n
   n -= 1
  } else 3;System.out.println("""tt  : AnyVal = """ + $show(tt ));$skip(17); 
  
  println(tt);$skip(155); 
  
  //THE VALUE OF A BLOCK IS THE VALUE OF THE LAST EXPRESSION
  // you can see here that the result of
  // the block of code is 4
  val x  = { r= 3; 4};System.out.println("""x  : Int = """ + $show(x ));$skip(13); 
  println(x);$skip(33); 

  val w = if (n > 0) {r = 3; 4};System.out.println("""w  : AnyVal = """ + $show(w ));$skip(45); 
  
  // the value of y is ()
  var y = n -=1;System.out.println("""y  : Unit = """ + $show(y ));$skip(55); 
  
  // the result of the assignment is ()
  y = n = 2;$skip(13); 
  println(y);$skip(13); 
  println(n);$skip(66); 
  
  // initialize many vals at once
  val s, s0, v, v0, t0 = 1.0;System.out.println("""s  : Double = """ + $show(s ));System.out.println("""s0  : Double = """ + $show(s0 ));System.out.println("""v  : Double = """ + $show(v ));System.out.println("""v0  : Double = """ + $show(v0 ));System.out.println("""t0  : Double = """ + $show(t0 ));$skip(54); 
  //(1.0,1.0,1.0,1.0,1.0)
  println(s, s0, v, v0, t0);$skip(32); 
  
  var s1,s2, v1, v2, t = 1.0;System.out.println("""s1  : Double = """ + $show(s1 ));System.out.println("""s2  : Double = """ + $show(s2 ));System.out.println("""v1  : Double = """ + $show(v1 ));System.out.println("""v2  : Double = """ + $show(v2 ));System.out.println("""t  : Double = """ + $show(t ));$skip(125); 
   // we have to initialize them, otherwise will be compilation error
   s1 = s2 + (v1-v2) * t +
    0.5 * (v1 + v2) * t * t;$skip(15); 
   println(s1);$skip(34); 
   
   var s3,s4, v3, v4, t1 = ();System.out.println("""s3  : Unit = """ + $show(s3 ));System.out.println("""s4  : Unit = """ + $show(s4 ));System.out.println("""v3  : Unit = """ + $show(v3 ));System.out.println("""v4  : Unit = """ + $show(v4 ));System.out.println("""t1  : Unit = """ + $show(t1 ));$skip(15); 
   println(s3)}
   
   
}
