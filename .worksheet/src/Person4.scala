
//eliminate the auxiliary constructors using named parameters in the primary constructor
class Person4(val name: String = "", val age: Int = 0){
  def description = s"$name is $age years old"
}



object sheetwks5_7_bis {
  println("Welcome to the Scala worksheet")
  
    val person4 = new Person4()
  person4.description
  
  
}
