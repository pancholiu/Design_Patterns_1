import iterator.BrowseHistory;
import iterator.IteradorSp;
import iterator.excercise.IteradorSP;
import iterator.excercise.Product;
import iterator.excercise.ProductCollection;
import strategy.BlackAndWhiteFilter;
import strategy.ImageStorage;
import strategy.JpegCompressor;
import strategy.PngCompressor;


public class Main {

   public static void main(String[] args) {
         var imageStorage = new ImageStorage();

         imageStorage.store("a",
                 new PngCompressor(),
                 new BlackAndWhiteFilter());

         imageStorage.store("a",
                 new JpegCompressor(),
                 new BlackAndWhiteFilter());
   }
}
