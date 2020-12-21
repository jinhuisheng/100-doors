package doorsgame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Doors {

    private static final int DOOR_COUNT = 100;
    private final List<Door> doorList;

    public Doors() {
        doorList = IntStream.range(0, DOOR_COUNT).boxed().map(i -> new Door()).collect(Collectors.toList());
    }

    public Integer count() {
        return 100;
    }

    public Door get(int index) {
        return doorList.get(index);
    }

    public void visit(int times) {
        for (int currentTimes = 1; currentTimes < times + 1; currentTimes++) {
            for (int index = 1; index <= DOOR_COUNT; index++) {
                if (index * currentTimes <= 100) {
                    doorList.get(index * currentTimes - 1).toggle();
                }
            }
        }
    }

    public List<DoorStatus> getStatuses() {
        return doorList.stream().map(Door::status).collect(Collectors.toList());
    }
}
