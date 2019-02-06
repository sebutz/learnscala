class Persona{
  var age = 0
}

// getter and setter are private
class Pers{
 private var age = 0
}

// only getter is generated!!!
class PersonGoGetter{
  val age = 21
}

// you can redefine yourself getter and setter
class PersonaVIP{

  private var privateAge = 0
  def age = privateAge // Javish style
  def age_=(newValue: Int) {
     if(newValue > privateAge) privateAge = newValue
  }
}


object sheetwks5_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(460); 
  println("Welcome to the Scala worksheet");$skip(39); 
  
  var person: Persona = new Persona;System.out.println("""person  : Persona = """ + $show(person ));$skip(43); val res$0 = 
  person.age;System.out.println("""res0: Int = """ + $show(res$0));$skip(32);        // getter the same name
  person.age_=(21);$skip(13); val res$1 =  // setter _=
  person.age;System.out.println("""res1: Int = """ + $show(res$1));$skip(18); 
  person.age = 23;$skip(20); val res$2 = 
  person.age;System.out.println("""res2: Int = """ + $show(res$2));$skip(27);    //23
  
  var pers = new Pers();System.out.println("""pers  : Pers = """ + $show(pers ));$skip(96); 
  // pers.age not accessable
  // pers.age_=(21) not accessable
  
  
  var vip =new PersonaVIP;System.out.println("""vip  : PersonaVIP = """ + $show(vip ));$skip(30); val res$3 = 
  // vip.privateAge
  vip.age;System.out.println("""res3: Int = """ + $show(res$3));$skip(16); 
  vip.age_=(21);$skip(10); val res$4 = 
  vip.age;System.out.println("""res4: Int = """ + $show(res$4));$skip(44); 
  
  // setter logic works!
  vip.age_=(20);$skip(10); val res$5 = 
  vip.age;System.out.println("""res5: Int = """ + $show(res$5));$skip(15); 
  vip.age = 40;$skip(10); val res$6 = 
  vip.age;System.out.println("""res6: Int = """ + $show(res$6));$skip(123); 
  
  // nice feature (setter works) // Uniform Access Principle
  // age is implemented by field or method?
  vip.age = 22;$skip(10); val res$7 = 
  vip.age;System.out.println("""res7: Int = """ + $show(res$7))}
  
  
  
  
}
