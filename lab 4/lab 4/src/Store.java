import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void applyDiscount(Discountable discountable) {
        for (Product product : products) {
            Double newPrice = discountable.applyDiscount(product);
            System.out.println("Product: " + product.getName() + ", Original Price: " + product.getPrice() + ", Discounted Price: " + newPrice);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}