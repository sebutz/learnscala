object sheetwork3_8 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //Interoperating with Java
  //Scala arrays are implemented as Java array
  // you can pass them back and forward
  
  
 val a = Array("Mary", "a", "had", "lamb", "little")
                                                  //> a  : Array[String] = Array(Mary, a, had, lamb, little)
 // java.util.Arrays.binarySearch(a, "beef") // Does not work
 
//Scala will not convert an Array[String] into an Array[Object]
//you have to force it

java.util.Arrays.binarySearch(a.asInstanceOf[Array[Object]], "beef")
                                                  //> res0: Int = -3

/*
 public static int binarySearch(Object[] a, Object key) {
        return binarySearch0(a, 0, a.length, key);
    }

*/




// use scala.collection.JavaConversions
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.mutable.ArrayBuffer

val command = ArrayBuffer("ls", "-al", "/home/user")
                                                  //> command  : scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(ls, -a
                                                  //| l, /home/user)
val pb = new ProcessBuilder(command) // Scala to Java
                                                  //> pb  : ProcessBuilder = java.lang.ProcessBuilder@60addb54



  println("endlich")                              //> endlich
  
}