import scala.collection.mutable.ArrayBuffer
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF


object sheetwks5_8 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
 class Network(val name: String) {
    class Member(val name: String) {
     val contacts = new ArrayBuffer[Member]
     def description = name + " inside"
   }

  val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}
  
  //each instance has its own Member class (different classes)
  // different from Java(where an inner class belongs to outer class)
  val chatter = new Network("chatty")             //> chatter  : sheetwks5_8.Network = sheetwks5_8$Network$1@1e643faf
  val myFace = new Network("theface")             //> myFace  : sheetwks5_8.Network = sheetwks5_8$Network$1@6e8dacdf
  val wilma = chatter.join("wilma")               //> wilma  : sheetwks5_8.chatter.Member = sheetwks5_8$Network$1$Member@7a79be86
  val fred = chatter.join("Fred")                 //> fred  : sheetwks5_8.chatter.Member = sheetwks5_8$Network$1$Member@34ce8af7
  
  fred.contacts += wilma                          //> res0: sheetwks5_8.fred.contacts.type = ArrayBuffer(sheetwks5_8$Network$1$Mem
                                                  //| ber@7a79be86)
  
  // Scala style ( not like in Java:  chatter.new Member())
  val member1 = new chatter.Member("aaa")         //> member1  : sheetwks5_8.chatter.Member = sheetwks5_8$Network$1$Member@3796751
                                                  //| b
  val member2 = new myFace.Member("bbb")          //> member2  : sheetwks5_8.myFace.Member = sheetwks5_8$Network$1$Member@67b64c45
                                                  //| 
  
  
  val barney = myFace.join("Barney")              //> barney  : sheetwks5_8.myFace.Member = sheetwks5_8$Network$1$Member@4411d970
//  fred.contacts  += barney  //type mismatch
  
  
  
  
  println("Endlich")                              //> Endlich
}