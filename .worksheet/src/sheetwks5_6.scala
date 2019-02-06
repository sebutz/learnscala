//AUXILIARY CONSTRUCTORS
// many constructors as in Java
// there is one constructor more important than the others
// called PRIMARY CONSTRUCTOR

// YOU CAN HAVE any number of AUXILARY METHODS(similar with Java constructors)

class Perso{
 private var name = ""
 private var age = 0
 
 //add some auxiliary constructors
 def this(name: String){
   this() // called primary constructor :
   //A class where you don't define a primary constructor
   // has a primary constructor with no arguments(more like the default constructor in Java)
   this.name = name
  }
  
  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
  
  def description: String = "name:" + this.name + " age:" + this.age
}



object sheetwks5_6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(782); 
  println("Welcome to the Scala worksheet");$skip(87); 
  
  // construct objects of this class
  //primary constructor
  val p1 = new Perso();System.out.println("""p1  : Perso = """ + $show(p1 ));$skip(29); 
  val p2 = new Perso("Fred");System.out.println("""p2  : Perso = """ + $show(p2 ));$skip(33); 
  val p3 = new Perso("Fred", 23);System.out.println("""p3  : Perso = """ + $show(p3 ));$skip(17); val res$0 = 
  p1.description;System.out.println("""res0: String = """ + $show(res$0));$skip(24); 
  
  println("Endlich")}
  
}
