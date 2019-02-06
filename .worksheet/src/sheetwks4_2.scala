object sheetwks4_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(94); 
  
  //ACCESSING MAP VALUES
  
   val scores = Map("Alice" -> 10, "Bob" -> 20, "Mary" -> -30);System.out.println("""scores  : scala.collection.immutable.Map[String,Int] = """ + $show(scores ));$skip(104); 
   //there is an analogy between map and functions
   
   // happy path
   val bobScore = scores("Bob");System.out.println("""bobScore  : Int = """ + $show(bobScore ));$skip(253); 
  
  // unhappy path
  // version1
  //java.util.NoSuchElementException: key not found: Jim
  try{
  val jimScore = scores("Jim")
  }catch{
   case _ : NoSuchElementException => println("cannot find key")
  } finally{
   println("Find another key")
  };$skip(154); 
 
  // this is too verbose
  
  //unhappy path
  //version2 , hide the exception
  
  val jimScore = if(scores.contains("Jimbo")) scores("Jimbo") else 0;System.out.println("""jimScore  : Int = """ + $show(jimScore ));$skip(20); ;
  println(jimScore);$skip(110); 
  
  // redundant key
 
  //unhappy path
  //version3
   
   val realJimScore  = scores.getOrElse("JIm", 200);System.out.println("""realJimScore  : Int = """ + $show(realJimScore ));$skip(34); 
  // best
  println(realJimScore);$skip(177); val res$0 = 
  
  
  //for immutable maps, you can turn it into a map
  //with a fixed default value for keys that are not present
  
  //scala.collection.immutable.Map[String,Int]
  scores;System.out.println("""res0: scala.collection.immutable.Map[String,Int] = """ + $show(res$0));$skip(46); 
  
  val scores1 = scores.withDefaultValue(0);System.out.println("""scores1  : scala.collection.immutable.Map[String,Int] = """ + $show(scores1 ));$skip(77); 
  //zeldaScore  : Option[Int] = None
  val zeldaScore = scores1.get("Zelda");System.out.println("""zeldaScore  : Option[Int] = """ + $show(zeldaScore ));$skip(47); 
  // 0
  val trueZeldaScore = scores1("Zelda");System.out.println("""trueZeldaScore  : Int = """ + $show(trueZeldaScore ));$skip(38); 
  val trueGigiScore = scores1("Gigi");System.out.println("""trueGigiScore  : Int = """ + $show(trueGigiScore ));$skip(78); val res$1 = 
 
 
   //USING GET IS SAFER
  //res1: Option[Int] = None
  scores.get("Gigi");System.out.println("""res1: Option[Int] = """ + $show(res$1));$skip(82); val res$2 = 
 
  try{
  scores("Gigi")
  } catch {
    case _: NoSuchElementException => 0
  };System.out.println("""res2: Int = """ + $show(res$2));$skip(118); 
  
  // applying some function to create a value on the fly from the key
  val scores2 = scores.withDefault(_.length);System.out.println("""scores2  : scala.collection.immutable.Map[String,Int] = """ + $show(scores2 ));$skip(61); 
  // 5 is the length
  val trueRobinScore = scores2("Robin");System.out.println("""trueRobinScore  : Int = """ + $show(trueRobinScore ));$skip(81); 
  
  // get is safe Option[Int] = None
  val trueHoodScore = scores2.get("Hood");System.out.println("""trueHoodScore  : Option[Int] = """ + $show(trueHoodScore ));$skip(60); val res$3 = 

  /// the length is 4 so the result is 4
  scores2("Hood");System.out.println("""res3: Int = """ + $show(res$3));$skip(24); 
  
  println("Endlich")}
  
}
