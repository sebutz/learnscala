object sheetwork3_7 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // Multidimensional Arrays
  //define a matrix
  
  val matrix = Array.ofDim[Double](3, 4)          //> matrix  : Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0,
                                                  //|  0.0, 0.0, 0.0), Array(0.0, 0.0, 0.0, 0.0))
  matrix                                          //> res0: Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0, 0.0
                                                  //| , 0.0, 0.0), Array(0.0, 0.0, 0.0, 0.0))
  
  //access the matrix
  //matrix(row)(column)
  matrix(1) (1) = 3.23
  matrix                                          //> res1: Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0, 3.2
                                                  //| 3, 0.0, 0.0), Array(0.0, 0.0, 0.0, 0.0))
  //make ragged array
  val triangle = new Array[Array[Int]](10)        //> triangle  : Array[Array[Int]] = Array(null, null, null, null, null, null, nu
                                                  //| ll, null, null, null)
  triangle                                        //> res2: Array[Array[Int]] = Array(null, null, null, null, null, null, null, nu
                                                  //| ll, null, null)
  
}