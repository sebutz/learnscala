// PRIMARY CONSTRUCTOR
// every class has a primary constructor
// parameters of the primary constructor are placed
// immediately after the class name

// turn into fields that are initialized
// the primary constructor executes all the statements in the class definition

//no parameters after the class name : primary constructor with no parameters
// executes all the statements in the body class


class Person3(val name: String, val age: Int){
  println("Just constructed the object") // part of primary constructor
  def description = s"$name is $age years old"
}


import java.util.Properties
import java.io.FileReader

class MyProg {
  private val props = new Properties
  props.load(new FileReader("myprog.properties"))
    // The statement above is a part of the primary constructor
}

object sheetwks5_7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(861); 
  println("Welcome to the Scala worksheet");$skip(44); 
  
  val person3 = new Person3("Adam", 100);System.out.println("""person3  : Person3 = """ + $show(person3 ));$skip(22); val res$0 = 
  person3.description;System.out.println("""res0: String = """ + $show(res$0));$skip(25); 
  

  println("Endlich")}
}
