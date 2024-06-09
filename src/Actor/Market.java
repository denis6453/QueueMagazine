package Actor;

import Human.Human;
import VendingMashine.Product;
import VendingMashine.VendingMashine;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior {

    private final List<Actor> actorsInMarket = new ArrayList<>();
    private MarketQueue queue = new MarketQueue();
    private VendingMashine vendingMashine = new VendingMashine();

    public void addProductsToMarket(List<Product> products) {
        vendingMashine.addProducts(products);
    }

    @Override
    public void comingToMarket(Actor actor) {
        actorsInMarket.add(actor);
    }

    @Override
    public void leaveFromMarket(Actor actor) {
        actorsInMarket.remove(actor);
    }

    @Override
    public void update() {
        for (Actor actor : actorsInMarket) {
            if (actor.isReadyOrder) queue.enterInQueue(actor);
        }

        //первый в очереди
        Actor actor = queue.actors.get(0);
        if (actor.isReadyOrder) {
            for (Product product : actor.order) {
                vendingMashine.getProduct(product.getName());
            }
            actor.getOrder();
            actor.setTakeOrder(true);
            actor.setReadyOrder(false);
            queue.leaveFromQueue(actor);
            leaveFromMarket(actor);
        }
        else System.out.println("Первый в очереди не готов сделать заказ");

    }

    public void printActorInMarket () {
        for (Actor actor : actorsInMarket) {
            System.out.println(actor);
        }
    }

}
