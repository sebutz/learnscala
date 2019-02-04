object sheetworks2_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(150); 

  //Java: 3 + 4 expression(has a value), if is a  statement (do an action/ no value )
  // Scala: almost all constructs have values
  
  var x  = 12;System.out.println("""x  : Int = """ + $show(x ));$skip(23); val res$0 = 
  if (x > 0) 2 else -1;System.out.println("""res0: Int = """ + $show(res$0));$skip(15); 
  
  
  x = -4;$skip(33); 
  var res = if (x > 0) 2 else -1;System.out.println("""res  : Int = """ + $show(res ));$skip(92); 

  // in Scala:
  // if is an expression, has value
  
  //here there is a twist
  
  x = 0;$skip(39); 
  val res_final = if (x > 0) 2 else -1;System.out.println("""res_final  : Int = """ + $show(res_final ));$skip(19); 
  print(res_final);$skip(38); 
  
  //is equivalent with
  var s = 0;System.out.println("""s  : Int = """ + $show(s ));$skip(30); 
  if (x> 0) s = 2 else s = -1;$skip(91); 
  
  //kind of old school, and the s needs to be var
  val y = if (x> 0) s = 2 else s = -1;System.out.println("""y  : Unit = """ + $show(y ));$skip(240); 
  
  // it's simplierto use val
  
// Scala combines ?: from Java and if/else
  
  // there is no ternary operator in Scala
  // var z = x > 0 ? 1 : 0
  
  
  //let's talk about the types of the if
  
  
  var z = if (x>0) "Aloha" else 2.0;System.out.println("""z  : Any = """ + $show(z ));$skip(238); 
  
  
  // there is another shorter variant without else
  
  // it is possible that an if yields no value
  // in fact there is sign denoting (), a placeholder for "no useful value"
  // the type scala.runtime.BoxedUnit
  z = if(x> 0) 1;$skip(13); 
  println(z);$skip(39); 
  println(z.getClass.getCanonicalName);$skip(48); 
  //equivalent with
   z = if (x > 0) 1 else ();$skip(14); 
   println(z);$skip(13); 
  
  x  = 23;$skip(17); 
  z = if(x> 0) 1;$skip(13); 
  println(z);$skip(39); 
  println(z.getClass.getCanonicalName);$skip(12); 
  
  x = -3;$skip(27); 
  z = if (x > 0) 1 else ();$skip(13); 
  println(z);$skip(39); 
  println(z.getClass.getCanonicalName)}
  
}
