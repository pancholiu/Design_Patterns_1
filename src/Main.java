import command.excercise.*;

public class Main {
   public static void main(String[] args) {
      var videoEditor = new VideoEditor();
      var history = new History();

      var setTextCommand = new SetTextCommand("My first text", videoEditor, history);
      setTextCommand.execute();
      System.out.println("TEXT: " + videoEditor);

      var setContrast = new SetContrastCommand(5, videoEditor, history);
      setContrast.execute();
      System.out.println("CONTRAST: " + videoEditor);

      var undoCommand = new UndoCommand(history);
      undoCommand.execute();
      System.out.println("UNDO: " + videoEditor);

      undoCommand.execute();
      System.out.println("UNDO: " + videoEditor);

      undoCommand.execute();
      System.out.println("UNDO: " + videoEditor);


      /*
      var history = new History();
      var document = new HtmlDocument();
      document.setContent("Hello world");

      var boldCommand = new BoldCommand(document, history);
      boldCommand.execute();
      System.out.println(document.getContent());

      var undoCommand = new UndoCommand(history);
      undoCommand.execute();
      System.out.println(document.getContent());
       */
   }
}