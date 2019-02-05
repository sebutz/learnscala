object sheetwork2_3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(16); 
  
val x0 = 1.0;System.out.println("""x0  : Double = """ + $show(x0 ));$skip(13); 
val y0 = 1.0;System.out.println("""y0  : Double = """ + $show(y0 ));$skip(12); 
var x = 4.0;System.out.println("""x  : Double = """ + $show(x ));$skip(12); 
var y = 5.0;System.out.println("""y  : Double = """ + $show(y ));$skip(253); 
 
//the value of a block of code is
// the value of the last expression
// pay attention not to use an assignment
// as the last line ()
val distance = {
       val dx = x - x0;
       val dy = y - y0;
       scala.math.sqrt(dx * dx + dy * dy)
       };System.out.println("""distance  : Double = """ + $show(distance ));$skip(41); 
       
println(f"distance:${distance}");$skip(34); 
          
         
var t, u = 0;System.out.println("""t  : Int = """ + $show(t ));System.out.println("""u  : Int = """ + $show(u ));$skip(19); 
println(f"t=${t}");$skip(19); 
println(f"u=${u}");$skip(22); 

// ()
println(u = 1);$skip(70); 

// once you got the type, you cannot change the type

var m: Int = 0;System.out.println("""m  : Int = """ + $show(m ));$skip(51); 
// m = "abc" will give "type mismatch"

var ss = 0;System.out.println("""ss  : Int = """ + $show(ss ));$skip(16); 
var tt = ss = 1;System.out.println("""tt  : Unit = """ + $show(tt ))}
// tt is (), because it's the same as tt = (ss = 1)

}
