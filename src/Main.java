import observer.Chart;
import observer.DataSource;
import observer.SpreadSheet;
import observer.excercise.StatusBar;
import observer.excercise.Stock;

public class Main {
   public static void main(String[] args) {
      var stock = new Stock();

      var statusBar = new StatusBar(stock);

      stock.addObserver(statusBar);

      stock.setPrice(7);
      stock.setSymbol("Hola");


      /*
      var dataSource = new DataSource();
      var sheet1 = new SpreadSheet(dataSource);
      var sheet2 = new SpreadSheet(dataSource);
      var chart = new Chart(dataSource);

      dataSource.addObserver(sheet1);
      dataSource.addObserver(sheet2);
      dataSource.addObserver(chart);

      dataSource.setValue(1);

       */
   }
}