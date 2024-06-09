package VendingMashine;

import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    protected List<Product> products;

    public VendingMashine() {
        this.products = new ArrayList<>();
    }

    public VendingMashine(List<Product> products) {
        this.products = products;
    }

    public List<Product> printProducts() {
        return products;
    }

    public void addProducts (List<Product> products) {this.products.addAll(products);};

    public Product getProduct(String name) {

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;

            }
        }
        throw new RuntimeException("No such Product" + name);
    }


    @Override
    public String toString() {
        return "VendingMashine{" +
                "products=" + products +
                '}';
    }
}
