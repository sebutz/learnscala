// one applucation of the companion object
//specify default object that can be shared

object sheetwks6_3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(152); 
  println("Welcome to the Scala worksheet")
  
  abstract class UndoableAction(val description: String) {
  def undo(): Unit
  def redo(): Unit
}
  
  object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo() {}
  override def redo() {}
};$skip(294); 

val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction);System.out.println("""actions  : scala.collection.immutable.Map[String,sheetwks6_3.DoNothingAction.type] = """ + $show(actions ));$skip(28); val res$0 = 
actions("open").description;System.out.println("""res0: String = """ + $show(res$0));$skip(35); val res$1 = 
actions("open") == actions("save");System.out.println("""res1: Boolean = """ + $show(res$1))}
  
  
}
