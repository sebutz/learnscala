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


object sheetwks5_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(419); 
println("Welcome to the Scala worksheet");$skip(58); 
val myCounter = new Counter();System.out.println("""myCounter  : Counter = """ + $show(myCounter ));$skip(29);   // you can use new Counter
println(myCounter.current());$skip(23); 

myCounter.increment();$skip(20); val res$0 = 
myCounter.current();System.out.println("""res0: Int = """ + $show(res$0));$skip(33); val res$1 = 
// the same as
myCounter.current;System.out.println("""res1: Int = """ + $show(res$1))}

 //CONVENTION: GOOD STYLE TO USE () for a mutator
 //DROP THE () FOR A ACCESSOR

}
