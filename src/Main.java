import visitor.HtmlDocument;
import visitor.AnchorNode;
import visitor.HeadingNode;

public class Main {
   public static void main(String[] args) {
      var document = new HtmlDocument();
      document.add(new HeadingNode());
      document.add(new AnchorNode());
      document.highlight();
   }
}