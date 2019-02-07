object sheetwks4_2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //ACCESSING MAP VALUES
  
   val scores = Map("Alice" -> 10, "Bob" -> 20, "Mary" -> -30)
                                                  //> scores  : scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob 
                                                  //| -> 20, Mary -> -30)
   //there is an analogy between map and functions
   
   // happy path
   val bobScore = scores("Bob")                   //> bobScore  : Int = 20
  
  // unhappy path
  // version1
  //java.util.NoSuchElementException: key not found: Jim
  try{
  val jimScore = scores("Jim")
  }catch{
   case _ : NoSuchElementException => println("cannot find key")
  } finally{
   println("Find another key")
  }                                               //> cannot find key
                                                  //| Find another key
 
  // this is too verbose
  
  //unhappy path
  //version2 , hide the exception
  
  val jimScore = if(scores.contains("Jimbo")) scores("Jimbo") else 0;
                                                  //> jimScore  : Int = 0
  println(jimScore)                               //> 0
  
  // redundant key
 
  //unhappy path
  //version3
   
   val realJimScore  = scores.getOrElse("JIm", 200)
                                                  //> realJimScore  : Int = 200
  // best
  println(realJimScore)                           //> 200
  
  
  //for immutable maps, you can turn it into a map
  //with a fixed default value for keys that are not present
  
  //scala.collection.immutable.Map[String,Int]
  scores                                          //> res0: scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bob -> 
                                                  //| 20, Mary -> -30)
  
  val scores1 = scores.withDefaultValue(0)        //> scores1  : scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bo
                                                  //| b -> 20, Mary -> -30)
  //zeldaScore  : Option[Int] = None
  val zeldaScore = scores1.get("Zelda")           //> zeldaScore  : Option[Int] = None
  // 0
  val trueZeldaScore = scores1("Zelda")           //> trueZeldaScore  : Int = 0
  val trueGigiScore = scores1("Gigi")             //> trueGigiScore  : Int = 0
 
 
   //USING GET IS SAFER
  //res1: Option[Int] = None
  scores.get("Gigi")                              //> res1: Option[Int] = None
 
  try{
  scores("Gigi")
  } catch {
    case _: NoSuchElementException => 0
  }                                               //> res2: Int = 0
  
  // applying some function to create a value on the fly from the key
  val scores2 = scores.withDefault(_.length)      //> scores2  : scala.collection.immutable.Map[String,Int] = Map(Alice -> 10, Bo
                                                  //| b -> 20, Mary -> -30)
  // 5 is the length
  val trueRobinScore = scores2("Robin")           //> trueRobinScore  : Int = 5
  
  // get is safe Option[Int] = None
  val trueHoodScore = scores2.get("Hood")         //> trueHoodScore  : Option[Int] = None

  /// the length is 4 so the result is 4
  scores2("Hood")                                 //> res3: Int = 4
  
  println("Endlich")                              //> Endlich
  
}