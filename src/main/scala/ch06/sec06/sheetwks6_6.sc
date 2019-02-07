 
// enumeration

//Scala don't have enumeration type
// there is a helper class Enumeration that can help emulate, simulate
object sheetwks6_6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  object TrafficLightColor extends Enumeration {
    type TrafficLightColor = Value  // type alias
    val Red, Yellow, Green = Value // multiple assignment
  }
  

  
  TrafficLightColor.values                        //> res0: sheetwks6_6.TrafficLightColor.ValueSet = 2.ValueSet(Red, Yellow, Green
                                                  //| )

  TrafficLightColor.Red                           //> res1: sheetwks6_6.TrafficLightColor.Value = Red
  println(TrafficLightColor.Yellow.getClass.getCanonicalName)
                                                  //> scala.Enumeration.Val
  //Red
  TrafficLightColor(0)    // Enumeration.apply    //> res2: sheetwks6_6.TrafficLightColor.Value = Red
  
  TrafficLightColor.withName("Green")             //> res3: sheetwks6_6.TrafficLightColor.Value = Green
  
    

 println("Endlich")                               //> Endlich
  
}