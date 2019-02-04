object sheetworks2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
 // declaring values and variables
 val answer = 8 * 5 + 2                           //> answer  : Int = 42

//answer is actually a constant
0.5 * answer                                      //> res0: Double = 21.0

// you can specify the type if necesssary
val greeting: String = null                       //> greeting  : String = null
 
 // answer = 0 // This will give an error : reassignment to val
// variable with content that can vary
 var counter = 0                                  //> counter  : Int = 0
 counter = 1 // Ok, can change a var
 
 
 // can declare multiple values or variables together
var i, j = 0                                      //> i  : Int = 0
                                                  //| j  : Int = 0
var greeting2, message: String = "abc"            //> greeting2  : String = abc
                                                  //| message  : String = abc

def f[T](v: T) = v                                //> f: [T](v: T)T
println(f(greeting2))                             //> abc
println(greeting2.getClass)                       //> class java.lang.String

}