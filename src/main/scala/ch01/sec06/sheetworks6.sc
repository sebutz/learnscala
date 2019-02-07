object sheetworks6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // in Scala, it is common to use syntax like a method call
  
  
  val s = "Hello"                                 //> s  : String = Hello
  s(4)                                            //> res0: Char = o
  // think like an overloaded form of the () operator
  
  // how this is implemented? as a method named
  //apply
  /**
    def apply(n: Int): Char
  */
  
  s.apply(4)                                      //> res1: Char = o
  
  //why not use []? because of the function notation
  // Using the apply method of a companion object is a common Scala idiom
  // for constructing objects
}