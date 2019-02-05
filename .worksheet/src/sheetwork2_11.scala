object sheetwork2_11 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet")
  //LAZY VALUES
  //defer the initialization of a variable until is accessed for the first time
  
  
 import javax.swing.JOptionPane._;$skip(167); 

println("Defining firstName");$skip(51); 
val firstName = showInputDialog("Your First Name");System.out.println("""firstName  : String = """ + $show(firstName ));$skip(25); 
println("Printing once");$skip(19); 
println(firstName);$skip(26); 
println("Printing twice");$skip(19); 
println(firstName);$skip(33); 
  
 println("Defining lastName");$skip(49); 
val lastName = showInputDialog("Your Last Name");System.out.println("""lastName  : String = """ + $show(lastName ));$skip(25); 
println("Printing once");$skip(18); 
println(lastName);$skip(26); 
println("Printing twice");$skip(18); 
println(lastName)}
 
  
}
