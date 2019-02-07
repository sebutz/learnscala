object sheetwork2_8 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //DEFAULT NAME AND ARGUMENTS
  def decorate(str: String, left:String = "[", right:String = "]") =
    left + str + right                            //> decorate: (str: String, left: String, right: String)String
    
  // defaults
  decorate("Hello")                               //> res0: String = [Hello]
  // overwrites the defaults
  decorate("Hello", "<<<", ">>>")                 //> res1: String = <<<Hello>>>
  // right is default
  decorate("Hello", "&&&")                        //> res2: String = &&&Hello]
  
  // we can name the arguments
  decorate("Hello", right="<><><><>")             //> res3: String = [Hello<><><><>
  
  // as long we don't specify the names of arguments,
 // there is a default order aka the order from the definition
 
 // if you change the order you have to specify all the arguments
 decorate(right = "aaa", left ="bbb", str="Hello")//> res4: String = bbbHelloaaa
  
}