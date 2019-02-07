object sheetwork2_11 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //LAZY VALUES
  //defer the initialization of a variable until is accessed for the first time
  
  
 import javax.swing.JOptionPane._

println("Defining firstName")                     //> Defining firstName
val firstName = showInputDialog("Your First Name")//> firstName  : String = aaa
println("Printing once")                          //> Printing once
println(firstName)                                //> aaa
println("Printing twice")                         //> Printing twice
println(firstName)                                //> aaa
  
 println("Defining lastName")                     //> Defining lastName
val lastName = showInputDialog("Your Last Name")  //> lastName  : String = bbb
println("Printing once")                          //> Printing once
println(lastName)                                 //> bbb
println("Printing twice")                         //> Printing twice
println(lastName)                                 //> bbb-
 
  
}