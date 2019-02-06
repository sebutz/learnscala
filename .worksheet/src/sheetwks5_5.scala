import scala.beans.BeanProperty
// BEAN PROPERTIES

// the Scala generated names for getter and setter are not really
// what Java tools expect
// we can control this behavior and generates also the goold old methods
// with the right names : setXXX() and getXXX() or getXXX

// Obs: the Scala setter and getter are also generated !!!
// so for a public field are generated 4 methods

class FakePersona{
    @BeanProperty
    var name: String = ""
}


object sheetwks5_5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(516); 
  println("Welcome to the Scala worksheet");$skip(32); 
  val freddie = new FakePersona;System.out.println("""freddie  : FakePersona = """ + $show(freddie ));$skip(27); 
  freddie.setName("Fredo");$skip(20); val res$0 = 
  freddie.getName();System.out.println("""res0: String = """ + $show(res$0));$skip(26); val res$1 = 
  // or
  freddie.getName;System.out.println("""res1: String = """ + $show(res$1));$skip(60); val res$2 = 
  
  // the Scala methods are still working!
  freddie.name;System.out.println("""res2: String = """ + $show(res$2));$skip(27); 
  freddie.name_=("Albert");$skip(15); val res$3 = 
  freddie.name;System.out.println("""res3: String = """ + $show(res$3))}
  
}
