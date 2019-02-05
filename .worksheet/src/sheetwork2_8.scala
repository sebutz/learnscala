object sheetwork2_8 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(126); 
  
  //DEFAULT NAME AND ARGUMENTS
  def decorate(str: String, left:String = "[", right:String = "]") =
    left + str + right;System.out.println("""decorate: (str: String, left: String, right: String)String""");$skip(39); val res$0 = 
    
  // defaults
  decorate("Hello");System.out.println("""res0: String = """ + $show(res$0));$skip(63); val res$1 = 
  // overwrites the defaults
  decorate("Hello", "<<<", ">>>");System.out.println("""res1: String = """ + $show(res$1));$skip(49); val res$2 = 
  // right is default
  decorate("Hello", "&&&");System.out.println("""res2: String = """ + $show(res$2));$skip(72); val res$3 = 
  
  // we can name the arguments
  decorate("Hello", right="<><><><>");System.out.println("""res3: String = """ + $show(res$3));$skip(239); val res$4 = 
  
  // as long we don't specify the names of arguments,
 // there is a default order aka the order from the definition
 
 // if you change the order you have to specify all the arguments
 decorate(right = "aaa", left ="bbb", str="Hello");System.out.println("""res4: String = """ + $show(res$4))}
  
}
