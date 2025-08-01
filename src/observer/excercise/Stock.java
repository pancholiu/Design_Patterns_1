package observer.excercise;

public class Stock extends Subject {
    private String symbol;
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
