object sheetwork2_6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //ADVANCED FOR LOOPS
  
  //you can have multiple generators
   for (i<- 1 to 3; j <- 2 to 5)
     print((10* i + j) + ":" )                    //> 12:13:14:15:22:23:24:25:32:33:34:35:
  
   // multiple generators wich can be interelated
   for(i<- 1 to 7; j<- 2 to 5 if i!= j )  print((10* i + j) + ":" )
                                                  //> 12:13:14:15:23:24:25:32:34:35:42:43:45:52:53:54:62:63:64:65:72:73:74:75:
   
   // you can have definitions inside the for loop
   for { i <- 1 to 3
         border_value =  4 -i
         j <- border_value to 7 }
       print((10* i + j) + ":" )                  //> 13:14:15:16:17:22:23:24:25:26:27:31:32:33:34:35:36:37:
       
    //or write onliner
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")
                                                  //> 13 22 23 31 32 33 
                                                  
    //yield (body starts with yield) FOR COMPREHENSION
    //scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 0, 1, 2)
    for (i <- 1 to 5) yield i%3                   //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 0, 1, 2)
   
    // the generated collection has to be (it is ) COMPATIBLE WITH THE FIRST GENERATOR
                                                  
   println("endlich")                             //> endlich
}