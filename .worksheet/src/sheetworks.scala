object sheetworks {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(27); 
  
 val answer = 8 * 5 + 2;System.out.println("""answer  : Int = """ + $show(answer ));$skip(15); val res$0 = 

 0.5 * answer;System.out.println("""res0: Double = """ + $show(res$0));$skip(54); 

 //define the also type
 val greeting: String = null;System.out.println("""greeting  : String = """ + $show(greeting ));$skip(40); val res$1 = 

 answer = 0 // This will give an error;System.out.println("""res1: <error> = """ + $show(res$1))}
//
//var counter = 0
//counter = 1 // Ok, can change a var
//
//var i, j = 0
//var greeting2, message: String = null
  
  
  
  
}
