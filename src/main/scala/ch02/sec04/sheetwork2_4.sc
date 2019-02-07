object sheetwork2_4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var name = "Victorina"                          //> name  : String = Victorina
 println(f"supermodel is: $name")                 //> supermodel is: Victorina
  
  val tax = 32323.43333                           //> tax  : Double = 32323.43333
  
  println(f"Hello, $name!")                       //> Hello, Victorina!
  print(f"In six months, you have to pay ${tax + 0.213}%6.2f  %n")
                                                  //> In six months, you have to pay 32323.65  
  
  //“With a prefix of s, strings can contain expressions but not format directives. ”
 println(s"Hello, $name")                         //> Hello, Victorina
  
  // to include $ in an interpolated string, double it
  println(s"Hello, $$$name")                      //> Hello, $Victorina
  

  
}