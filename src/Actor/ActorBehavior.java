package Actor;

public interface ActorBehavior {
    void setReadyOrder(boolean makeOrder);

    void setTakeOrder(boolean takeOrder);

    boolean isReadyOrder();

    boolean isTakeOrder();
}
