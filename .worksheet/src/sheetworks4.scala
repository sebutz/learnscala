object sheetworks4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(69); val res$0 = 
  
  // you can omit . for binary method
  "Hello".intersect("elle");System.out.println("""res0: String = """ + $show(res$0));$skip(27); val res$1 = 
  "Hello" intersect "elle";System.out.println("""res1: String = """ + $show(res$1));$skip(68); val res$2 = 
   
   // you can omit () for no arguments
   "Hello".toUpperCase();System.out.println("""res2: String = """ + $show(res$2));$skip(23); val res$3 = 
   "Hello".toUpperCase;System.out.println("""res3: String = """ + $show(res$3));$skip(49); 
  
  
  // operators are methods
  val x = 3 + 4;System.out.println("""x  : Int = """ + $show(x ));$skip(13); 
  println(x);$skip(9); val res$4 = 
  3.+(4);System.out.println("""res4: Int(7) = """ + $show(res$4));$skip(81); val res$5 = 
  
  // in general
  //a.method(b)  is the same as
  // a method b
  
  1.to(10);System.out.println("""res5: scala.collection.immutable.Range.Inclusive = """ + $show(res$5));$skip(10); val res$6 = 
  1 to 10;System.out.println("""res6: scala.collection.immutable.Range.Inclusive = """ + $show(res$6));$skip(96); 
  
  
  //Scala don't have ++, --
  //instead as in Python, use +=, -+ etc
  
  var counter = 1;System.out.println("""counter  : Int = """ + $show(counter ));$skip(15); 
  counter += 1;$skip(35); 
  println(s"counter = ${counter}");$skip(137); 
  
  
  
  
  //use operators with BigInt, BigDecimal
  // instead of methods (bi.multiply(bi).multiply(bi))
  val bi: BigInt = 23123123;System.out.println("""bi  : BigInt = """ + $show(bi ));$skip(40); 
  println(bi.getClass.getCanonicalName);$skip(50); 
  
  // scala.math.BigInt
  var y =  bi * bi * bi;System.out.println("""y  : scala.math.BigInt = """ + $show(y ))}
    
}
