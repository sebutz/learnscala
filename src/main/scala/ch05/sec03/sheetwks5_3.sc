
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

object sheetwks5_3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var message = new Message                       //> message  : Message = Message@36f0f1be
  message.timestamp                               //> res0: java.time.Instant = 2019-02-06T13:57:46.185094Z
  // cannot set it as it will be treated as a "reasignment to val"
  // message.timestamp = java.time.Instant.MAX
  
  
  val myCounter = new Counter5_3                  //> myCounter  : Counter5_3 = Counter5_3@e50a6f6
  myCounter.current                               //> res1: Int = 0
  // myCounter.current()  // does not take parameters
}