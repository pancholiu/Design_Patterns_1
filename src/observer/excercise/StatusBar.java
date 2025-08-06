package observer.excercise;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {
    private List<Stock> stocks = new ArrayList<>();
    private Stock stock;

    public StatusBar(Stock stock) {
        this.stock = stock;
    }

    public void addStock() {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println("StatusBar notified: " + stock);
    }

    @Override
    public void update() {
        addStock();
        show();
    }
}
