object sheetwork2_12 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  import scala.math._
  def root(x: Double)= {
   if (x >= 0) sqrt(x)
   else throw new IllegalArgumentException("""x should not be
       negative """)
  }                                               //> root: (x: Double)Double
  
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
  }                                               //> Weird!
  

  
  try{
   println(root(4))
   root(-4)
  } catch{
    case e: Exception => println(e.getMessage)
  }                                               //> 2.0
                                                  //| x should not be
                                                  //|        negative 
                                                  //| res0: AnyVal = ()
 
 
 //throw new Throwable
 println("Endlich")                               //> Endlich
  
}