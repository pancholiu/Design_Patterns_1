import iterator.BrowseHistory;
import iterator.IteradorSp;


public class Main {

   public static void main(String[] args) {
      var history = new BrowseHistory();
      history.push("a");
      history.push("b");
      history.push("c");

      IteradorSp iteradorSp = history.createIterator();
      
      while(iteradorSp.hasNext()) {
         var url = iteradorSp.current();
         System.out.println(url);
         iteradorSp.next();
      }
   }


}