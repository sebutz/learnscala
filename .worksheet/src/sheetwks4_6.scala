object sheetwks4_6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet")
  
  //scenario: you got a Java map --> Scala map (works with both mutable or immutable maps)
  import scala.collection.JavaConversions.mapAsScalaMap;$skip(244); 
  val scores : scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int];System.out.println("""scores  : scala.collection.mutable.Map[String,Int] = """ + $show(scores ));$skip(98); 
   val immutables_scores : scala.collection.Map[String, Int] = new java.util.TreeMap[String, Int];System.out.println("""immutables_scores  : scala.collection.Map[String,Int] = """ + $show(immutables_scores ));$skip(106); 
   // this is working only if we have JavaConversions.mapAsScalaMap imported !!!
  
  scores("Alice") = 3;$skip(9); val res$0 = 
  scores
  
  
  // scenario: java.util.Properties to Map[String, Int] (works with both immutable and mutable maps)
  import scala.collection.JavaConversions.propertiesAsScalaMap;System.out.println("""res0: scala.collection.mutable.Map[String,Int] = """ + $show(res$0));$skip(247); 
  val props: scala.collection.Map[String, String]  =  System.getProperties();System.out.println("""props  : scala.collection.Map[String,String] = """ + $show(props ));$skip(84); 
  val props2: scala.collection.mutable.Map[String, String] = System.getProperties();System.out.println("""props2  : scala.collection.mutable.Map[String,String] = """ + $show(props2 ));$skip(67); 
  //java.util.Properties
  val properties = System.getProperties()
  
  
  // scenario: pass a Scala map to a method that expects Java map
   // it should pass some implicit conversion, right?
   import scala.collection.JavaConversions.mapAsJavaMap
   import java.awt.font.TextAttribute._;System.out.println("""properties  : java.util.Properties = """ + $show(properties ));$skip(312); 
   
   //scala.collection.immutable.Map
   val attrs = Map(FAMILY -> "Serif", SIZE -> 12);System.out.println("""attrs  : scala.collection.immutable.Map[java.awt.font.TextAttribute,Any] = """ + $show(attrs ));$skip(39); 
   val font = new java.awt.Font(attrs);System.out.println("""font  : java.awt.Font = """ + $show(font ));$skip(31); 
   
  
  
  println("endlich")}
  
  
  
}
