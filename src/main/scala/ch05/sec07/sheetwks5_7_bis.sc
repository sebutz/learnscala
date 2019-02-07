import scala.beans.BeanProperty


//eliminate the auxiliary constructors using named parameters in the primary constructor




object sheetwks5_7_bis {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  class Person4(val name: String = "", val age: Int = 0){
  def description = s"$name is $age years old"
  }
  
  class Person5(val name: String= "", val age: Int = 0)
  
  val person4 = new Person4()                     //> person4  : sheetwks5_7_bis.Person4 = sheetwks5_7_bis$Person4$2@41ee392b
  person4.description                             //> res0: String = " is 0 years old"
  
  val person5 = new Person5                       //> person5  : sheetwks5_7_bis.Person5 = sheetwks5_7_bis$Person5$2@214b199c
  person5                                         //> res1: sheetwks5_7_bis.Person5 = sheetwks5_7_bis$Person5$2@214b199c
  
  // defaults are saving the auxiliary
  class Person6(val name: String = "", val age: Int = 0) // property accessable + backed by a field
  val person6 = new Person6                       //> person6  : sheetwks5_7_bis.Person6 = sheetwks5_7_bis$Person6$2@55ca8de8
  val person66 = new Person6()                    //> person66  : sheetwks5_7_bis.Person6 = sheetwks5_7_bis$Person6$2@2c34f934
 
  
  class Person7(val name: String = "", var age: Int = 0)
  
  val person7 = new Person7("Andrew", 100)        //> person7  : sheetwks5_7_bis.Person7 = sheetwks5_7_bis$Person7$2@240237d2
  person7.age                                     //> res2: Int = 100
  person7.name                                    //> res3: String = Andrew
  
  person7.age = 201
  person7.age     //201                           //> res4: Int = 201
  
  // person7.name = "John" read-only
 
  
  // missing the var or val for the parameters?
  // that is object-private-field, or no field if no method is using it
  class Person8(name: String, age: Int = 0)
  // only one parameter have defaults
  val person8 = new Person8("aaa")                //> person8  : sheetwks5_7_bis.Person8 = sheetwks5_7_bis$Person8$2@212bf671
  val person88 = new Person8("aaa", 100)          //> person88  : sheetwks5_7_bis.Person8 = sheetwks5_7_bis$Person8$2@14a2f921
  //person8.name  name not a member of the class !!!
  // person8.age age is not a member of the class !!!!
  
  // you have to put var or val
  class Person9(@BeanProperty var name: String, val age: Int)
  val person9 = new Person9("Dully", 100)         //> person9  : sheetwks5_7_bis.Person9 = sheetwks5_7_bis$Person9$1@2aece37d
  person9.age                                     //> res5: Int = 100
  person9.name                                    //> res6: String = Dully
  person9.getName()                               //> res7: String = Dully
  person9.setName("Dilly")
  person9.name                                    //> res8: String = Dilly
  person9.name_=("Dolly")
  person9.getName()                               //> res9: String = Dolly
  
  //private fields (class-private fields)
  class Person10(private var name: String, private val age: Int)
  val person10 = new Person10("Aliona", 100)      //> person10  : sheetwks5_7_bis.Person10 = sheetwks5_7_bis$Person10$1@5762806e
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
  }
  
  val person11 = new Person11("John Doe", 129) //constructor cannot be accessed
                                                  //> person11  : sheetwks5_7_bis.Person11 = sheetwks5_7_bis$Person11$2@5ef60048
  
  println("Endlich")                              //> Endlich
}