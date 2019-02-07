package ch08.sec01

class Person {
  var name = ""
}

class Employee extends Person {
  var salary = 0.0
  def description = s"An employee with name  $name and salary $salary"

  override def toString: String = description
}

object Main extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred.description)
  println(fred)
}

