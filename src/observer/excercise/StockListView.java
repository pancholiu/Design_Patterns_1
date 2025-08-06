package observer.excercise;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks = new ArrayList<>();
    private Stock stock;

    public StockListView(Stock stock) {
        this.stock = stock;
    }

    public void addStock() {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println("StockListView notified: " + stock);
    }

    @Override
    public void update() {
        addStock();
        show();
    }
}
