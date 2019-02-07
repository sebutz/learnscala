// one applucation of the companion object
//specify default object that can be shared

object sheetwks6_3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  abstract class UndoableAction(val description: String) {
  def undo(): Unit
  def redo(): Unit
}
  
  object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo() {}
  override def redo() {}
}

val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction)
                                                  //> actions  : scala.collection.immutable.Map[String,sheetwks6_3.DoNothingAction
                                                  //| .type] = Map(open -> sheetwks6_3$DoNothingAction$2$@6537cf78, save -> sheetw
                                                  //| ks6_3$DoNothingAction$2$@6537cf78)
actions("open").description                       //> res0: String = Do nothing
actions("open") == actions("save")                //> res1: Boolean = true
  
  
}