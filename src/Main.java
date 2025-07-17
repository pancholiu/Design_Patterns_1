import memento.Editor;
import memento.History;
import mementoExercise.Document;
import MementoExercise.DocumentHistory;


public class Main {

   public static void main(String[] args) {
       var document = new Document();
       var history = new DocumentHistory();

       document.setContent("la noticia", "Arial", 2);
       history.push(document.createState());

       document.setContent("la noticia B", "Arial B", 3);
       history.push(document.createState());

       document.setContent("la noticia C", "Arial C", 4);
       history.push(document.createState());

       document.restore(history.pop());
       document.restore(history.pop());
       document.restore(history.pop());

       System.out.println(document.getContent());

       /*
       var editor = new Editor();
       var history = new History();

       editor.setContent("a");
       history.push(editor.createState());

       editor.setContent("b");
       history.push(editor.createState());

       editor.setContent("c");
       editor.restore(history.pop());
       editor.restore(history.pop());


       System.out.println(editor.getContent());
        */
   }


}