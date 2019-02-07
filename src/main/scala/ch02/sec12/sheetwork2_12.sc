import java.net.MalformedURLException
import java.net.URL
import java.io.IOException
import javax.swing.ImageIcon
import javax.swing.JOptionPane
import javax.imageio.ImageIO
import java.io._

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
  

//catching is modeled after the pattern matching
  
  try{
   println(root(4))
   root(-4)
  } catch{
    case e: Exception => println(e.getMessage)
  }                                               //> 2.0
                                                  //| x should not be
                                                  //|        negative 
                                                  //| res0: AnyVal = ()
 
 
   def process(u: URL){
    val img = ImageIO.read(u)
    JOptionPane.showMessageDialog(null, null, null, 0, new ImageIcon(img))
   }                                              //> process: (u: java.net.URL)Unit
 

   try {
     process(new URL("http://horstmann.com/cay-tiny.gif"))
     process(new URL("http://horstmann.com/fred.gif"))
   } catch {
     case _: MalformedURLException => println("Bad URL: ")
     case ex: IOException => ex.printStackTrace()
  }                                               //> javax.imageio.IIOException: Can't get input stream from URL!
                                                  //| 	at java.desktop/javax.imageio.ImageIO.read(ImageIO.java:1407)
                                                  //| 	at sheetwork2_12$.process$1(sheetwork2_12.scala:63)
                                                  //| 	at sheetwork2_12$.$anonfun$main$1(sheetwork2_12.scala:70)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at sheetwork2_12$.main(sheetwork2_12.scala:9)
                                                  //| 	at sheetwork2_12.main(sheetwork2_12.scala)
                                                  //| Caused by: java.io.FileNotFoundException: http://horstmann.com/fred.gif
                                                  //| 	at java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream0
                                                  //| (HttpURLConnection.java:1909)
                                                  //| 	at java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream(
                                                  //| HttpURLConnection.java:1509)
 

//// -- Change to input stream

def processo(in: InputStream) {
  var bytes = -1; var next = 0
  while (next != -1) {
    next = in.read()
    bytes += 1
  }
  println(bytes + " bytes")
}                                                 //> processo: (in: java.io.InputStream)Unit

var in = new URL("http://horstmann.com/cay-tiny.gif").openStream()
                                                  //> in  : java.io.InputStream = sun.net.www.protocol.http.HttpURLConnection$Htt
                                                  //| pInputStream@6e6f2380
try {
  processo(in)
} finally {
  in.close()
}                                                 //> 5526 bytes

//// try/catch/finally is no good--what if close throws an exception?

in = new URL("http://horstmann.com/cay-tiny.gif").openStream()
try {
  processo(in)
} catch {
  case ex: IOException => println(ex)
} finally {
  in.close()  // might throw also an exception
}                                                 //> 5526 bytes

//// This is what you want

try {
  in = new URL("http://horstmann.com/cay-tiny.gif").openStream()
  try {
    processo(in)
  } finally {
    in.close()
      }
} catch {
  case ex: IOException => println(ex)
}                                                 //> 5526 bytes

//
import scala.util._
import scala.io._

// this is not for worksheet
//val result =
//  for (a <- Try { StdIn.readLine("a: ").toInt };
//      b <- Try { StdIn.readLine("b: ").toInt })
//      yield a / b



 println("Endlich")                               //> Endlich\
  
}