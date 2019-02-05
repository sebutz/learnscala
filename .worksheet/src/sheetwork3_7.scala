object sheetwork3_7 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(96); 
  
  // Multidimensional Arrays
  //define a matrix
  
  val matrix = Array.ofDim[Double](3, 4);System.out.println("""matrix  : Array[Array[Double]] = """ + $show(matrix ));$skip(9); val res$0 = 
  matrix;System.out.println("""res0: Array[Array[Double]] = """ + $show(res$0));$skip(72); 
  
  //access the matrix
  //matrix(row)(column)
  matrix(1) (1) = 3.23;$skip(9); val res$1 = 
  matrix;System.out.println("""res1: Array[Array[Double]] = """ + $show(res$1));$skip(65); 
  //make ragged array
  val triangle = new Array[Array[Int]](10);System.out.println("""triangle  : Array[Array[Int]] = """ + $show(triangle ));$skip(11); val res$2 = 
  triangle;System.out.println("""res2: Array[Array[Int]] = """ + $show(res$2))}
  
}
