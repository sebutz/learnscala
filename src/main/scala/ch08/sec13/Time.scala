package ch08.sec13

class MilTime private(val time: Int) extends AnyVal {
  def minutes: Int = time % 100
  def hours: Int = time / 100
  override def toString = f"$time"
}

object MilTime {
  def apply(t: Int): MilTime =
    if (0 <= t && t < 2400 && t % 100 < 60) new MilTime(t)
    else throw new IllegalArgumentException
}

object Main extends App {
  val lunch = MilTime(1230)
  println(lunch)
}






