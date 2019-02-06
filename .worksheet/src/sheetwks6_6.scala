 
// enumeration

//Scala don't have enumeration type
// there is a helper class Enumeration that can help emulate, simulate
object sheetwks6_6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(189); 
  println("Welcome to the Scala worksheet")
  
  object TrafficLightColor extends Enumeration {
    type TrafficLightColor = Value  // type alias
    val Red, Yellow, Green = Value // multiple assignment
  };$skip(198); val res$0 = 
  

  
  TrafficLightColor.values;System.out.println("""res0: sheetwks6_6.TrafficLightColor.ValueSet = """ + $show(res$0));$skip(25); val res$1 = 

  TrafficLightColor.Red;System.out.println("""res1: sheetwks6_6.TrafficLightColor.Value = """ + $show(res$1));$skip(62); 
  println(TrafficLightColor.Yellow.getClass.getCanonicalName);$skip(55); val res$2 = 
  //Red
  TrafficLightColor(0);System.out.println("""res2: sheetwks6_6.TrafficLightColor.Value = """ + $show(res$2));$skip(41); val res$3 =     // Enumeration.apply
  
  TrafficLightColor.withName("Green");System.out.println("""res3: sheetwks6_6.TrafficLightColor.Value = """ + $show(res$3));$skip(29); 
  
    

 println("Endlich")}
  
}
