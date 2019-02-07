object sheetwork2_5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var r = 1                                       //> r  : Int = 1
  var n = 10                                      //> n  : Int = 10
  
  //Scala has the same while as in C++ and Java
  while(n>0){
  r = r * n
  n -= 1
  }
  
  println(r)                                      //> 3628800
  
  r = 1; n = 10
  
  //Scala has NO equivalent for(initialize; test; update)
  // let's suppose you need this kind of loop
  // what did you do
  //1.   for (i <- expr) // traversable?
  // how the traversal works depend on the type of expression
  // no need to add var, val in front of i
  for (i<- 1 to n)
    r = r * i
    
  println("r=" + r)                               //> r=3628800
    
  var s = "Hello"                                 //> s  : String = Hello
  
  for(i <- 0 to s.length() - 1)
    println(s(i))                                 //> H
                                                  //| e
                                                  //| l
                                                  //| l
                                                  //| o
  // no need in this case to be explicit
  //about the index
  for(ch <- s)
    println(ch)                                   //> H
                                                  //| e
                                                  //| l
                                                  //| l
                                                  //| o
  
  // there is no break or continue from a for loop in Scala
  // how do you get out?
  
  //BREAK1: use a Boolean control variable
    //TODO
    
    
  // BREAK2: use a nested function: use return
    //TODO
  
  // BREAK3: use break method from Breaks object
  import scala.util.control.Breaks._
  breakable{
  for (i <- 1 to 10)
     if(i == 5) break
  }
  
  
  //Scala is permitting shadowing
  //(overlapping variable scope are ok, not like in Java)
  var i = 100                                     //> i  : Int = 100
  for(i<- 1 to 3 )
    println(i)                                    //> 1
                                                  //| 2
                                                  //| 3
  
  
   
}