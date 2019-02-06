import scala.collection.mutable.ArrayBuffer

 class Networks{
     private val members = new ArrayBuffer[Networks.Member]

     def join(name: String) = {
        val m = new Networks.Member(name)
        members += m
        m
      }
     def description = "a network with members " +
        (for (m <- members) yield m.description).mkString(", ")
  }
  


object Networks {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
    def description = name + " with contacts " +
      (for (c <- contacts) yield c.name).mkString(" ")
  }
}


object sheetwks5_8 {
  println("Welcome to the Scala worksheet")
  
  
 
  

  
  println("Endlich")
}
