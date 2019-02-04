object sheetworks2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(65); 
  
  
 // declaring values and variables
 val answer = 8 * 5 + 2;System.out.println("""answer  : Int = """ + $show(answer ));$skip(46); val res$0 = 

//answer is actually a constant
0.5 * answer;System.out.println("""res0: Double = """ + $show(res$0));$skip(71); 

// you can specify the type if necesssary
val greeting: String = null;System.out.println("""greeting  : String = """ + $show(greeting ));$skip(122); 
 
 // answer = 0 // This will give an error : reassignment to val
// variable with content that can vary
 var counter = 0;System.out.println("""counter  : Int = """ + $show(counter ));$skip(37); 
 counter = 1;$skip(71);  // Ok, can change a var
 
 
 // can declare multiple values or variables together
var i, j = 0;System.out.println("""i  : Int = """ + $show(i ));System.out.println("""j  : Int = """ + $show(j ));$skip(39); 
var greeting2, message: String = "abc";System.out.println("""greeting2  : String = """ + $show(greeting2 ));System.out.println("""message  : String = """ + $show(message ));$skip(20); 

def f[T](v: T) = v;System.out.println("""f: [T](v: T)T""");$skip(22); 
println(f(greeting2));$skip(28); 
println(greeting2.getClass)}

}
