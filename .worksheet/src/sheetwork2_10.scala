object sheetwork2_10 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(177); 
  
  
  //PROCEDURES = FUNCTION WITH NO RETURN VALUE
  
  // return no value () aka Unit
  // you can ommit the  =  before the curlies
  def box(s: String) {
    println(s)
  };System.out.println("""box: (s: String)Unit""");$skip(101); 
  
  
  // more explicit way
  // same shit
  def box_explicit(s:String): Unit = {
   println(s)
  };System.out.println("""box_explicit: (s: String)Unit""")}
  
  
}
