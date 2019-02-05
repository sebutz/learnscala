object sheetwork3_3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(92); 
  
  //“Traversing Arrays and Array Buffers”

  //old way
  
  val aa = Array(3, 4 , 5,  7);System.out.println("""aa  : Array[Int] = """ + $show(aa ));$skip(11); val res$0 = 
  
  aa(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(19); val res$1 = 
  aa(aa.length -1);System.out.println("""res1: Int = """ + $show(res$1));$skip(52); 
  
  
  for(i<- 0 to  aa.length-1)
  println(aa(i));$skip(93); 
   // cut to crap with
  // to aa.length -1
  
  for(i <- 0 until aa.length)
   print(aa(i));$skip(97); 
   
   
   // control the step with "by"
   for (i <- 0 until aa.length by 2)
      print(aa(i));$skip(118); 
   
   // this is giving us the ideea to traverse backwards
    for (i <- aa.length-1 to 0 by -1)
       print(aa(i));$skip(87); 
    
    // not working !!!
    for (i <- 0 until aa.length by -1)
       print(aa(i));$skip(83); 
        
        
      // indices
     for(i <- aa.indices)
         print(aa(i));$skip(75); 
               
     for (i <- aa.indices.reverse)
           print(aa(i));$skip(150); 
      
      
      // when you don't need the indices
      //similar with the enhanced for loop in Java
      for(elem <- aa)
          print(elem);$skip(33); 
      
   
   println("endlich")}
  
}
