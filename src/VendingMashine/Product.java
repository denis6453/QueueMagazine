package VendingMashine;

import java.time.LocalDate;

public class Product {
    protected String name;
    protected double price;
    protected LocalDate releaseDate;

    public Product(String name, double price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Список продуктов: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
