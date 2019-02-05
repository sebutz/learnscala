object sheetwork3_8 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(175); 
  //Interoperating with Java
  //Scala arrays are implemented as Java array
  // you can pass them back and forward
  
  
 val a = Array("Mary", "a", "had", "lamb", "little");System.out.println("""a  : Array[String] = """ + $show(a ));$skip(221); val res$0 = 
 // java.util.Arrays.binarySearch(a, "beef") // Does not work
 
//Scala will not convert an Array[String] into an Array[Object]
//you have to force it

java.util.Arrays.binarySearch(a.asInstanceOf[Array[Object]], "beef")

/*
 public static int binarySearch(Object[] a, Object key) {
        return binarySearch0(a, 0, a.length, key);
    }

*/




// use scala.collection.JavaConversions
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.mutable.ArrayBuffer;System.out.println("""res0: Int = """ + $show(res$0));$skip(322); 

val command = ArrayBuffer("ls", "-al", "/home/user");System.out.println("""command  : scala.collection.mutable.ArrayBuffer[String] = """ + $show(command ));$skip(54); 
val pb = new ProcessBuilder(command);System.out.println("""pb  : ProcessBuilder = """ + $show(pb ));$skip(24);  // Scala to Java



  println("endlich")}
  
}
