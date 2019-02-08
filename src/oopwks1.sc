class Point(val x: Double, val y: Double) { //primary constructor
  def this(){this(0, 0)} // one auxiliary constructor
  def this(x: Double)  = {this(x, 1); println("x auxiliary")} // another
  def this(y: String) {this(100, y.toInt ); println("y auxiliary")}
  def move(dx: Double, dy: Double) = new Point(x + dx, y + dy)
  def distanceFromOrigin = math.sqrt(x * x + y * y)
  override def toString = f"(${x}%2.2f, ${y}%2.2f)"

}
// primary constructor is not like default constructor in Java,
// in the sense that it's more elaborated

// auxiliary constructor has to have the call to the primary constructor on the first line


val p1 = new Point(3, 4)
println(p1)
p1.distanceFromOrigin

p1.move(1, 2)
p1.distanceFromOrigin // same distance as we create a new point


val p2 = new Point(3)
println(p2)

val p3 = new Point()
println(p3)

// yep
val p4 = new Point("2")
println(p4)

// we can eliminate the need of auxiliary with default args
class Point2D(val x: Double = 0.0, val y: Double = 0.0){
  println("Aloha") // this gets executed every time when you constuct something
  override def toString = f"(${x}%2.2f, ${y}%2.2f)"
}

val p5  = new Point2D()
val p6 = new Point2D(4,0)
val p7 =  new Point2D(y = 3)