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


object sheetwks5_5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val freddie = new FakePersona                   //> freddie  : FakePersona = FakePersona@8b96fde
  freddie.setName("Fredo")
  freddie.getName()                               //> res0: String = Fredo
  // or
  freddie.getName                                 //> res1: String = Fredo
  
  // the Scala methods are still working!
  freddie.name                                    //> res2: String = Fredo
  freddie.name_=("Albert")
  freddie.name                                    //> res3: String = Albert
  
}