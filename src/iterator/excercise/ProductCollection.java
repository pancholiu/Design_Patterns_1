package iterator.excercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public IteradorSP createIterator() {
    return new ArrayProducts(this);
  }

  public class ArrayProducts implements IteradorSP {
    private ProductCollection productCollection;
    private int index;

    public ArrayProducts(ProductCollection productCollection) {
      this.productCollection = productCollection;
    }

    @Override
    public boolean hasNext() {
      return (index < productCollection.products.size());
    }

    @Override
    public Product current() {
      return productCollection.products.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }
}
