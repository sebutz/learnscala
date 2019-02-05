object sheetwork2_6 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(130); 
  
  //ADVANCED FOR LOOPS
  
  //you can have multiple generators
   for (i<- 1 to 3; j <- 2 to 5)
     print((10* i + j) + ":" );$skip(121); 
  
   // multiple generators wich can be interelated
   for(i<- 1 to 7; j<- 2 to 5 if i!= j )  print((10* i + j) + ":" );$skip(173); 
   
   // you can have definitions inside the for loop
   for { i <- 1 to 3
         border_value =  4 -i
         j <- border_value to 7 }
       print((10* i + j) + ":" );$skip(109); 
       
    //or write onliner
    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ");$skip(211); val res$0 = 
                                                  
    //yield (body starts with yield) FOR COMPREHENSION
    //scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 0, 1, 2)
    for (i <- 1 to 5) yield i%3;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$0));$skip(164); 
   
    // the generated collection has to be (it is ) COMPATIBLE WITH THE FIRST GENERATOR
                                                  
   println("endlich")}
}
