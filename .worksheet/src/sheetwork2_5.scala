object sheetwork2_5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(15); 
  
  var r = 1;System.out.println("""r  : Int = """ + $show(r ));$skip(13); 
  var n = 10;System.out.println("""n  : Int = """ + $show(n ));$skip(90); 
  
  //Scala has the same while as in C++ and Java
  while(n>0){
  r = r * n
  n -= 1
  };$skip(16); 
  
  println(r);$skip(19); 
  
  r = 1; n = 10;$skip(307); 
  
  //Scala has NO equivalent for(initialize; test; update)
  // let's suppose you need this kind of loop
  // what did you do
  //1.   for (i <- expr) // traversable?
  // how the traversal works depend on the type of expression
  // no need to add var, val in front of i
  for (i<- 1 to n)
    r = r * i;$skip(25); 
    
  println("r=" + r);$skip(23); 
    
  var s = "Hello";System.out.println("""s  : String = """ + $show(s ));$skip(53); 
  
  for(i <- 0 to s.length() - 1)
    println(s(i));$skip(92); 
  // no need in this case to be explicit
  //about the index
  for(ch <- s)
    println(ch)
  
  // there is no break or continue from a for loop in Scala
  // how do you get out?
  
  //BREAK1: use a Boolean control variable
    //TODO
    
    
  // BREAK2: use a nested function: use return
    //TODO
  
  // BREAK3: use break method from Breaks object
  import scala.util.control.Breaks._;$skip(362); 
  breakable{
  for (i <- 1 to 10)
     if(i == 5) break
  };$skip(112); 
  
  
  //Scala is permitting shadowing
  //(overlapping variable scope are ok, not like in Java)
  var i = 100;System.out.println("""i  : Int = """ + $show(i ));$skip(34); 
  for(i<- 1 to 3 )
    println(i)}
  
  
   
}
