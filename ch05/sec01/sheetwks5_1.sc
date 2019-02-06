//looks like a Java class
// Scala: a class is not declared public
// a source file can contain multiple classes
// all of them have public visibility

class Counter{
  private var value = 0 // you MUST initialize the field
  
  def increment() {value +=1 }
  def decrement() {value -=1}
  def current() = value // no need for brackets for a single lin
}


object sheetwks5_1 {
println("Welcome to the Scala worksheet")         //> Welcome to the Scala worksheet
val myCounter = new Counter()  // you can use new Counter
                                                  //> myCounter  : Counter = Counter@8b96fde
println(myCounter.current())                      //> 0

myCounter.increment()
myCounter.current()                               //> res0: Int = 1
// the same as
myCounter.current                                 //> res1: Int = 1

 //CONVENTION: GOOD STYLE TO USE () for a mutator
 //DROP THE () FOR A ACCESSOR

}