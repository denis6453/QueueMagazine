package Actor;

import Human.Human;

import java.util.ArrayList;
import java.util.List;

public class MarketQueue implements QueueBehavior{

    public final List<Actor> actors;

    public MarketQueue() {this.actors = new ArrayList<>();}

    @Override
    public void enterInQueue(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void leaveFromQueue(Actor actor) {
        this.actors.remove(actor);
    }
}
