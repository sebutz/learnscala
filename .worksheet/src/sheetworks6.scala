object sheetworks6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(88); 
  
  // in Scala, it is common to use syntax like a method call
  
  
  val s = "Hello";System.out.println("""s  : String = """ + $show(s ));$skip(7); val res$0 = 
  s(4);System.out.println("""res0: Char = """ + $show(res$0));$skip(170); val res$1 = 
  // think like an overloaded form of the () operator
  
  // how this is implemented? as a method named
  //apply
  /**
    def apply(n: Int): Char
  */
  
  s.apply(4);System.out.println("""res1: Char = """ + $show(res$1))}
  
  //why not use []? because of the function notation
  // Using the apply method of a companion object is a common Scala idiom
  // for constructing objects
}
