object sheetwork2_9 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(433); 
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
  };System.out.println("""sum: (args: Int*)Int""");$skip(24); val res$0 = 
  
  sum(2,32 ,323, 45);System.out.println("""res0: Int = """ + $show(res$0));$skip(327); val res$1 = 
  
  
  // can you pass a sequence of values? No
  
  //sum (1 to 4)
  
  // type mismatch sum(1  to 4) required int aka should work for only one Int
  //TRICK: tell the compiler that you want that the only parameter
  // you send to be considered as an argument sequence:
  
  // ADD   :_*   (the sleepy guy)
  sum(1 to 4:_*);System.out.println("""res1: Int = """ + $show(res$1));$skip(144); 
   
  //recursive sum
  
  def recursiveSum(args: Int*):Int = {
    if(args.length == 0) 0
    else args.head + recursiveSum(args.tail: _*)
  };System.out.println("""recursiveSum: (args: Int*)Int""");$skip(29); val res$2 = 
 
  recursiveSum(1, 2, 3, 4)
  
  // a little bit of Java with Scala
  
  
import java.text.MessageFormat;System.out.println("""res2: Int = """ + $show(res$2));$skip(264); 

// you have to convert any primitive type by hand when you are calling  a Java method
val str = MessageFormat.format("The answer to  {0} is {1}", "everything", 42.asInstanceOf[AnyRef] );System.out.println("""str  : String = """ + $show(str ));$skip(13); 
println(str);$skip(23); 
 
  println("endlich")}
  
}
