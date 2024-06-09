import Actor.Market;
import Actor.Actor;
import Human.Human;
import VendingMashine.Product;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Product product1 = new Product("Продукт - 1", 50, LocalDate.now());
        Product product2 = new Product("Продукт - 2", 50, LocalDate.now());
        Product product3 = new Product("Продукт - 3", 50, LocalDate.now());
        Product product4 = new Product("Продукт - 4", 50, LocalDate.now());
        Product product5 = new Product("Продукт - 5", 50, LocalDate.now());
        Product product6 = new Product("Продукт - 6", 50, LocalDate.now());


        market.addProductsToMarket(List.of(product1, product2, product3, product4, product5, product6));

        Actor actor1 = new Human("Посетитель - 1");
        Actor actor2 = new Human("Посетитель - 2");
        Actor actor3 = new Human("Посетитель - 3");
        Actor actor4 = new Human("Посетитель - 4");
        Actor actor5 = new Human("Посетитель - 5");

        market.comingToMarket(actor1);
        market.comingToMarket(actor2);
        market.comingToMarket(actor3);
        market.comingToMarket(actor4);
        market.comingToMarket(actor5);

        actor1.createOrder(List.of(product1, product2));

        actor2.createOrder(List.of(product3, product4));

        actor3.createOrder(List.of(product5, product6));

        market.printActorInMarket();

        System.out.println("Итерация - 1");
        market.update();
        market.printActorInMarket();

        System.out.println("Итерация - 2");
        market.update();
        market.printActorInMarket();

        System.out.println("Итерация - 3");
        market.update();
        market.printActorInMarket();

    }
}