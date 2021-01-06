package doorsgame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author huisheng.jin
 * @date 2021/1/6.
 */
public class DoorsGame {
    private final List<Door> doors;

    public DoorsGame(int doorCount) {
        doors = IntStream.range(0, doorCount).boxed().map(i -> new Door()).collect(Collectors.toList());
    }

    public List<Status> getDoorStatuses() {
        return this.doors.stream().map(Door::getStatus).collect(Collectors.toList());
    }

    public void visit(int times) {
        for (int visitTimes = 1; visitTimes <= times; visitTimes++) {
            for (int doorIndex = 0; doorIndex < doors.size(); doorIndex++) {
                toggleDoors(doorIndex, visitTimes);
            }
        }
    }

    private void toggleDoors(int doorIndex, int visitTimes) {
        if ((doorIndex + 1) % visitTimes == 0) {
            doors.get(doorIndex).toggle();
        }
    }
}
