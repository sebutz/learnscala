class Person {
  var age = 0  // this is public field
}

//Scala generates a class for the JVM with
// private int age field
// and also getter and setter method 
// these method are public because we did not
// declare in Scala class age as private

// in Scala,
// getter is called age
// setter is called age_=




/*

$ javap -private Person
Compiled from "Person.scala"
public class Person implements scala.ScalaObject {
  private int age;
  public int age();
  public void age_$eq(int);
  public Person();
}

*/
