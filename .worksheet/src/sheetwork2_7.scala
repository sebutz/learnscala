object sheetwork2_7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(141); 
  
  // a method operates on object, function not
  // in Java you imitate with static functions
  def abs(x: Double) = if(x >= 0) x else -x;System.out.println("""abs: (x: Double)Double""");$skip(370); 
  
  // Mandatory: you must specify the types of all parameters
  // you have to specify the return type only when the function is recursive
  
  // the body has more than 1 expression use a block
  
  // the last expression from the block determines the return value
  
  def fac(n: Int): Int = {
   var result = 1
   for(i <- 1 to n) result = result * i
   result
  };System.out.println("""fac: (n: Int)Int""");$skip(13); val res$0 = 
  
  fac(10);System.out.println("""res0: Int = """ + $show(res$0));$skip(122); 
  
  //playing recursive
  // convention 0! = 1
  def facrec(n: Int): Int = {
    if (n <= 0) 1 else n * facrec(n -1)
  };System.out.println("""facrec: (n: Int)Int""");$skip(10); val res$1 = 
  fac(10);System.out.println("""res1: Int = """ + $show(res$1))}
  
}
