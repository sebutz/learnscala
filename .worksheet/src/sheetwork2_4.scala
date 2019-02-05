object sheetwork2_4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(28); 
  
  var name = "Victorina";System.out.println("""name  : String = """ + $show(name ));$skip(34); 
 println(f"supermodel is: $name");$skip(27); 
  
  val tax = 32323.43333;System.out.println("""tax  : Double = """ + $show(tax ));$skip(31); 
  
  println(f"Hello, $name!");$skip(67); 
  print(f"In six months, you have to pay ${tax + 0.213}%6.2f  %n");$skip(115); 
  
  //“With a prefix of s, strings can contain expressions but not format directives. ”
 println(s"Hello, $name");$skip(87); 
  
  // to include $ in an interpolated string, double it
  println(s"Hello, $$$name")}
  

  
}
