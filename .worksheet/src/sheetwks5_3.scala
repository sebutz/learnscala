
// “Properties with Only Getters”

// you want only getters

// you cannot have write-only property

class Message{
  val timestamp = java.time.Instant.now
}

class Counter5_3{
 private var value = 0
 def increment(){value += 1}
 def decrement(){value -= 1}
 // you must call the getter method without parantheses
 def current = value  //No () implementation

}

object sheetwks5_3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(428); 
  println("Welcome to the Scala worksheet");$skip(31); 
  
  var message = new Message;System.out.println("""message  : Message = """ + $show(message ));$skip(20); val res$0 = 
  message.timestamp;System.out.println("""res0: java.time.Instant = """ + $show(res$0));$skip(153); 
  // cannot set it as it will be treated as a "reasignment to val"
  // message.timestamp = java.time.Instant.MAX
  
  
  val myCounter = new Counter5_3;System.out.println("""myCounter  : Counter5_3 = """ + $show(myCounter ));$skip(20); val res$1 = 
  myCounter.current;System.out.println("""res1: Int = """ + $show(res$1))}
  // myCounter.current()  // does not take parameters
}
