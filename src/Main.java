import observer.Chart;
import observer.DataSource;
import observer.SpreadSheet;
import observer.excercise.StatusBar;
import observer.excercise.Stock;
import observer.excercise.StockListView;

public class Main {
   public static void main(String[] args) {
      var stock = new Stock();

      var statusBar = new StatusBar(stock);
      var stockListView = new StockListView(stock);

      stock.addObserver(statusBar);
      stock.addObserver(stockListView);

      stock.setPrice(7);
      stock.setSymbol("Hola");

      stock.setPrice(8);
      stock.setSymbol("Mundo");
   }
}