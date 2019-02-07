object sheetwks4_6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //scenario: you got a Java map --> Scala map (works with both mutable or immutable maps)
  import scala.collection.JavaConversions.mapAsScalaMap
  val scores : scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
                                                  //> scores  : scala.collection.mutable.Map[String,Int] = Map()
   val immutables_scores : scala.collection.Map[String, Int] = new java.util.TreeMap[String, Int]
                                                  //> immutables_scores  : scala.collection.Map[String,Int] = Map()
   // this is working only if we have JavaConversions.mapAsScalaMap imported !!!
  
  scores("Alice") = 3
  scores                                          //> res0: scala.collection.mutable.Map[String,Int] = Map(Alice -> 3)
  
  
  // scenario: java.util.Properties to Map[String, Int] (works with both immutable and mutable maps)
  import scala.collection.JavaConversions.propertiesAsScalaMap
  val props: scala.collection.Map[String, String]  =  System.getProperties()
                                                  //> props  : scala.collection.Map[String,String] = Map(gopherProxySet -> false, 
                                                  //| awt.toolkit -> sun.lwawt.macosx.LWCToolkit, java.specification.version -> 9,
                                                  //|  file.encoding.pkg -> sun.io, sun.cpu.isalist -> "", sun.jnu.encoding -> UTF
                                                  //| -8, java.class.path -> /Applications/Eclipse.app/Contents/Eclipse/configurat
                                                  //| ion/org.eclipse.osgi/1010/0/.cp/target/lib/worksheet-runtime-library_2.12.ja
                                                  //| r:/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/lib/jrt-fs.j
                                                  //| ar:/Applications/Eclipse.app/Contents/Eclipse/plugins/org.scala-lang.scala-l
                                                  //| ibrary_2.12.3.v20170725-052526-VFINAL-6ac6da8.jar:/Applications/Eclipse.app/
                                                  //| Contents/Eclipse/plugins/org.scala-lang.scala-reflect_2.12.3.v20170725-05252
                                                  //| 6-VFINAL-6ac6da8.jar:/Users/p3700406/GitHub/learnscala/bin:/Users/p3700406/G
                                                  //| itHub/learnscala/bin:/Users/p3700406/GitHub/learnscala/bin:/Users/p3700406/G
                                                  //| itHub/learnscala/bin:/Users/p3700406/GitHub/learnscala/bin:/Users/p3700406/G
                                                  //| itHub/learnscala/bin:/Us
                                                  //| Output exceeds cutoff limit.
  val props2: scala.collection.mutable.Map[String, String] = System.getProperties()
                                                  //> props2  : scala.collection.mutable.Map[String,String] = Map(gopherProxySet -
                                                  //| > false, awt.toolkit -> sun.lwawt.macosx.LWCToolkit, java.specification.vers
                                                  //| ion -> 9, file.encoding.pkg -> sun.io, sun.cpu.isalist -> "", sun.jnu.encodi
                                                  //| ng -> UTF-8, java.class.path -> /Applications/Eclipse.app/Contents/Eclipse/c
                                                  //| onfiguration/org.eclipse.osgi/1010/0/.cp/target/lib/worksheet-runtime-librar
                                                  //| y_2.12.jar:/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/lib
                                                  //| /jrt-fs.jar:/Applications/Eclipse.app/Contents/Eclipse/plugins/org.scala-lan
                                                  //| g.scala-library_2.12.3.v20170725-052526-VFINAL-6ac6da8.jar:/Applications/Ecl
                                                  //| ipse.app/Contents/Eclipse/plugins/org.scala-lang.scala-reflect_2.12.3.v20170
                                                  //| 725-052526-VFINAL-6ac6da8.jar:/Users/p3700406/GitHub/learnscala/bin:/Users/p
                                                  //| 3700406/GitHub/learnscala/bin:/Users/p3700406/GitHub/learnscala/bin:/Users/p
                                                  //| 3700406/GitHub/learnscala/bin:/Users/p3700406/GitHub/learnscala/bin:/Users/p
                                                  //| 3700406/GitHub/learnscal
                                                  //| Output exceeds cutoff limit.
  //java.util.Properties
  val properties = System.getProperties()         //> properties  : java.util.Properties = {gopherProxySet=false, awt.toolkit=sun.
                                                  //| lwawt.macosx.LWCToolkit, java.specification.version=9, file.encoding.pkg=sun
                                                  //| .io, sun.cpu.isalist=, sun.jnu.encoding=UTF-8, java.class.path=/Applications
                                                  //| /Eclipse.app/Contents/Eclipse/configuration/org.eclipse.osgi/1010/0/.cp/targ
                                                  //| et/lib/worksheet-runtime-library_2.12.jar:/Library/Java/JavaVirtualMachines/
                                                  //| jdk-9.0.4.jdk/Contents/Home/lib/jrt-fs.jar:/Applications/Eclipse.app/Content
                                                  //| s/Eclipse/plugins/org.scala-lang.scala-library_2.12.3.v20170725-052526-VFINA
                                                  //| L-6ac6da8.jar:/Applications/Eclipse.app/Contents/Eclipse/plugins/org.scala-l
                                                  //| ang.scala-reflect_2.12.3.v20170725-052526-VFINAL-6ac6da8.jar:/Users/p3700406
                                                  //| /GitHub/learnscala/bin:/Users/p3700406/GitHub/learnscala/bin:/Users/p3700406
                                                  //| /GitHub/learnscala/bin:/Users/p3700406/GitHub/learnscala/bin:/Users/p3700406
                                                  //| /GitHub/learnscala/bin:/Users/p3700406/GitHub/learnscala/bin:/Users/p3700406
                                                  //| /GitHub/learnscala/bin:/
                                                  //| Output exceeds cutoff limit.
  
  
  // scenario: pass a Scala map to a method that expects Java map
   // it should pass some implicit conversion, right?
   import scala.collection.JavaConversions.mapAsJavaMap
   import java.awt.font.TextAttribute._
   
   //scala.collection.immutable.Map
   val attrs = Map(FAMILY -> "Serif", SIZE -> 12) //> attrs  : scala.collection.immutable.Map[java.awt.font.TextAttribute,Any] = 
                                                  //| Map(java.awt.font.TextAttribute(family) -> Serif, java.awt.font.TextAttribu
                                                  //| te(size) -> 12)
   val font = new java.awt.Font(attrs)            //> font  : java.awt.Font = java.awt.Font[family=Serif,name=Serif,style=plain,s
                                                  //| ize=12]
   
  
  
  println("endlich")                              //> endlich/
  
  
  
}