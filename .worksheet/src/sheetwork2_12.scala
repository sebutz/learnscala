import java.net.MalformedURLException
import java.net.URL
import java.io.IOException
import javax.swing.ImageIcon
import javax.swing.JOptionPane
import javax.imageio.ImageIO
import java.io._

object sheetwork2_12 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(258); 
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
  };$skip(157); val res$0 = 
  

//catching is modeled after the pattern matching
  
  try{
   println(root(4))
   root(-4)
  } catch{
    case e: Exception => println(e.getMessage)
  };System.out.println("""res0: AnyVal = """ + $show(res$0));$skip(138); 
 
 
   def process(u: URL){
    val img = ImageIO.read(u)
    JOptionPane.showMessageDialog(null, null, null, 0, new ImageIcon(img))
   };System.out.println("""process: (u: java.net.URL)Unit""");$skip(252); 
 

   try {
     process(new URL("http://horstmann.com/cay-tiny.gif"))
     process(new URL("http://horstmann.com/fred.gif"))
   } catch {
     case _: MalformedURLException => println("Bad URL: ")
     case ex: IOException => ex.printStackTrace()
  };$skip(191); 
 

//// -- Change to input stream

def processo(in: InputStream) {
  var bytes = -1; var next = 0
  while (next != -1) {
    next = in.read()
    bytes += 1
  }
  println(bytes + " bytes")
};System.out.println("""processo: (in: java.io.InputStream)Unit""");$skip(68); 

var in = new URL("http://horstmann.com/cay-tiny.gif").openStream();System.out.println("""in  : java.io.InputStream = """ + $show(in ));$skip(48); 
try {
  processo(in)
} finally {
  in.close()
};$skip(135); 

//// try/catch/finally is no good--what if close throws an exception?

in = new URL("http://horstmann.com/cay-tiny.gif").openStream();$skip(130); 
try {
  processo(in)
} catch {
  case ex: IOException => println(ex)
} finally {
  in.close()  // might throw also an exception
};$skip(212); 

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
}

//
import scala.util._
import scala.io._;$skip(231); 

// this is not for worksheet
//val result =
//  for (a <- Try { StdIn.readLine("a: ").toInt };
//      b <- Try { StdIn.readLine("b: ").toInt })
//      yield a / b



 println("Endlich")}
  
}
