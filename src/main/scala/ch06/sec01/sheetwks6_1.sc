object sheetwks6_1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //OBJECT CONSTRUCT
  // when you need a class with a single instance
  // or some kind of a home for values and functions
  
  // a class can have a companion object
  
  // objects can extend classes or traits
  // the apply method of an object is usually used
  // for constructing new intances of the companion class
  
  // to avoid main method,
  //use an object that extends the App trait
  
  // you can implement enumerations by extending the
  // Enumeration object
  
  
  // Scala has no static methods or fields. You use
  // the object construct
  // single instance of a class with the features
  // that you want
  
  object Accounts{
  println("Ho-ho-ho")
    private var lastNumber = 0
    def newUniqueNumber() = {
          lastNumber += 1
          lastNumber
    }
  }
  
  
  // you need a new unique account number
  //Accounts.newUniqueNumber()
  //Accounts.newUniqueNumber()
  
  // it looks like the constructor was called
  // an object can have  all the features of a class
  //with ONE BIG EXCEPTION:
  //YOU CANNOT PROVIDE CONSTRUCTOR PARAMETERS
  //cannot write for example
  // object Account(val s: String) ...
  
  
  
  
}