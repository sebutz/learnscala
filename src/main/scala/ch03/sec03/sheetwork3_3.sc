object sheetwork3_3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //“Traversing Arrays and Array Buffers”

  //old way
  
  val aa = Array(3, 4 , 5,  7)                    //> aa  : Array[Int] = Array(3, 4, 5, 7)
  
  aa(0)                                           //> res0: Int = 3
  aa(aa.length -1)                                //> res1: Int = 7
  
  
  for(i<- 0 to  aa.length-1)
  println(aa(i))                                  //> 3
                                                  //| 4
                                                  //| 5
                                                  //| 7
   // cut to crap with
  // to aa.length -1
  
  for(i <- 0 until aa.length)
   print(aa(i))                                   //> 3457
   
   
   // control the step with "by"
   for (i <- 0 until aa.length by 2)
      print(aa(i))                                //> 35
   
   // this is giving us the ideea to traverse backwards
    for (i <- aa.length-1 to 0 by -1)
       print(aa(i))                               //> 7543
    
    // not working !!!
    for (i <- 0 until aa.length by -1)
       print(aa(i))
        
        
      // indices
     for(i <- aa.indices)
         print(aa(i))                             //> 3457
               
     for (i <- aa.indices.reverse)
           print(aa(i))                           //> 7543
      
      
      // when you don't need the indices
      //similar with the enhanced for loop in Java
      for(elem <- aa)
          print(elem)                             //> 3457
      
   
   println("endlich")                             //> endlich
  
}