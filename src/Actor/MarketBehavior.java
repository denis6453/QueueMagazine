package Actor;

import java.util.List;

public interface MarketBehavior {
    void comingToMarket(Actor actor);
    void leaveFromMarket(Actor actor);
    void update();

}
