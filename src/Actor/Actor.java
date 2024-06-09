package Actor;

import VendingMashine.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean isReadyOrder; //Готовность сделать заказ (продукты набраны)
    protected boolean isTakeOrder; // Уже забрал заказ (тут же покидает очередь и магазин)
    protected List<Product> order; // Заказ

    public Actor(String name) {
        this.name = name;
        this.isReadyOrder = false;
        this.isTakeOrder = false;
        this.order = new ArrayList<Product>();
    }

    public abstract void createOrder(List<Product> products);
    public abstract void getOrder();
    public abstract boolean isReadyOrder();
    public abstract boolean isTakeOrder();

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", isReadyOrder=" + isReadyOrder +
                ", isTakeOrder=" + isTakeOrder +
                ", order=" + order +
                '}';
    }
}
