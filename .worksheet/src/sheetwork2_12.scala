object sheetwork2_12 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet")
  
  import scala.math._;$skip(160); 
  def root(x: Double)= {
   if (x >= 0) sqrt(x)
   else throw new IllegalArgumentException("""x should not be
       negative """)
  };System.out.println("""root: (x: Double)Double""");$skip(1044); 
  
  //if branch has return type Double
  //else branch has return type Nothing
  
  // the return type of if/else branch is in this case , the not throwing branch
  // aka Double
  
  
  // when code throws an exception  the current compoutation is aborted
  //the runtime system is loooking for an exception handler that can accept IllegalArgumentException
  // control resumes with the innermost such handler
  // if no such handler exists, program terminates
  
  // as in Java, the object you throw have to be Throwable (duh!)
  // unlike Java, Scala has no checked exceptions (you don't have to declare
  //that a function or a method might thrown an exception)
  
  
  // what is with these "cheched"? They are checked by the compiler at (duh!) compile time.
  // draw back: weird signatures
  // positive: programmers think about it
  
  
  try{
  
  var x = throw new IllegalCallerException("Weird!")
  // never gets after
  println(x)
  println(x.getClass.getCanonicalName)
  } catch{
  case e: Exception => println(e.getMessage)
  };$skip(108); val res$0 = 
  

  
  try{
   println(root(4))
   root(-4)
  } catch{
    case e: Exception => println(e.getMessage)
  };System.out.println("""res0: AnyVal = """ + $show(res$0));$skip(47); 
 
 
 //throw new Throwable
 println("Endlich")}
  
}
