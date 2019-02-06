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



object sheetwks5_6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // construct objects of this class
  //primary constructor
  val p1 = new Perso()                            //> p1  : Perso = Perso@8b96fde
  val p2 = new Perso("Fred")                      //> p2  : Perso = Perso@2d2e5f00
  val p3 = new Perso("Fred", 23)                  //> p3  : Perso = Perso@4c40b76e
  p1.description                                  //> res0: String = name: age:0
  
  println("Endlich")                              //> Endlich
  
}