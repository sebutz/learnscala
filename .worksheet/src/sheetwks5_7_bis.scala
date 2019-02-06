import scala.beans.BeanProperty


//eliminate the auxiliary constructors using named parameters in the primary constructor




object sheetwks5_7_bis {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(195); 
  println("Welcome to the Scala worksheet")
  
  
  class Person4(val name: String = "", val age: Int = 0){
  def description = s"$name is $age years old"
  }
  
  class Person5(val name: String= "", val age: Int = 0);$skip(207); 
  
  val person4 = new Person4();System.out.println("""person4  : sheetwks5_7_bis.Person4 = """ + $show(person4 ));$skip(22); val res$0 = 
  person4.description;System.out.println("""res0: String = """ + $show(res$0));$skip(31); 
  
  val person5 = new Person5;System.out.println("""person5  : sheetwks5_7_bis.Person5 = """ + $show(person5 ));$skip(10); val res$1 = 
  person5
  
  // defaults are saving the auxiliary
  class Person6(val name: String = "", val age: Int = 0);System.out.println("""res1: sheetwks5_7_bis.Person5 = """ + $show(res$1));$skip(170);  // property accessable + backed by a field
  val person6 = new Person6;System.out.println("""person6  : sheetwks5_7_bis.Person6 = """ + $show(person6 ));$skip(31); 
  val person66 = new Person6()
 
  
  class Person7(val name: String = "", var age: Int = 0);System.out.println("""person66  : sheetwks5_7_bis.Person6 = """ + $show(person66 ));$skip(108); 
  
  val person7 = new Person7("Andrew", 100);System.out.println("""person7  : sheetwks5_7_bis.Person7 = """ + $show(person7 ));$skip(14); val res$2 = 
  person7.age;System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  person7.name;System.out.println("""res3: String = """ + $show(res$3));$skip(23); 
  
  person7.age = 201;$skip(24); val res$4 = 
  person7.age     //201
  
  // person7.name = "John" read-only
 
  
  // missing the var or val for the parameters?
  // that is object-private-field, or no field if no method is using it
  class Person8(name: String, age: Int = 0);System.out.println("""res4: Int = """ + $show(res$4));$skip(282); 
  // only one parameter have defaults
  val person8 = new Person8("aaa");System.out.println("""person8  : sheetwks5_7_bis.Person8 = """ + $show(person8 ));$skip(41); 
  val person88 = new Person8("aaa", 100)
  //person8.name  name not a member of the class !!!
  // person8.age age is not a member of the class !!!!
  
  // you have to put var or val
  class Person9(@BeanProperty var name: String, val age: Int);System.out.println("""person88  : sheetwks5_7_bis.Person8 = """ + $show(person88 ));$skip(247); 
  val person9 = new Person9("Dully", 100);System.out.println("""person9  : sheetwks5_7_bis.Person9 = """ + $show(person9 ));$skip(14); val res$5 = 
  person9.age;System.out.println("""res5: Int = """ + $show(res$5));$skip(15); val res$6 = 
  person9.name;System.out.println("""res6: String = """ + $show(res$6));$skip(20); val res$7 = 
  person9.getName();System.out.println("""res7: String = """ + $show(res$7));$skip(27); 
  person9.setName("Dilly");$skip(15); val res$8 = 
  person9.name;System.out.println("""res8: String = """ + $show(res$8));$skip(26); 
  person9.name_=("Dolly");$skip(20); val res$9 = 
  person9.getName()
  
  //private fields (class-private fields)
  class Person10(private var name: String, private val age: Int);System.out.println("""res9: String = """ + $show(res$9));$skip(155); 
  val person10 = new Person10("Aliona", 100)
  //person10.name // value name cannot be accessed
  // person10.age  // value age cannot be accessed
  
  
  //make a primary constructor private. Can you do that?
  //Make the user of this class to use only auxliariary constructors...
  class Person11 private(var name: String= "Soldier", var age: Int= 24, val id: Int = 12323 ) {
     def this(name: String, age: Int)  {
       this() // primary constructor has to be the first called
       this.name = name
       this.age = age
     }
  };System.out.println("""person10  : sheetwks5_7_bis.Person10 = """ + $show(person10 ));$skip(578); 
  
  val person11 = new Person11("John Doe", 129);System.out.println("""person11  : sheetwks5_7_bis.Person11 = """ + $show(person11 ));$skip(24);  //constructor cannot be accessed
  
  println("Endlich")}
}
