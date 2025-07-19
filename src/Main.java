import memento.Editor;
import memento.History;
import mementoExercise.Document;
import MementoExercise.DocumentHistory;
import state.Canvas;
import state.EraserTool;
import state.SelectionTool;


public class Main {

   public static void main(String[] args) {
      var canvas = new Canvas();
      canvas.setCurrentTool(new EraserTool());
      canvas.mouseDown();
      canvas.mouseUp();
   }


}