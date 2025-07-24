import iterator.BrowseHistory;
import iterator.IteradorSp;
import iterator.excercise.IteradorSP;
import iterator.excercise.Product;
import iterator.excercise.ProductCollection;


public class Main {

   public static void main(String[] args) {

      var collection = new ProductCollection();
      collection.add(new Product(1, "a"));
      collection.add(new Product(2, "b"));
      collection.add(new Product(3, "c"));

      IteradorSP collectionIterator = collection.createIterator();

      while(collectionIterator.hasNext()) {
         var product = collectionIterator.current();
         System.out.println(product);
         collectionIterator.next();
      }
   }
}