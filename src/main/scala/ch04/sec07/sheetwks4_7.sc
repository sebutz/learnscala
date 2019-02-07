object sheetwks4_7 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  // TUPLES
  
  // maps are collections of (key, value) pairs
  // with the obs. that they respect the types
  
  //scenario: what if we want different types for different pairs
  //scenario: what if we want to return multiple values from a function
  
  // tuples comes to rescue
  
  //scala.Tuple3
  val t = (1.2, "Freddie", true)                  //> t  : (Double, String, Boolean) = (1.2,Freddie,true)
  //scala.Tuple4
  val x = (2, "2323", false, 2.3)                 //> x  : (Int, String, Boolean, Double) = (2,2323,false,2.3)
  println(x.getClass.getCanonicalName)            //> scala.Tuple4
   
  // how can we access the components of a tuple
  //special syntax
  
  println(x._1, x._2, x._3, x._4)                 //> (2,2323,false,2.3)
  
  //COMPONENTS OF THE TUPLES START WITH 1 !!!!!
 
  // same as x._2
  x _2                                            //> res0: String = 2323
  
  // tuple assignments: tuples should have the same number of components
  val (first, second, third ) = t                 //> first  : Double = 1.2
                                                  //| second  : String = Freddie
                                                  //| third  : Boolean = true
  
  
  // when you need the first 2 components of a tuple
  val (aa, bb, _) = t                             //> aa  : Double = 1.2
                                                  //| bb  : String = Freddie
  
  
  
  // returning tuples
  //(String, String) = (NY,ew ork)
  "New York".partition(_.isUpper)                 //> res1: (String, String) = (NY,ew ork)
  
  
  
}