object sheetwork2_9 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //VARIABLE NUMBER OF ARGUMENTS
  
  // you add * at the end
  //type of args is scala.collection.mutable.WrappedArray.ofInt
  def sum(args: Int*)={
   var result = 0
   println("type of args is "  + args.getClass.getCanonicalName)
   println("args head is: "+ args.head)    //args head is: 2
   println("args tail is : " + args.tail)  // args tail is : WrappedArray(32, 323, 45)
   for(arg<- args)
     result += arg
   result
  }                                               //> sum: (args: Int*)Int
  
  sum(2,32 ,323, 45)                              //> type of args is scala.collection.mutable.WrappedArray.ofInt
                                                  //| args head is: 2
                                                  //| args tail is : WrappedArray(32, 323, 45)
                                                  //| res0: Int = 402
  
  
  // can you pass a sequence of values? No
  
  //sum (1 to 4)
  
  // type mismatch sum(1  to 4) required int aka should work for only one Int
  //TRICK: tell the compiler that you want that the only parameter
  // you send to be considered as an argument sequence:
  
  // ADD   :_*   (the sleepy guy)
  sum(1 to 4:_*)                                  //> type of args is scala.collection.immutable.Range.Inclusive
                                                  //| args head is: 1
                                                  //| args tail is : Range 2 to 4
                                                  //| res1: Int = 10
   
  //recursive sum
  
  def recursiveSum(args: Int*):Int = {
    if(args.length == 0) 0
    else args.head + recursiveSum(args.tail: _*)
  }                                               //> recursiveSum: (args: Int*)Int
 
  recursiveSum(1, 2, 3, 4)                        //> res2: Int = 10
  
  // a little bit of Java with Scala
  
  
import java.text.MessageFormat

// you have to convert any primitive type by hand when you are calling  a Java method
val str = MessageFormat.format("The answer to  {0} is {1}", "everything", 42.asInstanceOf[AnyRef] )
                                                  //> str  : String = The answer to  everything is 42
println(str)                                      //> The answer to  everything is 42
 
  println("endlich")                              //> endlich
  
}