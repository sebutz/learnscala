object sheetwork2_10 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  //PROCEDURES = FUNCTION WITH NO RETURN VALUE
  
  // return no value () aka Unit
  // you can ommit the  =  before the curlies
  def box(s: String) {
    println(s)
  }                                               //> box: (s: String)Unit
  
  
  // more explicit way
  // same shit
  def box_explicit(s:String): Unit = {
   println(s)
  }                                               //> box_explicit: (s: String)Unit
  
  
}