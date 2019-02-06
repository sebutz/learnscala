import scala.collection.mutable.ArrayBuffer
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF


object sheetwks5_8 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(169); 
  println("Welcome to the Scala worksheet")
  
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
};$skip(467); 
  
  //each instance has its own Member class (different classes)
  // different from Java(where an inner class belongs to outer class)
  val chatter = new Network("chatty");System.out.println("""chatter  : sheetwks5_8.Network = """ + $show(chatter ));$skip(38); 
  val myFace = new Network("theface");System.out.println("""myFace  : sheetwks5_8.Network = """ + $show(myFace ));$skip(36); 
  val wilma = chatter.join("wilma");System.out.println("""wilma  : sheetwks5_8.chatter.Member = """ + $show(wilma ));$skip(34); 
  val fred = chatter.join("Fred");System.out.println("""fred  : sheetwks5_8.chatter.Member = """ + $show(fred ));$skip(28); val res$0 = 
  
  fred.contacts += wilma;System.out.println("""res0: sheetwks5_8.fred.contacts.type = """ + $show(res$0));$skip(105); 
  
  // Scala style ( not like in Java:  chatter.new Member())
  val member1 = new chatter.Member("aaa");System.out.println("""member1  : sheetwks5_8.chatter.Member = """ + $show(member1 ));$skip(41); 
  val member2 = new myFace.Member("bbb");System.out.println("""member2  : sheetwks5_8.myFace.Member = """ + $show(member2 ));$skip(43); 
  
  
  val barney = myFace.join("Barney");System.out.println("""barney  : sheetwks5_8.myFace.Member = """ + $show(barney ));$skip(79); 
//  fred.contacts  += barney  //type mismatch
  
  
  
  
  println("Endlich")}
}
