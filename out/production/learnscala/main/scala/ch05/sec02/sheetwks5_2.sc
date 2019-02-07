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


object sheetwks5_2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var person: Persona = new Persona               //> person  : Persona = Persona@8b96fde
  person.age       // getter the same name        //> res0: Int = 0
  person.age_=(21) // setter _=
  person.age                                      //> res1: Int = 21
  person.age = 23
  person.age   //23                               //> res2: Int = 23
  
  var pers = new Pers()                           //> pers  : Pers = Pers@4c40b76e
  // pers.age not accessable
  // pers.age_=(21) not accessable
  
  
  var vip =new PersonaVIP                         //> vip  : PersonaVIP = PersonaVIP@41ee392b
  // vip.privateAge
  vip.age                                         //> res3: Int = 0
  vip.age_=(21)
  vip.age                                         //> res4: Int = 21
  
  // setter logic works!
  vip.age_=(20)
  vip.age                                         //> res5: Int = 21
  vip.age = 40
  vip.age                                         //> res6: Int = 40
  
  // nice feature (setter works) // Uniform Access Principle
  // age is implemented by field or method?
  vip.age = 22
  vip.age                                         //> res7: Int = 40
  
  
  
  
}