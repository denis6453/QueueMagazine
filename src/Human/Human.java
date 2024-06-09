package Human;

import Actor.Actor;
import VendingMashine.Product;

import java.util.ArrayList;
import java.util.List;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public void createOrder(List<Product> products) {
        this.order.addAll(products);
        setReadyOrder(true);
    }

    @Override
    public void getOrder() {
        this.order.clear();
    }

    @Override
    public void setReadyOrder(boolean readyOrder) {
        this.isReadyOrder = readyOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isReadyOrder() {
        return isReadyOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
